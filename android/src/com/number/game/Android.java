package com.number.game;

import android.app.Activity;
import android.content.Context;

public class Android implements Native {
    Context context;

    Android(Context context) {
        this.context = context;
    }

    public void StartMenuScreen() {
        ((Activity) this.context).finish();
    }
}
