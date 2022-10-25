/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hanht
 */
public class KetNoi {
    public Connection cn;
    public void KetNoi() {
        try {
//            Ket noi vao csdl: QLTaiKhoan
            //b1: xac dinh he quan tri csdl
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("DA KET NOI HQTCSDL");
            String url="jdbc:sqlserver://LAPTOP-V5E394L3\\SQLEXPRESS:1433;databaseName=QLTaiKhoan;user=sa;password=123123";
            cn = DriverManager.getConnection(url);
            System.out.println("Da Ket NOI");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        KetNoi kn = new KetNoi();
        kn.KetNoi();
    }
}