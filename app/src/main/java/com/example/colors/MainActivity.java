package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private TextView textViewColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int red = random.nextInt(256);//ha nem adunk meg számot csak nullát generál
                int green = random.nextInt(256);//ha nem adunk meg számot csak nullát generál
                int blue = random.nextInt(256);//ha nem adunk meg számot csak nullát generál

                textViewColor.setBackgroundColor(Color.rgb(red, green, blue));
                textViewColor.setText("("+ red +","+ green + "," + blue + ")");
                int osszes = red + green + blue;
                if (osszes > 400){
                    textViewColor.setTextColor(Color.BLACK);
                } else {
                    textViewColor.setTextColor(Color.WHITE);
                }

            }
        });
    }

    public void init(){
        relativeLayout = findViewById(R.id.relativeLayout);
        textViewColor = findViewById(R.id.textViewColor);
    }
}