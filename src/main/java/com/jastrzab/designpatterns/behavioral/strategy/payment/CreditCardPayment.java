package com.jastrzab.designpatterns.behavioral.strategy.payment;

public class CreditCardPayment implements PaymentStrategy {
    private final String creditCardDetails;
    private final int provision;
    private int balance;

    public CreditCardPayment(String creditCardDetails, int provision, int balance) {
        this.creditCardDetails = creditCardDetails;
        this.provision = provision;
        this.balance = balance;
    }

    public boolean chargeOnlineAccount(String creditCardDetails, int amount) {
        if (creditCardDetails.length() < 4) return false;
        if (!creditCardDetails.startsWith("V")) return false;
        return balance > amount && amount > 0;
    }

    @Override
    public String name() {
        return "Credit Card";
    }

    @Override
    public boolean charge(int amount) {
        int total = amount + provision;
        if (chargeOnlineAccount(this.creditCardDetails, total)) {
            this.balance = this.balance - total;
            return true;
        }
        return false;
    }

    @Override
    public int getAccountBalance() {
        return this.balance;
    }
}
