package com.matheussilas.jokenpoexpansion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    TextInputEditText playerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerName = findViewById(R.id.playerName);

    }

    public void playGameClassic(View view) {
        Intent intent = new Intent(getApplicationContext(), ClassicGameActivity.class);
        if (playerName.getText().toString().equals("")) {
            intent.putExtra("name", "Jogador");
        } else {
            intent.putExtra("name", playerName.getText().toString());
        }
        startActivity(intent);
    }

    public void playGameExpansion(View view) {
        Intent intent = new Intent(getApplicationContext(), ExpansionGameActivity.class);
        if (playerName.getText().toString().equals("")) {
            intent.putExtra("name", "Jogador");
        } else {
            intent.putExtra("name", playerName.getText().toString());
        }
        startActivity(intent);
    }

    public void rules(View view) {
        Intent intent = new Intent(getApplicationContext(), RulesActivity.class);
        startActivity(intent);
    }
}
