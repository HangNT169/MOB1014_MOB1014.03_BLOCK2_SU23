/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4_VongLap.P2_VongLap;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Vong lap: lặp lại những gì cần lặp Có 3 loại vòng lặp trong C 1. while Cu
     * phap: while(dieuKien){ // code can lap lai } 2. do..while do{ // code can
     * lap lai }while(dieuKien); 3. for for(gia tri khoi tao; dieuKien, buoc
     * nhay){ // code }
     */
    // In cac so tu 0 - 10 su dung 3 vong lap
    public static void main(String[] args) {
        // while 
//        int number = 0;
//        while (number < 11) {
//            // in ra so number
//            System.out.println(number);
//            // set gia tri cua buoc nhay
////            3 cach tuong duong
//            number++;
////            number = number +1;
////            number+=1;
//            // GS buoc nhay tang 2
////            number+=2;
////            number = number+2;
//        }
//        do...while
//        int number = 15;
//        do {
//            // in number
//            System.out.println(number);
//            // buoc nhay tang 1
//            number++;
//        } while (number < 11);
        // for 
//          for (int i = 0; i < 11; i++) {
//              System.out.println(i);
//        }
        // BT:
        // 1. In ra cac so tu 0 toi 50
        // 2. In ra cac so le tu 1 toi 50
        // 3. Tinh tong cac so tu 0 toi 10
        // 4. Tinh tong cac so le tu 0 toi 15
        // 5. Tinh tich cac so tu 1 toi 20
        // 6. Tinh tich cac so chan tu 1 toi 15
//        for (int i = 0; i < 51; i++) {
//            System.out.println(i);
//        }
//        for (int i = 1; i < 51; i++) {
//            // Neu la so le => moi in
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
        int tong = 0;
//        for (int i = 0; i < 11; i++) {
//            tong += i;
//        }
//        System.out.println("Tong = " + tong);
        for (int i = 0; i < 16; i++) {
            if (i % 2 != 0) {
                tong += i;
            }
        }
    }
}
