package com.pplab.songhua2.huahuatv.dagger;


import javax.inject.Inject;

/**
 * Created by songhua2 on 2017/1/13.
 */
public class SimpleMaker implements CoffeeMaker {

    Cooker cooker;

    @Inject
    public SimpleMaker(Cooker cooker){
        this.cooker = cooker;
    }

    @Override
    public String makeCoffee() {
        return "ok";
    }
}