package com.matheussilas.jokenpoexpansion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    TextInputEditText playerName;

    private Preferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerName = findViewById(R.id.playerName);

        preferences = new Preferences(getApplicationContext());

        //load player name for Shared Preferences
        String player = preferences.loadPlayer();
        if (!player.equals("")) {
            playerName.setText(player);
        }

    }

    public void playGameClassic(View view) {

        //save playerName
        preferences.savePlayer(playerName.getText().toString());

        Intent intent = new Intent(getApplicationContext(), ClassicGameActivity.class);
        if (playerName.getText().toString().equals("")) {
            intent.putExtra("name", "Jogador");
        } else {
            intent.putExtra("name", playerName.getText().toString());
        }
        startActivity(intent);
    }

    public void playGameExpansion(View view) {

        //save playerName
        preferences.savePlayer(playerName.getText().toString());

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

    @Override
    protected void onStop() {
        preferences.savePlayer(playerName.getText().toString());
        super.onStop();
    }

    @Override
    protected void onPause() {
        preferences.savePlayer(playerName.getText().toString());
        super.onPause();
    }
}
