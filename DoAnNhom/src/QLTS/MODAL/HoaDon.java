/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.MODAL;

/**
 *
 * @author cheda
 */
public class HoaDon {
    private String MaHD;
    private String GioTT;
    private String TrangThai;
    private int ThanhTien;

    public HoaDon() {
    }

    public HoaDon(String MaHD, String GioTT, String TrangThai, int ThanhTien) {
        this.MaHD = MaHD;
        this.GioTT = GioTT;
        this.TrangThai = TrangThai;
        this.ThanhTien = ThanhTien;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setGioTT(String GioTT) {
        this.GioTT = GioTT;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getGioTT() {
        return GioTT;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public int getThanhTien() {
        return ThanhTien;
    }
    
    
}
