package com.Hemant.fashionsahayak;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class womenrb extends Fragment {

    View view;

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_womenrb, container, false);


        Toast.makeText(getActivity(), "Men Category", Toast.LENGTH_SHORT).show();

        return view;
    }}