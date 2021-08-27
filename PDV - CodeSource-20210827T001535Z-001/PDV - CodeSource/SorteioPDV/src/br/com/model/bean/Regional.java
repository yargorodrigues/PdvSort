/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bean;



/**
 *
 * @author realcapsorteiointerior
 */
public class Regional {
    private int id_regional;
    private String nome_regional,responsavel_regional, endereco, telefone;

    public Regional() {
    }

    public Regional(String nome_regional, String responsavel_regional) {
        this.nome_regional = nome_regional;
        this.responsavel_regional = responsavel_regional;
    }

    
    
    public Regional(String nome_regional, String responsavel_regional, String endereco, String telefone) {
        this.nome_regional = nome_regional;
        this.responsavel_regional = responsavel_regional;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Regional(int id, String nome_regional, String responsavel_regional, String endereco, String telefone) {
        this.id_regional = id;
        this.nome_regional = nome_regional;
        this.responsavel_regional = responsavel_regional;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    
    
    
    
    public int getId_regional() {
        return id_regional;
    }

    public void setId_regional(int id_regional) {
        this.id_regional = id_regional;
    }

    public String getNome_regional() {
        return nome_regional;
    }

    public void setNome_regional(String nome_regional) {
        this.nome_regional = nome_regional;
    }

    public String getResponsavel_regional() {
        return responsavel_regional;
    }

    public void setResponsavel_regional(String responsavel_regional) {
        this.responsavel_regional = responsavel_regional;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    

   
    
    
    

    
  
    

 
    
}
