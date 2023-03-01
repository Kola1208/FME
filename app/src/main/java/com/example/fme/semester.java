package com.example.fme;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class semester extends Activity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester);
        t1=(TextView)findViewById(R.id.t1);
        Bundle i=getIntent().getExtras();
        String department=i.getString("department");
        Toast.makeText(this, department, Toast.LENGTH_SHORT).show();
        t1.setText(department);
}
}
