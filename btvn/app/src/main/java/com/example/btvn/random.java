package com.example.btvn;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class random extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);



        int[] listUri =new int[6];
        listUri[0] = R.drawable.dice1;
        listUri[1] = R.drawable.dice2;
        listUri[2] = R.drawable.dice3;
        listUri[3] = R.drawable.dice4;
        listUri[4] = R.drawable.dice5;
        listUri[5] = R.drawable.dice6;


        Button button = findViewById(R.id.bt);
        ImageView imageView = findViewById(R.id.vd);
        button.setOnClickListener(v -> {
            Random random = new Random();
            // Tạo số ngẫu nhiên từ 1 đến 6
            int randomNumber = random.nextInt(6);
            imageView.setImageResource(listUri[randomNumber]);
        });

    }
}