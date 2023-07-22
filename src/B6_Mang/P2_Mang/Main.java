/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_Mang.P2_Mang;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
    // 5,-3,1,9
    //=> Tong cac cac phan :
    // 5+(-3)+1+9
    // => Tong cua cac vi tri trong mang
    // 0+1+2+3
    // Mang :
    //  - vi tri : bat dau tu 0
    //  - gia tri :
    // 5,-3,1,9
    // vi tri dau = 0 
    // => gia tri cua vi tri dau : arr[0] = 5
    // vi tri cuoi cung = size -1
    // => gia tri cua vi tri cuoi : arr[size-1] = 9
    // vi tri i bat ky 
    // => gia tri o vi tri i => arr[i]
    public static void main(String[] args) {
        // 1. Nhap vao size cua mang so nguyen
        // Nhap tu ban phim gia tri cua cac phan tu trong mang 
        // Va in ra man hinh
        // 2. Nhap 1 mang so nguyen tu ban phim
        // Tinh tong cac so nguyen trong mang
        // 3. Nhap 1 mang so nguyen tu ban phim.
        // Tinh tich cac so le o vi tri chan trong mang
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap size:");
        int size = sc.nextInt();
        int arr[] = new int[size]; // Cu phap khai bao mang 
        // nhap cac so nguyen vao mang
        System.out.println("Nhap cac so vao mang:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // in ra 
        System.out.println("In cac phan tu trong mang");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
