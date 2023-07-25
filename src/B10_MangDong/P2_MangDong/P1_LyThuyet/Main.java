/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P2_MangDong.P1_LyThuyet;

import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class Main {

    //int a[] = new int[]
    //Mang thuan => Truoc khi khai bao 
    // Phai biet duoc size = ???
    // Kha bat tien => size luon luon co dinh
    // => Mang dong => size khong co dinh.
    // => Size k co dinh
    // => Co the tang hoac giam tuy y
    // Collections => ArrayList 
    // Cu phap:
//    ArrayList<Kieu du lieu>ten mang = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        System.out.println(lists.size()); // Dang chua co phan tu nao
        // Lay do dai cua mang: size 
        lists.add("IT17317"); // add => Them
        lists.add("IT17307");
        System.out.println("After : " + lists.size());
        lists.remove(0);
        System.out.println("After1 : " + lists.size());
        // - DongVat gồm các thuộc tính : 
        // maDV- String, ten-String, tuoi-int, canNang-double,
        // và các contrcutor, getter, setter 
        // và hàm inThongTin(): void 
        // Tao class Main .
        // Tao 1 mang ArrayList<DongVat>.
        // Nhap tu ban phim 2 doi tuong dong vat va them vao lists.
        // Sau do in thong tin cua lists ra man hinh
    }
}
