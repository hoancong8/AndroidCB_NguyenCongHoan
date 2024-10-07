package com.example.convertcf;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText c,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = findViewById(R.id.ipCelsius);
        f = findViewById(R.id.ipFahrenheit);
    }
    public void convertC(View view){
        if (!f.getText().toString().isEmpty()){
            double a = Double.parseDouble(f.getText().toString());
            double kq = (a-32)*5f/9f;
            c.setText(String.valueOf(kq));
        }
    }
    public void convertF(View view){
        if (!c.getText().toString().isEmpty()) {
            double a = Double.parseDouble(c.getText().toString());
            double kq = (a * 9f / 5f) + 32;
            f.setText(String.valueOf(kq));
        }
    }
    public void clear(View view){
        c.setText("");
        f.setText("");
    }
}