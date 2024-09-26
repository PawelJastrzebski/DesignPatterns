package com.jastrzab.designpatterns.behavioral.strategy;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.behavioral.strategy.payment.CreditCardPayment;
import com.jastrzab.designpatterns.behavioral.strategy.payment.OnlineAccountPayment;
import com.jastrzab.designpatterns.behavioral.strategy.payment.PaymentStrategy;
import com.jastrzab.designpatterns.behavioral.strategy.store.Product;
import com.jastrzab.designpatterns.behavioral.strategy.store.Store;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class StrategyApp implements Application {
    @Override
    public String appName() {
        return "Strategy";
    }

    @Override
    public void startApplication() {
        Store store = new Store();
        store.addToStore(new Product("Car", 1099));
        store.addToStore(new Product("Ted Bear", 1499));
        store.addToStore(new Product("Doll", 2299));
        store.addToStore(new Product("Plane", 6499));

        log.info("------- Welcome to the store ------");
        for (Product product : store.getProducts()) {
            log.info("{} {} PLN", product.name, (double)product.price / 100);
        }
        log.info("----------------------------------");

        OnlineAccountPayment account = new OnlineAccountPayment(9900);
        CreditCardPayment creditCard = new CreditCardPayment("code", 120, 1200);
        CreditCardPayment creditCard2 = new CreditCardPayment("V-code", 120, 9200);
        processPayment(store, account, "Car", "Doll");
        processPayment(store, account, "Plane");
        processPayment(store, account, "Ted Bear");
        processPayment(store, creditCard, "Ted Bear");
        processPayment(store, creditCard2, "Ted Bear");
    }

    private static void processPayment(Store store, PaymentStrategy strategy, String... products) {
        List<Product> basket = store.buildBasket(products);
        if (store.charge(basket, strategy)) {
            log.info("Payment success! - Your products: {}", basket);
        } else {
            log.error("Payment rejected - Products to expensive: {}", basket);
        }
        log.info("Your balance: {}, Paid via {}.\n", strategy.getAccountBalance(), strategy.name());
    }
}
