package com.example.mafya;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Fire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#02ADFC")));

        ListView fire = findViewById(R.id.fire);
        String[] array = {"Fire Station In Kenya", "Nairobi City Council Fire Emergency", "G4S Fire Services"};

        ArrayAdapter<String> aa = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.design, array);

        fire.setAdapter(aa);

        fire.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent a = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:999"));
                    startActivity(a);
                }

                if (position == 1) {
                    Intent b = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:2222181"));
                    startActivity(b);
                }

                if (position == 2) {
                    Intent c = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:6982999"));
                    startActivity(c);
                }
            }
        });
    }}