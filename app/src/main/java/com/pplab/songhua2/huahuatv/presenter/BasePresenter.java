package com.pplab.songhua2.huahuatv.presenter;

import android.support.annotation.Nullable;

import com.pplab.songhua2.huahuatv.ui.view.BaseView;

/**
 * Created by songhua2 on 2017/1/11.
 */
public interface BasePresenter<T extends BaseView> {
    void onCreate();

    void attachView(@Nullable T t);

    void deattachView();

    void onDestroy();


}
