package com.example.contact;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<Mycontact> listContact = new ArrayList<>();
    ContactAdapter contactAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        initdata();
        lvContact = findViewById(R.id.lvContact);

        contactAdapter = new ContactAdapter(MainActivity.this,
                R.layout.layout_item_contact, listContact);
        lvContact.setAdapter(contactAdapter);
    }
    private void initdata(){
        listContact.add( new Mycontact(android.R.drawable.sym_def_app_icon, "Wukonghi", "0999999999"));
        listContact.add( new Mycontact(android.R.drawable.sym_def_app_icon, "Wukonghhvv", "0999999999"));
        listContact.add( new Mycontact(android.R.drawable.sym_def_app_icon, "Wukongịb", "0999999999"));
        listContact.add( new Mycontact(android.R.drawable.sym_def_app_icon, "Wukongdfd", "0999999999"));
        listContact.add( new Mycontact(android.R.drawable.sym_def_app_icon, "Wukongdfd", "0999999999"));



    }
}