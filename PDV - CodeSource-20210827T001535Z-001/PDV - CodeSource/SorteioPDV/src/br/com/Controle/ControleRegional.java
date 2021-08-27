/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.conexao.Conexao;
import static br.com.conexao.Conexao.rs;
import br.com.model.bean.Regional;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Yargo Rodrigues
 */
public class ControleRegional {

    private static PreparedStatement stmt;

    public static void gravarDados(Regional cadreg) {
        // Metodo que inseri dados da tela de regional na tabela regional
        try {
            stmt = Conexao.conn.prepareStatement("insert into regional (id_regional,nome_regional,responsavel_regional,endereco,telefone) values (?,?,?,?,?)");
            stmt.setInt(1, cadreg.getId_regional());
            stmt.setString(2, cadreg.getNome_regional());
            stmt.setString(3, cadreg.getResponsavel_regional());
            stmt.setString(4, cadreg.getEndereco());
            stmt.setString(5, cadreg.getTelefone());

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Gravado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar!!!" + ex);
        } finally {
            Conexao.closeConnection();
        }

    }

    public static void alterarDados(Regional cadreg) {
        // Metodo que altera dados da tela de regional na tabela regional
        try {
            stmt = Conexao.conn.prepareStatement("insert into regionais (id_regional, nome_regional,responsavel_regional, endereco, telefone,) values (?,?,?,?,?)");
            stmt.setInt(1, cadreg.getId_regional());
            stmt.setString(2, cadreg.getNome_regional());
            stmt.setString(3, cadreg.getResponsavel_regional());
            stmt.setString(4, cadreg.getEndereco());
            stmt.setString(5, cadreg.getTelefone());

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Gravado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar" + ex);
        } finally {
            Conexao.closeConnection();
        }
    }

    public static void excluirDados() {
        // Metodo que inseri exclui da tela de regional na tabela regional

    }
    
    /**
     *
     * @return
     */
   
}
