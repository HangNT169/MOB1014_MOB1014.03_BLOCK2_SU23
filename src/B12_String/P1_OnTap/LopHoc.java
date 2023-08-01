/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_String.P1_OnTap;

/**
 *
 * @author hangnt
 */
public class LopHoc {

    private String maLop;
    private String lopHoc;
    private int dienTich;
    private String diaDiemLopHoc;

    public LopHoc(String maLop, String lopHoc, int dienTich, String diaDiemLopHoc) {
        this.maLop = maLop;
        this.lopHoc = lopHoc;
        this.dienTich = dienTich;
        this.diaDiemLopHoc = diaDiemLopHoc;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public String getDiaDiemLopHoc() {
        return diaDiemLopHoc;
    }

    public void setDiaDiemLopHoc(String diaDiemLopHoc) {
        this.diaDiemLopHoc = diaDiemLopHoc;
    }

    public void inThongTin() {
        System.out.println("ma lop " + maLop);
        System.out.println("lop hoc " + lopHoc);
        System.out.println("dien tich " + dienTich);
        System.out.println("dia diem lop hoc" + diaDiemLopHoc);
    }
}
