package assignment4.view;

import java.util.Scanner;

import assignment4.model.bean.BienLai;
import assignment4.model.bean.KhachHang;

public class KhachHangView {

	private Scanner sc;

	public KhachHangView() {
		sc = new Scanner(System.in);
	}

	public KhachHang[] nhapKhachHang() {
		System.out.print("Nhap so khach hang : ");
		int soKhachHang = Integer.parseInt(sc.nextLine());
		KhachHang[] khachHangs = new KhachHang[soKhachHang];

		for (int i = 0; i < soKhachHang; i++) {
			khachHangs[i] = new KhachHang();
			System.out.print("Nhap ten : ");
			khachHangs[i].setHoTen(sc.nextLine());

			System.out.print("Nhap dia chi : ");
			khachHangs[i].setSoNha(sc.nextLine());

			khachHangs[i].setBienLai(new BienLai());
			BienLai bl = khachHangs[i].getBienLai();
			System.out.print("Nhap ma so cong to : ");
			bl.setMaCongTo(sc.nextLine());

			System.out.print("Nhap chi so cu : ");
			bl.setChiSoCu(Double.parseDouble(sc.nextLine()));

			System.out.print("Nhap chi so Moi : ");
			bl.setChiSoMoi(Double.parseDouble(sc.nextLine()));
		}

		return khachHangs;
	}

	public void hienThiThongTinKhachHangs(KhachHang[] khachHangs) {
		System.out.printf("%n|%-20s|%-30s|%-10s|%-10s|%-10s|%n",
				"ho ten khach hang",
				"dia chi",
				"ma cong to",
				"chi so cu",
				"chi so moi");
		for (KhachHang khachHang : khachHangs) {
			System.out.printf("|%-20s|%-30s|%-10s|%-10s|%-10s|%n",
								khachHang.getHoTen(),
								khachHang.getSoNha(),
								khachHang.getBienLai().getMaCongTo(),
								khachHang.getBienLai().getChiSoCu(),
								khachHang.getBienLai().getChiSoMoi());
		}

	}

	public void hienThiTienDienKhachHangs(KhachHang[] khachHangs) {
		System.out.printf("%n|%-20s|%-10s|%-15s|%n",
				"ho ten khach hang",
				"ma cong to",
				"tien phai tra");
		for (KhachHang khachHang : khachHangs) {
			System.out.printf("|%-20s|%-10s|%-15s|%n",
					khachHang.getHoTen(),
					khachHang.getBienLai().getMaCongTo(),
					khachHang.getBienLai().getSoTienPhaiTra());
		}
	}
}
