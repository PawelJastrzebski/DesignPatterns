package com.jastrzab.designpatterns.behavioral.iterator;

import java.util.List;

public class SimpleIterator<T> implements Iterator<T> {
    private int pointer = 0;
    private final List<T> list;

    public SimpleIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return pointer < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        return this.list.get(this.pointer++);
    }
}
