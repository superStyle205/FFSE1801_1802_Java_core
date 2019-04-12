package assignment4;

import java.util.Scanner;

public class MainQL {
	
	private static KhachHang[] listKhachHang;
	private static int size;
	private static int chiSoMoi;
	
	public MainQL() {
		listKhachHang = new KhachHang[100];
	}
	
	public KhachHang nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên khách hàng : ");
		String hoTen = sc.nextLine();
		System.out.println("Nhập số nhà : ");
		String soNha = sc.nextLine();
		System.out.println("Nhập mã số công tơ : ");
		int maCongTo = sc.nextInt();
		System.out.println("Nhập chỉ số cũ : ");
		int chiSoCu = sc.nextInt();
		System.out.println("Nhập chỉ số mới : ");
			
		boolean check;
		do {
			int soNhap = sc.nextInt();
			if (soNhap > chiSoCu) {
				check = false;
				chiSoMoi = soNhap;
			} else {
				check = true;
				System.out.println("Chỉ số mới bạn nhập nhỏ hơn chỉ số cũ, yêu cầu nhập lại : ");
			}
		} while(check);
		KhachHang danhSachKhachHang = new KhachHang(hoTen, soNha, maCongTo, chiSoCu, chiSoMoi);
		return listKhachHang[size++] = danhSachKhachHang;
	}
	
	public void hienThiKhachHang() {
		for (int i = 0 ; i < size ; i++) {
			listKhachHang[i].xuat();
		}
	}
	public static void main(String[] args) {
		MainQL danhsach = new MainQL();
		danhsach.nhap();
		danhsach.hienThiKhachHang();
	}
	
}
