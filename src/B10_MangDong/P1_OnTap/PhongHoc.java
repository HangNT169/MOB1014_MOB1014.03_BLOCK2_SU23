/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_OnTap;

/**
 *
 * @author hangnt
 */
public class PhongHoc {

    private String ma;
    private String ten;
    private String toa;
    private double dienTich;
    private int trangThai;

    public PhongHoc() {
    }

    public PhongHoc(String ma, String ten, String toa, double dienTich, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.toa = toa;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getToa() {
        return toa;
    }

    public void setToa(String toa) {
        this.toa = toa;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public void display() {
        System.out.println("ma: " + ma);
        System.out.println("ten: " + ten);
        System.out.println("toa: " + toa);
        System.out.println("dien tich: " + dienTich);
        System.out.println("trang thai:  " + trangThai);
    }

}
