package com.example.dado_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoFinalizar, botaoAbrirOutraTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoAbrirOutraTela = findViewById(R.id.btnAbrir);
        botaoFinalizar = findViewById(R.id.btnFinalizar);

        botaoFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        botaoAbrirOutraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent outraTela = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(outraTela);
            }
        });
    }
}