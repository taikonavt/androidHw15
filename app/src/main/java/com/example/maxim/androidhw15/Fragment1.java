package com.example.maxim.androidhw15;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {
    String TAG = "myTag";
    String str = "fragment 1";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d(TAG, str + " onAttach()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, str + " onCreateView()");
        return inflater.inflate(R.layout.fragment1, null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d(TAG, str + " onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.d(TAG, str + " onStart()");
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d(TAG, str + " onStop()");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d(TAG, str + " onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.d(TAG, str + " onPause()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d(TAG, str + " onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d(TAG, str + " onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.d(TAG, str + " onDetach()");
    }
}
