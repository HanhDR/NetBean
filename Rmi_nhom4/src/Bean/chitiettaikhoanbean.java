/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author hanht
 */
public class chitiettaikhoanbean implements Serializable{
    private long Id;
    private Date NgayRutTien;
    private long SoTIenRutRa;
    private String SoTaiKhoan;
    private String GhiChu;

    
    
     public  chitiettaikhoanbean(){

}
    public chitiettaikhoanbean(long Id, Date NgayRutTien, long SoTIenRutRa, String SoTaiKhoan, String GhiChu) {
        this.Id = Id;
        this.NgayRutTien = NgayRutTien;
        this.SoTIenRutRa = SoTIenRutRa;
        this.SoTaiKhoan = SoTaiKhoan;
        this.GhiChu = GhiChu;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public Date getNgayRutTien() {
        return NgayRutTien;
    }

    public void setNgayRutTien(Date NgayRutTien) {
        this.NgayRutTien = NgayRutTien;
    }

    public long getSoTIenRutRa() {
        return SoTIenRutRa;
    }

    public void setSoTIenRutRa(long SoTIenRutRa) {
        this.SoTIenRutRa = SoTIenRutRa;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
