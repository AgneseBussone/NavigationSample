package com.example.navigationsample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.fragment.NavHostFragment;

public class ComplexDialog extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.complex_dialog, container);

        Button button = view.findViewById(R.id.openDetails);
        button.setOnClickListener(view1 -> NavHostFragment.findNavController(this).navigate(ComplexDialogDirections.actionComplexDialogToDetailsFragment()));

        return view;
    }
}
