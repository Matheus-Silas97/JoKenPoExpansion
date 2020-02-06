package com.matheussilas.jokenpoexpansion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playGameClassic(View view) {
        Intent intent = new Intent(getApplicationContext(), ClassicGameActivity.class);
        startActivity(intent);
    }

    public void playGameExpansion(View view) {
        Intent intent = new Intent(getApplicationContext(), ExpansionGameActivity.class);
        startActivity(intent);
    }

    public void rules(View view) {
        Intent intent = new Intent(getApplicationContext(), RulesActivity.class);
        startActivity(intent);
    }
}
