package com.example.practicalwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

        // Инициализация TextView строковым ресурсом с помощью ViewBinding
        TextView textViewBookshelf = binding.mainActivityTextViewBookshelf;
        String textBookshelf = getString(R.string.welcome_to_bookshelf);
        textViewBookshelf.setText(textBookshelf);

        // Инициализация ImageView картинкой с помощью ViewBinding
        ImageView imageViewBook1 = binding.mainActivityBookPicture;
        Drawable drawableImageBook1 = getDrawable(R.drawable.book_5);
        imageViewBook1.setImageDrawable(drawableImageBook1);

        // Программное задание обработчика событий
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Click go to profile");
            }
        });
    }

    // Декларативное задание метода обработчика событий
    public void buttonSaveClickHandler(View view) {
        Log.d(TAG, "Click Save");
    }

}