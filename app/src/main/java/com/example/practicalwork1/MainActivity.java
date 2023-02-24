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

    private static final int REQUEST_CODE = 123;
    private final String TAG = this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Инициализация TextView строковым ресурсом с помощью ViewBinding
        TextView textViewBookshelf = binding.mainActivityTextViewBookshelf;
        String textBookshelf = getString(R.string.welcome_to_bookshelf);
        textViewBookshelf.setText(textBookshelf);

        // Инициализация ImageView картинкой с помощью ViewBinding
        ImageView imageViewBook1 = binding.mainActivityBookPicture;
        Drawable drawableImageBook1 = getDrawable(R.drawable.book_5);
        imageViewBook1.setImageDrawable(drawableImageBook1);

        // Программное задание обработчика событий
        binding.mainActivityLayoutSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Click settings");
            }
        });
    }

    public void onClickProfile(View view) {
        EditText editText = findViewById(R.id.main_activity__editText_name1);
        String data = editText.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("result", data);
        startActivityForResult(intent, REQUEST_CODE);
    }

    // Обработка результата из другой Activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE) {
            EditText EditName = findViewById(R.id.main_activity__editText_name1);
            if (resultCode == RESULT_OK) {
                // Получаем результат из Intent
                String result = data.getStringExtra("result");
                EditName.setText(result);
            } else {
                EditName.setText("Error");
            }
        }
    }

    // Декларативное задание метода обработчика событий
    public void buttonSaveClickHandler(View view) {
        Log.d(TAG, "Click Save");
    }
}