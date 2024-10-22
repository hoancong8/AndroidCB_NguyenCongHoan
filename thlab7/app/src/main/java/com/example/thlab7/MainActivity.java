package com.example.thlab7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private EditText user, pwd;
    private CheckBox checkBox;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pwd = findViewById(R.id.pwd);
        checkBox = findViewById(R.id.checkBox);
        bt = findViewById(R.id.login);
        sp = getSharedPreferences("login", MODE_PRIVATE);
        editor = sp.edit();


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean("check", checkBox.isChecked());
                save();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("user",sp.getString("user",""));
                startActivity(intent);

            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        save();
    }

    @Override
    protected void onResume() {
        super.onResume();
        reStoring();
    }

    private void reStoring() {
        SharedPreferences pre = this.getSharedPreferences("login", MODE_PRIVATE);
        if (pre != null) {
            if (pre.getBoolean("check", false)) {
                user.setText(pre.getString("user", ""));
                pwd.setText(pre.getString("pwd", ""));
                checkBox.setChecked((pre.getBoolean("check", false)));
            }


        }
    }

    private void save() {
        SharedPreferences pre = this.getSharedPreferences("login", MODE_PRIVATE);
        if (pre != null) {
            if (checkBox.isChecked()) {
                editor.putString("user", user.getText().toString());
                editor.putString("pwd", pwd.getText().toString());
                editor.commit();
            } else {
                editor.clear();
                editor.commit();
            }
        }
    }
}