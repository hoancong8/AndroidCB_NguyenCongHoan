package com.example.th17_9_2024;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class bai3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai3);
    }
    public void btntinhBMI(View view){
        Button btnchandoan = (Button) findViewById(R.id.tinhbmi);
        EditText editTen, editchieucao, editCannang, editBMI, editchandoan;

        editTen = (EditText) findViewById(R.id.ten);
        editchieucao = (EditText) findViewById(R.id.chieucao);
        editCannang = (EditText) findViewById(R.id.cannang);
        editBMI = (EditText) findViewById(R.id.bmi);
        editchandoan = (EditText) findViewById(R.id.chuandoan);

        double H = Double.parseDouble(editchieucao.getText() + "") / 100;
        double W = Double.parseDouble(editCannang.getText() + "");
        double BMI = W / Math.pow(H, 2);
        String chandoan = "";

        if (BMI < 18)
            chandoan = "Bạn gầy";
        else if (BMI <= 24.9)
            chandoan = "Bạn bình thường";
        else if (BMI <= 29.9)
            chandoan = "Bạn béo phì độ 1";
        else if (BMI <= 34.9)
            chandoan = "Bạn béo phì độ 2";
        else {
            chandoan = " Bạn béo phì độ 3";
        }
        DecimalFormat dcf = new DecimalFormat("#.0");
        editBMI.setText(dcf.format(BMI));
        editchandoan.setText(chandoan);
    }
}
