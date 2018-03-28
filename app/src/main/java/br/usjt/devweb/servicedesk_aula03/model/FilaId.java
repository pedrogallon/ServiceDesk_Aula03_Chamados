package br.usjt.devweb.servicedesk_aula03.model;

import android.graphics.drawable.Drawable;

import br.usjt.devweb.servicedesk_aula03.R;

/**
 * Created by arqdsis on 21/03/2018.
 */

public enum FilaId {

    PROJETO(1, "Novos Projetos", R.drawable.icon_projetos),
    VENDAS(2, "Manutenção do Sistema de Vendas", R.drawable.icon_vendas),
    ERP(3, "Manutenção do Sistema ERP", R.drawable.icon_erp),
    SERVIDORES(4, "Servidores", R.drawable.icon_servidores),
    REDES(5, "Redes", R.drawable.icon_redes),
    TELEFONIA(6, "Telefonia", R.drawable.icon_telefonia),
    DESKTOPS(7, "Desktops", R.drawable.icon_desktops);

    private final int id;
    private final String nome;
    private final int icone;
    FilaId(int num, String s, int i){
        id=num;
        nome=s;
        icone = i;
    }

    public int id(){
        return id;
    }
    public String nome(){
        return nome;
    }
    public int icone(){
        return icone;
    }
}
