/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_OOP;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Tao class SinhVien gom cac thuoc tinh - mssv : String - ten : String -
     * tuoi: Integer - diaChi : String - matKhauFacekBook : String -
     * soDuTaiKhoanNganHang : Long va cac contructor, getter, setter, va ham
     * inThongTin(): void Tao class Main . In Thong tin cua 1 doi tuong SV
     */
    public static void main(String[] args) {
//        SinhVien sv = new SinhVien();
//        sv.getM
//        SinhVienService service = new SinhVienService();
        // Khoi tao 1 doi tuong => contructor => new
        // C1: Khoi tao bang contructor khong tham so
//          SinhVien sv = new SinhVien();
//          // Chu y la lay ten bien 
//          sv.setTen("PhongTT35");
//          sv.setTuoi(20);
//          sv.setDiaChi("HN");
//          sv.setMatKhauFaceBook("12345");
//          sv.setSoDuTaiKhoan(12345L);
//          sv.setMssv("HE130461");
//          sv.inThongTin();
        // C2: Su dung contructor full tham so
        SinhVien sv1 = new SinhVien("HE130461", "Tran Tuan Phong",
                10,"Ha noi", "12345", 10L);
        sv1.inThongTin();
    }  
}
