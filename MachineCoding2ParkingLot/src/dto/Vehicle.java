package dto;

import enums.VehicleTypes;

public class Vehicle {
    VehicleTypes type;
    String registrationNumber;
    String color;

    public Vehicle(VehicleTypes type, String registrationNumber, String color){
        this.color = color;
        this.type = type;
        this.registrationNumber = registrationNumber;
    }
}
