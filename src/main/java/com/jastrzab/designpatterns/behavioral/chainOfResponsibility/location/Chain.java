package com.jastrzab.designpatterns.behavioral.chainOfResponsibility.location;

import lombok.extern.log4j.Log4j2;

import java.util.Optional;

@Log4j2
public abstract class Chain<T, R> {
    private Chain<T, R> next;

    public static <T, R> Chain<T, R> link(Chain<T, R> first, Chain<T, R>... chain) {
        Chain<T, R> head = first;
        for (Chain<T, R> nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public R run(T data) {
        log.info("Run: {}", this.getClass().getSimpleName());
        return this.check(data);
    }

    protected abstract R check(T data);

    protected Optional<R> checkNext(T data) {
        if (next == null) return Optional.empty();
        log.info("Run: {}", this.next.getClass().getSimpleName());
        return Optional.ofNullable(this.next.check(data));
    }

}
