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

public class Ambulance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#02ADFC")));


        ListView medical = findViewById(R.id.medical);

        String []array = {"Ambulance in Kenya", "AMREF Flying Doctors Ambulance Service in Kenya", "AAR Emergency Ambulance in Kenya", "Avenue Rescue Services in Kenya", "Kenya Red Cross Society Ambulance in Kenya", "Emergency Plus Medical Services in Kenya", "Phoenix Aviation Limited Ambulance Service in Kenya", "Intensive Care Air Ambulance Limited In Kenya", "Road Safety Network Ambulance Service In Kenya", "St. John Ambulance in Kenya"}
        ;

        ArrayAdapter<String> aa = new ArrayAdapter<String>(getApplicationContext(),
        R.layout.design, array);

        medical.setAdapter(aa);

        medical.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent a = new Intent(Intent.ACTION_DIAL, Uri.parse("112"));
                    startActivity(a);
                }

                if (position == 1){
                    Intent b = new Intent(Intent.ACTION_DIAL, Uri.parse("315454"));
                    startActivity(b);
                }

                if (position == 2){
                    Intent c = new Intent(Intent.ACTION_DIAL, Uri.parse("2717374"));
                    startActivity(c);
                }

                if (position == 3){
                    Intent d = new Intent(Intent.ACTION_DIAL, Uri.parse("3743858"));
                    startActivity(d);
                }

                if (position == 4){
                    Intent e = new Intent(Intent.ACTION_DIAL, Uri.parse("0203950000"));
                    startActivity(e);
                }

                if (position == 5){
                    Intent f = new Intent(Intent.ACTION_DIAL, Uri.parse("0700395395"));
                    startActivity(f);
                }

                if (position == 6){
                    Intent g = new Intent(Intent.ACTION_DIAL, Uri.parse("6005837"));
                    startActivity(g);
                }

                if (position == 7){
                    Intent h = new Intent(Intent.ACTION_DIAL, Uri.parse("6004945"));
                    startActivity(h);
                }

                if (position == 8){
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("2212699"));
                    startActivity(i);
                }

                if (position == 9){
                    Intent j = new Intent(Intent.ACTION_DIAL, Uri.parse("2210000"));
                    startActivity(j);
                }
            }
        }

        );
}}
