package DiscordBot.JDAPractice.jda;

import DiscordBot.JDAPractice.jda.command.Calculate;
import DiscordBot.JDAPractice.jda.events.Reactions;
import DiscordBot.JDAPractice.jda.events.WelcomeEvent;
import DiscordBot.JDAPractice.jda.filter.Filter;
import DiscordBot.JDAPractice.jda.filter.FilterMessage;
import DiscordBot.JDAPractice.jda.filter.FilterOnOff;


import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class BotCenter {

    public static String prefix = "!";
    public static JDA jda;

    public static void main(String[] args) throws LoginException {

        jda = new JDABuilder(AccountType.BOT).setToken("NzM3NjA0Njg0MTAxMDU4NjYw.Xx_x5A.H4nv4qzAlIPpz3o9sxMOSUw_WTQ").build();

        jda.addEventListener(new WelcomeEvent());
        jda.addEventListener(new Reactions());

        jda.addEventListener(new Filter());
        jda.addEventListener(new FilterMessage());
        jda.addEventListener(new FilterOnOff());

        jda.addEventListener(new Calculate());

        jda.getPresence().setActivity(Activity.of(Activity.ActivityType.WATCHING, "YOU"));
    }
}