package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    TextView resultIMC;
    RadioButton Masc, Fem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit2 = findViewById(R.id.etxtPeso);
        edit1 = findViewById(R.id.etxtAlt);
        resultIMC = findViewById(R.id.txtvResultado);
        Masc = findViewById(R.id.rdbtnMasc);
        Fem = findViewById(R.id.rdbtnFem);
    }

    public void Calcula(View view) {
        double altura = Double.parseDouble(edit1.getText().toString());
        double peso = Double.parseDouble(edit2.getText().toString());


        double imc = peso / (Math.pow(altura, 2));
        resultIMC.setText(Double.valueOf(imc).toString());

        if (Masc.isChecked() == true && Fem.isChecked() == false)  {
            if(imc < 20){
                resultIMC.setText("Seu imc é " + imc + ", Abaixo do peso");
            } else if(imc >= 20 && imc <= 24.9) {
                resultIMC.setText("Seu imc é " + imc + ", Normal");
            } else if(imc >= 25 && imc <= 29.9){
                resultIMC.setText("Seu imc é " + imc + ", Obesidade leve");
            } else if(imc >= 30 && imc <= 39.9) {
                resultIMC.setText("Seu imc é " + imc +", Obesidade moderada");
            } else if(imc >= 40) {
                resultIMC.setText("Seu imc é " + imc + ", Obesidade mórbida");
            }
        } else if (Masc.isChecked() == false && Fem.isChecked() == true){
            if(imc < 19){
                resultIMC.setText("Seu imc é " + imc + ", Abaixo do peso");
            } else if(imc >= 19 && imc <= 23.9) {
                resultIMC.setText("Seu imc é "+ imc + ", Normal");
            } else if(imc >= 24 && imc <= 28.9){
                resultIMC.setText("Seu imc é "+ imc +", Obesidade leve");
            } else if(imc >= 29 && imc <= 38.9) {
                resultIMC.setText("Seu imc é "+ imc +", Obesidade moderada");
            } else if(imc >= 39) {
                resultIMC.setText("Seu imc é "+ imc + ", Obesidade mórbida");
            }
        }

    }
}
