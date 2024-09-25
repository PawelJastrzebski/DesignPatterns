package com.jastrzab.designpatterns.structural.facade.module;

public class ModuleFacade {

    private final CarRepository repository;
    private final EmailService emailService;

    public ModuleFacade(CarRepository repository, EmailService email) {
        this.repository = repository;
        this.emailService = email;
    }

    public void createCar(String brand, String model, int year) {
        Car car = Car.builder()
                .brand(brand)
                .model(model)
                .year(year)
                .build();

        Car newCar = this.repository.save(car);
        this.emailService.sentEmail("admin@app.com", "New car created", newCar.toString());
    }

}
