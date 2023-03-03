package com.example.practicalwork1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    private FragmentManager fragmentManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentManager = getParentFragmentManager();
        fragmentManager.setFragmentResultListener("go to personal data", this, ((requestKey, result) -> {
            EditText editText1 = (EditText) getActivity().findViewById(R.id.editTextTextPersonName);
            EditText editText2 = (EditText) getActivity().findViewById(R.id.editTextTextPersonName2);
            EditText editText3 = (EditText) getActivity().findViewById(R.id.editTextTextPersonName3);

            String name = result.getString("name");
            editText1.setText(name);
            String lastName = result.getString("lastName");
            editText2.setText(lastName);
            String password = result.getString("email");
            editText3.setText(password);
        }));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        Button button = view.findViewById(R.id.second_activity__saveButton);
        button.setOnClickListener(v -> {
            EditText editText1 = (EditText) getActivity().findViewById(R.id.editTextTextPersonName);
            EditText editText2 = (EditText) getActivity().findViewById(R.id.editTextTextPersonName2);
            EditText editText3 = (EditText) getActivity().findViewById(R.id.editTextTextPersonName3);

            Bundle bundle = new Bundle();
            bundle.putString("name1", editText1.getText().toString());
            bundle.putString("lastName1", editText2.getText().toString());
            bundle.putString("email1", editText3.getText().toString());

            fragmentManager = getParentFragmentManager();
            fragmentManager.setFragmentResult("written data", bundle);
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.constraint_layout_main, new FirstFragment());
            fragmentTransaction.addToBackStack(null).commit();
        });

        return view;
    }
}