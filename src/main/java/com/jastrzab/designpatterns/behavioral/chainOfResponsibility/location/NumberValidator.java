package com.jastrzab.designpatterns.behavioral.chainOfResponsibility.location;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class NumberValidator extends Chain<LocationDto, Boolean> {

    @Override
    public Boolean check(LocationDto data) {
        if (data.houseNumber == null) return false;
        if (data.houseNumber < 0) return false;
        if (data.apartmentNumber != null && data.apartmentNumber < 0) {
            return false;
        }

        return checkNext(data).orElse(true);
    }
}
