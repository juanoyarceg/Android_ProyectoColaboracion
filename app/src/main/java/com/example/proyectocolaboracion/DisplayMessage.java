package com.example.proyectocolaboracion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DisplayMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    public void Mostrar(View view) {
        EditText auxMensajeMostrar = (EditText) findViewById(R.id.txtMensajeMostrar);
        EditText auxRutMostrar = (EditText) findViewById(R.id.txtRutMostrar);
        EditText auxNombreMostrar = (EditText) findViewById(R.id.txtNombreMostrar);

        Persona auxPersona = new Persona();
        auxPersona =(Persona) getIntent().getSerializableExtra("varPersona");

        String mensaje = getIntent().getStringExtra("varMensaje");
        auxMensajeMostrar.setText(mensaje);

        auxRutMostrar.setText(auxPersona.getRut());
        auxNombreMostrar.setText(auxPersona.getNombre());

    }
}
