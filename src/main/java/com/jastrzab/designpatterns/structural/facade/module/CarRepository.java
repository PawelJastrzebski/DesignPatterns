package com.jastrzab.designpatterns.structural.facade.module;

import java.util.LinkedList;
import java.util.Optional;

public class CarRepository {
    private LinkedList<Car> store = new LinkedList<>();

    private long getId() {
        return store.size() + 1;
    }

    public Car save(Car car) {
        car.setId(getId());
        store.push(car);
        return car;
    }

    public Optional<Car> getCar(long id) {
        return this.store.stream().filter(c -> c.id == id).findFirst();
    }

}
