package com.firtstprojectsuvojitsarker.embedvideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPlayer.video_url="https://www.youtube.com/embed/Lm_0GXPr1vk";

                Intent myintent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myintent);

            }
        });

        button2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPlayer.video_url="https://www.youtube.com/embed/yJg-Y5byMMw";

                Intent myintent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myintent);

            }
        });

        button3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPlayer.video_url="https://www.youtube.com/embed/9Oa_mWpckns";

                Intent myintent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myintent);

            }
        });

    }
}