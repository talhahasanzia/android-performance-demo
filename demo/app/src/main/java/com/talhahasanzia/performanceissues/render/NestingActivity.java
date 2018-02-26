package com.talhahasanzia.performanceissues.render;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.talhahasanzia.performanceissues.R;

public class NestingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        long before=System.currentTimeMillis();
        setContentView(R.layout.activity_nesting);
        long duration=System.currentTimeMillis()-before;

        Log.d("TIME_TOOK", "onCreate: time took - " +duration);
    }
}
