package com.example.practicalwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate information");
        Log.e(TAG, "onCreate error");
        Log.d(TAG, "onCreate debug");
        Log.w(TAG, "onCreate warning");
        Log.v(TAG, "onCreate verbose");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStart information");
        Log.e(TAG, "onStart error");
        Log.d(TAG, "onStart debug");
        Log.w(TAG, "onStart warning");
        Log.v(TAG, "onStart verbose");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop information");
        Log.e(TAG, "onStop error");
        Log.d(TAG, "onStop debug");
        Log.w(TAG, "onStop warning");
        Log.v(TAG, "onStop verbose");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroy information");
        Log.e(TAG, "onDestroy error");
        Log.d(TAG, "onDestroy debug");
        Log.w(TAG, "onDestroy warning");
        Log.v(TAG, "onDestroy verbose");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onPause information");
        Log.e(TAG, "onPause error");
        Log.d(TAG, "onPause debug");
        Log.w(TAG, "onPause warning");
        Log.v(TAG, "onPause verbose");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume information");
        Log.e(TAG, "onResume error");
        Log.d(TAG, "onResume debug");
        Log.w(TAG, "onResume warning");
        Log.v(TAG, "onResume verbose");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onRestart information");
        Log.e(TAG, "onRestart error");
        Log.d(TAG, "onRestart debug");
        Log.w(TAG, "onRestart warning");
        Log.v(TAG, "onRestart verbose");
    }
}