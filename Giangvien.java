/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GGV;

/**
 *
 * @author TrungKien
 */
public class Giangvien extends Person {
    private String donvi;
    private int soCT;

    public Giangvien() {
    }

    public Giangvien(String donvi, int soCT) {
        this.donvi = donvi;
        this.soCT = soCT;
    }

    public Giangvien(String donvi, int soCT, int maDD, String hoten, String gioitinh) {
        super(maDD, hoten, gioitinh);
        this.donvi = donvi;
        this.soCT = soCT;
    }

    public String getDonvi() {
        return donvi;
    }

    public int getSoCT() {
        return soCT;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public void setSoCT(int soCT) {
        this.soCT = soCT;
    }
    
    public String xetthuong(){
        if (this.soCT > 10){
            return "xet thuong";
        } else {
            return null;
        }
    }
    
}
