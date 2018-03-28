package br.usjt.devweb.servicedesk_aula03.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import br.usjt.devweb.servicedesk_aula03.R;

public class MainActivity extends Activity {
    public static final String FILA = "br.usjt.devweb.servicedesk_aula03.MainActivity";
    private EditText txtFila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFila = findViewById(R.id.buscar_fila);
    }

    public void buscarChamados(View view) {
        String fila = txtFila.getText().toString();
        Intent intent = new Intent(this, ListarChamadosActivity.class);
        intent.putExtra(FILA, fila);
        startActivity(intent);

    }
}
