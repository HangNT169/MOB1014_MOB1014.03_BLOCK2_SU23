/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4_VongLap.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Tao 1 menu gom cac chuc nang sau : 1. Nhap vao 2 so nguyen. Tinh tong,
     * hieu, tich, thuong 2. Nhap ten, tuoi, khuVucSong, canNang cua con meo
     * hang xom. Va in ra man hinh 3. Nhap vao 1 so nguyen. Kiem tra day la so
     * chan hay le. 4. Nhap vao 1 so nguyen la canh hinh vuong. Tinh chu vi,
     * dienTich hinh vuong 5. Nhap vao 1 so nguyen la ban kinh hinh tron. Tinh
     * chu vi dien tich hinh tron. 0. Thoat
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.println("  moi ban chon chuc nang ");
        chon = sc.nextInt();
        switch (chon) {
            case 1:
                System.out.println(" chuc nang 1");
                System.out.println("nhap 1 so d");
                int d = sc.nextInt();
                System.out.println("nhap 1 so e");
                int e = sc.nextInt();
                System.out.println("tong: " + (d + e));
                System.out.println("thuong: " + (1.0 * d / e));

                break;
            case 2:
                System.out.println("chuc nang 2");

                System.out.println("Nhap ten cua con meo:");
                String ten = sc.next();
                sc.nextLine();
                System.out.println("Nhap tuoi cua con meo :");
                int tuoi = sc.nextInt();
                System.out.println("Nhap khu vuc song cua con meo");
                String khuvucsong = sc.next();
                sc.nextLine();
                System.out.println("Nhap can nang cua con meo :");
                float cannang = sc.nextFloat();

                System.out.println("Ten cua con meo la :" + ten);
                System.out.println("Tuoi cua con meo la :" + tuoi);
                System.out.println("Khu vuc song cua con meo la :" + khuvucsong);
                System.out.println("Can nang cua con meo la :" + cannang);
                break;
            case 3:
                System.out.println("chuc nang 3");
                System.out.println("nhap 1 so nguyen");
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    System.out.println("so chan");
                } else {
                    System.out.println("so le");
                }

                break;
            case 4:
                System.out.println("chuc nang 4");
                System.out.println("nhap vao 1 canh");
                int b = sc.nextInt();
                System.out.println("chu vi" + (b * 4));
                System.out.println("dien tich" + (b * b));

            case 5:
                System.out.println(" chuc nang 5");
                System.out.println("nhap 1 so");
                int c = sc.nextInt();
                System.out.println("chu vi hinh tron: " + (c * 3.14 * 2));
                System.out.println("dien tich hinh tron " + (c * c * 3.14));
                break;
            case 0:
                break;
            default:
                System.out.println("  moi ban chon chuc nang ");

        }

    }
}
