package com.example.luisrodriguezmuoz_tics_7t11_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class receta3 extends AppCompatActivity {
    Button  boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta3);
        boton=(Button)findViewById(R.id.volver3);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(receta3.this, vista2Activity.class));
            }
        });
    }
}
