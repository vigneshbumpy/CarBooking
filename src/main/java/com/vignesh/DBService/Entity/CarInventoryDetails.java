package com.vignesh.DBService.Entity;

import com.vignesh.MetadaService.CarListEnum;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CarInventoryDetails {

    public int id;
    public CarListEnum carType;
    public boolean availablity;
    public Long bookedTill;
}
