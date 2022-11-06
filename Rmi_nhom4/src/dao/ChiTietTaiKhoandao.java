/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ChiTietTaiKhoandao {
    public int Them( Date NgayRutTien, long SoTIenRutRa, String SoTaiKhoan, String GhiChu) throws SQLException{
        String sql="Insert into ChiTietTaiKhoan(NgayRutTien,SoTienRutRa,SoTaiKhoan,GhiChu)\n" +
        "values (?,?,?,? )" ;      
        //tao preparedStatement
        PreparedStatement cmd=KetNoi.cn.prepareStatement(sql);
        //truyen tham so vao cau lenh
        cmd.setDate(1, new java.sql.Date(NgayRutTien.getTime()));
        cmd.setLong(2, SoTIenRutRa);
        cmd.setString(3, SoTaiKhoan);
        cmd.setString(4, GhiChu);
        //thuc hien 
        return cmd.executeUpdate();
    
    }
}
