package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getname,getadmno,getrollno,getcg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=(EditText) findViewById(R.id.na);
        ed2=(EditText) findViewById(R.id.admn);
        ed3=(EditText) findViewById(R.id.rno);
        ed4=(EditText) findViewById(R.id.cg);
        b1=(AppCompatButton) findViewById(R.id.sub);
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
                getname=ed1.getText().toString();
                getadmno=ed2.getText().toString();
                getrollno=ed3.getText().toString();
                getcg=ed4.getText().toString();
                Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getadmno, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getrollno, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getcg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}