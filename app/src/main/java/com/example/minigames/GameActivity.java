package com.example.minigames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private TextView nameTextView;
    private Button rollButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activity);

        nameTextView = findViewById(R.id.printNameTextView);
        rollButton = findViewById(R.id.rollButton);

        rollButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                roll();
            }
        });

    }
    public void roll(){
        ArrayList<String> namesList = (ArrayList<String>) getIntent().getSerializableExtra("names");
        Random rand = new Random();
        int randNumber = rand.nextInt(namesList.size());
        nameTextView.setText(namesList.get(randNumber));
        namesList.remove(randNumber);
        if(namesList.isEmpty()){
            Toast.makeText(this, "No Names Left!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, BadSanta.class);
            startActivity(intent);
        }

    }
}
