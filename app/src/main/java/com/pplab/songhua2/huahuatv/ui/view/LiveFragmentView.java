package com.pplab.songhua2.huahuatv.ui.view;

import com.pplab.songhua2.huahuatv.bean.PlayBean;

import java.util.List;

/**
 * Created by songhua2 on 2017/1/16.
 */
public interface LiveFragmentView extends  BaseView{
    void onPlayBeanList(List<PlayBean> playBeanList);
}
