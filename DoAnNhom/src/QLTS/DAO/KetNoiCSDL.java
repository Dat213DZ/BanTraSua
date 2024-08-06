/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author cheda
 */
public class KetNoiCSDL {
    public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("Loaded...");
        String url = "jdbc:sqlserver://LAPTOP-AUIVJ6IL\\DATCHE:1433;databaseName=QuanLyQuanTraSua;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String password = "123";
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connected...");
        return con;
    }
}
