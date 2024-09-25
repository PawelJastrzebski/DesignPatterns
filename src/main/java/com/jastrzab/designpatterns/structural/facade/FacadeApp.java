package com.jastrzab.designpatterns.structural.facade;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.structural.facade.module.CarRepository;
import com.jastrzab.designpatterns.structural.facade.module.EmailService;
import com.jastrzab.designpatterns.structural.facade.module.ModuleFacade;

public class FacadeApp implements Application {
    @Override
    public String appName() {
        return "Facade";
    }

    @Override
    public void startApplication() {
        ModuleFacade carModule = new ModuleFacade(new CarRepository(), new EmailService());
        carModule.createCar("Tesla", "3", 2023);
    }
}
