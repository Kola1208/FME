package com.audisankara.fme;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.annotation.Nullable;

import com.example.fme.R;

public class content extends Activity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    String department,semester,subject,type;
    RelativeLayout b1,b2,b3,b4,b5,b6,b7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
        Bundle j=getIntent().getExtras();
        department=j.getString("department");
        semester=j.getString("semester");
        subject=j.getString("subject");
        //Toast.makeText(this, department+semester+subject, Toast.LENGTH_LONG).show();
        t1= findViewById(R.id.t1);
        t1.setText(subject);
        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        b3= findViewById(R.id.b3);
        b4= findViewById(R.id.b4);
        b5= findViewById(R.id.b5);
        b6= findViewById(R.id.b6);
        b7= findViewById(R.id.b7);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        b1.setOnClickListener(view -> {
            type=t2.getText().toString();
            Intent i=new Intent(content.this,display.class);
            i.putExtra("department",department);
            i.putExtra("semester",semester);
            i.putExtra("subject",subject);
            i.putExtra("type",type);
            startActivity(i);
        });
        b2.setOnClickListener(view -> {
            type=t3.getText().toString();
            Intent i=new Intent(content.this,display.class);
            i.putExtra("department",department);
            i.putExtra("semester",semester);
            i.putExtra("subject",subject);
            i.putExtra("type",type);
            startActivity(i);
        });
        b3.setOnClickListener(view -> {
            type=t4.getText().toString();
            Intent i=new Intent(content.this,display.class);
            i.putExtra("department",department);
            i.putExtra("semester",semester);
            i.putExtra("subject",subject);
            i.putExtra("type",type);
            startActivity(i);
        });

        b4.setOnClickListener(view -> {
            type=t5.getText().toString();
            Intent i=new Intent(content.this,display.class);
            i.putExtra("department",department);
            i.putExtra("semester",semester);
            i.putExtra("subject",subject);
            i.putExtra("type",type);
            startActivity(i);
        });
        b5.setOnClickListener(view -> {
            type=t6.getText().toString();
            Intent i=new Intent(content.this,display.class);
            i.putExtra("department",department);
            i.putExtra("semester",semester);
            i.putExtra("subject",subject);
            i.putExtra("type",type);
            startActivity(i);
        });
        b6.setOnClickListener(view -> {
            type=t7.getText().toString();
            Intent i=new Intent(content.this,display.class);
            i.putExtra("department",department);
            i.putExtra("semester",semester);
            i.putExtra("subject",subject);
            i.putExtra("type",type);
            startActivity(i);
        });
        b7.setOnClickListener(view -> {
            type=t8.getText().toString();
            Intent i=new Intent(content.this,display.class);
            i.putExtra("department",department);
            i.putExtra("semester",semester);
            i.putExtra("subject",subject);
            i.putExtra("type",type);
            startActivity(i);
        });

    }
}
