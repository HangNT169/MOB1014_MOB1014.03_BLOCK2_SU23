/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_ReNhanh.P1_OnTapNhapXuat;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Bai2 {
    // 2.Nhap ten,tuoi,diaChi,chieuCao,canNang,nganhHoc,truongHoc
    // cua ban than va in ra man hinh

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String ten = scan.nextLine();
        System.out.println("Nhap dia chi: ");
        String diaChi = scan.nextLine();
        System.out.println("Nhap chieu cao");
//        int chieuCao = scan.nextInt();
//        String chieuCaoStr = scan.nextLine();
        // Can ep String => Integer 
//        int chieuCao = Integer.valueOf(chieuCaoStr);
        int chieuCao = Integer.valueOf(scan.nextLine());
        //
//        Integer.valueOf(ten).
        System.out.println("canNang");
//        double canNang = scan.nextDouble();
        double canNang = Double.parseDouble(scan.nextLine());
        // C1: C => fflush(stdin) => Xoa bo nho dem
        // => Java : scan.nextLine()
        // C2: Ep kieu
        // Coi tat ca moi thu nhap tu ban phim => La Chuoi
        // Sau do ep kieu ve kieu du lieu tuong ung
//        scan.nextLine();
        System.out.println("Nhap nganh hoc");
        String nganhHoc = scan.nextLine();
        System.out.println("Nhap truong hoc");
        String truongHoc = scan.nextLine();

        System.out.println("Ten:" + ten);
        System.out.println("Dia chi" + diaChi);
        System.out.println("Chieu cao" + chieuCao);
        System.out.println("Can nang" + canNang);
        System.out.println("Nganh hoc" + nganhHoc);
        System.out.println("Truong hoc" + truongHoc);
    }
}
