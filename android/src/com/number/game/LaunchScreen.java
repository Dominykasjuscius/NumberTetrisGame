package com.number.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Switch;

public class LaunchScreen extends Activity {
    public static boolean ad;
    public static boolean div;
    public static boolean mul;
    public static Button start;
    public static boolean sub;
    Switch addition;
    Switch division;
    boolean firstTime = true;
    Switch multiplication;
    Switch subtraction;

    /* renamed from: com.mygdx.game.LaunchScreen$1 */
    class C09171 implements OnClickListener {
        C09171() {
        }

        public void onClick(View view) {
            if (LaunchScreen.ad) {
                LaunchScreen.ad = false;
            } else {
                LaunchScreen.ad = true;
            }
        }
    }

    /* renamed from: com.mygdx.game.LaunchScreen$2 */
    class C09182 implements OnClickListener {
        C09182() {
        }

        public void onClick(View view) {
            if (LaunchScreen.sub) {
                LaunchScreen.sub = false;
            } else {
                LaunchScreen.sub = true;
            }
        }
    }

    /* renamed from: com.mygdx.game.LaunchScreen$3 */
    class C09193 implements OnClickListener {
        C09193() {
        }

        public void onClick(View view) {
            if (LaunchScreen.mul) {
                LaunchScreen.mul = false;
            } else {
                LaunchScreen.mul = true;
            }
        }
    }

    /* renamed from: com.mygdx.game.LaunchScreen$4 */
    class C09204 implements OnClickListener {
        C09204() {
        }

        public void onClick(View view) {
            if (LaunchScreen.div) {
                LaunchScreen.div = false;
            } else {
                LaunchScreen.div = true;
            }
        }
    }

    /* renamed from: com.mygdx.game.LaunchScreen$5 */
    class C09215 implements OnClickListener {
        C09215() {
        }

        public void onClick(View view) {
            LaunchScreen.this.getBaseContext().startActivity(new Intent(LaunchScreen.this.getBaseContext(), AndroidLauncher.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);
        start = (Button) findViewById(R.id.Start);
        this.addition = (Switch) findViewById(R.id.addition);
        this.subtraction = (Switch) findViewById(R.id.subtraction);
        this.multiplication = (Switch) findViewById(R.id.multiplication);
        this.division = (Switch) findViewById(R.id.division);
        this.addition.setOnClickListener(new C09171());
        this.subtraction.setOnClickListener(new C09182());
        this.multiplication.setOnClickListener(new C09193());
        this.division.setOnClickListener(new C09204());
        start.setOnClickListener(new C09215());
    }
}
