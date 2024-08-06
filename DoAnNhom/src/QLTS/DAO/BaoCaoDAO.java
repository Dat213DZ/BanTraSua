/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTS.DAO;

import QLTS.MODAL.BaoCao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cheda
 */
public class BaoCaoDAO {
    public List<BaoCao> docTatCaBaoCao()
    {
        List<BaoCao> list = new ArrayList<>();
        try{
            String sql = "SELECT CONVERT(date, h.GioTT) AS Ngay, COUNT(ct.MaHD) AS SoLuongDong,SUM(h.ThanhTien) AS TongThanhTien, COUNT(DISTINCT h.MaHD) AS SoHoaDon FROM  HoaDon h LEFT JOIN  ChiTietHoaDon ct ON h.MaHD = ct.MaHD GROUP BY   CONVERT(date, h.GioTT)";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                
                BaoCao bc = new BaoCao();
                bc.setNgay(rs.getString(1));
                bc.setSoLuongLy(rs.getString(2));
                bc.setTongHD(rs.getInt(3));
                bc.setTongTien(rs.getInt(4));
                
                list.add(bc);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
}
