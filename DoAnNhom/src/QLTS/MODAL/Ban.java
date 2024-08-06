/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.MODAL;

import java.util.logging.Logger;

/**
 *
 * @author cheda
 */
public class Ban {
    private String MaBan;
    private String TenBan;
    private String TrangThai;

    public Ban() {
    }

    public Ban(String MaBan, String TenBan, String TrangThai) {
        this.MaBan = MaBan;
        this.TenBan = TenBan;
        this.TrangThai = TrangThai;
    }

    public String getMaBan() {
        return MaBan;
    }

    public String getTenBan() {
        return TenBan;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public void setTenBan(String TenBan) {
        this.TenBan = TenBan;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
    
    
}
