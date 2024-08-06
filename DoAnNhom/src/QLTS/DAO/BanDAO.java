/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.DAO;

import QLTS.MODAL.Ban;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author cheda
 */
public class BanDAO {
    public List<Ban> docTatCaBan()
    {
        List<Ban> list = new ArrayList<>();
        try{
            String sql = "SELECT * FROM Ban;";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Ban bn = new Ban();
                bn.setMaBan(rs.getString(1));
                bn.setTenBan(rs.getString(2));
                bn.setTrangThai(rs.getString(3));

                list.add(bn);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
    public List<Ban> timTheoMa(String ma)
    {
        List<Ban> listBan = new ArrayList<>();
        try{
            String sql = "Select * from Ban where  MaNV = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, ma);
            ResultSet rs = pstm.executeQuery();
            listBan.clear();
            while(rs.next())
            {
                Ban bn = new Ban();
                bn.setMaBan(rs.getString(1));
                bn.setTenBan(rs.getString(2));
                bn.setTrangThai(rs.getString(3));
                listBan.add(bn);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return listBan;
    }
    public int themBan(Ban bn)
    {
        try{
            String sql = "Insert into Ban values(?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, bn.getMaBan());
            pstm.setString(2, bn.getTenBan());
            pstm.setString(3, bn.getTrangThai());
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int suaBan(Ban bn)
    {
        try{
            String sql = "Update Ban set TenBan = ?, TrangThai = ? where MaBan=?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(3, bn.getMaBan());
            pstm.setString(1, bn.getTenBan());
            pstm.setString(2, bn.getTrangThai());
            return pstm.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int suaTrangThaiBan(String Ma,String TrangThai)
    {
        try{
            String sql = "Update Ban set  TrangThai = N'"+TrangThai+"'  where MaBan='"+Ma+"'";
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
    public int xoaBan(String ma)
    {
        try{
            String sql = "Delete Ban Where MaBan=?";
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
