/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.MODAL;

/**
 *
 * @author cheda
 */
public class ChiTietHoaDon {
    private String MaHD;
    private String MaNuoc;
    private String MaBan;
    private int SoLuong;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String MaHD, String MaNuoc, String MaBan, int SoLuong) {
        this.MaHD = MaHD;
        this.MaNuoc = MaNuoc;
        this.MaBan = MaBan;
        this.SoLuong = SoLuong;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setMaNuoc(String MaNuoc) {
        this.MaNuoc = MaNuoc;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getMaNuoc() {
        return MaNuoc;
    }

    public String getMaBan() {
        return MaBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }
}
