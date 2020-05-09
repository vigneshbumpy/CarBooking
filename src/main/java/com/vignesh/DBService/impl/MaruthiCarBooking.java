package com.vignesh.DBService.impl;

import com.vignesh.DBService.CarBooking;
import com.vignesh.DBService.DataBaseInformation;
import com.vignesh.DBService.Entity.CarEntity;
import com.vignesh.MetadaService.CarListEnum;

import java.util.List;

public class MaruthiCarBooking implements CarBooking {
    DataBaseInformation dataBaseInformation = new DataBaseInformation();


    public List<CarEntity> getAvalialbleCars() {
        List<CarEntity> maruthiCars = dataBaseInformation.getAllCarAvaialble();
        maruthiCars.removeIf(i -> i.carType!= CarListEnum.Maruthi);
        return maruthiCars;
    }
}
