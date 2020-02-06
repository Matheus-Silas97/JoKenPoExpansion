package com.matheussilas.jokenpoexpansion;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class RulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        getSupportActionBar().setTitle("Regras");

    }

    public void rulesClassic(View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Modo Clássico");
        alertDialog.setMessage("-Pedra ganha de Tesoura\n" +
                "-Tesoura ganha de Papel\n" +
                "-Papel ganha de Pedra");
        alertDialog.setPositiveButton("OK", null);
        alertDialog.show();
    }

    public void rulesExpansion(View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Modo Expansão");
        alertDialog.setMessage("-Pedra ganha de lagarto\n" +
                "-Pedra ganha de tesoura\n" +
                "-Papel ganha de Spock\n" +
                "-Papel ganha de Pedra\n" +
                "-Tesoura ganha de lagarto\n" +
                "-Tesoura ganha de Papel\n" +
                "-Lagarto ganha de papel\n" +
                "-Lagarto ganha de Spock\n" +
                "-Spock ganha de tesoura\n" +
                "-Spock ganha de pedra");
        alertDialog.setPositiveButton("OK", null);
        alertDialog.show();
    }

    public void credits(View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Créditos");
        alertDialog.setMessage("Desenvolvido por: Matheus Silas\n\n" +
                "Versão 1.0");
        alertDialog.setPositiveButton("OK", null);
        alertDialog.show();
    }
}