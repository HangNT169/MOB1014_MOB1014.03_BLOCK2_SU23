/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P6_Mang.P2_Mang;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class LuyenTap {

    // 1. Nhap vao size cua mang so nguyen
    // Nhap tu ban phim gia tri cua cac phan tu trong mang 
    // Va in ra man hinh
    // 2. Nhap 1 mang so nguyen tu ban phim
    // Tinh tong cac so nguyen trong mang
    // 3. Nhap 1 mang so nguyen tu ban phim.
    // Tinh tich cac so le o vi tri chan trong mang
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        int tich = 1;
        System.out.println("Nhap size cua mang");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Moi ban nhap cac gia tri trong mang");
        // B1: Nhap 
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
//        // B2: Tinh
//        for (int i = 0; i < size; i++) {
//            tong += arr[i];
//        }
        // Bai3: Tinh tich
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0 && i % 2 == 0) {
                tich *= arr[i];
            }
        }
        System.out.println("Tich = " + tich);
//        System.out.println("Tong = " + tong);

    }
}
