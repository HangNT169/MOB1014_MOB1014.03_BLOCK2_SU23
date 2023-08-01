/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_String.P3_LuyenTap.bai2;

/**
 *
 * @author hangnt
 */
public class DienThoai {

    private String ten;
    private String mau;
    private Integer boNho;
    private Integer gia;

    public DienThoai() {
    }

    public DienThoai(String ten, String mau, Integer boNho, Integer gia) {
        this.ten = ten;
        this.mau = mau;
        this.boNho = boNho;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public Integer getBoNho() {
        return boNho;
    }

    public void setBoNho(Integer boNho) {
        this.boNho = boNho;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public void inThongTin() {
        System.out.println("ten" + ten);
        System.out.println("mau" + mau);
        System.out.println("bo Nho" + boNho);
    }
}
