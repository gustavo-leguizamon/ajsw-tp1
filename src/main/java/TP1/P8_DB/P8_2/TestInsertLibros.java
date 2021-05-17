package TP1.P8_DB.P8_2;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class TestInsertLibros {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try{
            //TUVE QUE DESCARGAR mssql-jdbc 9.2.1.jre8 PARA CONECTARME A LA bd
            //TUVE QUE DESCARGAR LA LIBRERIA mssql-jdbc_auth-9.2.1.x64 PARA USAR INTEGRATEDSECURITY

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:50513;database=APP_JAVA;integratedSecurity=true;instance=SQLEXPRESS;";
            connection = DriverManager.getConnection(connectionUrl);

            //Statement instruccion = connection.createStatement();
            //int filasAfectadas = instruccion.executeUpdate("INSERT INTO tblPrueba(campo1, campo2) VALUES(1,8)");

            connection.setAutoCommit(false);

            List<Libro> libros = getLibros();

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Libros(Nombre, Anio) VALUES(?,?)");

            int i = 0;

            for (Libro libro : libros){
                preparedStatement.setString(1, libro.get_nombre());
                preparedStatement.setInt(2, libro.get_anio());

                preparedStatement.addBatch();
                i++;

                if (i % 1000 == 0 || i == libros.size()) {
                    preparedStatement.executeBatch(); // Execute every 1000 items.
                }
            }

            preparedStatement.executeBatch();

            connection.commit();
        }catch (Exception ex){
            if (connection != null && !connection.isClosed())
                connection.rollback();
            System.out.print("Salio por time OUT, excepcion: " + ex);
        }
        finally {
            if (connection != null && !connection.isClosed())
                connection.close();
        }
    }

    private static List<Libro> getLibros(){
        return Arrays.asList(
                new Libro(1, "Libro1", 2021),
                new Libro(2, "libro2", 2022),
                new Libro(3, "libro3", 2023),
                new Libro(4, "libro4", 2024)
        );
    }
}
