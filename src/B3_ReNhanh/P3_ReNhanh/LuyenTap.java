/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_ReNhanh.P3_ReNhanh;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class LuyenTap {

    // 1. Nhap vao 1 so nguyen. Kiem tra day la so chan hay le
    // 2. Tinh tong,hieu, tich, thuong cua 2 so nguyen nhap tu ban phim
    // 3. Nhap vao 1 so nguyen. Kiem tra so do thuoc thang nao trong nam
    // 4. Nhap vao 1 so nguyen. Kiem tra so do thuoc quy nao trong nam
    // 5. Tao 1 menu gom cac chuc nang sau 
    // 1. Nhap ten, tuoi, dia chi cua ban than va in ra man hinh
    // 2. Kiem tra 1 so nhap tu ban phim xem co lon hon 10 khong
    // 3. Thoat
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // bai 1
//        System.out.println("nhap vao so nguyen");
//        int soNguyen = sc.nextInt();
//        if (soNguyen % 2 == 0) {
//            System.out.println("la so chan");
//
//        } else {
//            System.out.println("la so le");
//        }
        // bai 2
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println("nhap so b");
        int b = sc.nextInt();
        System.out.println("tong" + (a + b));
        System.out.println("hieu" + (a - b));
        System.out.println("tich" + (a * b));
        double thuong = 1.0 * a / b;
        System.out.println("Thuong = " + thuong);
    }

}
