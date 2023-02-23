package com.example.practicalwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practicalwork1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Инициализацию TextView строковым ресурсом с помощью ViewBinding
        TextView textViewBookshelf = binding.mainActivityTextViewBookshelf;
        String textBookshelf = getString(R.string.welcome_to_bookshelf);
        textViewBookshelf.setText(textBookshelf);

        // Инициализация ImageView картинкой с помощью ViewBinding
        ImageView imageViewBook1 = binding.mainActivityBookPicture;
        Drawable drawableImageBook1 = getDrawable(R.drawable.book_5);
        imageViewBook1.setImageDrawable(drawableImageBook1);
    }
}