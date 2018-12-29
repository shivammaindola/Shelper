package com.shivam.senior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shivam.senior.senior.s_NGO;
import com.shivam.senior.senior.s_places;
import com.shivam.senior.senior.s_entertainment;
import com.shivam.senior.senior.s_homes;
import com.shivam.senior.senior.s_gov;
import com.shivam.senior.senior.s_activity;

public class s_main extends AppCompatActivity {
    Button ngo, homes, entertainment,activity,places,gov,dating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_main);

        ngo=(Button)findViewById(R.id.s_info);
        homes=(Button)findViewById(R.id.s_homes);
        entertainment=(Button)findViewById(R.id.s_entertainment);
        activity=(Button)findViewById(R.id.s_activity);
        places=(Button)findViewById(R.id.s_places);
        gov=(Button)findViewById(R.id.s_gov);
        dating=(Button)findViewById(R.id.s_dating);


        ngo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(s_main.this, s_NGO.class);
                startActivity(intent);
            }

        });

        homes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(s_main.this, s_homes.class);
                startActivity(intent);
            }

        });
        entertainment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(s_main.this, s_entertainment.class);
                startActivity(intent);
            }

        });
        activity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(s_main.this, s_activity.class);
                startActivity(intent);
            }

        });

        places.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(s_main.this, s_places.class);
                startActivity(intent);
            }

        });
        gov.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToGov(view);
            }

        });
        dating.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(s_main.this, ChooseLoginRegistrationActivity.class);
                startActivity(intent);
            }

        });

    }
    public void goToGov(View view) {
        Intent intent = new Intent(s_main.this, s_gov.class);
        startActivity(intent);
        return;
    }
}
