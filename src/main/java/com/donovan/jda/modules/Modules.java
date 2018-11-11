package com.donovan.jda.modules;

import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public abstract class Modules {
    String command;
    MessageReceivedEvent event;
    MessageChannel channel;
    Message message;
    User user;
    Member member;
    Guild guild;



    public Modules(MessageReceivedEvent event) {
        this.command = event.getMessage().getContentRaw();
        this.event = event;
        this.channel = event.getChannel();
        this.member = event.getMember();
        this.user = event.getAuthor();
        this.guild = event.getGuild();
        process();

    }

    public abstract void process();
}
