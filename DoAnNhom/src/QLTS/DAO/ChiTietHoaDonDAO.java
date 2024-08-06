/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.DAO;

import QLTS.MODAL.ChiTietHoaDon;
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
public class ChiTietHoaDonDAO {
    public List<ChiTietHoaDon> docTatCaHoadon()
    {
        List<ChiTietHoaDon> list = new ArrayList<>();
        try{
            String sql = "Select MaHD,DoUong.tenNuoc,Ban.TenBan, SoLuong from ChiTietHoaDon,Ban,DoUong where ChiTietHoaDon.MaBan = Ban.MaBan AND DoUong.MaNuoc = ChiTietHoaDon.MaNuoc";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                ChiTietHoaDon hd = new ChiTietHoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setMaNuoc(rs.getString(2));
                hd.setMaBan(rs.getString(3));
                hd.setSoLuong(rs.getInt(4));
                list.add(hd);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
    public List<ChiTietHoaDon> timTheoMa(String ma)
    {
        List<ChiTietHoaDon> listChiTietHoaDon = new ArrayList<>();
        try{
            String sql = "Select * from ChiTietHoaDon where  MaHD = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, ma);
            ResultSet rs = pstm.executeQuery();
            listChiTietHoaDon.clear();
            while(rs.next()){
                ChiTietHoaDon hd = new ChiTietHoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setMaNuoc(rs.getString(2));
                hd.setMaBan(rs.getString(3));
                hd.setSoLuong(rs.getInt(4));
                listChiTietHoaDon.add(hd);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return listChiTietHoaDon;
    }
    public int themChiTietHoaDon(ChiTietHoaDon hd)
    {
        try{
            String sql = "Insert into ChiTietHoaDon values(?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, hd.getMaHD());
            pstm.setString(2,hd.getMaNuoc());
            pstm.setString(3, hd.getMaBan());
            pstm.setInt(4, hd.getSoLuong());
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int suaChiTietHoaDon(ChiTietHoaDon hd)
    {
        try{
            String sql = "Update ChiTietHoaDon set MaDat= ?, GioTT=?,ThanhTien=? where MaDat=?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, hd.getMaHD());
            pstm.setString(2,hd.getMaNuoc());
            pstm.setString(3, hd.getMaBan());
            pstm.setInt(4, hd.getSoLuong());
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int xoaChiTietHoaDon(String ma,String MaNuoc)
    {
        try{
            String sql = "Delete ChiTietHoaDon Where MaHD='"+ma+"' AND MaNuoc = (Select MaNuoc from DoUong where tenNuoc = N'"+MaNuoc+"')";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            return 1;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
}
