package Assignment4;

import java.util.Scanner;

public class BienLai {
    private int chiSoCu;
    private int chiSoMoi;
    private double soTienPhaiTra;
    private KhachHang khachHang;
     
    public BienLai() {
    }
 
    public BienLai(int chiSoCu, int chiSoMoi, double soTienPhaiTra, KhachHang khachHang) {
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.soTienPhaiTra = soTienPhaiTra;
        this.khachHang = khachHang;
    }
     
    public void nhapBienLai() {
        khachHang = new KhachHang();
        khachHang.nhapThongTinKhachHang();
         
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập chỉ số cũ \t\t: ");
            chiSoCu = scanner.nextInt();
            System.out.print("Nhập chỉ số mới \t: ");
            chiSoMoi = scanner.nextInt();
        } while (chiSoCu > chiSoMoi);
     
        soTienPhaiTra =  (chiSoMoi - chiSoCu) * 750;
    }
     
    public void hienThiBienLai() {
        khachHang.hienThiThongTinKhachHang();
        System.out.println("Chỉ số cũ \t\t: " + chiSoCu);
        System.out.println("Chỉ số mới \t\t: " + chiSoMoi);
        System.out.println("Số tiền phải trả \t: " + soTienPhaiTra);
    }
}