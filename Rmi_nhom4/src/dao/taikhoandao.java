/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.taikhoanbean;
import static dao.KetNoi.cn;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class taikhoandao {
   public taikhoanbean KtDn(String SoTaiKhoan, String MatKhau){
        try {
//            b2: Lay du lieu ve
            
            String sql = "select * from taikhoan where SoTaiKhoan = ? and MatKhau = ?";
	    PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
	    cmd.setString(1, SoTaiKhoan);
            cmd.setString(2,MatKhau);
            ResultSet rs = cmd.executeQuery();
            taikhoanbean tk = new taikhoanbean();
            if(rs.next()) {
                String taikhoan = rs.getString("SoTaiKhoan");
                String ht = rs.getString("HoTen");
                long Sotien = rs.getLong("SoTien");
                String mk =rs.getString("MatKhau");
                tk = new taikhoanbean(taikhoan, ht, Sotien, mk);
            }
            
            rs.close();
            
			   
            return tk;
	} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
	}
    }
    
}
