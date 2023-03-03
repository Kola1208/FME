package com.audisankara.fme;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

import com.example.fme.R;

public class mainactivity extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depatment);
        b1 =  findViewById(R.id.b1);
        b2 =  findViewById(R.id.b2);
        b3 =  findViewById(R.id.b3);
        b4 =  findViewById(R.id.b4);
        b5 =  findViewById(R.id.b5);
        b6 =  findViewById(R.id.b6);
        b7 =  findViewById(R.id.b7);
        b1.setOnClickListener(view -> {
            String department=b1.getText().toString();
            Intent i=new Intent(mainactivity.this,semester.class);
            i.putExtra("department",department);
            startActivity(i);
        });
        b2.setOnClickListener(view -> {
            String department=b2.getText().toString();
            Intent i=new Intent(mainactivity.this,semester.class);
            i.putExtra("department",department);
            startActivity(i);
        });
        b3.setOnClickListener(view -> {
            String department=b3.getText().toString();
            Intent i=new Intent(mainactivity.this,semester.class);
            i.putExtra("department",department);
            startActivity(i);
        });
        b4.setOnClickListener(view -> {
            String department=b4.getText().toString();
            Intent i=new Intent(mainactivity.this,semester.class);
            i.putExtra("department",department);
            startActivity(i);
        });
        b5.setOnClickListener(view -> {
            String department=b5.getText().toString();
            Intent i=new Intent(mainactivity.this,semester.class);
            i.putExtra("department",department);
            startActivity(i);
        });
        b6.setOnClickListener(view -> {
            String department=b6.getText().toString();
            Intent i=new Intent(mainactivity.this,semester.class);
            i.putExtra("department",department);
            startActivity(i);
        });
        b7.setOnClickListener(view -> {
            String department=b7.getText().toString();
            Intent i=new Intent(mainactivity.this,semester.class);
            i.putExtra("department",department);
            startActivity(i);
        });
    }


}
