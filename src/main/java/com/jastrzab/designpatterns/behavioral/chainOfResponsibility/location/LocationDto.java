package com.jastrzab.designpatterns.behavioral.chainOfResponsibility.location;

import lombok.*;

@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LocationDto {
    String country;
    String district;
    String street;
    Integer houseNumber;
    Integer apartmentNumber;
}
