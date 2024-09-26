package com.jastrzab.designpatterns.behavioral.templateMethod.http;


import org.graalvm.collections.Pair;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public abstract class RequestTemplate {

    public HttpResponse<String> post() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest.Builder builder = HttpRequest.newBuilder().uri(new URI(this.getUrl()));

        for (Pair<String, String> header : getHeaders()) {
            builder = builder.header(header.getLeft(), header.getRight());
        }

        try (
                var client = HttpClient
                        .newBuilder()
                        .proxy(ProxySelector.getDefault())
                        .build()
        ) {
            HttpRequest req = builder.POST(HttpRequest.BodyPublishers.ofString(getBody())).build();
            return client.send(req, HttpResponse.BodyHandlers.ofString());
        }
    }

    public HttpResponse<String> get() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest.Builder builder = HttpRequest.newBuilder().uri(new URI(this.getUrl()));

        for (Pair<String, String> header : getHeaders()) {
            builder = builder.header(header.getLeft(), header.getRight());
        }

        try (
                var client = HttpClient
                        .newBuilder()
                        .proxy(ProxySelector.getDefault())
                        .build()
        ) {
            HttpRequest req = builder.GET().build();
            return client.send(req, HttpResponse.BodyHandlers.ofString());
        }
    }


    abstract String getUrl();

    String getBody() {
        return "";
    }

    List<Pair<String, String>> getHeaders() {
        return List.of();
    }

}
