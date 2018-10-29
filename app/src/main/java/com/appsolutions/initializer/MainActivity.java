package com.appsolutions.initializer;

import android.os.Bundle;

import com.appsolutions.initializer.base.BaseActivity;
import com.appsolutions.initializer.fragment.HomeFragment;

import androidx.annotation.Nullable;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes(){
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main, new HomeFragment()).commit();
        }
    }
}
