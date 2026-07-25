package com.example.portfolio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class PageOne extends AppCompatActivity {

    private Button AboutMe;
    private Button PageThree;
    private Button PageFour;
    private Button PageFive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page_one);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        AboutMe = findViewById(R.id.aboutMe);
        AboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(PageOne.this, AboutMe.class);
                startActivity(activity);
            }
        });

        PageThree = findViewById(R.id.btnPageThree);
        PageThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(PageOne.this, PageThree.class);
                startActivity(activity);
            }
        });

        PageFour = findViewById(R.id.btnPageFour);
        PageFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(PageOne.this, PageFour.class);
                startActivity(activity);
            }
        });

        PageFive = findViewById(R.id.btnPageFive);
        PageFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(PageOne.this, PageFive.class);
                startActivity(activity);
            }
        });
    }
}