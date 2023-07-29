/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_String.P1_OnTap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class QLLophoc {

    Scanner sc = new Scanner(System.in);

    public void nhapThongTin(ArrayList<LopHoc> listLH) {
        System.out.println("Moi nhap ma lop: ");
        String maLop = sc.nextLine();
        System.out.println("Moi nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Moi nhap dien tich: ");
        int dienTich = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap dia diem :");
        String diaDiemLopHoc = sc.nextLine();

        LopHoc lh = new LopHoc(maLop, maLop, dienTich, diaDiemLopHoc);
        listLH.add(lh);
    }

    public void inThongTinLH(ArrayList<LopHoc> list) {
        for (LopHoc lopHoc : list) {
            lopHoc.inThongTin();
        }

    }
}
