package com.jastrzab.designpatterns.behavioral.strategy.payment;

import lombok.Getter;

@Getter
public class OnlineAccountPayment implements PaymentStrategy {
    private int accountBalance;

    public OnlineAccountPayment(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String name() {
        return "Online Account";
    }

    @Override
    public boolean charge(int amount) {
        if (accountBalance >= amount) {
            this.accountBalance = accountBalance - amount;
            return true;
        }
        return false;
    }
}
