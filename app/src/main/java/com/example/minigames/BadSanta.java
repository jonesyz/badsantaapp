package com.example.minigames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import java.util.ArrayList;


public class BadSanta extends AppCompatActivity {
    private ArrayList<String> playerName = new ArrayList<>();
    private EditText nameEditText;
    private TextView nameTextView;
    private TextView nameTextView2;
    private TextView nameTextView3;
    private TextView nameTextView4;
    private TextView nameTextView5;
    private TextView nameTextView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_santa);

        nameEditText = findViewById(R.id.nameEditText);
        nameTextView = findViewById(R.id.nameTextView);
        nameTextView2 = findViewById(R.id.nameTextView2);
        nameTextView3 = findViewById(R.id.nameTextView3);
        nameTextView4 = findViewById(R.id.nameTextView4);
        nameTextView5 = findViewById(R.id.nameTextView5);
        nameTextView6 = findViewById(R.id.nameTextView6);

        nameEditText.setText("");

    }

    public void loadGameActivity(View view) {
        Intent intent = new Intent(BadSanta.this, GameActivity.class);
        intent.putExtra("names", playerName);
        startActivity(intent);
    }

    public void addPlayers() {
        String name = nameEditText.getText().toString();
        playerName.add(name);
    }

    public void addName(View view) {
        for (int i = 0; i < 5; i++) {
            addPlayers();
        }
        if (nameTextView.getText().equals("")) {
            nameTextView.setText(nameEditText.getText().toString());
        } else if (nameTextView2.getText().equals("")){
            nameTextView2.setText(nameEditText.getText().toString());
        } else if (nameTextView3.getText().equals("")){
            nameTextView3.setText(nameEditText.getText().toString());
        } else if (nameTextView4.getText().equals("")){
            nameTextView4.setText(nameEditText.getText().toString());
        } else if (nameTextView5.getText().equals("")){
            nameTextView5.setText(nameEditText.getText().toString());
        } else if (nameTextView6.getText().equals("")){
            nameTextView6.setText(nameEditText.getText().toString());
        }

        nameEditText.setText("");
    }

}
