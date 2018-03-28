package br.usjt.devweb.servicedesk_aula03.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.usjt.devweb.servicedesk_aula03.R;


/**
 * Created by arqdsis on 21/03/2018.
 */

public class ChamadoAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<Chamado> chamados;

    public ChamadoAdapter(Context context, ArrayList<Chamado> chamados){
        this.context = context;
        this.chamados = chamados;
    }

    @Override
    public int getCount() {
        return chamados.size();
    }

    @Override
    public Object getItem(int i) {
        return chamados.get(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View converView, ViewGroup parent) {
        View view = null;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.linha_chamado, parent, false);

        ImageView imagem = view.findViewById(R.id.imagem_fila);
        TextView numero = view.findViewById(R.id.numero_status_chamado);
        TextView datas = view.findViewById(R.id.abertura_fechamento_chamado);
        TextView descricao = view.findViewById(R.id.descricao_chamado);
        Chamado chamado = chamados.get(i);
        imagem.setImageDrawable(view.getResources().getDrawable(chamado.getFila().getIcone(),null));
        numero.setText(String.format("numero: %d - status %s", chamado.getNumero(), chamado.getStatus()));
        datas.setText(String.format("abertura: %tD - fechamento: %tD", chamado.getDataAbertura(), chamado.getDataFechamento()));
        descricao.setText(chamado.getDescricao());
        return view;
    }
}
