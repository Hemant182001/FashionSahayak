package com.Hemant.fashionsahayak;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class menEid extends Fragment {

    View view;


    Button firstButton;
    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_men_eid, container, false);


        Toast.makeText(getActivity(), "Men Category", Toast.LENGTH_SHORT).show();

        return view;
    }}
