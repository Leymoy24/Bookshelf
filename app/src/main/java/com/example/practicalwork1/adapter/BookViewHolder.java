package com.example.practicalwork1.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.practicalwork1.R;

public class BookViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;

    public BookViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_view);
        textView = itemView.findViewById(R.id.text_view1);
    }
}
