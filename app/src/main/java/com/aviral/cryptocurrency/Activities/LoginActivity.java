package com.aviral.cryptocurrency.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.aviral.cryptocurrency.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AppCompatButton button = findViewById(R.id.button);

        button.setOnClickListener(view -> startActivity(new Intent(this, MainActivity.class)));
    }
}