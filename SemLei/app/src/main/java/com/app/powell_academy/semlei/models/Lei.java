package com.app.powell_academy.semlei.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by matheus on 02/02/18.
 */

public class Lei {

    @SerializedName("numero")
    private String numero;

    @SerializedName("tipo")
    private String tipo;

    @SerializedName("resumo")
    private String resumo;

    @SerializedName("nome")
    private String nome;

    @SerializedName("ano")
    private String ano;

    @SerializedName("valido")
    private Boolean valido;

    @SerializedName("politico")
    private Politico politico;

    @SerializedName("usuario")
    private Usuario usuario;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Boolean getValido() {
        return valido;
    }

    public void setValido(Boolean valido) {
        this.valido = valido;
    }

    public Politico getPolitico() {
        return politico;
    }

    public void setPolitico(Politico politico) {
        this.politico = politico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
