package com.pplab.songhua2.huahuatv.dagger;

import dagger.Module;
import dagger.Provides;

/**
 * Created by songhua2 on 2017/1/13.
 */
@Module
public class SimpleModule {


    @Provides
    Cooker providerCooker(){
        return new Cooker("James","Espresso");
    }

}
