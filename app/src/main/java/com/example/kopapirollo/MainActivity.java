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
    private int valasztas,dontetlenPont,maxJatekosHp,maxGepHp,rand;
    private Button koButton, olloButton, papirButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        koButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valasztas = 1;
                sajatValasztas.setImageResource(R.drawable.rock);
                jatek();
                gepValasztasa();
            }
        });
        papirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valasztas = 2;
                sajatValasztas.setImageResource(R.drawable.paper);
                jatek();
                gepValasztasa();
            }
        });

        olloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valasztas = 3;
                sajatValasztas.setImageResource(R.drawable.scissors);
                jatek();
                gepValasztasa();
            }
        });
    }
    private void gepValasztasa() {
        rand = random.nextInt(3) + 1;
        if (rand == 1) {
            gepValasztas.setImageResource(R.drawable.rock);
        } else if (rand == 2) {
            gepValasztas.setImageResource(R.drawable.paper);
        } else if (rand == 3) {
            gepValasztas.setImageResource(R.drawable.scissors);
        }
    }
    private void jatekosEletvesztes() {
        switch (maxJatekosHp) {
            case 3:
                jatekos_hp3.setImageResource(R.drawable.heart1);
                maxJatekosHp--;
                break;
            case 2:
                jatekos_hp2.setImageResource(R.drawable.heart1);
                maxJatekosHp--;
                break;
            case 1:
                jatekos_hp1.setImageResource(R.drawable.heart1);
                maxJatekosHp--;
                break;
            default:
                break;
        }
    }
    private void gepEletvesztes ()
        {
            switch (maxGepHp) {
                case 3:
                    gep_hp3.setImageResource(R.drawable.heart1);
                    maxGepHp--;
                    break;
                case 2:
                    gep_hp2.setImageResource(R.drawable.heart1);
                    maxGepHp--;
                    break;
                case 1:
                    gep_hp1.setImageResource(R.drawable.heart1);
                    maxGepHp--;
                    break;
                default:
                    break;
            }
        }
        private void jatek () {
            if (valasztas == 1 && rand == 3) {
                gepEletvesztes();
            } else if (valasztas == 1 && rand == 2) {
                jatekosEletvesztes();
            } else if (valasztas == 2 && rand == 1) {
                gepEletvesztes();
            } else if (valasztas == 2 && rand == 3) {
                jatekosEletvesztes();
            } else if (valasztas == 3 && rand == 1) {
                jatekosEletvesztes();
            } else if (valasztas == 3 && rand == 2) {
                gepEletvesztes();
            } else if (valasztas == 1 && rand == 1) {
                dontetlenPont++;
                dontetlen.setText("döntetlenek" + dontetlenPont);
            } else if (valasztas == 2 && rand == 2) {
                dontetlenPont++;
                dontetlen.setText("döntetlenek" + dontetlenPont);
            } else if (valasztas == 3 && rand == 3) {
                dontetlenPont++;
                dontetlen.setText("döntetlenek:" + dontetlenPont);
            }
        }

        private void init()
        {
            sajatValasztas = findViewById(R.id.sajat);
            gepValasztas = findViewById(R.id.alap);
            buttonKo = findViewById(R.id.ko);
            buttonOllo = findViewById(R.id.ollo);
            buttonPapir = findViewById(R.id.papir);
            dontetlen = findViewById(R.id.dontetlen);
            random = new Random();
            valasztas = 0;
            dontetlenPont = 0;

            maxJatekosHp = 3;
            jatekos_hp1 = findViewById(R.id.jatekos_hp1);
            jatekos_hp2 = findViewById(R.id.jatekos_hp2);
            jatekos_hp3 = findViewById(R.id.jatekos_hp3);

            maxGepHp = 3;
            gep_hp1 = findViewById(R.id.gep_hp1);
            gep_hp2 = findViewById(R.id.gep_hp2);
            gep_hp3 = findViewById(R.id.gep_hp3);


        }
    }
}


