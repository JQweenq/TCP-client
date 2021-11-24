package com.Dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class ErrorDialog extends DialogFragment {
    public String description;

    public ErrorDialog(String description) {
        this.description = description;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle state){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        return builder
                .setTitle("Ошибка!")
                .setMessage(description)
                .setPositiveButton("OK", null)
                .create();
    }
}
