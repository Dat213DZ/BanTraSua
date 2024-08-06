/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.DAO;

import QLTS.MODAL.Ban;
import QLTS.MODAL.DoiBan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cheda
 */
public class DoiBanDAO {
    public List<DoiBan> DoiBan(String Ma)
    {
        List<DoiBan> list = new ArrayList<>();
        try{
            String sql = "Select Ban.MaBan from ChiTietHoaDon,Ban where ChiTietHoaDon.MaHD = '"+Ma+"' AND ChiTietHoaDon.MaBan = Ban.MaBan";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                
                DoiBan bn = new DoiBan();
                bn.setMaBan(rs.getString(1));
                list.add(bn);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
}
