/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.DAO;

import QLTS.MODAL.HoaDon;
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
public class HoaDonDAO {
    public List<HoaDon> docTatCaHoadon()
    {
        List<HoaDon> list = new ArrayList<>();
        try{
            String sql = "SELECT * FROM HoaDon";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setGioTT(rs.getString(2));
                hd.setTrangThai(rs.getString(3));
                hd.setThanhTien(rs.getInt(4));
                list.add(hd);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
    public List<HoaDon> timTheoMa(String ma)
    {
        List<HoaDon> listHoaDon = new ArrayList<>();
        try{
            String sql = "Select * from HoaDon where  MaHD = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, ma);
            ResultSet rs = pstm.executeQuery();
            listHoaDon.clear();
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setGioTT(rs.getString(2));
                hd.setTrangThai(rs.getString(3));
                hd.setThanhTien(rs.getInt(4));
                listHoaDon.add(hd);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return listHoaDon;
    }
    public int themHoaDon(HoaDon hd)
    {
        try{
            String sql = "SET DATEFORMAT DMY Insert into HoaDon values(?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, hd.getMaHD());
            pstm.setString(2,hd.getGioTT());
            pstm.setString(3, hd.getTrangThai());
            pstm.setInt(4, hd.getThanhTien());
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int suaHoaDon(HoaDon hd)
    {
        try{
            String sql = "Update HoaDon set GioTT=?,TrangThai = ? ,ThanhTien=? where MaHD=?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(4, hd.getMaHD());
            pstm.setString(1,hd.getGioTT());
            pstm.setString(2, hd.getTrangThai());
            pstm.setInt(3, hd.getThanhTien());
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int suaTrangThaiHoaDon(String Ma, String TrangThai)
    {
        try{
            String sql = "Update HoaDon set TrangThai = N'"+TrangThai+"' where MaHD = '"+Ma+"'";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            return 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int xoaHoaDon(String ma)
    {
        try{
            String sql = "Delete HoaDon Where MaHD=?";
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
