package com.example.btvn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculate extends AppCompatActivity {


    EditText etxt1,etxt2;
    TextView txt;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate);
        etxt1  = findViewById(R.id.etxt1);
        etxt2  = findViewById(R.id.etxt2);
        txt  = findViewById(R.id.txt1);
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(etxt1.getText().toString().trim());
                int y = Integer.parseInt(etxt2.getText().toString().trim());
                int result = x + y;
                txt.setText(String.valueOf(result));
            }
        });
    }
    public void minus(View view){
        int x = Integer.parseInt(etxt1.getText().toString().trim());
        int y = Integer.parseInt(etxt2.getText().toString().trim());
        int result = x - y;
        txt.setText(String.valueOf(result));
    }
    public void nhan(View view){
        int x = Integer.parseInt(etxt1.getText().toString().trim());
        int y = Integer.parseInt(etxt2.getText().toString().trim());
        int result = x * y;
        txt.setText(String.valueOf(result));
    }
    public void chia(View view){
        int x = Integer.parseInt(etxt1.getText().toString().trim());
        int y = Integer.parseInt(etxt2.getText().toString().trim());
        float result = (float)x / (float) y;
        txt.setText(String.valueOf(result));
    }
    public void chialaydu(View view){
        int x = Integer.parseInt(etxt1.getText().toString().trim());
        int y = Integer.parseInt(etxt2.getText().toString().trim());
        float result = (float) (x % y);
        txt.setText(String.valueOf(result));
    }

}