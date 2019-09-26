package com.swipetabexample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by aalishan on 6/4/16.
 */
public class FragmentB extends Fragment {
    View view;
    String TAG = "TAG";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_b, container, false);
        Log.d(TAG, "onCreateView() Fragment_B");
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach() Fragment_B");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() Fragment_B");
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d(TAG, "onActivityCreated() Fragment_B");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() Fragment_B");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() Fragment_B");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() Fragment_B");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() Fragment_B");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView() Fragment_B");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() Fragment_B");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach() Fragment_B");
    }



}
