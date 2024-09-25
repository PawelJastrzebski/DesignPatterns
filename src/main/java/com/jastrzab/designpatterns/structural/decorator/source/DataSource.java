package com.jastrzab.designpatterns.structural.decorator.source;

public interface DataSource {
    byte[] read();
    void write(byte[] data);
}
