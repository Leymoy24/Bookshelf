package com.example.practicalwork1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstFragment extends Fragment {

    private FragmentManager fragmentManager;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(getActivity(), "Fragment attached", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment attached");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "Fragment created", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment created");

        fragmentManager = getParentFragmentManager();
        fragmentManager.setFragmentResultListener("written data", this, ((requestKey, result) -> {
            EditText editText1 = (EditText) getActivity().findViewById(R.id.main_activity__editText_name1);
            EditText editText2 = (EditText) getActivity().findViewById(R.id.main_activity__editText_name2);
            EditText editText3 = (EditText) getActivity().findViewById(R.id.main_activity__editText_name3);

            String name = result.getString("name1");
            editText1.setText(name);
            String lastName = result.getString("lastName1");
            editText2.setText(lastName);
            String password = result.getString("email1");
            editText3.setText(password);
        }));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Button button = view.findViewById(R.id.button2);
        button.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            EditText editText1 = (EditText) getActivity().findViewById(R.id.main_activity__editText_name1);
            bundle.putString("name", editText1.getText().toString());

            EditText editText2 = (EditText) getActivity().findViewById(R.id.main_activity__editText_name2);
            bundle.putString("lastName", editText2.getText().toString());

            EditText editText3 = (EditText) getActivity().findViewById(R.id.main_activity__editText_name3);
            bundle.putString("email", editText3.getText().toString());

            fragmentManager = getParentFragmentManager();
            fragmentManager.setFragmentResult("go to personal data", bundle);
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.constraint_layout_main, new SecondFragment());
            fragmentTransaction.addToBackStack(null).commit();
        });

        Toast.makeText(getActivity(), "Fragment createdView", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment createdView");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(), "Fragment activityCreated", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment activityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), "Fragment started", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment started");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "Fragment resumed", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment resumed");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(), "Fragment stopped", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment stopped");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getActivity(), "Fragment savedInstanceState", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment savedInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getActivity(), "Fragment stopped", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment stopped");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getActivity(), "Fragment destroyedView", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment destroyedView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(), "Fragment destroyed", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment destroyed");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "Fragment detached", Toast.LENGTH_SHORT).show();
        Log.d("MyFragment", "Fragment detached");
    }
}