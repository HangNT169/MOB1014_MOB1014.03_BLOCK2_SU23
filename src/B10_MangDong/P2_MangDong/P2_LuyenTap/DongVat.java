/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P2_MangDong.P2_LuyenTap;

/**
 *
 * @author hangnt
 */
public class DongVat {

    private String maDV;
    private String ten;
    private int tuoi;
    private double canNang;

    public DongVat() {
    }

    public DongVat(String maDV, String ten, int tuoi, double canNang) {
        this.maDV = maDV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.canNang = canNang;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public void inThongTin() {
        System.out.println("ma dong vat: " + maDV);
        System.out.println("ten dong vat: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("can nang: " + canNang);
    }
}
