package com.example.maxim.androidhw15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "myTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate()",Toast.LENGTH_LONG).show();
        Log.d(TAG, "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Toast.makeText(this, "onPostResume()",Toast.LENGTH_LONG).show();
        Log.d(TAG, "onPostResume()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "onResume()",Toast.LENGTH_LONG).show();
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "onPause()",Toast.LENGTH_LONG).show();
        Log.d(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "onStop()",Toast.LENGTH_LONG).show();
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy()",Toast.LENGTH_LONG).show();
        Log.d(TAG, "onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart()",Toast.LENGTH_LONG).show();
        Log.d(TAG, "onRestart()");
    }
}
