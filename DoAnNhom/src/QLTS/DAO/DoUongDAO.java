/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.DAO;


import QLTS.MODAL.DoUong;
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
public class DoUongDAO {
    public List<DoUong> docTatCaDoUong()
    {
        List<DoUong> list = new ArrayList<>();
        try{
            String sql = "SELECT * FROM DoUong";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                DoUong nuoc = new DoUong();
                nuoc.setMaNuoc(rs.getString(1));
                nuoc.setTenNuoc(rs.getString(2));
                nuoc.setGia(rs.getInt(3));
                nuoc.setKhuyenMai(rs.getInt(4));
                nuoc.setAnh(rs.getString(5));
                list.add(nuoc);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
    public List<DoUong> timTheoMa(String ma)
    {
        List<DoUong> listDoUong = new ArrayList<>();
        try{
            String sql = "Select * from DoUong where  MaNuoc = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, ma);
            ResultSet rs = pstm.executeQuery();
            listDoUong.clear();
            while(rs.next())
            {
                DoUong nuoc = new DoUong();
                nuoc.setMaNuoc(rs.getString(1));
                nuoc.setTenNuoc(rs.getString(2));
                nuoc.setGia(rs.getInt(3));
                nuoc.setKhuyenMai(rs.getInt(4));
                listDoUong.add(nuoc);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return listDoUong;
    }
    public int themDoUong(DoUong nuoc)
    {
        try{
            String sql = "Insert into DoUong values(?,?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nuoc.getMaNuoc());
            pstm.setString(2,nuoc.getTenNuoc());
            pstm.setInt(3, nuoc.getGia());
            pstm.setInt(4, nuoc.getKhuyenMai());
            pstm.setString(5, nuoc.getAnh());
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int suaDoUong(DoUong nuoc)
    {
        try{
            String sql = "SET DATEFORMAT DMY Update DoUong set TenNuoc=?,Gia=?,KhuyenMai =?, Anh = ? where MaNuoc=?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(5, nuoc.getMaNuoc());
            pstm.setString(1,nuoc.getTenNuoc());
            pstm.setInt(2, nuoc.getGia());
            pstm.setInt(3, nuoc.getKhuyenMai());
            pstm.setString(4, nuoc.getAnh());
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
     public DoUong timTheoID(String MaNuoc) throws Exception {
        String sql = "Select * From DoUong where MaNuoc = '"+MaNuoc+"'";
        try {
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    DoUong nuoc = new DoUong();
                    nuoc.setMaNuoc(rs.getString(1));
                    nuoc.setTenNuoc(rs.getString(2));
                    nuoc.setGia(rs.getInt(3));
                    nuoc.setKhuyenMai(rs.getInt(4));
                    nuoc.setAnh(rs.getString(5));
                    return nuoc;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Trả về null nếu không tìm thấy
    }
    public int xoaDoUong(String ma)
    {
        try{
            String sql = "Delete DoUong Where MaNuoc=?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,ma);
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
}
