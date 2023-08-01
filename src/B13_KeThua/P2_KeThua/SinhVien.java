/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThua.P2_KeThua;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    // extends Nguoi : SV ke thua tu class Nguoi
    // Khong ke thua duoc cac phuong thuc, thuoc tinh
    // o pham vi private
    // Con co the ke thua duoc cac phuong thuc, thuoc tinh Cha
    // Thong qua super
//    public void test(){
////        super.
//    }
    private double diem;
    // Sinh Vien => 7 thuoc tinh (6 cha + 1 rieng no)

    public SinhVien() {
    }

    public SinhVien(double diem, String ten, int tuoi, int gioiTinh, String queQuan, String sdt, String email) {
        super(ten, tuoi, gioiTinh, queQuan, sdt, email);
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void display() {
        // in ra 7 thuoc tinh
//        System.out.println("Ten: " + super.getTen());
//        System.out.println("Tuoi: " + super.getTuoi());
//        System.out.println("Gioi tinh: " + super.getGioiTinh());
//        System.out.println("Que quan: " + super.getQueQuan());
//        System.out.println("Email: " + super.getEmail());
//        System.out.println("So dien thoai: " + super.getSdt());
//        System.out.println("Diem: " + diem);
        super.display();
        System.out.println("Diem " + diem);
    }
}
