package assignment5;
import java.util.Scanner;

public class GiangVien extends CanBo {
	Scanner sc = new Scanner(System.in);
	private String khoa;
	private String trinhDo;
	private int soTiet;

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}



	public int getSoTiet() {
		return soTiet;
	}

	public void setSoTiet(int soTiet) {
		this.soTiet = soTiet;
	}

	public void input() {
		System.out.println("Nhap ten giang vien: ");
		setName(sc.nextLine());
		System.out.println("Nhap khoa: ");
		this.khoa = sc.nextLine();
		System.out.println("Nhap trinh do: \n 1. Cu nhan \n 2. Thac si \n 3. Tien si");
		int chonTrinhDo = sc.nextInt();

		switch (chonTrinhDo) {
		case 1:
			this.trinhDo = "Cu nhan";
			setPhuCap(300);
			break;
		case 2:
			this.trinhDo = "Thac si";
			setPhuCap(500);
			break;
		case 3:
			this.trinhDo = "Tien si";
			setPhuCap(1000);
			break;
		default:
			break;
		}

		System.out.println("Nhap so ngay cong: ");
		this.soTiet = sc.nextInt();
		System.out.println("Nhap he so luong: ");
		setHeSoLuong(sc.nextDouble());
		tinhLuong();
	}

	public void output() {
		System.out.printf("\n%n|%-30s|%-20s|%-20s|%-15s|%-15s|%-20s|%n", "Ten", "Khoa", "Trinh do", "He so luong",
				"So ngay cong", "Phu cap");
		System.out.printf("\n%n|%-30s|%-20s|%-20s|%-15s|%-15s|%-20s|%n", getName(), khoa, trinhDo, getHeSoLuong(), soTiet,
				getPhuCap());
	}

	public void findGiangVien(String khoa) {
		if (khoa.equals(this.khoa)) {
			output();
		}
	}

	public void tinhLuong() {
		double luong = getHeSoLuong() * 730 + getPhuCap() + soTiet * 45;
		setLuong(luong);
	}
	//ke thua vs dong goi
}
