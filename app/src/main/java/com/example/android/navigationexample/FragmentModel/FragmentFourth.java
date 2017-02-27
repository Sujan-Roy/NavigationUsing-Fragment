package com.example.android.navigationexample.FragmentModel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.navigationexample.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFourth extends Fragment {


    public FragmentFourth() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_fourth, container, false);
    }

}
