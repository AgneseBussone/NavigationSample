package com.example.navigationsample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class SimpleDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("My dialog");
        builder.setMessage("When this dialog is dismissed, the up arrow will change color");

        builder.setPositiveButton("OK", (dialog, which) -> {
            // do something
        });
        builder.setNegativeButton("CANCEL", null);
        builder.setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }
}
