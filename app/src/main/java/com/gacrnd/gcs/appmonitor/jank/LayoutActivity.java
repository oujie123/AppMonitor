package com.gacrnd.gcs.appmonitor.jank;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.gacrnd.gcs.appmonitor.R;


public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
//
//        try {
//            Thread.sleep(3_000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}
