package assignment04;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTienDien {
	ArrayList<KhachHang> listKH;
	private Scanner sc;

	public QuanLyTienDien() {
		listKH = new ArrayList<KhachHang>();
		sc = new Scanner(System.in);
	}

	public void menu() {
		String chooseMenu;
		while (true) {
			System.out.println("/******************************/");
			System.out.println("       1.Nhập thông tin         ");
			System.out.println("       2.Hiển thị biên lai      ");
			System.out.println("       3.Tính tiền điện         ");
			System.out.println("/******************************/");

			chooseMenu = sc.nextLine();
			switch (chooseMenu) {
			case "1":
				nhap();
				break;
			case "2":
				hienThiBienLai();
				break;
			case "3":
				hienThiTienDien();
				break;
			default:
				System.out.println("Vui lòng nhập đúng");
			}
		}
	}

	// Nhập thông tin đầy đủ cho n hộ sử dụng điện
	public void nhap() {
		System.out.println("Nhập số lượng hộ sử dụng điện");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i ++) {
			KhachHang khachHang = new KhachHang();
			System.out.println("Nhập tên khách hàng");
			khachHang.setName(sc.nextLine());
			System.out.println("Nhập số nhà");
			khachHang.setSoNha(sc.nextLine());
			System.out.println("Nhập mã công tơ");
			khachHang.setMaCongTo(sc.nextLine());
			BienLai bienLai = new BienLai();
			System.out.println("Nhập chỉ số cũ");
			bienLai.setChiSoCu(Double.parseDouble(sc.nextLine()));
			System.out.println("Nhập chỉ số mới");
			bienLai.setChiSoMoi(Double.parseDouble(sc.nextLine()));
			
			khachHang.setBienLai(bienLai);
			
			listKH.add(khachHang);
		}

	}

	// Hiển thị các biên lai đã nhập
	public void hienThiBienLai() {
		for(int i = 0; i < listKH.size(); i++) {
			System.out.println("Tên chủ hộ: " + listKH.get(i).getName());
			System.out.println("Số nhà: " + listKH.get(i).getSoNha());
			System.out.println("Mã số công tơ: " + listKH.get(i).getMaCongTo());
			System.out.println("Chỉ số cũ: " + listKH.get(i).getBienLai().getChiSoCu());
			System.out.println("Chỉ số mới: " + listKH.get(i).getBienLai().getChiSoMoi());
		}
	}

	// tính tiền điện
	public void hienThiTienDien() {
		for(int i = 0; i < listKH.size(); i++) {
			System.out.println("Tên chủ hộ:	" + listKH.get(i).getName());
			System.out.println("Số nhà:	" + listKH.get(i).getSoNha());
			System.out.println("Mã số công tơ:	" + listKH.get(i).getMaCongTo());
			System.out.println("Chỉ số cũ:	" + listKH.get(i).getBienLai().getChiSoCu());
			System.out.println("Chỉ số mới:	" + listKH.get(i).getBienLai().getChiSoMoi());
			System.out.println("Số tiền phải trả: " + listKH.get(i).getBienLai().getTienDienTra() + "đ");
		}
	}
}
