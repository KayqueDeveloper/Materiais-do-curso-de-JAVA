package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {
        
        final String stringDeConexao = "jdbc:mysql://localhost";
        final String usuario = "root";
        final String senha = "k0203h27";
        
        Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
        
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
        
        conexao.close();
    }
}
