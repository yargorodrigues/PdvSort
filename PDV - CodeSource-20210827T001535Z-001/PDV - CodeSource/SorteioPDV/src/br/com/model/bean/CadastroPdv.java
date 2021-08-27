/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bean;



/**
 *
 * @author Yargo Rodrigues
 */
public class CadastroPdv  {
    private int id, id_regional, rota;
    private String nome_pdv,endereco, bairro, telefone, cidade;

    public CadastroPdv(int id, int id_regional, int rota, String nome_pdv, String endereco, String bairro, String telefone, String cidade) {
        this.id = id;
        this.id_regional = id_regional;
        this.rota = rota;
        this.nome_pdv = nome_pdv;
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public CadastroPdv(int id_regional, int rota, String nome_pdv, String endereco, String bairro, String telefone, String cidade) {
        this.id_regional = id_regional;
        this.rota = rota;
        this.nome_pdv = nome_pdv;
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.cidade = cidade;
    }
    
   
    

    public CadastroPdv() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_pdv() {
        return nome_pdv;
    }

    public void setNome_pdv(String nome_pdv) {
        this.nome_pdv = nome_pdv;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId_regional() {
        return id_regional;
    }

    public void setId_regional(int id_regional) {
        this.id_regional = id_regional;
    }

    public int getRota() {
        return rota;
    }

    public void setRota(int rota) {
        this.rota = rota;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    
   
    
}
