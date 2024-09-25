package com.jastrzab.designpatterns.behavioral.chainOfResponsibility;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.behavioral.chainOfResponsibility.location.*;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ChainOfResponsibilityApp implements Application {
    @Override
    public String appName() {
        return "Chain Of Responsibility";
    }

    public void printStatus(LocationDto locationDto) {
        Chain<LocationDto, Boolean> locationValidator = Chain.link(
                new CountryValidator(),
                new DistrictValidator(),
                new StreetValidator(),
                new NumberValidator()
        );
        boolean isValid = locationValidator.run(locationDto);
        log.info("Location: {} is {}", locationDto.toString(), isValid ? "Valid" : "Invalid");
    }

    @Override
    public void startApplication() {
        printStatus(LocationDto.builder().build());
        printStatus(LocationDto.builder().country("Poland").build());
        printStatus(LocationDto.builder()
                .country("Poland")
                .district("Mazowieckie")
                .street("Polna")
                .houseNumber(10)
                .build());
    }
}
