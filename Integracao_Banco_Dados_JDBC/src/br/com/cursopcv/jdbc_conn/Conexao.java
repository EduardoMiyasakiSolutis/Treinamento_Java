package br.com.cursopcv.jdbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection conn;

    public Conexao() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_novo","root", "01082011Dudu@");
            System.out.println("Conexão estabelecida!!");
        }
        catch(SQLException e){
            System.out.println("Conexão Falhou!!!!!!");
            System.out.println(e.getMessage());
        }
    }

    public Connection getConn() {
        return this.conn;
    }
}
