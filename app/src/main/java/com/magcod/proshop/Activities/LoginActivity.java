package com.magcod.proshop.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.magcod.proshop.R;

public class LoginActivity extends AppCompatActivity {
    MaterialToolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getViews();
    }

    private void getViews() {
        toolbar = findViewById(R.id.toolbar);
    }
}