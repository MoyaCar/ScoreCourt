package com.syntax.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void triple(View view){
        score = score + 3;
        actualizarResultado(score);
        }
    public void doubles(View view){
        score = score + 2;
        actualizarResultado(score);
    }
    public void FreeShot(View view){
        score = score + 1;
        actualizarResultado(score);
    }

    public void actualizarResultado(int tantos){
        TextView Contador= findViewById(R.id.Contador_de_puntos_view);
        Contador.setText(tantos);
    }

}
