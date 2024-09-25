package com.jastrzab.designpatterns.creational.builder;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.creational.builder.builder.CarBuilder;
import com.jastrzab.designpatterns.creational.builder.builder.CarManualBuilder;
import com.jastrzab.designpatterns.creational.builder.products.Car;
import com.jastrzab.designpatterns.creational.builder.products.CarManual;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BuilderApp implements Application, Director {
    @Override
    public String appName() {
        return "Builder";
    }

    @Override
    public void startApplication() {
        CarManualBuilder manualBuilder = new CarManualBuilder();
        CarBuilder carBuilder = new CarBuilder();

        this.buildAudi(manualBuilder);
        this.buildAudi(carBuilder);
        Car car = carBuilder.build();
        CarManual manual = manualBuilder.build();

        if (car.checkVinNumber()) {
            log.info("VIN is valid: {}", car.getVinNumber());
        }

         log.info("Car manual:");
         log.info(manual.printManual());
    }
}
