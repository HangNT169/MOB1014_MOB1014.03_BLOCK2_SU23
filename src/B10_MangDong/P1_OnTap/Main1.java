/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DienThoai dt = new DienThoai();
        System.out.println("Nhap ma :");
        String ma = scan.nextLine();
        System.out.println("Nhap ten :");
        String ten = scan.nextLine();
        System.out.println("Nhap dong may :");
        String dongMay = scan.nextLine();
        System.out.println("Nhap gia :");
        float gia = scan.nextFloat();
        System.out.println("Nhap dung luong :");
        int dungLuong = scan.nextInt();
        scan.nextLine();
        System.out.println("Nhap mau sac :");
        String mauSac = scan.nextLine();

        dt.setMa(ma);
        dt.setTen(ten);
        dt.setDongMay(dongMay);
        dt.setGia(gia);
        dt.setDungLuong(dungLuong);
        dt.setMauSac(mauSac);

       // dt.hienThiDanhSachSinhVien();
        System.out.println(dt.hienThiDanhSachSinhVien());
    }
}
