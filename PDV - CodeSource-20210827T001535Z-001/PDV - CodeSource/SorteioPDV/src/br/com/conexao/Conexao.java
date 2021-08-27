/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.conexao;

import java.sql.*;


/**
 *
 * @author realcapsorteiointerior Classe de conexao com o banco de dados
 */
public class Conexao {
        
    public static Statement stmt;
    public static ResultSet rs;
    public static PreparedStatement pst;
    public static Connection conn;

    public static Connection getConnection() {
        //metodo de abrir conexão
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bdsorteiopdv", "root", "rc038656");
            
            System.out.println("Conectado");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getMessage();
        }

        return conn;

    }
    public static void closeConnection(){
        //metodo de fechar conexão
        try {
            conn.close();
            System.out.println("Conexão encerrada");
        } catch (SQLException e) {
            e.getMessage();
        }
    }
    
    public static void executaSQL(String sql){
        //metodo que executa um sql no banco e retorno o result
        try {
            stmt = conn.createStatement(rs.CONCUR_READ_ONLY, rs.TYPE_SCROLL_INSENSITIVE);
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

   
}
