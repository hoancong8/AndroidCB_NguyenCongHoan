package com.example.bai1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void search(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.figma.com/login"));
        startActivity(intent);

    }
    public void bai1_1(View view){
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(+84)796336514"));
        startActivity(intent);
    }
    public void bai2_1(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+84)796336514"));
        startActivity(intent);
    }
    public void bai2_2(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
        startActivity(intent);
    }
}