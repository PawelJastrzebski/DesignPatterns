package com.jastrzab.designpatterns.structural.decorator.source;

import java.nio.charset.StandardCharsets;

public class StringDataSource implements DataSource {
    private String data;

    public String getRawData() {
        return data;
    }

    public StringDataSource(String data) {
        this.data = data;
    }

    @Override
    public byte[] read() {
        return this.data.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public void write(byte[] data) {
        this.data = new String(data);
    }
}
