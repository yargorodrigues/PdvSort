/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.conexao.Conexao;
import br.com.model.bean.Sorteio;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author yargorodrigues
 */
public class ControleSorteio {
     private static PreparedStatement stmt;
     
     public static void GravaDadosSorteio(Sorteio sort){
         // Metodo que inseri dados do sorteio na tabela sorteio
         try {
             stmt = Conexao.conn.prepareStatement("insert into sorteio (pdv_id, pdv_nome, pdv_cidade, pdv_endereco, pdv_regional, pdv_telefone, pdv_bairro) values (?,?,?,?,?,?,?)");
             stmt.setInt(1, sort.getIdPdv_Sorteio());
             stmt.setString(2, sort.getPdv_NomeSorteio());
             stmt.setString(3, sort.getCidadeSorteio());
             stmt.setString(4, sort.getEnderecoSorteio());
             stmt.setString(5, sort.getRegionalSorteio());
             stmt.setString(6, sort.getTelefone());
             stmt.setString(7, sort.getBairro());
             
             stmt.execute();
             
             System.out.println("Gravado com sucesso!!!");
         } catch (SQLException ex) {
              System.out.println("Erro ao gravar!!!"+ex);
         }
     }
}
