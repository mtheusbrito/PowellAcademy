package com.app.powell_academy.semlei.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by matheus on 29/01/18.
 */

public class Politico {
    @SerializedName("id")
    private int id;
    @SerializedName("nome")
    private String nome;
    @SerializedName("cargo")
    private String cargo;
    @SerializedName("partido")
    private String partido;
    @SerializedName("dataCriacao")
    private String dataCriacao;
    @SerializedName("dataAtualizacao")
    private String dataAtualizacao;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
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
