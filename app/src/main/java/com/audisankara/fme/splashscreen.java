package com.audisankara.fme;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


import com.example.fme.R;

public class splashscreen extends Activity {

    private  static final int SPLASH_SCREEN = 3000;
    Animation topanim, bottomanim;
    ImageView image;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.annimiation);
        topanim = AnimationUtils.loadAnimation(this,R.anim.slide_down1);
       // bottomanim = AnimationUtils.loadAnimation(this,R.anim.buttom_animation);
        image = findViewById(R.id.simage);
        image.setAnimation(topanim);
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(splashscreen.this,mainactivity.class);
            startActivity(intent);
            finish();
        },SPLASH_SCREEN);
    }
}