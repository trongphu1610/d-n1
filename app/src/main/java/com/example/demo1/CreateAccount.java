package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }

    public void exit(View view) {
        Intent intent = new Intent(CreateAccount.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void add(View view) {
        Intent intent = new Intent(CreateAccount.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
