package com.example.navigationsample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.first_fragment, container, false);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        NavigationUI.setupWithNavController(toolbar, NavHostFragment.findNavController(this));
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        toolbar.setTitle("This is the first fragment");

        Button next = view.findViewById(R.id.next);
        next.setOnClickListener(view1 -> NavHostFragment.findNavController(this).navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment()));

        return view;
    }
}
