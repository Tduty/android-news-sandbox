package com.example.android_sandbox.presentation;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android_sandbox.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment = getFragmentManager().findFragmentById(R.id.container);
        if (fragment == null)
            initMainFragment();
    }

    private void initMainFragment() {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.container, NewsFragment.newInstance());
        ft.commit();
    }

}
