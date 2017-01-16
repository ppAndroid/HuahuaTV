package com.pplab.songhua2.huahuatv.dagger;

/**
 * Created by songhua2 on 2017/1/13.
 */
public class Cooker {
    String name; //咖啡师名字
    String coffeeKind; //制作咖啡的类型

    public Cooker(String name,String coffeeKind){
        this.name = name;
        this.coffeeKind = coffeeKind;
    }

    public String makeCoffee(){
        return name +" make " + coffeeKind; //咖啡师制作Coffee的过程
    }
}