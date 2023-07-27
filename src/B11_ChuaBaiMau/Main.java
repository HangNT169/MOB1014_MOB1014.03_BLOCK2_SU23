/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_ChuaBaiMau;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nhap;
        // Can goi cac ham trong DienThoaiService
        DienThoaiService dtService = new DienThoaiService();
        ArrayList<DienThoai>lists = new ArrayList<>();
        do {
            System.out.println("Moi nhap lua chon:");
            System.out.println("Menu");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("0.");
            nhap = Integer.valueOf(sc.nextLine());
            switch (nhap) {
                case 1: {
                    dtService.nhapThongTin(lists);
                    break;
                }
                case 2: {
                    dtService.inDanhSachDienThoai(lists);
                    break;
                }
                case 3: {
                    System.out.println("bai3");
                    break;
                }
                case 4: {
                    System.out.println("bai4");
                    break;
                }
                case 5: {
                    System.out.println("bai5");
                    break;
                }
                case 6: {
                    System.out.println("bai6");
                    break;
                }
                case 7: {
                    System.out.println("bai7");
                    break;
                }
                case 8: {
                    System.out.println("bai8");
                    break;
                }
                default: {
                    System.out.println("chuc nang k ton tai");
                    break;
                }
            }
            
        } while (nhap != 0);
    }
}
