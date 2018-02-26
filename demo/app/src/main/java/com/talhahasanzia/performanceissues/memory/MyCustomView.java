package com.talhahasanzia.performanceissues.memory;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class MyCustomView extends View {

    public interface MyListener {
        public void someListenerCallback();
    }

    /**
     * Internal initialization procedures for this view, regardless of which constructor was called.
     */
    private void init() {
        ListenerCollector collector = new ListenerCollector();
        collector.setListener(this, mListener);
    }

    public MyCustomView(Context context) {
        super(context);
        init();
    }

    public MyCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private MyListener mListener = new MyListener() {
        @Override
        public void someListenerCallback() {
            System.out.println("Someone called me!");
        }
    };
}