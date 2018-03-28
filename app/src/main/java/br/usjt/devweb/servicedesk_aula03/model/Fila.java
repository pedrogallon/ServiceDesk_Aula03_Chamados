package br.usjt.devweb.servicedesk_aula03.model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by arqdsis on 21/03/2018.
 */

public class Fila implements Serializable {
    private int id;
    private String nome;
    private int icone;


    public Fila(int id, String nome, int icone) {
        this.id = id;
        this.nome = nome;
        this.icone = icone;
    }

    public int getIcone() {
        return icone;
    }

    public void setIcone(int icone) {
        this.icone = icone;
    }

    public Fila() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
