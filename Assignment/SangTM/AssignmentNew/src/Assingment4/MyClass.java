package Assingment4;

import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {
	private ArrayList<KhachHang> quanLyKhachHang;
	private Scanner scan;
	
	public MyClass() {
		quanLyKhachHang = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	
	//1. Nhập vào các thông tin cho n hộ sử dụng điện
	public void nhapDanhSachKhachHang() {
		System.err.print("--->Nhập n khách hàng: ");
		int luongKhachHang = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < luongKhachHang; i++) {
			KhachHang khachHang = new KhachHang();
			System.err.println("--->Nhập khách hàng thứ :" + (i+1));
			System.err.print("Nhập họ tên: ");
			khachHang.setHoTenChuHo(scan.nextLine());
			System.err.print("Nhập số nhà: ");
			khachHang.setSoNha(scan.nextLine());
			System.err.print("Nhập mã công tơ: ");
			khachHang.setMaCongTo(scan.nextLine());
			quanLyKhachHang.add(khachHang);
			
			BienLai bienLai = new BienLai();
			System.err.print("Chỉ số cũ: ");
			bienLai.setChiSoCu(Integer.parseInt(scan.nextLine()));
			System.err.print("Chỉ số mới: ");
			bienLai.setChiSoMoi(Integer.parseInt(scan.nextLine()));
			khachHang.setBienLai(bienLai);
		}
	}
	
	
	//2. Hiển thị thông tin về các biên lai đã nhập
	public void xuat() {
		for (int i = 0; i < quanLyKhachHang.size(); i++) {
			System.err.println("--->Thông tin khách hàng thứ :" + (i+1));
			System.err.println("Họ và tên khách hàng: " + quanLyKhachHang.get(i).getHoTenChuHo());
			System.err.println("Số nhà: " + quanLyKhachHang.get(i).getSoNha());
			System.err.println("Mã công tơ: " + quanLyKhachHang.get(i).getMaCongTo());
			System.err.println("Chỉ số cũ:" + quanLyKhachHang.get(i).getBienLai().getChiSoCu());
			System.err.println("Chỉ số mới:" + quanLyKhachHang.get(i).getBienLai().getChiSoMoi());
		}
	}
	
	
	//3. Tính số tiền điện phải trả cho mỗi hộ dân
	public void xuatTienDien() {
		for (int i = 0; i < quanLyKhachHang.size(); i++) {
			System.err.println("--->Thông tin khách hàng thứ :" + (i+1));
			System.err.println("Họ và tên khách hàng: " + quanLyKhachHang.get(i).getHoTenChuHo());
			System.err.println("Mã công tơ: " + quanLyKhachHang.get(i).getMaCongTo());
			System.err.println("Tiền điện phải trả: " + quanLyKhachHang.get(i).getBienLai().getTienPhaiTra());
		}
	}

	
	/*public void menu() {
		while(true) {
			System.err.println("--->Chọn chức năng [1_4]");
			System.err.println("1. Nhập vào các thông tin cho n hộ sử dụng điện");
			System.err.println("2. Hiển thị thông tin về các biên lai đã nhập");
			System.err.println("3. Tính số tiền điện phải trả cho mỗi hộ dân");
			System.err.println("4. Kết thúc!");
			System.err.print("--->Mời chọn chức năng: ");
			int chooseMenu = Integer.parseInt(scan.nextLine());
			switch (chooseMenu) {
			case 1:
				
				break;
				
			case 2:
				
				break;
				
			case 3:
	
				break;
	
			case 4:
				System.err.println("Tạm biệt!!!");
				System.exit(0);
				break;

			default:
				System.err.println("--->Nhập lại");
				break;
			}
		}
	}*/
	
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.nhapDanhSachKhachHang();
		myclass.xuat();
		myclass.xuatTienDien();
	}
}
