package Lab3;
import java.util.Scanner;
public class SinhVien {
	String hoTen;
	double diemTB;
	
	public String xepLoai() {
		if (diemTB >= 0 && diemTB <= 10) {
			if (diemTB < 5.0) {
				return " Yếu";
			} else if (diemTB <= 6.5) {
				return " Trung bình";
			} else if (diemTB <= 7.5) {
				return " Khá";
			} else if (diemTB <= 9.0) {
				return " Giỏi";
			} else {
				return " Xuất sắc";
			}
		}else {
			return "Sai điểm rồi nè";
		}
	}
	public void xuat() {
		System.out.println("Tên của sinh viên là " + hoTen);
		System.out.println("Điểm  là " + diemTB);
		System.out.println("Xếp loại " + xepLoai());
	}
	public void nhap() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập họ tên nè");
		hoTen = nhap.nextLine();
		System.out.println("Nhập điểm trung bình tên nè");
		diemTB = nhap.nextDouble();
	}
	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		sv.nhap();
		sv.xuat();
	}
}
