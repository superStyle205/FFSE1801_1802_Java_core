package Assignment5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;



public class MainSV {

	public static ArrayList<ConNguoi> arr = new ArrayList<ConNguoi>();

	public static Scanner chu = new Scanner(System.in);

	public static Scanner so = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("1. Nhập thông tin danh sách cán bộ trong trường");

		System.out.println("2. Xuất danh sách giảng viên khoa x,hoặc nhân viên phòng ban y nào đó");

		System.out.println("3. Tổng số lương phải trả cho cán bộ");

		System.out.println("4. Sắp xếp cán bộ theo lương,nếu lương bằng thì sắp xếp theo tên");

		arr.add(new GiangVien("Long", 10, "Toán", "Thạc sĩ", 10));
		arr.add(new GiangVien("Sang", 20, "Lý", "Cử nhân", 40));
		arr.add(new GiangVien("Linh", 5, "Hóa", "Cử nhân", 10));
		arr.add(new GiangVien("Tư", 15, "Toán", "Tiến sĩ", 10));

		arr.add(new HanhChinh("Hưng", 80, "Kế toán", 20, "Trưởng phòng"));
		arr.add(new HanhChinh("Huy", 50, "Thu ngân", 40, "Phó phòng"));
		arr.add(new HanhChinh("Vinh", 30, "Kế toán", 30, "Trưởng phòng"));
		arr.add(new HanhChinh("a", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh("r", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh("e", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh("b", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh("d", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh("q", 10, "Bảo vệ", 15, "Nhân viên"));
		arr.add(new HanhChinh("t", 10, "Bảo vệ", 15, "Nhân viên"));
		

		while (true) {
			System.out.println("Chọn[1-4]");

			switch (so.nextInt()) {

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
		int chon = so.nextInt();

		if (chon == 1) {

			GiangVien gv = new GiangVien();

			System.out.println("Nhập thông tin giảng viên thứ " + (arr.size() + 1));

			System.out.println("Nhập tên");
			gv.setTen(chu.nextLine());

			System.out.println("Nhập khoa");
			gv.setKhoa(chu.nextLine());

			System.out.println("Nhập trình độ");
			gv.setTrinhDo(chu.nextLine());

			System.out.println("Nhập số tiết dạy trong tháng");
			gv.setSoTietDayTrongThang(chu.nextDouble());

			System.out.println("Nhập hệ số lương");
			gv.setHeSoLuong(chu.nextDouble());

			arr.add(gv);

		} else if (chon == 2) {

			HanhChinh hc = new HanhChinh();

			System.out.println("Nhập thông tin nhân viên thứ " + (arr.size() + 1));

			System.out.println("Nhập tên");
			hc.setTen(chu.nextLine());

			System.out.println("Nhập phòng ban");
			hc.setPhongBan(chu.nextLine());

			System.out.println("Nhập số ngày công");
			hc.setSoNgayCong(so.nextDouble());

			System.out.println("Nhập số tiết dạy trong tháng");
			hc.setChucVu(chu.nextLine());

			System.out.println("Nhập hệ số lương");
			hc.setHeSoLuong(so.nextDouble());

			arr.add(hc);

		} else {

			System.out.println("Vui lòng chọn lại!");

		}
	}

	public static void cau2_xuat() {

		System.out.println("1. Xuất Giảng viên\n2. Xuất Nhân Viên\n3. Xuất tất cả");
		int chon = so.nextInt();

		if (chon == 1) {

			System.out.println("Nhập khoa cần tìm");
			System.out.println("(Toán,lý,hóa)");

			String chonKhoa = chu.nextLine();

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

			String chonPhongBan = chu.nextLine();

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
						
						//nếu lương bằng thì sx theo tên
						
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
