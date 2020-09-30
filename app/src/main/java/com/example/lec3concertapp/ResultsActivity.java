package com.example.lec3concertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("tickets");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        final TextView results = findViewById(R.id.txtResults);
        results.setText(name);
        Log.v("TAG", name);
    }
}