import java.util.ArrayList;
import java.util.Scanner;

public class quanLyKhachHang {
	ArrayList<khachHang> danhSachKhachHang = new ArrayList<khachHang>();
    Scanner sc = new Scanner(System.in);

    public void nhap() {
    	int n;
    	System.out.println("vui long nhap so luong khach hang: ");
    	 n = Integer.parseInt(sc.nextLine());
    	 for(int i = 0; i < n; i++) {
    		 khachHang kh = new khachHang();
    		 bienLai bl = new bienLai();
    		 System.out.println("vui long nhap ten khach hang: ");
    		 kh.setHoTen(sc.nextLine());
    		 System.out.println("vui long nhap so nha: ");
    		 kh.setSoNha(sc.nextLine());
    		 	System.out.println("vui long nhap ma cong to:");
	    		 bl.setMaCongTo(sc.nextLine());
	    		 System.out.println("vui long nhap chi so cu: ");
	    		 bl.setChiSoCu(Double.parseDouble(sc.nextLine()));
	    		 System.out.println("vui long nhap chi so moi: ");
	    		 bl.setChiSoMoi(Double.parseDouble(sc.nextLine()));
    		 kh.setBienlai(bl);
    		 danhSachKhachHang.add(kh);
    	 }
    }
    public void xuat() {
    	for(int i = 0; i < danhSachKhachHang.size(); i++) {
    		System.out.println(danhSachKhachHang.get(i).getHoTen());
    		System.out.println(danhSachKhachHang.get(i).getSoNha());
    		System.out.println(danhSachKhachHang.get(i).getBienlai().getMaCongTo());
    		System.out.println(danhSachKhachHang.get(i).getBienlai().getChiSoCu());
    		System.out.println(danhSachKhachHang.get(i).getBienlai().getChiSoMoi());
    		System.out.println(danhSachKhachHang.get(i).getBienlai().getTienDienTra());
    	}
    }
}
	


	