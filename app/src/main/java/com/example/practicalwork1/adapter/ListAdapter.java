package com.example.practicalwork1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practicalwork1.R;

import java.util.List;

public class ListAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final List<String> items;

    public ListAdapter(Context context, List<String> items) {
        super(context, R.layout.list_item, items);
        this.context = context;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item, parent, false);

        ImageView imageView = view.findViewById(R.id.image_view);
        imageView.setImageResource(R.drawable.book_5);

        TextView textView1 = view.findViewById(R.id.text_view1);
        textView1.setText(items.get(position));

        return view;
    }
}

