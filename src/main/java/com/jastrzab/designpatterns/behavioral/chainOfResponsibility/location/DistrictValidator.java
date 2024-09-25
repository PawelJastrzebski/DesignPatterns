package com.jastrzab.designpatterns.behavioral.chainOfResponsibility.location;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DistrictValidator extends Chain<LocationDto, Boolean> {

    @Override
    public Boolean check(LocationDto data) {
        if (data.district == null) return false;
        if (data.district.length() < 2) return false;
        return checkNext(data).orElse(true);
    }
}
