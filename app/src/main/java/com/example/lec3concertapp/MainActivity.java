package com.example.lec3concertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.txtNumOfTickets);
        final String numOfTickets = String.valueOf(editText.getText());

        Button calculateCost = findViewById(R.id.btnCalculateCost);
        calculateCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", String.valueOf(numOfTickets));
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("tickets", numOfTickets);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}