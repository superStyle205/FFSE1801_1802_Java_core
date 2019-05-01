package Assignment6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;

public class MainSV {

	public static ArrayList<ConNguoi> arr = new ArrayList<ConNguoi>();

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("1. Nhập thông tin danh sách cán bộ trong trường");

		System.out.println("2. Xuất danh sách giảng viên khoa x,hoặc nhân viên phòng ban y nào đó");

		System.out.println("3. Tổng số lương phải trả cho cán bộ");

		System.out.println("4. Sắp xếp cán bộ theo lương,nếu lương bằng thì sắp xếp theo tên");

		GiangVien gv = new GiangVien(1, "Long", 10, "Toán", "Thạc sĩ", 10);
		arr.add(gv);
		arr.add(new GiangVien(2, "Long", 10, "Toán", "Thạc sĩ", 10));
		arr.add(new GiangVien(3, "Sang", 20, "Lý", "Cử nhân", 40));
		arr.add(new GiangVien(4, "Linh", 5, "Hóa", "Cử nhân", 10));
		arr.add(new GiangVien(5, "Tư", 15, "Toán", "Tiến sĩ", 10));

		arr.add(new HanhChinh(6, "Hưng", 80, "Kế toán", 20, "Trưởng phòng"));
		arr.add(new HanhChinh(7, "Huy", 50, "Thu ngân", 40, "Phó phòng"));
		arr.add(new HanhChinh(8, "Vinh", 30, "Kế toán", 30, "Trưởng phòng"));
		arr.add(new HanhChinh(9, "a", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh(10, "r", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh(11, "e", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh(12, "b", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh(13, "d", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh(14, "q", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh(15, "t", 10, "Bảo vệ", 15, "Nhân viên"));

		while (true) {
			System.out.println("Chọn[1-4]");

			switch (new Scanner(System.in).nextInt()) {

			case 1:
				cau1_nhap();
				break;
			case 2:
				cau2_xuat();
				break;
			case 3:
				cau3_tongLuong();
				break;
			case 4:
				cau4_sapXep();
				break;

			default:
				System.exit(0);
				break;
			}

		}
	}

	public static void cau1_nhap() {

		System.out.println("1. Giảng viên\n2. Nhân Viên");
		int chon = Integer.parseInt(sc.nextLine());

		if (chon == 1) {

			GiangVien gv = new GiangVien();

			try {
				System.out.println("Nhập thông tin giảng viên thứ " + (arr.size() + 1));

				System.out.println("Nhập ID");
				gv.setMa(Integer.parseInt(sc.nextLine()));
				kiemTraId(gv.getMa());

				System.out.println("Nhập tên");
				gv.setTen(sc.nextLine());
				xuLyTen(gv);

				System.out.println("Nhập khoa");
				gv.setKhoa(sc.nextLine());

				System.out.println("Nhập trình độ\n(Cử nhân - Thạc sĩ - Tiến sĩ)");
				gv.setTrinhDo(sc.nextLine());
				xuLyTrinhDo(gv);

				System.out.println("Nhập số tiết dạy trong tháng");
				gv.setSoTietDayTrongThang(Integer.parseInt(sc.nextLine()));
				xuLySoGV(gv);

				System.out.println("Nhập hệ số lương");
				gv.setHeSoLuong(Integer.parseInt(sc.nextLine()));
				xuLySoGV(gv);

				arr.add(gv);

			} catch (InputMismatchException e) {

				System.err.println(" Bạn phải nhập số thực!");

			} catch (Exception e) {
				System.out.println("Lỗi nè " + e);
			}

		} else if (chon == 2) {

			HanhChinh hc = new HanhChinh();

			try {

				System.out.println("Nhập thông tin nhân viên thứ " + (arr.size() + 1));

				System.out.println("Nhập ID");
				hc.setMa(Integer.parseInt(sc.nextLine()));
				kiemTraId(hc.getMa());

				System.out.println("Nhập tên");
				hc.setTen(sc.nextLine());
				xuLyTen(hc);

				System.out.println("Nhập phòng ban");
				hc.setPhongBan(sc.nextLine());

				System.out.println("Nhập số ngày công");
				hc.setSoNgayCong(Integer.parseInt(sc.nextLine()));
				xuLySoHC(hc);

				System.out.println("Nhập chức vụ\n(Trưởng phòng - Phó phòng - Nhân viên)");
				hc.setChucVu(sc.nextLine());
				xuLyChucVu(hc);

				System.out.println("Nhập hệ số lương");
				hc.setHeSoLuong(Integer.parseInt(sc.nextLine()));
				xuLySoHC(hc);

				arr.add(hc);

			} catch (Exception e) {
				System.out.println("Lỗi nè " + e);
			}

		} else {

			System.out.println("Vui lòng chọn lại!");

		}
	}

	// Xử lý ngoại lề nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè
	public static void kiemTraId(int id) throws Exception {
		// Xử lý id trùng

		int xet = 0;

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getMa() == id) {
				xet = 1;
			}
		}

		if (xet == 1) {

			throw new Exception("ID đã bị trùng");

		}

	}

	public static void xuLyTen(ConNguoi arr) {

		if (arr.getTen().equals("")) {

			throw new NullPointerException("Tên không được phép rỗng");

		} else if (arr.getTen().length() > 40) {

			throw new NullPointerException("Tên quá dài!");
		}
	}

	public static void xuLyTrinhDo(GiangVien gv) throws Exception {

		if (gv.getTrinhDo().equals("Cử nhân") || gv.getTrinhDo().equals("Thạc sĩ")
				|| gv.getTrinhDo().equals("Tiến sĩ")) {

		} else {

			throw new Exception("Vui lòng nhập lại trình độ (Cử nhân - Thạc sĩ - Tiến sĩ)");

		}
	}

	public static void xuLyChucVu(HanhChinh hc) throws Exception {

		if (hc.getChucVu().equals("Trưởng phòng") || hc.getChucVu().equals("Phó phòng")
				|| hc.getChucVu().equals("Nhân viên")) {

		} else {

			throw new Exception("Vui lòng nhập lại chức vụ (Trưởng phòng - Phó phòng - Nhân viên)");

		}

	}

	public static void xuLySoGV(GiangVien gv) throws Exception {

		if (gv.getSoTietDayTrongThang() < 0 || gv.getHeSoLuong() < 0) {

			throw new Exception("Bạn phải nhập số dương");

		}

	}

	public static void xuLySoHC(HanhChinh hc) throws Exception {

		if (hc.getHeSoLuong() < 0 || hc.getSoNgayCong() < 0) {

			throw new Exception("Bạn phải nhập số dương");

		}

	}

	// Kết thúc Xử lý ngoại lề nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè nè
	// nè nè nè nè nè nè nè

	public static void cau2_xuat() {

		System.out.println("1. Xuất Giảng viên\n2. Xuất Nhân Viên\n3. Xuất tất cả");
		int chon = new Scanner(System.in).nextInt();

		if (chon == 1) {

			System.out.println("Nhập khoa cần tìm");
			System.out.println("(Toán,lý,hóa)");

			String chonKhoa = sc.nextLine();

			for (ConNguoi conNguoi : arr) {

				if (conNguoi instanceof GiangVien) {

					if (((GiangVien) conNguoi).getKhoa().equals(chonKhoa)) {

						conNguoi.xuat();

					}
				}
			}

		} else if (chon == 2) {
			System.out.println("Nhập phòng ban cần tìm");
			System.out.println("(Kế toán,Thu ngân,Bảo vệ)");

			String chonPhongBan = sc.nextLine();

			for (ConNguoi conNguoi : arr) {

				if (conNguoi instanceof HanhChinh) {

					if (((HanhChinh) conNguoi).getPhongBan().equals(chonPhongBan)) {

						conNguoi.xuat();

					}

				}

			}

		} else if (chon == 3) {

			for (ConNguoi conNguoi : arr) {

				conNguoi.xuat();

			}

		} else {

			System.out.println("Vui lòng chọn lại!");

		}

	}

	public static void cau3_tongLuong() {

		double tongGiangVien = 0;
		double tongHanhChinh = 0;

		for (ConNguoi conNguoi : arr) {

			if (conNguoi instanceof GiangVien) {

				tongGiangVien += conNguoi.getLuong();

			} else if (conNguoi instanceof HanhChinh) {

				tongHanhChinh += conNguoi.getLuong();

			}

		}

		System.out.println("Tổng lương giảng viên \t: " + tongGiangVien);
		System.out.println("Tổng hành chính \t: " + tongHanhChinh);
		System.out.println("Tổng \t\t\t: " + (tongGiangVien + tongHanhChinh));

	}

	public static void cau4_sapXep() {

		Collections.sort(arr, new Comparator<ConNguoi>() {

			public int compare(ConNguoi cn1, ConNguoi cn2) {

				if (cn1.getLuong() < cn2.getLuong()) {

					return 1;

				} else {

					if (cn1.getLuong() == cn2.getLuong()) {

						// nếu lương bằng thì sx theo tên

						return (cn1.getTen().compareTo(cn2.getTen()));

					} else {

						return -1;

					}

				}

			}

		});

		for (ConNguoi conNguoi : arr) {

			conNguoi.xuat();

		}

	}
}