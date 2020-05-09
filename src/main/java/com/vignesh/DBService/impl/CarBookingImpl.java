package com.vignesh.DBService.impl;

import com.vignesh.DBService.CarBooking;
import com.vignesh.DBService.DataBaseInformation;
import com.vignesh.DBService.Entity.CarEntity;

import java.util.List;

public class CarBookingImpl implements CarBooking {
    DataBaseInformation dataBaseInformation = new DataBaseInformation();

    public List<CarEntity> getAvalialbleCars() {
        return dataBaseInformation.getAllCarAvaialble();
    }
}
