package com.github.mknr.bugappcompatdialog;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Title")
                .setMessage("Message")
                .setPositiveButton("LOOOOOOOOOOOOONG TEXT", (dialog, which) -> {
                })
                .setNegativeButton("A", (dialog, which) -> {
                })
                .create()
                .show();

    }
}