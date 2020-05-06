package com.number.game;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize(new Main(new Android(this), LaunchScreen.ad, LaunchScreen.sub, LaunchScreen.div, LaunchScreen.mul), new AndroidApplicationConfiguration());
    }
}
