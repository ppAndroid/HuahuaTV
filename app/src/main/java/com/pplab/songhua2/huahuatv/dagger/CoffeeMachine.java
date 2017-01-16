package com.pplab.songhua2.huahuatv.dagger;

import javax.inject.Inject;

/**
 * Created by songhua2 on 2017/1/13.
 */

public class CoffeeMachine {
    CoffeeMaker maker;

    @Inject
    public CoffeeMachine(CoffeeMaker maker){
        this.maker = maker;
    }

    public String makeCoffee(){
        return maker.makeCoffee();
    }
}