package com.jastrzab.designpatterns.behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
