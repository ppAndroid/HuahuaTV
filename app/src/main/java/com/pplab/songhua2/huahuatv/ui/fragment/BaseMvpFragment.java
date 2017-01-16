package com.pplab.songhua2.huahuatv.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pplab.songhua2.huahuatv.presenter.BasePresenter;
import com.pplab.songhua2.huahuatv.ui.view.BaseView;

/**
 * Created by songhua2 on 2017/1/11.
 */

public abstract  class BaseMvpFragment<T extends BasePresenter> extends Fragment implements BaseView{
    //this value should inject by subclass

    protected T mPresenter;
    private View rootview;

    //return subclass presenter
    protected  abstract  T initInjector();
    //return subclass layoutid
    protected  abstract  int getLayoutId();
    //init view
    protected  abstract void initView(View rootview);
    //init data
    protected  abstract void initData();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //first we need init presenter with this fragment
        mPresenter = initInjector();
        mPresenter.onCreate();
        mPresenter.attachView(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int layoutid = getLayoutId();
        rootview = inflater.inflate(layoutid,null);
        initView(rootview);
        return rootview;
    }
    //when to init data
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initData();
        super.onViewCreated(view, savedInstanceState);
    }
    /*
        utils
     */
    protected  View findViewById(int id){
        return rootview.findViewById(id);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void showProgress(@Nullable String msg) {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showToast(@Nullable String msg) {

    }

    @Override
    public void showLongToast(@Nullable String msg) {

    }
}
