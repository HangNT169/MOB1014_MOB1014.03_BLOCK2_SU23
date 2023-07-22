/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_OOP;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    // Khong duoc phep khai bao bien hang loat
    // Thuoc tinh => cac bien
//    - mssv : String
//     *  - ten : String
//     *  - tuoi: Integer
//     *  - diaChi : String
//     *  - matKhauFacekBook : String
//     *  - soDuTaiKhoanNganHang : Long
    // Tinh dong goi => bao ve quyen rieng tu
    // Pham vi truy cap (Access Modifier)
    // + private 
    // + default
    // + protected
    // + public 
    private String mssv; // => null
    private String ten;
    private Integer tuoi; // => 0/ null voi kieu Object
    private String diaChi;
    private String matKhauFaceBook;
    private Long soDuTaiKhoan;
//    private boolean gioiTinh;
//    va cac contructor, getter, setter,
//     * va ham inThongTin(): void

    //    int a = 5;
    // contructor: Khoi tao 1 doi tuong 
    /**
     * Co 2 loai contructor 
     *  + contructor khong tham so
     *  + contructor co tham so
     */
    // Mac dinh cua 1 class la 
    // loai contructor khong tham so
    // NHUNG KHI KHOI TAO CONTRUCTOR CO THAM SO
    // MAC DINH => MAT DI
    // MUON SU DUNG CONTRUCTOR KHONG THAM SO
    // THI PHAI KHOI TAO CONTRUCTOR KHONG THAM SO
    
    // Dau hieu nhan biet contructor
    // - Ten contructor trung voi ten class
    // - Khong co kieu tra ve (KHONG CO RETURN)
    public SinhVien() {
    }
//
//    public SinhVien(String mssv) {
//        this.mssv = mssv;
//    }
//
//    public SinhVien(String ten, String diaChi, String matKhauFaceBook, Long soDuTaiKhoan) {
//        this.ten = ten;
//        this.diaChi = diaChi;
//        this.matKhauFaceBook = matKhauFaceBook;
//        this.soDuTaiKhoan = soDuTaiKhoan;
//    }
//
    public SinhVien(String mssv, String ten, Integer tuoi, String diaChi, String matKhauFaceBook, Long soDuTaiKhoan) {
        this.mssv = mssv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.matKhauFaceBook = matKhauFaceBook;
        this.soDuTaiKhoan = soDuTaiKhoan;
    }

    // Getter : lay ra thong tin cua doi tuong 
    //  + bat dau bang tu get 
    //  + Tat ca cac kieu du lieu tru boolean => getter se bat dau bang is
    public String getMssv() {
        return mssv;
    }

    /**
     * setter : thay doi thong tin cua doi tuong 
     *  + bat dau bang set
     */
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

//    public boolean isGioiTinh() {
//        return gioiTinh;
//    }
//
//    public void setGioiTinh(boolean gioiTinh) {
//        this.gioiTinh = gioiTinh;
//    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhauFaceBook() {
        return matKhauFaceBook;
    }

    public void setMatKhauFaceBook(String matKhauFaceBook) {
        this.matKhauFaceBook = matKhauFaceBook;
    }

    public Long getSoDuTaiKhoan() {
        return soDuTaiKhoan;
    }

    public void setSoDuTaiKhoan(Long soDuTaiKhoan) {
        this.soDuTaiKhoan = soDuTaiKhoan;
    }

    public void inThongTin() {
        // in tat ca thong tin cua doi tuong SV
        System.out.println("MSSV: " + mssv);
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Mat khau fb: " + matKhauFaceBook);
        System.out.println("So du tai khoan: " + soDuTaiKhoan);
    }
}
