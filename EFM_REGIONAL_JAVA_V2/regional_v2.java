package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class regional_v2 extends AppCompatActivity {
    Button btn;
    EditText poids,taille;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regional);

        btn = findViewById(R.id.btn);
        poids = findViewById(R.id.poids);
        taille = findViewById(R.id.taille);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double imc = Double.parseDouble(poids.getText().toString()) / (703 * Double.parseDouble(taille.getText().toString()) * Double.parseDouble(taille.getText().toString()));
                if(imc<18.5)
                    Toast.makeText(regional_v2.this, "Underweight", Toast.LENGTH_SHORT).show();
                else if(imc>=18.5 && imc<25)
                    Toast.makeText(regional_v2.this, "Normal", Toast.LENGTH_SHORT).show();
                else if(imc>=25 && imc<40)
                    Toast.makeText(regional_v2.this, "Overweight", Toast.LENGTH_SHORT).show();
                else if(imc>=40)
                    Toast.makeText(regional_v2.this, "Obese", Toast.LENGTH_SHORT).show();
            }
        });

    }
}