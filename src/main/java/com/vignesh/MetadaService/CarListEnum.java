package com.vignesh.MetadaService;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CarListEnum {
    Maruthi(1),
    Honda(2),
    MG(3),
    Others(4);

    @Getter
    private final int val;

    public CarListEnum getFromVal(int val) {
        switch (val) {
            case 1:
                return Maruthi;
            case 2:
                return Honda;
            case 3:
                return MG;
            default:
                return Others;
        }
    }
}

