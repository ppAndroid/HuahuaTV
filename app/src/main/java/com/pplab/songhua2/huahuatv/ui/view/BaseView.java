package com.pplab.songhua2.huahuatv.ui.view;

import android.support.annotation.Nullable;

/**
 * Created by songhua2 on 2017/1/15.
 */

public interface BaseView {
    void showProgress(@Nullable String msg);
    void hideProgress();
    void showToast(@Nullable String msg);
    void showLongToast(@Nullable String msg);


}
