package com.example.thuchanhandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2 ;
    private Button button;
    float ketqua;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.edittext1);
        editText2 = findViewById(R.id.edittext2);
        button = findViewById(R.id.kq);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Lập trình sự kiện ");
    }
    public void lay(){
        try {
            a = Integer.parseInt(editText1.getText().toString().trim());
            b = Integer.parseInt(editText2.getText().toString().trim());
        } catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
    public void tong(View view){
        lay();
        ketqua = a+b;
        button.setText(String.valueOf(ketqua));
    }
    public void hieu(View view){
        lay();
        ketqua = a-b;
        button.setText(String.valueOf(ketqua));
    }
    public void tich(View view){
        lay();
        ketqua = a*b;
        button.setText(String.valueOf(ketqua));
    }
    public void thuong(View view){
        lay();
        ketqua = (float)a/(float) b;
        button.setText(String.valueOf(ketqua));
    }

    public void ucln(View view){
        lay();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        button.setText(String.valueOf(a));
    }
    public void thoat(View view){
        finish();
    }
}