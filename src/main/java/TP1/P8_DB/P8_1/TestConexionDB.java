package TP1.P8_DB.P8_1;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConexionDB {
    public static void main(String[] args){
        Connection connection = null;
        try{
            //Class.forName("net.sourceforge.jtds.jdbc.Driver");
//            String url = "jdbc:sqlserver://localhost;integratedSecurity=true;";
//            connection = DriverManager.getConnection(url,"","");

            //TUVE QUE DESCARGAR mssql-jdbc 9.2.1.jre8 PARA CONECTARME A LA bd
            //TUVE QUE DESCARGAR LA LIBRERIA mssql-jdbc_auth-9.2.1.x64 PARA USAR INTEGRATEDSECURITY

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:50513;database=PCPC;integratedSecurity=true;instance=SQLEXPRESS;";
            connection = DriverManager.getConnection(connectionUrl);
        }catch (Exception ex){
            System.out.print("Salio por time OUT, excepcion: " + ex);
        }
    }
}
