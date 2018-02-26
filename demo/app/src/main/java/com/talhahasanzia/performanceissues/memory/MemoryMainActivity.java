package com.talhahasanzia.performanceissues.memory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.talhahasanzia.performanceissues.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MemoryMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_main);

        View customView = findViewById(R.id.custom);
    }

    public void onMemoryLeakClicked(View view) {




    }

    public void onMemoryChurnClicked(View view) {
        imPrettySureSortingIsFree();
    }



    public void imPrettySureSortingIsFree() {
        // Throw together a nice, big 2D array of random numbers.
        int dimension = 100;
        int[][] lotsOfInts = new int[dimension][dimension];
        Random randomGenerator = new Random();
        for(int i = 0; i < lotsOfInts.length; i++) {
            for (int j = 0; j < lotsOfInts[i].length; j++) {
                lotsOfInts[i][j] = randomGenerator.nextInt();
            }
        }

        // Now go through and dump the sorted version of each row to output!
        for(int i = 0; i < lotsOfInts.length; i++) {
            String rowAsStr = "";
            for (int j = 0; j < lotsOfInts[i].length; j++) {
                // Clearly, the only reasonable way to construct a string is one character at a
                // time, with lots and lots of convenient concatenation.
                rowAsStr += getSorted(lotsOfInts[i])[j];
                if(j < (lotsOfInts[i].length - 1)){
                    rowAsStr += ", ";
                }
            }
            Log.i("CachingActivityExercise", "Row " + i + ": " + rowAsStr);
        }
    }

    /**
     * Helper method, returns the sorted copy of an array.
     * @param input the unsorted array
     * @return the sorted array
     */
    public int[] getSorted(int[] input) {
        int[] clone = input.clone();
        Arrays.sort(clone);
        return clone;
    }
}
