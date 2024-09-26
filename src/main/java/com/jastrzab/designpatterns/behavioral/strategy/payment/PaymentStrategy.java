package com.jastrzab.designpatterns.behavioral.strategy.payment;

public interface PaymentStrategy {

    String name();
    boolean charge(int amount);
    int getAccountBalance();
}
