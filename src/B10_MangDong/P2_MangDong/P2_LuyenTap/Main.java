/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P2_MangDong.P2_LuyenTap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<DongVat> listDongVat = new ArrayList<>();
        // B1:Nhap thong tin cua Dong Vat 
        // Nhap doi tuong 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma:");
        String ma = sc.nextLine();
        System.out.println("Nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi:");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap can nang");
        double canNang = Double.parseDouble(sc.nextLine());
        // B2: Khoi tao doi tuong
        DongVat dongVat = new DongVat(ma, ten, tuoi, canNang);
        // B3: Them doi tuong vao list
        listDongVat.add(dongVat);
        // Nhap doi tuong t2
        System.out.println("Nhap ma:");
        String ma1 = sc.nextLine();
        System.out.println("Nhap ten:");
        String ten1 = sc.nextLine();
        System.out.println("Nhap tuoi:");
        int tuoi1 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap can nang");
        double canNang1 = Double.parseDouble(sc.nextLine());
        DongVat dongVat1 = new DongVat(ma1, ten1, tuoi1, canNang1);
        listDongVat.add(dongVat1);
        // In list doi tuong
        for (DongVat dongVat2 : listDongVat) {
            dongVat2.inThongTin();
        }

    }
}
