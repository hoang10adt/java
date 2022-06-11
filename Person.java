/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GGV;

/**
 *
 * @author TrungKien
 */
public abstract class Person {
    private int maDD;
    private String hoten;
    private String gioitinh;

    public Person() {
    }

    public Person(int maDD, String hoten, String gioitinh) {
        this.maDD = maDD;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
    }

    public int getMaDD() {
        return maDD;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setMaDD(int maDD) {
        this.maDD = maDD;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
    public abstract String xetthuong();
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
