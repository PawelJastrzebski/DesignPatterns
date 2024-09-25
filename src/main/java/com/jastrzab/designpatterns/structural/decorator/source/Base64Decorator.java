package com.jastrzab.designpatterns.structural.decorator.source;

import java.util.Base64;

public class Base64Decorator implements DataSource{

    public final DataSource source;

    public Base64Decorator(DataSource source) {
        this.source = source;
    }

    @Override
    public byte[] read() {
        byte[] base = source.read();
        return Base64.getDecoder().decode(base);
    }

    @Override
    public void write(byte[] data) {
        byte[] base = Base64.getEncoder().encode(data);
        source.write(base);
    }

}
