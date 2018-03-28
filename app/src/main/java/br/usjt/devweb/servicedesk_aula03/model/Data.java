package br.usjt.devweb.servicedesk_aula03.model;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.Date;

import br.usjt.devweb.servicedesk_aula03.R;

import static br.usjt.devweb.servicedesk_aula03.model.Chamado.ABERTO;
import static br.usjt.devweb.servicedesk_aula03.model.Chamado.FECHADO;

/**
 * Created by arqdsis on 21/03/2018.
 */

public class Data {

    public static ArrayList<Chamado> buscarChamados(String chave){
        ArrayList<Chamado> lista = gerarListaChamados();
        if (chave == null || chave.length()==0){
            return lista;
        }
        ArrayList<Chamado> resultado = new ArrayList<>();

        for (Chamado chamado:lista){
            if (chamado.getFila().getNome().toUpperCase().contains(chave.toUpperCase())){
                resultado.add(chamado);
            }
        }
        return resultado;
    }

    public static ArrayList<Chamado> gerarListaChamados(){
        ArrayList<String> nomes = nomesAPAGAR();
        ArrayList<Chamado> lista = new ArrayList<>();
        Chamado chamado;
        Fila fila = new Fila();
        Drawable d;

        for(int i = 0; i< 10; i++){
            chamado = new Chamado();
            chamado.setNumero(i);
            chamado.setDataAbertura(new Date());
            chamado.setDataFechamento(null);
            chamado.setStatus(ABERTO);
            chamado.setDescricao(nomes.get(i));

            fila.setId(FilaId.DESKTOPS.id());
            fila.setNome(FilaId.DESKTOPS.nome());
            fila.setIcone(FilaId.DESKTOPS.icone());
            chamado.setFila(fila);
            lista.add(chamado);
        }

        fila = new Fila();

        for(int i = 10; i< 20; i++){
            chamado = new Chamado();
            chamado.setNumero(i);
            chamado.setDataAbertura(new Date());
            chamado.setDataFechamento(null);
            chamado.setStatus(ABERTO);
            chamado.setDescricao(nomes.get(i));
            fila.setId(FilaId.VENDAS.id());
            fila.setNome(FilaId.VENDAS.nome());
            fila.setIcone(FilaId.VENDAS.icone());
            chamado.setFila(fila);
            lista.add(chamado);
        }


        return lista;
    }

    private static ArrayList<String> nomesAPAGAR(){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Computador da secretária quebrado.");
        nomes.add("Telefone não funciona.");
        nomes.add("Manutenção no proxy.");
        nomes.add("Lentidão generalizada.");
        nomes.add("CRM");
        nomes.add("Atualizar versão.");
        nomes.add("Rede MPLS");
        nomes.add("Incluir pipeline.");
        nomes.add("Erro contábil");
        nomes.add("Gestão de Orçamento");
        nomes.add("Big Data");
        nomes.add("Manoel de Barros");
        nomes.add("Internet com lentidão");
        nomes.add("Chatbot");
        nomes.add("Troca de senha");
        nomes.add("Falha no Windows");
        nomes.add("ITIL V3");
        nomes.add("Liberar celular");
        nomes.add("Mover ramal");
        nomes.add("Ponto com defeito");
        nomes.add("Ferramenta EMM");
        return nomes;
    }
}
