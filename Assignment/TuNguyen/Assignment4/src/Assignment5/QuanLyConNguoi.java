package Assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyConNguoi {

	private GiangVien GV;

	private NhanVienHanhChinh NV;

	private ArrayList<ConNguoi> List;

	private Scanner scan;

	public QuanLyConNguoi() {

		GV = new GiangVien();

		NV = new NhanVienHanhChinh();

		List = new ArrayList<ConNguoi>();

		scan = new Scanner(System.in);
	}

	/// 1.Nhập thông tin:

	public void nhapThongTin() {
		System.out.println("1. Nhập thông tin giảng viên");
		System.out.println("2. Nhập thông tin nhân viên");

		int nhap = Integer.parseInt(scan.nextLine());

		if (nhap == 1) {
			GiangVien GV = new GiangVien();

			System.out.println("Họ tên: ");
			GV.setHoTen(scan.nextLine());

			System.out.println("Hệ số lương: ");
			GV.setHeSoLuong(Double.parseDouble(scan.nextLine()));

			System.out.println("Khoa: ");
			GV.setKhoa(scan.nextLine());

			System.out.println("Trình độ: ");
			GV.setTrinhDo(scan.nextLine());

			System.out.println("Số tiết dạy: ");
			GV.setSoTietDay(Integer.parseInt(scan.nextLine()));

			List.add(GV);

		}

		if (nhap == 2) {
			NhanVienHanhChinh NV = new NhanVienHanhChinh();

			System.out.println("Nhập tên:");
			NV.setHoTen(scan.nextLine());

			System.out.println("Hệ số lương:");
			NV.setHeSoLuong(Double.parseDouble(scan.nextLine()));

			System.out.println("Phòng ban:");
			NV.setPhongBan(scan.nextLine());

			System.out.println("Chức vụ:");
			NV.setChucVu(scan.nextLine());

			System.out.println("Số ngày công: ");
			NV.setSoNgayCong(Integer.parseInt(scan.nextLine()));

			List.add(NV);

		}
	}
	/// bai 2:



	public void xuat() {



		System.out.println("1. Tim kiem khoa giang vien.");
		System.out.println("2. Tim kiem ban nhan vien hanh chinh.");
		System.out.println("3. xuat tat ca");

		int chon = Integer.parseInt(scan.nextLine());

		if (chon == 1) {

			System.out.println("Nhap khoa giang vien");
			String nhapKhoa = scan.nextLine();

			for (ConNguoi gv : List) {

				if (gv instanceof GiangVien) {

					if (((GiangVien) gv).getKhoa().equals(nhapKhoa)) {

						System.out.println(gv);
						System.out.println("----------------------");

					}

				}

			}

		} else if (chon == 2) {

			System.out.println("Nhap ban nhan vien");
			String nhapBan = scan.nextLine();

			for (ConNguoi nv : List) {
				if (nv instanceof NhanVienHanhChinh) {

					if (((NhanVienHanhChinh) nv).getPhongBan().equals(nhapBan)) {
						System.out.println(nv);
						System.out.println("---------------------");
					}
				}
			}
		} else if (chon == 3){
			for (Object data : List) {

				if (data instanceof GiangVien) {
					System.err.println("Thông tin giảng viên: ");
					System.out.println(data);
					System.out.println("--------------------");
				}

				if (data instanceof NhanVienHanhChinh) {
					System.err.println("Thông tin nhân viên:");
					System.out.println(data);
					System.out.println("---------------------");

				}

			}
		}
	}

	public void tongLuong() {

		double sum = 0;
		for (Object data : List) {

			if (data instanceof GiangVien) {
				sum += ((GiangVien) data).getLuong();
			}

			if (data instanceof NhanVienHanhChinh) {
				sum += ((NhanVienHanhChinh) data).getLuong();
			}
		}
		System.out.println(sum);
	}

	public void sapXep() {
		Collections.sort(List, new Comparator<ConNguoi>(){

			@Override
			public int compare(ConNguoi cn1, ConNguoi cn2) {

				if (cn1.getLuong() < cn2.getLuong()) {

					return 1;

				} else {

					if (cn1.getLuong() == cn2.getLuong()) {

						return cn1.getHoTen().compareTo(cn2.getHoTen());

					} else {

						return -1;

					}
					
				}

			} 


		});

		for (int i = 0; i < List.size(); i++) {
			
			System.out.println(List.get(i).toString());
			System.out.println("--------------------");
			
		}
		
	
	}
}
