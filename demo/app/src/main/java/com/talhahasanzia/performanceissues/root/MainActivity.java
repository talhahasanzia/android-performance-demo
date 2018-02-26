package com.talhahasanzia.performanceissues.root;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.talhahasanzia.performanceissues.R;
import com.talhahasanzia.performanceissues.battery.BatteryMainActivity;
import com.talhahasanzia.performanceissues.computations.ComputationsMainActivity;
import com.talhahasanzia.performanceissues.memory.MemoryMainActivity;
import com.talhahasanzia.performanceissues.render.RenderMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRenderClicked(View view) {
        startActivity(new Intent(this, RenderMainActivity.class));
    }

    public void onComputationClicked(View view) {
        startActivity(new Intent(this, ComputationsMainActivity.class));

    }

    public void onMemoryClicked(View view) {
        startActivity(new Intent(this, MemoryMainActivity.class));
    }

    public void onBatteryClicked(View view) {
        startActivity(new Intent(this, BatteryMainActivity.class));
    }
}
