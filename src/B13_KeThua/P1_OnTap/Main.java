/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThua.P1_OnTap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nhap;
        ArrayList<DongHo> list = new ArrayList<>();
        QlDongHo dh = new QlDongHo();
        do {            
            System.out.println("Moi Ban Chon Chuc Nang Trong Menu");
            System.out.println("1:");
            System.out.println("2:");
            System.out.println("3:");
            System.out.println("4:");
            System.out.println("5:");
            System.out.println("6:");
            System.out.println("0:Thoat");
            nhap = Integer.valueOf(scan.nextLine());
            switch (nhap) {
                case 1: {
                    System.out.println("Bai 1");
                    dh.nhapTT(list);
                    break;
                }
                case 2: {
                    System.out.println("Bai 2");
                    dh.inTT(list);
                    break;
                }
                case 3: {
                    System.out.println("Bai 3");
                    break;
                }
                case 4: {
                    System.out.println("Bai 4");
                    break;
                }
                case 5: {
                    System.out.println("Bai 5");
                    dh.xapSap(list);
                    System.out.println("List Sau khi Sap xep la");
                    dh.inTT(list);
                    break;
                }
                case 6: {
                    System.out.println("Bai 6");
                    break;
                }
                case 0: {
                    System.out.println("Thoat");
                    break;
                }
                
                default:
                    System.out.println("Ban Chon Sai Chuc Nang");
            }
        } while (nhap != 0);
    }
}
