package Assignment4;

import java.util.Scanner;

public class KhachHang {
    private String hoTenChuNha;
    private String soNha;
    private int maSoCongTo;
     
    public KhachHang() {
    }
     
    public KhachHang(String hoTenChuNha, String soNha, int maSoCongTo) {
        this.hoTenChuNha = hoTenChuNha;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }
     
    public void nhapThongTinKhachHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên chủ hộ \t: ");
        hoTenChuNha = scanner.nextLine();
        System.out.print("Nhập số nhà \t\t: ");
        soNha = scanner.nextLine();
        System.out.print("Mã số công tơ \t\t: ");
        maSoCongTo = scanner.nextInt();
    }
     
    public void hienThiThongTinKhachHang() {
        System.out.println("Tên chủ hộ \t\t: " + hoTenChuNha);
        System.out.println("Số nhà \t\t\t: " + soNha);
        System.out.println("Mã số công tơ \t\t: " + maSoCongTo);
    }
}