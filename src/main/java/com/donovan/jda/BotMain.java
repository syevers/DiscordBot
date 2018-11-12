package com.donovan.jda;

import com.donovan.jda.References.References;
import com.donovan.jda.commandhandler.CommandHandler;


import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class BotMain {

    public static void main(String[] args) {
        try {

            JDA jda = new JDABuilder(AccountType.BOT).setToken(References.getToken()).build();
            jda.addEventListener(new CommandHandler());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
