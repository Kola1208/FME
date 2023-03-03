package com.audisankara.fme;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.fme.R;


public class cse_sem2 extends Activity {
    TextView t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    Intent i;
    String subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_sem2);
        Bundle j=getIntent().getExtras();
        String semester=j.getString("semester");
        String department=j.getString("department");
        //Toast.makeText(this, department+semester, Toast.LENGTH_SHORT).show();
        t1= findViewById(R.id.t1);
        t1.setText(semester);
        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        b3= findViewById(R.id.b3);
        b4= findViewById(R.id.b4);
        b5= findViewById(R.id.b5);
        b6= findViewById(R.id.b6);
        b7= findViewById(R.id.b7);
        b8= findViewById(R.id.b8);
        b1.setOnClickListener(view -> {
            String subject=b1.getText().toString();
            i = new Intent(cse_sem2.this, content.class);
            i.putExtra("semester",semester);
            i.putExtra("department",department);
            i.putExtra("subject",subject);
            startActivity(i);
        });
        b2.setOnClickListener(view -> {
            String subject=b2.getText().toString();
            i = new Intent(cse_sem2.this, content.class);
            i.putExtra("semester",semester);
            i.putExtra("department",department);
            i.putExtra("subject",subject);
            startActivity(i);
        });
        b3.setOnClickListener(view -> {
            subject=b3.getText().toString();
            i = new Intent(cse_sem2.this, content.class);
            i.putExtra("semester",semester);
            i.putExtra("department",department);
            i.putExtra("subject",subject);
            startActivity(i);
        });
        b4.setOnClickListener(view -> {
            subject=b4.getText().toString();
            i = new Intent(cse_sem2.this, content.class);
            i.putExtra("semester",semester);
            i.putExtra("department",department);
            i.putExtra("subject",subject);
            startActivity(i);
        });
        b5.setOnClickListener(view -> {
            subject=b5.getText().toString();
            i = new Intent(cse_sem2.this, content.class);
            i.putExtra("semester",semester);
            i.putExtra("department",department);
            i.putExtra("subject",subject);
            startActivity(i);
        });
        b6.setOnClickListener(view -> {
            subject=b6.getText().toString();
            i = new Intent(cse_sem2.this, display.class);
            i.putExtra("semester",semester);
            i.putExtra("department",department);
            i.putExtra("subject",subject);
            startActivity(i);
        });
        b7.setOnClickListener(view -> {
            subject=b7.getText().toString();
            i = new Intent(cse_sem2.this, display.class);
            i.putExtra("semester",semester);
            i.putExtra("department",department);
            i.putExtra("subject",subject);
            startActivity(i);
        });
        b8.setOnClickListener(view -> {
            i = new Intent(cse_sem2.this, display.class);
            subject=b8.getText().toString();
            i.putExtra("semester",semester);
            i.putExtra("department",department);
            i.putExtra("subject",subject);
            startActivity(i);
        });
    }
}