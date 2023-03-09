package com.example.practicalwork1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.practicalwork1.adapter.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        ListView listView = view.findViewById(R.id.list_view);
        List<String> items = new ArrayList<>();

        for (int i = 1; i <= 200; i++) {
            items.add("Book " + i);
        }

        ListAdapter adapter = new ListAdapter(getContext(), items);
        listView.setAdapter(adapter);

        // Отображение Toast и сообщения в Log при нажатии на элемент списка
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Clicking on a list item", Toast.LENGTH_SHORT).show();
                Log.i("tag","Clicking on a list item");
            }
        });

        return view;
    }

}