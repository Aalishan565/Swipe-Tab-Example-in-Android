package com.swipetabexample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by aalishan on 6/4/16.
 */
public class FragmentC extends Fragment {
    View view;
    String TAG = "TAG";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_c, container, false);
        Log.d(TAG, "onCreateView() Fragment_C");
        return view;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach() Fragment_C");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() Fragment_C");
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated() Fragment_C");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() Fragment_C");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() Fragment_C");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() Fragment_C");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() Fragment_C");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView() Fragment_C");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() Fragment_C");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach() Fragment_C");
    }

}
