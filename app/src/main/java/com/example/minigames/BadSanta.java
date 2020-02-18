package com.example.minigames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import java.util.ArrayList;


public class BadSanta extends AppCompatActivity{
    private ArrayList<String> playerName = new ArrayList<>();
    private EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_santa);

        nameEditText = findViewById(R.id.nameEditText);

        nameEditText.setText("");

    }
    public void loadGameActivity(View view){
        Intent intent = new Intent(BadSanta.this, GameActivity.class);
        intent.putExtra("names", playerName);
        startActivity(intent);
    }

    public void addPlayers(){
        String name = nameEditText.getText().toString();
        playerName.add(name);
    }

    public void addName(View view){
        for(int i = 0; i<5; i++) {
            addPlayers();
        }
        nameEditText.setText("");
    }

}
