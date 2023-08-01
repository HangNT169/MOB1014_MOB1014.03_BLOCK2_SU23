/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThua.P1_OnTap;

/**
 *
 * @author hangnt
 */
public class DongHo {
//    Tạo đối tượng DongHo gồm các thông tin:maDongHo - int, theLoai - String, mauSac- String, kichThuoc - int, chatLieu -String, gia-int  và các phương thức constructor, getter, setter và inThongTin(): void 
//Tạo class DongHoService sử dụng ArrayList<DongHo> . Các chức năng viết trong class này 
//Tạo Class Main: trong hàm main() tạo menu lặp đi lặp lại tới khi chọn 0  và làm các chức năng: 
//1.Nhập thông tin đối tượng. Hỏi nhập tiếp hay không ?( Y tiếp tục, N - Không) 
//2.In các thông tin ra màn hình 
//3.Tìm kiếm đồng hồ theo khoảng giá  
//4. Xoá đồng hồ theo mã
//5. Sắp xếp đồng hồ theo kích thước tăng dần
//6. Sắp xếp đồng hồ theo kích thước giảm dần
//0.Thoát

    private Integer maDongHo;
    private String theLoai;
    private String mauSac;
    private Integer kichThuoc;
    private String chatLieu;
    private Integer gia;

    public DongHo() {
    }

    public DongHo(Integer maDongHo, String theLoai, String mauSac, Integer kichThuoc, String chatLieu, Integer gia) {
        this.maDongHo = maDongHo;
        this.theLoai = theLoai;
        this.mauSac = mauSac;
        this.kichThuoc = kichThuoc;
        this.chatLieu = chatLieu;
        this.gia = gia;
    }

    public Integer getMaDongHo() {
        return maDongHo;
    }

    public void setMaDongHo(Integer maDongHo) {
        this.maDongHo = maDongHo;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public Integer getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(Integer kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public void inThongTin() {
        System.out.println("Ma Dong Ho: " + maDongHo);
        System.out.println("The Loai: " + theLoai);
        System.out.println("Mau Sac: " + mauSac);
        System.out.println("Kich Thuoc: " + kichThuoc);
        System.out.println("Chat Lieu: " + chatLieu);
        System.out.println("Gia: " + gia);
    }
}
