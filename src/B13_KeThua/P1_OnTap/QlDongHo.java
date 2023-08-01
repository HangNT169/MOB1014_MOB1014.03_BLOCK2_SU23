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
public class QlDongHo {

    Scanner scan = new Scanner(System.in);

    public void nhapTT(ArrayList<DongHo> lists) {
        System.out.println("Moi Ban Nhap Ma Dong Ho");
        int maDongHo = Integer.valueOf(scan.nextLine());
        System.out.println("Moi Ban Nhap The Loai");
        String theLoai = scan.nextLine();
        System.out.println("Moi Ban Nhap Mau Sac");
        String mauSac = scan.nextLine();
        System.out.println("Moi Ban Nhap Kich Thuoc");
        int kichThuoc = Integer.valueOf(scan.nextLine());
        System.out.println("Moi Ban Nhap Chat Lieu");
        String chatLieu = scan.nextLine();
        System.out.println("Moi Ban Nhap Gia");
        int gia = Integer.valueOf(scan.nextLine());

        DongHo dh = new DongHo(maDongHo, theLoai, mauSac, kichThuoc, chatLieu, gia);
        lists.add(dh);

    }

    public void inTT(ArrayList<DongHo> listDongHo) {
        listDongHo.forEach(DongHo::inThongTin);
    }
    public void xapSap(ArrayList<DongHo>xapSep){
        xapSep.sort((o1, o2) -> {
            return o1.getKichThuoc() - o2.getKichThuoc(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }
}
