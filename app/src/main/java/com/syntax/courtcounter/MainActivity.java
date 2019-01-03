package com.syntax.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void triple(View view) {
        score = score + 3;
        actualizarResultado(score);
    }

    public void doubles(View view) {
        score = score + 2;
        actualizarResultado(score);
    }

    public void FreeShot(View view) {
        score = score + 1;
        actualizarResultado(score);
    }

    public void actualizarResultado(int tantos) {
        TextView Contador = findViewById(R.id.Contador_de_puntos_equipoA_view);
        Contador.setText("" + tantos);
    }

    //contador para equipo B

    public void tripleB(View view) {
        scoreB = scoreB + 3;
        actualizarResultadoB(scoreB);
    }

    public void doublesB(View view) {
        scoreB = scoreB + 2;
        actualizarResultadoB(scoreB);
    }

    public void FreeShotB(View view) {
        scoreB = scoreB + 1;
        actualizarResultadoB(scoreB);
    }

    public void actualizarResultadoB(int tantos) {
        TextView Contador = findViewById(R.id.Contador_de_puntos_equipoB_view);
        Contador.setText("" + tantos);
    }

    //reset Button

    public void resetearContadores(View view){
        score= 0;
        scoreB = 0;
        actualizarResultado(score);
        actualizarResultadoB(scoreB);
    }
}
