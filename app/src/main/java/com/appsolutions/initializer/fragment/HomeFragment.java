package com.appsolutions.initializer.fragment;

import android.os.Bundle;
import android.view.View;

import com.appsolutions.initializer.R;
import com.appsolutions.initializer.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HomeFragment extends BaseFragment {
    @Override
    protected int layoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){

    }
}
