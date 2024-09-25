package com.jastrzab.designpatterns.structural.facade.module;


import lombok.*;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Car {
    @Setter
    long id;
    String brand;
    String model;
    int year;
}
