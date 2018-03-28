package br.usjt.devweb.servicedesk_aula03.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import br.usjt.devweb.servicedesk_aula03.R;
import br.usjt.devweb.servicedesk_aula03.model.Chamado;

import static br.usjt.devweb.servicedesk_aula03.controller.ListarChamadosActivity.CHAMADO;

public class DetalheChamadoActivity extends Activity {
    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        txtNome = findViewById(R.id.chamado_nome);
        Intent intent = getIntent();
        Chamado chamado = (Chamado) intent.getSerializableExtra(CHAMADO);
        txtNome.setText(chamado.getDescricao());
    }
}
