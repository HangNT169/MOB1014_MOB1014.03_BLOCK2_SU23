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
public class DienThoaiService {

    // DienThoaiService => Chua cac chuc nang
    // menu => 8 case => 8 ham trong service
    // Cac ham service => Main goi => public 
    // Ham nhap
    public void nhapThongTin(ArrayList<DienThoai> lists) {
        // B1:nhap dien thoai => ma, ten, hang,mau,boNho,gia
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma:");
        int ma = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Hang:");
        String hang = sc.nextLine();
        System.out.println("Mau:");
        String mau = sc.nextLine();
        System.out.println("Nhap bo nho:");
        int boNho = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap gia:");
        int gia = Integer.valueOf(sc.nextLine());
        // B2: Khoi tao doi tuong => new => contructor
        DienThoai dt = new DienThoai(ma, ten, hang, mau, boNho, gia);
        // B3: Them doi tuong vao mang
        lists.add(dt);
    }

    // Ham in
    public void inDanhSachDienThoai(ArrayList<DienThoai> listDienThoai) {
        // Mang thuan : int arr[]= new int[size];
        // vi tri (i), arr[] => gia tri cua vi tri : arr[i]
        // Mang dong : ArrayList<..>listsss = new ArrayList<>();
        // vi tri (i), mang ten => listsss => gia tri cua vi tri i => listsss.get(i)
        // C1: for(int i = 0;i<size;i++) => for i(for thuong)
//        for (int i = 0; i < listDienThoai.size(); i++) {
//            // gia tri cua vi tri 
//            DienThoai dt = listDienThoai.get(i);
//            dt.inThongTin();
//        }
        // C2: for each
//        for (DienThoai dt : listDienThoai) {
//            dt.inThongTin();
//        }
        // C3: for each + lamda(->)
//        listDienThoai.forEach(dt -> dt.inThongTin());
        // C4: for each + method reference(::)
        listDienThoai.forEach(DienThoai::inThongTin);
    }

    // Sap xep giam dan theo ten
    public void sapXepTheoTen(ArrayList<DienThoai> lists) {
        lists.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }

    // Sap xep tang dan theo gia
    public void sapXepTheoGia(ArrayList<DienThoai> lists) {
        lists.sort((o1, o2) -> {
            return o1.getGia() - o2.getGia(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }

    // xoa theo vi tri
    public void xoaTheoViTri(ArrayList<DienThoai> lists, int viTri) {
        lists.remove(viTri);
    }
}
