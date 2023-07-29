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
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nguoi> list = new ArrayList<>();
        QLNguoi service = new QLNguoi();
        System.out.println("    1.Nhập thông tin Nguoi (sau khi nhập xong thông tin 1 Nguoi, hỏi có nhập tiếp hay không)\n");
        System.out.println("2 in thong tin ra man hinh");
        System.out.println("3 thoat");
        int chon;
        do {
            System.out.println("moi ban nhap chuc nang");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1: {
                    service.nhapThongTin(list);
                    break;
                }
                case 2: {
                    service.inThongTin(list);
                    break;
                }
                case 3: {
                    System.out.println("ban da thoat");
                    break;
                }
            }
        } while (chon != 0);
    }
}
