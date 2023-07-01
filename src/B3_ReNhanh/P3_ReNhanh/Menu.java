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
public class Menu {

    // Tao 1 menu gom cac chuc nang sau 
    // 1. Nhap ten, tuoi, dia chi cua ban than va in ra man hinh
    // 2. Kiem tra 1 so nhap tu ban phim xem co lon hon 10 khong
    // 3. Thoat
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chuc nang:");
        int chucNang = Integer.valueOf(sc.nextLine());
        switch (chucNang) {
            case 1: {
                // Chuc nang 1 
                System.out.println("Chuc nang 1");
                break;
            }
            case 2: {
                // Chuc nang 2
                System.out.println("Chuc nang 2");
                break;
            }
            case 3: {
                break;
            }
            default: {
                System.out.println("Chuc nang khong ton tai");
                break;
            }
        }
    }
}
