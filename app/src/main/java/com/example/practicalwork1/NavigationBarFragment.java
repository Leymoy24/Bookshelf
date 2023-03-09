package com.example.practicalwork1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

public class NavigationBarFragment extends Fragment {

    private FragmentManager fragmentManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navigation_bar, container, false);

        //Переход в ThirdFragment по нажатии на кнопку main_activity__layout_home_button
        LinearLayout linearLayout_home = view.findViewById(R.id.main_activity__layout_home_button);
        linearLayout_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.constraint_layout_main, new ThirdFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        //Переход в ReadingFragment по нажатии на кнопку main_activity__layout_book_button
        LinearLayout linearLayout_reading = view.findViewById(R.id.main_activity__layout_book_button);
        linearLayout_reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.constraint_layout_main, new ReadingFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });


        return view;
    }
}