package com.matheussilas.jokenpoexpansion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ExpansionGameActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_expansion_game);

        imagePattern = findViewById(R.id.patternPc);
        patternPlayer = findViewById(R.id.patternPlayer);
        result = findViewById(R.id.result);
        winScore = findViewById(R.id.winScore);
        lossScore = findViewById(R.id.lossScore);

        getSupportActionBar().setTitle("Modo Expansão");
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

    public void playerLizard(View view) {
        this.selection("lizard");
        patternPlayer.setImageResource(R.drawable.lizard);
    }

    public void playerSpock(View view) {
        this.selection("spock");
        patternPlayer.setImageResource(R.drawable.spock);
    }

    public void selection(String selectionPlayer) {

        int number = new Random().nextInt(5);
        String[] adversaryChoice = {"rock", "scissor", "paper", "lizard", "spock"};
        String adversary = adversaryChoice[number];

        switch (adversary) {
            case "rock":
                imagePattern.setImageResource(R.drawable.rockadversary);
                break;
            case "scissor":
                imagePattern.setImageResource(R.drawable.scissoradversary);
                break;
            case "paper":
                imagePattern.setImageResource(R.drawable.paperadversary);
                break;
            case "lizard":
                imagePattern.setImageResource(R.drawable.lizardadversary);
                break;
            case "spock":
                imagePattern.setImageResource(R.drawable.spockadversary);
                break;
        }

        if (adversary == "rock" && selectionPlayer == "paper"
                || adversary == "paper" && selectionPlayer == "scissor"
                || adversary == "scissor" && selectionPlayer == "rock"
                || adversary == "lizard" && selectionPlayer == "rock"
                || adversary == "spock" && selectionPlayer == "paper"
                || adversary == "lizard" && selectionPlayer == "scissor"
                || adversary == "paper" && selectionPlayer == "lizard"
                || adversary == "spock" && selectionPlayer == "lagart"
                || adversary == "scissor" && selectionPlayer == "spock"
                || adversary == "rock" && selectionPlayer == "spock") {
            result.setText("Ganhou");
            win = win + 1;
            winScore.setText(Integer.toString(win));
        } else if (adversary == "rock" && selectionPlayer == "scissor"
                || adversary == "paper" && selectionPlayer == "rock"
                || adversary == "scissor" && selectionPlayer == "paper"
                || adversary == "rock" && selectionPlayer == "lizard"
                || adversary == "paper" && selectionPlayer == "spock"
                || adversary == "scissor" && selectionPlayer == "lizard"
                || adversary == "lizard" && selectionPlayer == "paper"
                || adversary == "lizard" && selectionPlayer == "spock"
                || adversary == "spock" && selectionPlayer == "scissor"
                || adversary == "spock" && selectionPlayer == "rock"
        ) {
            result.setText("Perdeu");
            loss = loss + 1;
            lossScore.setText(Integer.toString(loss));
        } else {
            result.setText("Empate");
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
