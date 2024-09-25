package com.jastrzab.designpatterns.behavioral.chainOfResponsibility.location;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StreetValidator extends Chain<LocationDto, Boolean> {

    @Override
    public Boolean check(LocationDto data) {
        if (data.street == null) return false;
        if (data.street.length() < 2) return false;
        return checkNext(data).orElse(true);
    }
}
