/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bean;

/**
 *
 * @author yargorodrigues
 */
public class Sorteio {
    private int idPdv_Sorteio;
    private String pdv_NomeSorteio,cidadeSorteio, enderecoSorteio, regionalSorteio, telefone, bairro;

    public Sorteio() {
    }

    public Sorteio( int idPdv_Sorteio, String pdv_NomeSorteio, String cidadeSorteio, String enderecoSorteio, String regionalSorteio, String telefone, String bairro) {
        this.idPdv_Sorteio = idPdv_Sorteio;
        this.pdv_NomeSorteio = pdv_NomeSorteio;
        this.cidadeSorteio = cidadeSorteio;
        this.enderecoSorteio = enderecoSorteio;
        this.regionalSorteio = regionalSorteio;
        this.telefone = telefone;
        this.bairro = bairro;
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

   
    
   
    public int getIdPdv_Sorteio() {
        return idPdv_Sorteio;
    }

    public void setIdPdv_Sorteio(int idPdv_Sorteio) {
        this.idPdv_Sorteio = idPdv_Sorteio;
    }

    public String getPdv_NomeSorteio() {
        return pdv_NomeSorteio;
    }

    public void setPdv_NomeSorteio(String pdv_NomeSorteio) {
        this.pdv_NomeSorteio = pdv_NomeSorteio;
    }

    
    
    public String getCidadeSorteio() {
        return cidadeSorteio;
    }

    public void setCidadeSorteio(String cidadeSorteio) {
        this.cidadeSorteio = cidadeSorteio;
    }

    public String getEnderecoSorteio() {
        return enderecoSorteio;
    }

    public void setEnderecoSorteio(String enderecoSorteio) {
        this.enderecoSorteio = enderecoSorteio;
    }

    public String getRegionalSorteio() {
        return regionalSorteio;
    }

    public void setRegionalSorteio(String regionalSorteio) {
        this.regionalSorteio = regionalSorteio;
    }
    
    
}
