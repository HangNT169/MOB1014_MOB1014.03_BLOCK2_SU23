/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieuVaNhapXuat;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class P3_LuyenTap {

    // Luyen tap :
    // 1. Nhap ten,diaChi,nganhHoc,truongHoc cua nguoi yeu cu
    // va in ra man hinh
    // 2.Nhap ten,tuoi,diaChi,chieuCao,canNang,nganhHoc,truongHoc
    // cua ban than va in ra man hinh
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String ten = scan.nextLine();
        System.out.println("Nhap dia chi:");
        String diaChi = scan.nextLine();
        System.out.println("Nhap nganh hoc:");
        String nganhHoc = scan.nextLine();
        System.out.println("Nhap truong hoc:");
        String truongHoc = scan.nextLine();

        System.out.println("Ten: " + ten);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Nganh hoc: " + nganhHoc);
        System.out.println("Truong hoc: " + truongHoc);
    }

}
