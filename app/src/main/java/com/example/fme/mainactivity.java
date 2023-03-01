package com.example.fme;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainactivity extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depatment);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String department=b1.getText().toString();
                Intent i=new Intent(mainactivity.this,semester.class);
                i.putExtra("department",department);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String department=b2.getText().toString();
                Intent i=new Intent(mainactivity.this,semester.class);
                i.putExtra("department",department);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String department=b3.getText().toString();
                Intent i=new Intent(mainactivity.this,semester.class);
                i.putExtra("department",department);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String department=b4.getText().toString();
                Intent i=new Intent(mainactivity.this,semester.class);
                i.putExtra("department",department);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String department=b5.getText().toString();
                Intent i=new Intent(mainactivity.this,semester.class);
                i.putExtra("department",department);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String department=b6.getText().toString();
                Intent i=new Intent(mainactivity.this,semester.class);
                i.putExtra("department",department);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String department=b7.getText().toString();
                Intent i=new Intent(mainactivity.this,semester.class);
                i.putExtra("department",department);
                startActivity(i);
            }
        });
    }


}
