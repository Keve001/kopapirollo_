package com.example.kopapirollo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView sajatValasztas, gepValasztas, gep_hp1, gep_hp2, gep_hp3, jatekos_hp1, jatekos_hp2, jatekos_hp3;
    private Button buttonKo, buttonOllo, buttonPapir;
    private Random random;
    private TextView dontetlen;
    private int db,dontetlenPont,maxJatekosHp,maxGepHp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        private void init()
        {
            sajatValasztas = findViewById(R.id.sajat);
            gepValasztas = findViewById(R.id.alap);
            buttonKo = findViewById(R.id.ko);
            buttonOllo = findViewById(R.id.ollo);
            buttonPapir = findViewById(R.id.papir);
            dontetlen = findViewById(R.id.dontetlen);
            db = 0;
            random = new Random();
            dontetlenPont = 0;
            maxJatekosHp = 3;
            maxGepHp = 3;
            jatekos_hp1 = findViewById(R.id.jatekos_hp1);
            jatekos_hp2 = findViewById(R.id.jatekos_hp2);
            jatekos_hp3 = findViewById(R.id.jatekos_hp3);

            gep_hp1 = findViewById(R.id.gep_hp1);
            gep_hp2 = findViewById(R.id.gep_hp2);
            gep_hp3 = findViewById(R.id.gep_hp3);
        }

    }

}


