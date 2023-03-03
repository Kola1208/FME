package com.audisankara.fme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fme.R;


public class semester extends Activity {
    public Button b1, b2;
     public TextView t1;
     String department;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester);
        Bundle k=getIntent().getExtras();
        department=k.getString("department");

        t1=findViewById(R.id.t1);
        t1.setText(department);
        b1 =  findViewById(R.id.b1);
        b2 =  findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            Intent i;
            String semester;
            @Override
            public void onClick(View view) {
                switch(k.getString("department")){
                    case "computer science and engineering":
                        semester=b1.getText().toString();
                        i = new Intent(semester.this, cse_sem1.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "cse(ai)":
                        semester=b1.getText().toString();
                        i = new Intent(semester.this, cseai_sem1.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "cse(ds)":
                        semester=b1.getText().toString();
                         i = new Intent(semester.this, cseds_sem1.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "eletronics and communication engineering":
                        semester=b1.getText().toString();
                         i = new Intent(semester.this, ece_sem1.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "electrical and eletronic engineering":
                        semester=b1.getText().toString();
                       i = new Intent(semester.this, eee_sem1.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "mechanical engineering":
                        semester=b1.getText().toString();
                        i = new Intent(semester.this, mech_sem1.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "civil engineering":
                        semester=b1.getText().toString();
                         i = new Intent(semester.this, civil_sem1.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            Intent i;
            String semester;
            @Override
            public void onClick(View view) {
                switch(k.getString("department")){
                    case "computer science and engineering":
                        semester=b2.getText().toString();
                        i = new Intent(semester.this, cse_sem2.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "cse(ai)":
                        semester=b2.getText().toString();
                        i = new Intent(semester.this, cseai_sem2.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "cse(ds)":
                        semester=b2.getText().toString();
                        i = new Intent(semester.this, cseds_sem2.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "eletronics and communication engineering":
                        semester=b2.getText().toString();
                        i = new Intent(semester.this, ece_sem2.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "electrical and eletronic engineering":
                        semester=b2.getText().toString();
                        i = new Intent(semester.this, eee_sem2.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "mechanical engineering":
                        semester=b2.getText().toString();
                        i = new Intent(semester.this, mech_sem2.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                    case "civil engineering":
                        semester=b2.getText().toString();
                        i = new Intent(semester.this, civil_sem2.class);
                        i.putExtra("semester",semester);
                        i.putExtra("department",department);
                        startActivity(i);
                        break;
                }
            }
        });
    }
}

