package bcdadosnew;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AcessoBancoNovo {

    private Conexao conexao;
    private Connection conn;

    public AcessoBancoNovo(Conexao conexao) {
        this.conexao = conexao;
        this.conn = conexao.getConn();
    }

    public void criarTabela() {
        try {
            PreparedStatement prep = conn.prepareStatement(
                    """
                            CREATE TABLE dinossauros (
                                codigo INT NOT NULL AUTO_INCREMENT,
                                genero VARCHAR(50),
                                especie VARCHAR(50),
                                PRIMARY KEY (codigo)
                            );
                            """
            );
            prep.execute();
            System.out.println("Tabela criada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void inserirRegTab() {
        try {
            PreparedStatement prep = conn.prepareStatement(
                    """
                            INSERT INTO dinossauros (genero,especie) VALUES ('Ornithischia', 'T-Rex');
                            """
            );

            prep.executeUpdate();
            System.out.println("Insert feito com sucesso!!!");
            prep = conn.prepareStatement("SELECT * from dinossauros");
            var response = prep.executeQuery();

            while (response.next()) {
                String genero = response.getString("genero");
                String especie = response.getString("especie");
                System.out.println(genero + " " + especie);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void alteraRegistro() {

        Scanner sc = new Scanner(System.in);
        Scanner scN = new Scanner(System.in);

        System.out.println("Informe o código");
        int codigo = scN.nextInt();

        System.out.println("Informe a nova espécie: ");
        String especie = sc.nextLine();

        System.out.println("Informe o novo genêro: ");
        String genero = sc.nextLine();

        try {

            PreparedStatement prep = conn.prepareStatement(
                    "UPDATE dinossauros set especie = ?, genero = ? WHERE codigo = ?"
            );

            prep.setString(1, especie);
            prep.setString(2, genero);
            prep.setInt(3, codigo);

            prep.executeUpdate();
            System.out.println("Update feito");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deletaRegistro() {

        Scanner scN = new Scanner(System.in);

        System.out.println("Informe o código");
        int codigo = scN.nextInt();

        try {

            PreparedStatement prep = conn.prepareStatement(
                    "DELETE FROM dinossauros WHERE codigo = ?"
            );

            prep.setInt(1, codigo);

            prep.executeUpdate();
            System.out.println("Delete concluído!");

        } catch (SQLException e) {
            System.out.println("a");
            System.out.println(e.getMessage());
        }
    }
}
