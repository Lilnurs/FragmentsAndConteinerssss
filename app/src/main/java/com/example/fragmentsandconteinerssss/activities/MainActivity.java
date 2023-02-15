package com.example.fragmentsandconteinerssss.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fragmentsandconteinerssss.R;
import com.example.fragmentsandconteinerssss.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new FirstFragment()).commit();
    }
}