package controller;

import java.util.Scanner;

import assignment4.model.bean.BienLai;
import assignment4.model.bean.KhachHang;

public class QuanLyKhachHang {
	private KhachHang[] danhSachKhachHang;
	private int size;
	private Scanner scanner;

	public QuanLyKhachHang() {
		danhSachKhachHang = new KhachHang[100];
		scanner = new Scanner(System.in);
	}

	public void nhapDanhSachKhachHang() {
		System.out.print("Nhap n khach hang : ");
		int soLuongKhachHang = Integer.parseInt(scanner.nextLine());

		KhachHang khachHang;
		String hoTen;
		String soNha;
		BienLai bienLai;
		String maCongTo;
		double chiSoCu;
		double chiSoMoi;
		for (int i = 0; i < soLuongKhachHang; i++) {
			khachHang = new KhachHang();
			System.out.print("Nhap ho ten : ");
			hoTen = scanner.nextLine();
			khachHang.setHoTen(hoTen);

			System.out.print("Nhap so nha : ");
			soNha = scanner.nextLine();
			khachHang.setSoNha(soNha);

			bienLai = new BienLai();
			System.out.print("Nhap ma cong to : ");
			maCongTo = scanner.nextLine();
			bienLai.setMaCongTo(maCongTo);

			System.out.print("Nhap chi so cu : ");
			chiSoCu = Double.parseDouble(scanner.nextLine());
			bienLai.setChiSoCu(chiSoCu);

			System.out.print("Nhap chi so moi : ");
			chiSoMoi = Double.parseDouble(scanner.nextLine());
			bienLai.setChiSoMoi(chiSoMoi);

			khachHang.setBienLai(bienLai);

			danhSachKhachHang[size++] = khachHang;
		}
	}

	public void xuatToanBoThongTinKhachHang() {
		System.out.printf("%n|%-20s|%-30s|%-10s|%-10s|%-10s|%n",
				"ho ten khach hang",
				"dia chi",
				"ma cong to",
				"chi so cu",
				"chi so moi");
		for (int i = 0; i < size ; i++) {
			System.out.printf("|%-20s|%-30s|%-10s|%-10s|%-10s|%n",
								danhSachKhachHang[i].getHoTen(),
								danhSachKhachHang[i].getSoNha(),
								danhSachKhachHang[i].getBienLai().getMaCongTo(),
								danhSachKhachHang[i].getBienLai().getChiSoCu(),
								danhSachKhachHang[i].getBienLai().getChiSoMoi());
		}
	}
	
	public void xuatToanBoTienTraCuaKhachHang() {
		System.out.printf("%n|%-20s|%-10s|%-15s|%n",
				"ho ten khach hang",
				"ma cong to",
				"tien phai tra");
		for (int i = 0; i < size ; i++) {
			System.out.printf("|%-20s|%-10s|%-15s|%n",
					danhSachKhachHang[i].getHoTen(),
					danhSachKhachHang[i].getBienLai().getMaCongTo(),
					danhSachKhachHang[i].getBienLai().getSoTienPhaiTra());
		}
	}
	
	public static void main(String[] args) {
		QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang();
		quanLyKhachHang.nhapDanhSachKhachHang();
		quanLyKhachHang.xuatToanBoThongTinKhachHang();
		quanLyKhachHang.xuatToanBoTienTraCuaKhachHang();
	}
}
