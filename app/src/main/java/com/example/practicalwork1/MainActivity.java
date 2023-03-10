package com.example.practicalwork1;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practicalwork1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void onClickProfile(View view) {
        EditText editText = findViewById(R.id.main_activity__editText_name1);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("result", editText.getText().toString());
        mStartForResult.launch(intent);
    }

    // Обработка результата из другой Activity
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    EditText editText = findViewById(R.id.main_activity__editText_name1);
                    if (result.getResultCode() == RESULT_OK) {
                        Intent intent = result.getData();
                        String name = intent.getStringExtra("result");
                        editText.setText(name);
                    }
                }
            });

    // Декларативное задание метода обработчика событий
    public void buttonSaveClickHandler(View view) {
        Log.d(TAG, "Click Save");
    }
}