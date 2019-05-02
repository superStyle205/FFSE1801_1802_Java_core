package assignment5;
import java.util.Scanner;

public class NhanVien extends CanBo {
	Scanner sc = new Scanner(System.in);
	private String phongBan;
	private int soNgayCong;
	private String chucVu;

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public void input() {
		System.out.println("Nhap ten nhan vien: ");
		setName(sc.nextLine());
		System.out.println("Nhap phong ban: ");
		this.phongBan = sc.nextLine();
		System.out.println("Nhap chuc vu: \n 1. Truong phong \n 2. Pho phong \n 3. Nhan vien");
		int chonChucVu = sc.nextInt();

		switch (chonChucVu) {
		case 1:
			this.chucVu = "Truong phong";
			setPhuCap(2000);
			break;
		case 2:
			this.chucVu = "Pho phong";
			setPhuCap(1000);
			break;
		case 3:
			this.chucVu = "Nhan vien";
			setPhuCap(500);
			break;
		default:
			break;
		}

		System.out.println("Nhap so ngay cong: ");
		this.soNgayCong = sc.nextInt();
		System.out.println("Nhap he so luong: ");
		setHeSoLuong(sc.nextDouble());
		tinhLuong();
	}

	public void output() {
		System.out.printf("\n%n|%-30s|%-20s|%-20s|%-15s|%-15s|%-20s|%n", "Ten", "Phong ban", "Chuc vu", "He so luong",
				"So ngay cong", "Phu cap");
		System.out.printf("\n%n|%-30s|%-20s|%-20s|%-15s|%-15s|%-20s|%n", getName(), phongBan, chucVu, getHeSoLuong(), soNgayCong,
				getPhuCap());
	}

	public void findNhanVien(String phongBan) {
		if (phongBan.equals(this.phongBan)) {
			output();
		}
	}

	public void tinhLuong() {
		double luong = getHeSoLuong() * 730 + getPhuCap() + soNgayCong * 30;
		setLuong(luong);
	}

}
