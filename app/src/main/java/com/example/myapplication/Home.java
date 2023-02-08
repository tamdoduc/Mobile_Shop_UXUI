package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        LinearLayout layout = (LinearLayout) findViewById(R.id.sp1);


        Button btOpenHot = (Button) findViewById(R.id.btOpenHot);
        btOpenHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Hot.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button btOpenCategory = (Button) findViewById(R.id.btOpenCategory);
        btOpenCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Category.class);
                startActivityForResult(myIntent, 0);
            }
        });

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

        ImageView imageView = (ImageView) findViewById(R.id.imgHome);
        imageView.setImageResource(R.drawable.home_enable);
    }
}