package com.matheussilas.jokenpoexpansion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ClassicGameActivity extends AppCompatActivity {

    ImageView imagePattern;
    ImageView patternPlayer;
    TextView result;
    TextView winScore;
    TextView lossScore;
    int win = 0;
    int loss = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_game);

        imagePattern = findViewById(R.id.patternPc);
        patternPlayer = findViewById(R.id.patternPlayer);
        result = findViewById(R.id.result);
        winScore = findViewById(R.id.winScore);
        lossScore = findViewById(R.id.lossScore);

        getSupportActionBar().setTitle("Modo Clássico");
    }

    public void playerRock(View view) {
        this.selection("rock");
        patternPlayer.setImageResource(R.drawable.rock);
    }

    public void playerScissor(View view) {
        this.selection("scissor");
        patternPlayer.setImageResource(R.drawable.scissor);
    }

    public void playerPaper(View view) {
        this.selection("paper");
        patternPlayer.setImageResource(R.drawable.paper);
    }

    public void selection(String selectionPlayer) {

        int number = new Random().nextInt(3);
        String[] adversaryChoice = {"rock", "scissor", "paper"};
        String adversary = adversaryChoice[number];

        switch (adversary) {
            case "rock":
                imagePattern.setImageResource(R.drawable.rock);
                break;
            case "scissor":
                imagePattern.setImageResource(R.drawable.scissor);
                break;
            case "paper":
                imagePattern.setImageResource(R.drawable.paper);
                break;
        }

        if (adversary == "rock" && selectionPlayer == "paper" || adversary == "paper" && selectionPlayer == "scissor" || adversary == "scissor" && selectionPlayer == "rock") {
            result.setText("Ganhou");
            win = win + 1;
            winScore.setText(Integer.toString(win));
        } else if (adversary == "rock" && selectionPlayer == "scissor" || adversary == "paper" && selectionPlayer == "rock" || adversary == "scissor" && selectionPlayer == "paper") {
            result.setText("Perdeu");
            loss = loss + 1;
            lossScore.setText(Integer.toString(loss));
        } else {
            result.setText("Empate");
        }
    }

}