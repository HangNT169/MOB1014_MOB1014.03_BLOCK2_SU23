/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P6_Mang.P1_MenuLap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Tao 1 menu gom cac chuc nang sau - Lap lai toi khi chon 3 thi dung 1.
     * Tinh tong, hieu, tich , thuong cua 3 so nguyen nhap tu ban phim 2. Nhap
     * vao so nguyen duong n. Tinh tich cua cac so le va chia het cho 3 tu 1-n
     * 3. Thoat
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nhap;
        do {
            System.out.println("menu");
            System.out.println("1. bai 1");
            System.out.println("2. bai 2");
            System.out.println("3. thoat");
            System.out.println("moi ban chon");
            nhap = Integer.valueOf(sc.nextLine());

            switch (nhap) {
                case 1:
                    System.out.println("1. bai 1");
                    System.out.println("Moi nhap so thu nhat: ");
                    int so1 = Integer.valueOf(sc.nextLine());
                    System.out.println("Moi nhap so thu hai: ");
                    int so2 = Integer.valueOf(sc.nextLine());
                    int tong = so1 + so2;
                    int hieu = so1 - so2;
                    int tich1 = so1 * so2;
                    double thuong = 1.0 * so1 / so2;
                    System.out.println("Tong: " + tong);
                    System.out.println("Hieu: " + hieu);
                    System.out.println("Tich: " + tich1);
                    System.out.println("Thuong: " + thuong);

                    break;
                case 2:
                    System.out.println("2. bai 2");
                    System.out.println("Moi ban nhap so nguyen duong");
                    int soNguyen = Integer.valueOf(sc.nextLine());
                    int tich = 1;
                    for (int i = 1; i < soNguyen + 1; i++) {
                        if (i % 2 != 0 && i % 3 == 0) {
                            tich *= i;
                        }
                    }
                    System.out.println("Tich cac so nguyen tu 1 den  n la " + tich);
                    break;
                case 3:
                    System.out.println("3. bai 3");
                    break;
                default:
                    System.out.println("chon sai moi chon lai");
                    break;
            }
        } while (nhap != 3);

    }
}
