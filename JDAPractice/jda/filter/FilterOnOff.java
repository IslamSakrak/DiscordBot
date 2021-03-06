package DiscordBot.JDAPractice.jda.filter;

import DiscordBot.JDAPractice.jda.BotCenter;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class FilterOnOff extends ListenerAdapter {

    public static boolean filterOn = true;

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().equalsIgnoreCase(BotCenter.prefix + "togglefilter") && filterOn) {
            filterOn = false;
            event.getChannel().sendMessage("The Curse-Filter has been disabled by " + event.getMember().getUser().getName()).queue();
        } else if (event.getMessage().getContentRaw().equalsIgnoreCase(BotCenter.prefix + "togglefilter") && !filterOn) {
            filterOn = true;
            event.getChannel().sendMessage("The Curse-Filter has been enabled by " + event.getMember().getUser().getName()).queue();
        }
    }
}
