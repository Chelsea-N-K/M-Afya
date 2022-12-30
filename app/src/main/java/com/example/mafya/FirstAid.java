package com.example.mafya;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FirstAid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#02ADFC")));

        ListView aid = findViewById(R.id.aid);
        String []array={"What To Do If An Adult Is Bleeding" ,"What To Do If An Adult Is Choking", "What To Do If An Adult Is Having A Heart Attack", "What To Do If An Adult Is Unresponsive", "What To Do If An Adult Is Unresponsive And Not Breathing Properly",
                "How To Treat A Burn Or A Scald", "How To Hold A Baby In The Recovery Position", "What To Do If A Baby Is Having A Seizure", "What To Do If A Baby Has Stopped Breathing", "What To Do If A Baby Is Choking"};

        ArrayAdapter<String> aa = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.design, array);

        aid.setAdapter(aa);

        aid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent a = new Intent(getApplicationContext(), Display.class);
                    Bundle b = new Bundle();
                    b.putInt("key",position);
                    a.putExtras(b);
                    startActivity(a);



            }
        });
    }
}
