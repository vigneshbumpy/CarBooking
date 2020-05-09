package com.vignesh.CarBookingService;

import com.vignesh.DBService.CarBooking;
import com.vignesh.DBService.Entity.CarEntity;
import com.vignesh.DBService.impl.CarBookingImpl;
import com.vignesh.DBService.impl.MaruthiCarBooking;

import java.util.Scanner;

public class CarBookingService {

    public static void main(String[] args) {
        CarBooking carBooking = new CarBookingImpl();
        CarBooking maruthiCars = new MaruthiCarBooking();
        System.out.println("Welcome to Vignesh Car Booking \n");
        System.out.println("Following is the list of Avaialable Cars");
        for (CarEntity car: carBooking.getAvalialbleCars())
        {
            System.out.println(car.carType);
        }
        for (CarEntity car: maruthiCars.getAvalialbleCars())
        {
            System.out.println(car.id);
        }


    }
}
