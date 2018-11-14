package com.donovan.jda.commandhandler;
import com.donovan.jda.modules.EbayViews;


import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;



public class CommandHandler extends ListenerAdapter {
    java.util.Date date = new java.util.Date();

    @SuppressWarnings("unused")
    public void onMessageReceived(MessageReceivedEvent event) {
        if( event.getAuthor().isBot()) return;
        Message message = event.getMessage();
        String content = message.getContentRaw();
        MessageChannel channel = event.getChannel();

        if(content.startsWith("!ebay")) {
            new EbayViews(event);
            System.out.println(date + ": Request received.");
        }
    }
}