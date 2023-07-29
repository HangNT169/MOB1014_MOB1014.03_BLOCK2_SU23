/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_String.P1_OnTap;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLLophoc qLLophoc = new QLLophoc();
        ArrayList<LopHoc> listLH = new ArrayList<>();
        int menu;
        do {
            System.out.println("menu");
            System.out.println("1. bai 1");
            System.out.println("2. bai 2");
            System.out.println("0. thoat");
            menu = Integer.valueOf(sc.nextLine());
            switch (menu) {
                case 1:
                    System.out.println("nhap thong tin");
                    qLLophoc.nhapThongTin(listLH);
                    break;
                case 2:
                    System.out.println("in thong tin");
                    qLLophoc.inThongTinLH(listLH);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("nhap sai nhap lai");
                    break;

            }

        } while (menu != 0);

    }
}
