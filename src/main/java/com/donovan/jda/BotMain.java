package com.donovan.jda;

import com.donovan.jda.References.References;
import com.donovan.jda.commandhandler.CommandHandler;


import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

public class BotMain {

    public static void main(String[] args) throws LoginException, InterruptedException {

            JDA jda = new JDABuilder(AccountType.BOT)
                    .setToken(References.getToken())
                    .addEventListener(new CommandHandler())
                    .build().awaitReady();

    }

}
