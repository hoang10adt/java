/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GGV;
import java.sql.*;
/**
 *
 * @author TrungKien
 */
public class XLGV {
    public Connection getCon(){
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlgv2","root","");
        } 
        catch (Exception ex){
            ex.printStackTrace();
        }
        return conn;
    }
    
    public void getGV(String Donvi, int SoCT){
        Connection conn = getCon();
        
        String query = "Select * from tbgiangvien2 where Donvi = '" + Donvi + "' and Soct = '" + SoCT + "'";
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
        
            while(rs.next()){
                int maDD = rs.getInt("MaDD");
                String hoten = rs.getString("Hoten");
                String gioiTInh = rs.getString("GioiTinh");
                String donVi = rs.getString("Donvi");
                int soCT = rs.getInt("soCT");
                
                System.out.println(maDD + "\t" + hoten + "\t" + gioiTInh + "\t" + donVi + "\t" +soCT);
            
            }
        }
        catch (Exception ex) {
                    System.out.println(ex);
                }
        }
    }
