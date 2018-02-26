package com.talhahasanzia.performanceissues.computations;

import android.os.Trace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.talhahasanzia.performanceissues.R;

public class ComputationsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computations_main);
    }

    public void onFabonacciClicked(View view) {
        Trace.beginSection("FABONACCI");
        computeFibonacci(20);
        Trace.endSection();
    }

    public int computeFibonacci(int positionInFibSequence) {
        if (positionInFibSequence <= 2) {
            return 1;
        } else {
            return computeFibonacci(positionInFibSequence - 1)
                    + computeFibonacci(positionInFibSequence - 2);
        }
    }



    public void onFabonacciImprovedClicked(View view) {

        computeFibonacciImproved(20);
    }


    public int computeFibonacciImproved(int positionInFibSequence) {
        int prev = 0;
        int current = 1;
        int newValue;
        for (int i=1; i<positionInFibSequence; i++) {
            newValue = current + prev;
            prev = current;
            current = newValue;
        }
        return current;
    }
}
