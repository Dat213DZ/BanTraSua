/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.MODAL;

/**
 *
 * @author cheda
 */
public class BaoCao {
    private String Ngay;
    private String SoLuongLy;
    private int TongTien;
    private int TongHD;

    public BaoCao(String Ngay, String SoLuongLy, int TongTien, int TongHD) {
        this.Ngay = Ngay;
        this.SoLuongLy = SoLuongLy;
        this.TongTien = TongTien;
        this.TongHD = TongHD;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public void setSoLuongLy(String SoLuongLy) {
        this.SoLuongLy = SoLuongLy;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public void setTongHD(int TongHD) {
        this.TongHD = TongHD;
    }

    public BaoCao() {
    }

    public String getNgay() {
        return Ngay;
    }

    public String getSoLuongLy() {
        return SoLuongLy;
    }

    public int getTongTien() {
        return TongTien;
    }

    public int getTongHD() {
        return TongHD;
    }
    
    
}
