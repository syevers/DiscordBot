package com.donovan.jda.modules;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class EbayViews extends Modules {

    public EbayViews(MessageReceivedEvent event) {
        super(event);
    }

    @Override
    public void process() {
        String message = event.getMessage().getContentRaw();
        String[] params = message.split(" ");

        String url = params[1];
        int viewNum = Integer.parseInt(params[2]);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        for (int i = 0; i <= viewNum; ++i) {
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::statusCode)
                    .join();
        }

        channel.sendMessage("Success! Sending views now.").queue();



    }

}