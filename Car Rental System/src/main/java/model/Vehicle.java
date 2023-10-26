package model;

import enums.VehicleBookingStatusEnum;
import enums.VehicleTypeEnum;

public class Vehicle {
    int id;
    String carNo;
    VehicleTypeEnum vehicleType;
    String manufacturer;
    int hourlyRate;
    int dailyRate;
    VehicleBookingStatusEnum vehicleBookingStatus;
}
