package com.pplab.songhua2.huahuatv.dagger;

import com.pplab.songhua2.huahuatv.MainActivity;

import dagger.Component;

/**
 * Created by songhua2 on 2017/1/13.
 */
@Component(modules = SimpleModule.class)
public interface SimpleComponent {
    void Inject(MainActivity mainActivity);
}
