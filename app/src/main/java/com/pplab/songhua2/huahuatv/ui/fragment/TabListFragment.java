package com.pplab.songhua2.huahuatv.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.pplab.songhua2.huahuatv.R;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;



public class TabListFragment extends BaseFragment {

    private SwipeRefreshLayout mRefreshLayout;
    private RecyclerView mRecyclerView;

    @Override
    protected int getLayoutId() {
        return R.layout.recommandlistlayout;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bindViews();

    }

    private void bindViews() {
        mRefreshLayout = find(R.id.mRefreshLayout);
        mRecyclerView = find(R.id.mRecyclerView);
    }

}
