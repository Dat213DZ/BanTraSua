/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.DAO;

import QLTS.MODAL.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cheda
 */
public class NhanVienDAO {
    public List<NhanVien> docTatCaNhanVien()
    {
        List<NhanVien> list = new ArrayList<>();
        try{
            String sql = "SELECT MaNV,TenNV,MatKhau ,CONVERT(varchar, NgaySinh, 103) AS NgaySinh,DiaChi,SDT,chucvu FROM NHANVIEN;";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setMatKhau(rs.getString(3));
                nv.setNamSinh(rs.getString(4));
                nv.setDiaChi(rs.getString(5));
                nv.setSDT(Integer.parseInt(rs.getString(6)));
                nv.setChucvu(Integer.parseInt(rs.getString(7)));
                list.add(nv);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
    public List<NhanVien> timTheoMa(String ma)
    {
        List<NhanVien> listNhanVien = new ArrayList<>();
        try{
            String sql = "Select * from NhanVien where  MaNV = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, ma);
            ResultSet rs = pstm.executeQuery();
            listNhanVien.clear();
            while(rs.next())
            {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setMatKhau(rs.getString(3));
                nv.setNamSinh(rs.getString(4));
                nv.setDiaChi(rs.getString(5));
                nv.setSDT(Integer.parseInt(rs.getString(6)));
                nv.setChucvu(Integer.parseInt(rs.getString(7)));
                listNhanVien.add(nv);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return listNhanVien;
    }
    public NhanVien timTheoID(String MaSV) throws Exception {
        String sql = "Select * From NhanVien where MaNV = ?";
        try {
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, MaSV);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    NhanVien nv = new NhanVien();
                    nv.setMaNV(rs.getString(1));
                    nv.setTenNV(rs.getString(2));
                    nv.setMatKhau(rs.getString(3));
                    nv.setNamSinh(rs.getString(4));
                    nv.setDiaChi(rs.getString(5));
                    nv.setSDT(Integer.parseInt(rs.getString(6)));
                    nv.setChucvu(Integer.parseInt(rs.getString(7)));
                    return nv;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Trả về null nếu không tìm thấy
    }

    public int themSanPham(NhanVien nv)
    {
        try{
            String sql = "SET DATEFORMAT DMY Insert into NhanVien values(?,?,?,?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nv.getMaNV());
            pstm.setString(2, nv.getTenNV());
            pstm.setString(3,nv.getMatKhau());
            pstm.setString(4, nv.getNamSinh());
            pstm.setString(5, nv.getDiaChi());
            pstm.setInt(6, nv.getSDT());
            pstm.setInt(7, nv.getChucvu());
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int suaSanPham(NhanVien nv)
    {
        try{
            String sql = "SET DATEFORMAT DMY Update NhanVien set TenNV=?,MatKhau = ?, NgaySinh =?, DiaChi=?, SDT = ?, chucvu =? where MaNV=?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(7, nv.getMaNV());
            pstm.setString(1, nv.getTenNV());
            pstm.setString(2,nv.getMatKhau());
            pstm.setString(3, nv.getNamSinh());
            pstm.setString(4, nv.getDiaChi());
            pstm.setInt(5, nv.getSDT());
            pstm.setInt(6, nv.getChucvu());
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int xoaSanPham(String maSp)
    {
        try{
            String sql = "Delete NhanVien Where MaNV=?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,maSp);
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
}
