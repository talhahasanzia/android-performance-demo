package com.talhahasanzia.performanceissues.memory;

import android.view.View;

import java.util.WeakHashMap;

public class ListenerCollector {
    // A common case is to want to store all the listeners for a particular type of view
    // somewhere.  Harmless AND convenient.  Or... is it? o_0
    static private WeakHashMap<View, MyCustomView.MyListener> sListeners = new WeakHashMap<View, MyCustomView.MyListener>();

    public void setListener(View view, MyCustomView.MyListener listener) {
        sListeners.put(view, listener);
    }
}