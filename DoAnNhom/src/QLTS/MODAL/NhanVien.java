/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.MODAL;

import java.util.List;

/**
 *
 * @author cheda
 */
public class NhanVien {
    private String MaNV;
    private String TenNV;
    private String MatKhau;
    private String NamSinh;
    private String DiaChi;
    private int SDT;
    private int Chucvu;

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public void setChucvu(int Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public int getChucvu() {
        return Chucvu;
    }

    public NhanVien(String MaNV, String TenNV, String MatKhau, String NamSinh, String DiaChi, int SDT, int Chucvu) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.MatKhau = MatKhau;
        this.NamSinh = NamSinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Chucvu = Chucvu;
    }
    public NhanVien() {
        
    }

    
}
