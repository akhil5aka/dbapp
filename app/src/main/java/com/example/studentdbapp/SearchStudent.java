package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchStudent extends AppCompatActivity {
EditText ed1;
String getadmn;
AppCompatButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_student);
        ed1=(EditText) findViewById(R.id.adm);
        b1=(AppCompatButton) findViewById(R.id.sc);
        b2=(AppCompatButton) findViewById(R.id.bcm);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getadmn=ed1.getText().toString();
                Toast.makeText(getApplicationContext(), getadmn, Toast.LENGTH_SHORT).show();
            }
        });
    }
}