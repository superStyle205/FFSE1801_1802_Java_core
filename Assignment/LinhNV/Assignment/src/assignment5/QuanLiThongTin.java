package assignment5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class QuanLiThongTin {
	private static ArrayList<ConNguoi> DanhSach = new ArrayList<ConNguoi>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			menu();
			System.out.println(DanhSach.size());
		}
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"" + "/****************************************/ \n" + "1.Nhập thông tin danh sách cán bộ trong trường"
						+ "2.Xuất danh sách giảng viên khoa x, hoặc nhân viên phòng ban y nào đó \n"
						+ "3.Tổng số lương trường phải trả cho cán bộ \n"
						+ "4.Sắp xếp cán bộ theo lương, nếu lương bằng thì sắp xếp theo tên \n"
						+ "0. Kết thúc chương trình. \n" + "/****************************************/");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			themSinhVien();
			break;
		case 2:
			xuatThongTin();
			break;
		case 3:
			tongSoLuongPhaiTra();
			break;
		case 4:
			sapXepTheoLuong();
			break;
		case 0:
			System.err.println("kết thúc");
			System.exit(0);
			break;
		default:
			break;
		}
	}

	public static void themSinhVien() {
		String hoTen;
		int heSoLuong;
		double phuCap;
		System.out.print("Chon 1 nhập Nhân Viên| 2 nhập Giảng viên ");
		int chooseInput = Integer.parseInt(sc.nextLine());
		switch (chooseInput) {
		case 1:
			System.out.print("Nhập tên nhân viên : ");
			hoTen = sc.nextLine();
			System.out.print("Nhập phòng ban : ");
			String phongBan = sc.nextLine();
			System.out.print("Nhập số ngày công : ");
			int soNgayCong = Integer.parseInt(sc.nextLine());
			System.out.print("Nhập hệ số lương : ");
			heSoLuong = Integer.parseInt(sc.nextLine());
			System.out.print("Nhập phụ cấp : ");
			phuCap = Double.parseDouble(sc.nextLine());
			System.out.print("Nhập chức vụ : ");
			String chucVu = sc.nextLine();
			ConNguoi nhanVien = new NhanVien(hoTen, phuCap, heSoLuong, phongBan, soNgayCong, chucVu);
			DanhSach.add(nhanVien);
			break;
		case 2:
			System.out.print("Nhập tên giảng viên : ");
			hoTen = sc.nextLine();
			System.out.print("Nhập khoa : ");
			String khoa = sc.nextLine();
			System.out.print("Nhập trình độ : ");
			String trinhDo = sc.nextLine();
			System.out.print("Nhập phụ cấp : ");
			phuCap = Double.parseDouble(sc.nextLine());
			System.out.print("Nhập số tiết dạy : ");
			int soTietDay = Integer.parseInt(sc.nextLine());
			System.out.print("Nhập hệ số lương : ");
			heSoLuong = Integer.parseInt(sc.nextLine());
			ConNguoi giangVien = new GiangVien(hoTen, phuCap, heSoLuong, khoa, trinhDo, soTietDay);
			DanhSach.add(giangVien);
			break;
		}

	}

	public static void xuatThongTin() {
		System.out.print("Chon 1 xuất Nhân Viên| 2 xuất Giảng viên ");
		int chon = sc.nextInt();
		switch (chon) {
		case 1:
			System.out.println("Nhập phòng ban");
			String nhapPhongBan = sc.nextLine();
			for (ConNguoi conNguoi : DanhSach) {
				if (conNguoi instanceof NhanVien) {
					if (((NhanVien) conNguoi).getPhongBan().equals(nhapPhongBan)) {
						conNguoi.xuat();
					}
				}
			}
		case 2:
			System.out.println("Nhập khoa");
			String nhapKhoa = sc.nextLine();
			for (ConNguoi conNguoi : DanhSach) {
				if (conNguoi instanceof GiangVien) {
					if (((GiangVien) conNguoi).getKhoa().equals(nhapKhoa)) {
						conNguoi.xuat();
					}
				}
			}
		}
	}

	public static void tongSoLuongPhaiTra() {
		double tienGV = 0;
		double tienNV = 0;

		for (ConNguoi conNguoi : DanhSach) {
			if (conNguoi instanceof GiangVien) {
				tienGV += conNguoi.getLuong();
			} else if (conNguoi instanceof NhanVien) {
				tienGV += conNguoi.getLuong();
			}
		}
		System.out.println("Tổng lương phải trả : " + (tienGV + tienNV));
	}

	public static void sapXepTheoLuong() {
		Collections.sort(DanhSach, new Comparator<ConNguoi>() {
			public int compare(ConNguoi o1, ConNguoi o2) {
				if (o1.getLuong() < o2.getLuong()) {
					return 1;
				} else {
					if (o1.getLuong() == o2.getLuong()) {
						return (o1.getHoTen().compareTo(o2.getHoTen()));
					} else {
						return -1;
					}
				}
			}
		});
		for (ConNguoi conNguoi : DanhSach) {
			conNguoi.xuat();
		}
	}
}
