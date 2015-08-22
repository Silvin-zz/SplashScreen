package com.example.silviobravocado.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by silviobravocado on 22/08/15.
 */
public class SpashScreen extends Activity {

    private int splash = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreem_layout);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SpashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, splash);

    }

}
