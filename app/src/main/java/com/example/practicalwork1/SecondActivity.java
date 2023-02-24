package com.example.practicalwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.practicalwork1.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("result");
            if (name != null) {
                binding.editTextTextPersonName.setText(name);
            }
        }

        binding.secondActivitySaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = binding.editTextTextPersonName.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("result", name1);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}