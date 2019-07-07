package com.example.proyectocolaboracion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Enviar(View view) {
        EditText auxMensaje = (EditText) findViewById(R.id.txtMensajeIngresar);
        EditText auxRut = (EditText) findViewById(R.id.txtRutIngresar);
        EditText auxNombre = (EditText) findViewById(R.id.txtNombreIngresar);

        Persona auxPersona = new Persona();
        auxPersona.setRut(auxRut.getText().toString());
        auxPersona.setNombre(auxNombre.getText().toString());

        //Crear instancia del activity
        Intent auxIntentMensaje = new Intent(this,DisplayMessage.class);
        auxIntentMensaje.putExtra("varMensaje",auxMensaje.getText().toString());
        auxIntentMensaje.putExtra("varPersona",auxPersona);
        startActivity(auxIntentMensaje);
    }
}
