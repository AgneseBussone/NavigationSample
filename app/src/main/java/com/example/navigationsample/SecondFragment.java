package com.example.navigationsample;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_fragment, container, false);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        NavigationUI.setupWithNavController(toolbar, NavHostFragment.findNavController(this));
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        toolbar.setTitle("Example");
        final Drawable upArrow = getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationIcon(upArrow);

        Button openDialog = view.findViewById(R.id.openSimpleDialog);
        openDialog.setOnClickListener(view1 -> NavHostFragment.findNavController(this).navigate(SecondFragmentDirections.actionSecondFragmentToSimpleDialog()));

        Button openDetail = view.findViewById(R.id.openComplexDialog);
        openDetail.setOnClickListener(view1 -> NavHostFragment.findNavController(this).navigate(SecondFragmentDirections.actionSecondFragmentToComplexDialog()));

        return view;
    }
}
