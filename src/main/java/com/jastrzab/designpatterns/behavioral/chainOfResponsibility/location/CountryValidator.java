package com.jastrzab.designpatterns.behavioral.chainOfResponsibility.location;

import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class CountryValidator extends Chain<LocationDto, Boolean> {
    List<String> countries = List.of(
            "poland", "germany", "france", "italy", "spain",
            "united kingdom", "netherlands", "belgium", "switzerland",
            "austria", "sweden", "norway", "denmark", "finland",
            "portugal", "greece", "ireland", "czech republic",
            "hungary", "slovakia", "slovenia", "croatia",
            "lithuania", "latvia", "estonia", "romania",
            "bulgaria", "serbia", "bosnia and herzegovina", "ukraine"
    );

    @Override
    public Boolean check(LocationDto data) {
        if (data.country == null) return false;
        if (!countries.contains(data.country.toLowerCase())) return false;
        return checkNext(data).orElse(true);
    }
}
