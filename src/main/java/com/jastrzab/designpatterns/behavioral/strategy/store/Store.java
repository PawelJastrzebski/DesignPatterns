package com.jastrzab.designpatterns.behavioral.strategy.store;

import com.jastrzab.designpatterns.behavioral.strategy.payment.PaymentStrategy;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class Store {
    private final List<Product> products = new LinkedList<>();

    public void addToStore(Product product) {
        products.add(product);
    }

    public List<Product> buildBasket(String... products) {
        List<String> names = List.of(products);
        return this.products.stream().filter(p -> names.contains(p.name)).toList();
    }

    public boolean charge(List<Product> basket, PaymentStrategy payment) {
        var total = basket.stream().mapToInt(p -> p.price).sum();
        return payment.charge(total);
    }
}
