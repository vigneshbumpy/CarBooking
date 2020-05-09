package com.vignesh.DBService;

import com.vignesh.DBService.Entity.CarEntity;
import com.vignesh.MetadaService.CarListEnum;

import java.util.ArrayList;
import java.util.List;

public class DataBaseInformation {
    
    public List<CarEntity> getAllCarAvaialble() {
        List<CarEntity> carEntityList = new ArrayList<CarEntity>();
        carEntityList.add(new CarEntity(1, CarListEnum.Maruthi));
        carEntityList.add(new CarEntity(2, CarListEnum.Honda));
        return carEntityList;
    }    
    
    public List<CarEntity> allCarInventory() {
        List<CarEntity> carEntityList = new ArrayList<CarEntity>();
        carEntityList.add(new CarEntity(1, CarListEnum.Maruthi));
        carEntityList.add(new CarEntity(2, CarListEnum.Honda));
        carEntityList.add(new CarEntity(3, CarListEnum.MG));        
        carEntityList.add(new CarEntity(4, CarListEnum.Maruthi));
        carEntityList.add(new CarEntity(5, CarListEnum.Honda));
        carEntityList.add(new CarEntity(6, CarListEnum.MG));
        carEntityList.add(new CarEntity(7, CarListEnum.Maruthi));
        carEntityList.add(new CarEntity(8, CarListEnum.Honda));
        carEntityList.add(new CarEntity(9, CarListEnum.MG));        
        carEntityList.add(new CarEntity(10, CarListEnum.Maruthi));
        carEntityList.add(new CarEntity(11, CarListEnum.Honda));
        carEntityList.add(new CarEntity(12, CarListEnum.MG));
        carEntityList.add(new CarEntity(13, CarListEnum.Others));
        return carEntityList;
    }
}
