/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_String.P3_LuyenTap.bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class QLNguoi {

    Scanner sc = new Scanner(System.in);

    public void nhapThongTin(ArrayList<Nguoi> lists) {
        System.out.println("nhap ten");
        String ten = sc.nextLine();
        System.out.println("nhap tuoi");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("nhap gioi tinh");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("nhap que quan");
        String queQuan = sc.nextLine();
        System.out.println("nhap nghe nghiep");
        String ngheNghiep = sc.nextLine();
        Nguoi nguoi = new Nguoi(ten, tuoi, gioiTinh, queQuan, ngheNghiep);
        lists.add(nguoi);
    }
    public void inThongTin(ArrayList<Nguoi> lists){
        for (Nguoi list : lists) {
            list.inThongTin();
            
        }
    }
}
