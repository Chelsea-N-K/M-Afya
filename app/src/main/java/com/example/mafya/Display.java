package com.example.mafya;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#02ADFC")));

        WebView webdisplay = findViewById(R.id.webdisplay);

        Bundle b = getIntent().getExtras();
        int position = b.getInt("key");

        if (position==0){
            webdisplay.loadUrl("file:///android_asset/adultbleeding.html");
        }

        if (position==1){
            webdisplay.loadUrl("file:///android_asset/adultchoke.html");
        }

        if (position==2){
            webdisplay.loadUrl("file:///android_asset/heartattack.html");
        }

        if (position==3){
            webdisplay.loadUrl("file:///android_asset/adultunresponsive.html");
        }

        if (position==4){
            webdisplay.loadUrl("file:///android_asset/adultunresponsive2.html");
        }

        if (position==5){
            webdisplay.loadUrl("file:///android_asset/burn.html");
        }

        if (position==6){
            webdisplay.loadUrl("file:///android_asset/babyposition.html");
        }

        if (position==7){
            webdisplay.loadUrl("file:///android_asset/babyseizure.html");
        }

        if (position==8){
            webdisplay.loadUrl("file:///android_asset/babybreathing.html");
        }

        if (position==9){
            webdisplay.loadUrl("file:///android_asset/babychoking.html");
        }


    }
}
