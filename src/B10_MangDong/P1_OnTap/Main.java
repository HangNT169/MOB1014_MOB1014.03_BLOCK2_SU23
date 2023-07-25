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
public class Main {

    /**
     * 1. Tao class PhongHoc gom cac thuoc tinh sau ma - String, ten - String, toa
     * - String, dienTich - double trangThai - int, va cac contructor getter,
     * setter, display(): void Tao class Main . - In thong tin cua 1 PhongHoc
     * với dữ liệu fix cứng - Nhap thong tin cua 1 PHongHoc tu ban phim va in ra
     * man hinh thong tin do
     */
    /**
     * 2. DienThoai gồm các thuộc tính :
     * ma- String  ten-String, dongMay -String ,
     * gia-float,  dungLuong - int, mauSac - String
     * và các contrcutor, getter, setter 
     * và hàm hienThiDanhSachSinhVien(): String 
     * 
     * Tao class Main :
     *  Nhap thong tin cua 1 doi tuong Dien Thoai 
     *  tu ban phim va in ra man hinh
     */
    public static void main(String[] args) {
//        PhongHoc phongHoc = new PhongHoc("PH31906", "Nguyen Hai Yen", "F406", 1.0, 1);
//        phongHoc.display();
        // Nhap thong tin Phong Hoc => Nhap ma, ten, toa, dien tich, trang thai
        // => In PHong hoc 
        Scanner sc = new Scanner(System.in);
        // B1: Nhap thong tin Phong Hoc => Nhap ma, ten, toa, dien tich, trang thai
        System.out.println("Nhap ma phong hoc: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten phong hoc: ");
        String ten = sc.nextLine();
        System.out.println("Nhap toa hoc: ");
        String toa = sc.nextLine();
        System.out.println("Nhap dien tich: ");
        double dienTich = sc.nextDouble();
        System.out.println("Nhap trang thai: ");
        int trangThai = sc.nextInt();
        
       // B2: Khoi tao doi tuong 
       // C1: K tham so
       PhongHoc phongHoc = new PhongHoc();
       phongHoc.setMa(ma);
       // lam cho den khi het thuoc tinh
       // C2: full ts
       PhongHoc ph = new PhongHoc(ma, ten, toa, dienTich, trangThai);
       
       // B3: In ra 
       ph.display();

    }
}
