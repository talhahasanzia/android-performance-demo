package com.talhahasanzia.performanceissues.render;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.talhahasanzia.performanceissues.R;

public class RenderMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_render_main);
    }

    public void onOverdrawClicked(View view) {
        startActivity(new Intent(this, OverdrawActivity.class));
    }

    public void onNestingClicked(View view) {
        startActivity(new Intent(this, NestingActivity.class));
    }
}
