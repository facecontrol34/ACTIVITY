package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String TAG = "lifecycle";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Activity создано");
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "Восстанавливает состояние");
        Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(TAG, "Activity перезапущено");
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "Activity становится видимым");
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "Activity получает фокус (состояние Resumed)");
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.d(TAG, "Activity сохраняет состояние");
        Toast.makeText(this, "onSaveInstanceState()", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "Activity приостоновлено (состояне Paused)");
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "Activity остоновлено(состояние Stopped)");
        Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Activity Уничтожено");
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }
}