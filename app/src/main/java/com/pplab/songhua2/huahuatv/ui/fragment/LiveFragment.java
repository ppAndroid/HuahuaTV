package com.pplab.songhua2.huahuatv.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pplab.songhua2.huahuatv.R;
import com.pplab.songhua2.huahuatv.presenter.LiveFragmentPresenter;
import com.pplab.songhua2.huahuatv.ui.adapter.LiveFragmentListAdapter;
import com.pplab.songhua2.huahuatv.ui.view.LiveFragmentView;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiveFragment extends BaseMvpFragment<LiveFragmentPresenter> {
    @Inject
    LiveFragmentPresenter<LiveFragmentView> mlivePresenter;

    private RecyclerView mRv;
    private LiveFragmentListAdapter mAdapter;

    public LiveFragment() {
        // Required empty public constructor
    }


    @Override
    protected LiveFragmentPresenter<LiveFragmentView> initInjector() {
        //initInjector();
        return mlivePresenter;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.frg_live;
    }

    @Override
    protected void initView(View rootview) {
        mRv = (RecyclerView) rootview.findViewById(R.id.mRv);
        mRv.setLayoutManager(new GridLayoutManager(this.getActivity(),2));
        mAdapter = new LiveFragmentListAdapter();

    }

    @Override
    protected void initData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_live, container, false);
    }

}
