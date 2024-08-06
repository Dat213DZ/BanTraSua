/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.DAO;

import QLTS.MODAL.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author cheda
 */
public class DangNhapDAO {
    public NhanVien dangNhap(String tennd, String password)
    {
        NhanVien nd = null;
        try{
            Connection  con = KetNoiCSDL.openConnection();
            String sql = "select * from NhanVien where MaNV = ? and MatKhau =?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1,tennd);
            pre.setString(2,password);
            ResultSet rs = pre.executeQuery();
            if(rs.next())
            {
                nd = new NhanVien();
                nd.setMaNV(rs.getString("MaNV"));
                nd.setMatKhau(rs.getString("MatKhau"));
                nd.setChucvu(rs.getInt("chucvu"));
            }
            con.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return nd;
    }
}
