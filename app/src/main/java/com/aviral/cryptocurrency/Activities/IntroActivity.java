package com.aviral.cryptocurrency.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.aviral.cryptocurrency.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ImageView button = findViewById(R.id.imageView3);

        button.setOnClickListener(view -> startActivity(new Intent(this, LoginActivity.class)));
    }
}