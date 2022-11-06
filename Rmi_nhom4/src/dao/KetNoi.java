/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hanht
 */
public class KetNoi {
    public static Connection cn;
    public void KetNoi() {
        try {
//            Ket noi vao csdl: QLTaiKhoan
            //b1: xac dinh he quan tri csdl
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("DA KET NOI HQTCSDL");
            String url="jdbc:sqlserver://LAPTOP-TNBT312N\\SQLEXPRESS:1433;databaseName=QLTK;user=sa;password=1234";
            cn = DriverManager.getConnection(url);
            System.out.println("Da Ket NOI");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        try {
               KetNoi kn = new KetNoi();
        kn.KetNoi();
        ChiTietTaiKhoandao ctdao=new ChiTietTaiKhoandao();
        taikhoandao tkdao=new taikhoandao();
        tkdao.KtDn("01234","12344");
        String st="2021-10-10";
        SimpleDateFormat dd=new SimpleDateFormat("yyyy-mm-dd");
        Date ngay=dd.parse(st);
        ctdao.Them(ngay,12300000 ,"01234","alo");
        
        } catch (Exception e) {
        }
        
    }
}
