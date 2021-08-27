/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.conexao.Conexao;
import br.com.model.bean.CadastroPdv;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Yargo Rodrigues
 */
public class ControleCadastro {
    
    private static PreparedStatement stmt;
    
    public static void gravarDados(CadastroPdv cadpdv) {
        // Metodo que inseri dados da tela de cadastro na tabela pdvs
        
        try {
            stmt = Conexao.conn.prepareStatement("insert into pdvs (id_pdv, nome_pdv, endereco, bairro, telefone, id_regional, rota, cidade_pdv) values (?,?,?,?,?,?,?,?)");
            stmt.setInt(1, cadpdv.getId());
            stmt.setString(2, cadpdv.getNome_pdv());
            stmt.setString(3, cadpdv.getEndereco());
            stmt.setString(4, cadpdv.getBairro());
            stmt.setString(5, cadpdv.getTelefone());
            stmt.setInt(6, cadpdv.getId_regional());
            stmt.setInt(7, cadpdv.getRota());
            stmt.setString(8, cadpdv.getCidade());
            
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Gravado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar!!!" + ex);
        } finally {
            Conexao.closeConnection();
        }
        
    }
    
    public static void alterarDados(CadastroPdv cadpdv) {
        // Metodo que altera dados da tela de cadastro na tabela pdvs
        
        try {
            stmt = Conexao.conn.prepareStatement("update pdvs set nome_pdv=?, endereco=?, bairro=?, telefone=?, id_regional=?, rota=?, cidade_pdv=? WHERE id_pdv=?");
            stmt.setInt(8, cadpdv.getId());
            stmt.setString(1, cadpdv.getNome_pdv());
            stmt.setString(2, cadpdv.getEndereco());
            stmt.setString(3, cadpdv.getBairro());
            stmt.setString(4, cadpdv.getTelefone());
            stmt.setInt(5, cadpdv.getId_regional());
            stmt.setInt(6, cadpdv.getRota());
            stmt.setString(7, cadpdv.getCidade());
            
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "PDV alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar PDV" + ex);
        } finally {
            Conexao.closeConnection();
        }
    }
    
    public static void excluirDados(CadastroPdv cadpdv) throws SQLException {
        // Metodo que inseri exclui da tela de cadastro na tabela pdvs
        stmt = Conexao.conn.prepareStatement("delete * from pdvs where id_regional = '" + cadpdv + "'");
        stmt.setInt(1, cadpdv.getId());
        
        stmt.execute();
        
    }
    
}
