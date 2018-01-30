package com.app.powell_academy.semlei.models;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by matheus on 29/01/18.
 */

public class Politico {
    private int id;
    private String nome;
    private String cargo;
    private String partido;
    private Calendar dataCriacao;
    private Calendar dataAtualizacao;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }




    private ArrayList<Politico> politicos;

    public ArrayList<Politico> getPoliticos() {
        return politicos;
    }

    public void setPoliticos(ArrayList<Politico> politicos) {
        this.politicos = politicos;
    }
}
