package com.example.lesson3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.lesson3_1.databinding.ActivitySenondBinding;

public class SenondActivity extends AppCompatActivity {
    private ActivitySenondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySenondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       String messing = getIntent().getExtras().getString("massage");
       binding.textView.setText(messing);

    }
}