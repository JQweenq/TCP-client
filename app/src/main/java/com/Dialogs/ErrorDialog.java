package com.Dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class ErrorDialog extends DialogFragment {

    @NonNull
    public Dialog onCreateDialog(Bundle state){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        return builder
                .setTitle("Ошибка!")
                .setMessage("Проверьте правильность заполнения полей.")
                .setPositiveButton("OK", null)
                .create();
    }
}
