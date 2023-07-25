/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_OnTap;

/**
 *
 * @author hangnt
 */
public class DienThoai {
//    /**thuộc tính :
//     * ma- String  ten-String, dongMay -String ,
//     * gia-float,  dungLuong - int, mauSac - String
//     * và các contrcutor, getter, setter 
//     * và hàm hienThiDanhSachSinhVien(): String 

    private String ma;
    private String ten;
    private String dongMay;
    private float gia;
    private int dungLuong;
    private String mauSac;

    public DienThoai() {
    }

    public DienThoai(String ma, String ten, String dongMay, float gia, int dungLuong, String mauSac) {
        this.ma = ma;
        this.ten = ten;
        this.dongMay = dongMay;
        this.gia = gia;
        this.dungLuong = dungLuong;
        this.mauSac = mauSac;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDongMay() {
        return dongMay;
    }

    public void setDongMay(String dongMay) {
        this.dongMay = dongMay;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String hienThiDanhSachSinhVien() {
        String ketqua = "";
        ketqua = "Ma la" + ma + "Ten la" + ten + "Dong may" + dongMay + "Gia la" + gia + "Dung luong la" + dungLuong + "Mau sac la" + mauSac;
        return ketqua;

    }
}
