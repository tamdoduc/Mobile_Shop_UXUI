package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Product extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_info);

        LinearLayout btHome = (LinearLayout) findViewById(R.id.btHome);
        btHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Home.class);
                startActivityForResult(myIntent, 0);
            }
        });
        LinearLayout btBuyHelp = (LinearLayout) findViewById(R.id.btBuyHelp);
        btBuyHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),BuyHelp.class);
                startActivityForResult(myIntent, 0);
            }
        });
        LinearLayout btMe = (LinearLayout) findViewById(R.id.btMe);
        btMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Profile.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}