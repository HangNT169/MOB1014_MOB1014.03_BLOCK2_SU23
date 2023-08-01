/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThua.P2_KeThua;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
//    Tạo class Nguoi gồm các thông tin:
//        ten - String , 
//          tuoi - int, 
//          gioiTinh - int (1-Nam, 0- Nữ),  
//          queQuan - String , 
//          sdt - String , 
//          email - String   
//     và các phương thức constructor, getter, setter
//                  và hàm display(): void
//    Tạo class SinhVien kế thừa từ class Nguoi 
//    nhưng thêm thuộc tính diem-double 
//    và các phương thức constructor, getter, setter 
//    và display(): void.
//    Nhập thông tin của 1 sinh viên
//    và in ra màn hình ( Sử dụng constructor không tham số)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten ");
        String ten = sc.nextLine();
        System.out.println("Tuoi");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("gioi tinh");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("que quan");
        String queQuan = sc.nextLine();
        System.out.println("sdt");
        String soDienThoai = sc.nextLine();
        System.out.println("email");
        String email = sc.nextLine();
        System.out.println("Diem");
        double diem = Double.valueOf(sc.nextLine());

        SinhVien sv = new SinhVien();
        sv.setTen(ten);
        sv.setTuoi(tuoi);
        sv.setGioiTinh(gioiTinh);
        sv.setQueQuan(queQuan);
        sv.setSdt(soDienThoai);
        sv.setEmail(email);
        sv.setDiem(diem);

        sv.display();
    }
}
