package com.example.btvn;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class MainActivity extends AppCompatActivity implements InterfaceOnClick.iOnClickItem1{
        private RecyclerView rcv;
        private List<String> list;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            list = new ArrayList<>();
            String[] myStringArray = getResources().getStringArray(R.array.my_string_list);
            list = Arrays.asList(myStringArray);


            rcv = findViewById(R.id.rcv);
            Adapter adapter = new Adapter(list,this);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
            rcv.setLayoutManager(layoutManager);
            rcv.setAdapter(adapter);
        }

        @Override
        public void iOnClickItem1(String string) {
            Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,MainActivity2.class);
            intent.putExtra("string",string);
            startActivity(intent);
        }

        public List<String> getList() {
            return list;
        }

    }