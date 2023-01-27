package com.example.lesson3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.lesson3_1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity  {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btAdd.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,SenondActivity.class);
            intent.putExtra("massage",binding.etText.getText().toString());
            startActivity(intent);

        });


    }


}