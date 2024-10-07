package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,cong,tru,nhan,chia,cham,xoa,xoahet,mongoac,dongngoac,bang;
    private ArrayList<Button> listbt;
    private EditText operation,kq;
    private String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operation = findViewById(R.id.operation);
        kq = findViewById(R.id.result);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);


        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhann);
        chia = findViewById(R.id.chia);
        mongoac = findViewById(R.id.mongoac);
        dongngoac = findViewById(R.id.dongngoac);
        cham = findViewById(R.id.cham);
        bang = findViewById(R.id.bang);
        xoa = findViewById(R.id.xoa);
        xoahet = findViewById(R.id.xoahet);


        listbt = new ArrayList<>();
        listbt.add(button0);
        listbt.add(button1);
        listbt.add(button2);
        listbt.add(button3);
        listbt.add(button4);
        listbt.add(button5);
        listbt.add(button6);
        listbt.add(button7);
        listbt.add(button8);
        listbt.add(button9);
        listbt.add(cong);
        listbt.add(tru);
        listbt.add(nhan);
        listbt.add(chia);
        listbt.add(cham);
        listbt.add(mongoac);
        listbt.add(dongngoac);
        for (Button a: listbt) {
            a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!operation.getText().toString().equals("0")){
                        if (a.getText().toString().equals("x")){
                            operation.setText(operation.getText().toString()+"*");
                        }
                        else {
                            operation.setText(operation.getText().toString()+a.getText().toString());
                        }
                    } else {
                        operation.setText(a.getText().toString());
                    }
                }
            });
        }

        xoa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (operation.getText().toString().length()>1){
                    operation.setText(operation.getText().toString().substring(0,operation.getText().toString().length()-1));
                    kq.setText("0");
                }
                else if (operation.getText().toString().length()==1 && !operation.getText().toString().equals("0")){
                    operation.setText("0");
                    kq.setText("0");
                }
            }
        });
        xoahet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText("0");
                kq.setText("0");
            }
        });
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = operation.getText().toString();
                Expression exp = new ExpressionBuilder(expression).build();
                double result = exp.evaluate();
                DecimalFormat df = new DecimalFormat("#.##");
                String formattedResult = df.format(result);
                kq.setText(formattedResult);

            }
        });
        // Tạo và tính toán biểu thức



    }
}