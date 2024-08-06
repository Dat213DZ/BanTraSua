/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.MODAL;

/**
 *
 * @author cheda
 */
public class DoUong {
    private String MaNuoc;
    private String TenNuoc;
    private int Gia;
    private int KhuyenMai;
    
    private String Anh;

    public DoUong() {
    }

    public DoUong(String MaNuoc, String TenNuoc, int Gia, int KhuyenMai, String Anh) {
        this.MaNuoc = MaNuoc;
        this.TenNuoc = TenNuoc;
        this.Gia = Gia;
        this.KhuyenMai = KhuyenMai;
        this.Anh = Anh;
    }

    public void setMaNuoc(String MaNuoc) {
        this.MaNuoc = MaNuoc;
    }

    public void setTenNuoc(String TenNuoc) {
        this.TenNuoc = TenNuoc;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public void setKhuyenMai(int KhuyenMai) {
        this.KhuyenMai = KhuyenMai;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getMaNuoc() {
        return MaNuoc;
    }

    public String getTenNuoc() {
        return TenNuoc;
    }

    public int getGia() {
        return Gia;
    }

    public int getKhuyenMai() {
        return KhuyenMai;
    }

    public String getAnh() {
        return Anh;
    }
    
    
}
