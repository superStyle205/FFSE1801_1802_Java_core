package Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyConNguoi {

	private GiangVien GV;

	private NhanVienHanhChinh NV;

	private ArrayList<Object>  List;

	private Scanner scan;

	public QuanLyConNguoi() {

		GV = new GiangVien();

		NV = new NhanVienHanhChinh();

		List = new ArrayList<Object>();

		scan = new Scanner(System.in);
	}

	/// 1.Nhập thông tin:

		public void nhapThongTin() {
			System.out.println("1. Nhập thông tin giảng viên");
			System.out.println("2. Nhập thông tin nhân viên");

			int nhap = Integer.parseInt(scan.nextLine());

			if (nhap == 1) {

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
		
		public void xuat() {
			
//			for (Object data : List) {
//				
//				if (data instanceof GiangVien) {
//					System.err.println("Thông tin giảng viên: ");
//					System.out.println(data);
//				}
//				
//				if (data instanceof NhanVienHanhChinh) {
//					System.err.println("Thông tin nhân viên:");
//					System.out.println(data);
//					
//				}
//				
//			}
			
			System.out.println("1. Tim kiem khoa giang vien.");
			System.out.println("2. Tim kiem ban nhan vien hanh chinh.");
			
			int chon = Integer.parseInt(scan.nextLine());
			
			if (chon == 1) {
				
				System.out.println("Nhap khoa giang vien");
				String nhapKhoa = scan.nextLine();
				for (int i = 0; i < List.size(); i++) {
				if (nhapKhoa.equals(GV.getKhoa())) {
					
					System.out.println(GV.toString());
					
				}else {
					
					System.out.println("Khong co thong tin giang vien");
					
				}
				}
				
			} else if (chon == 2) {
				
				System.out.println("Nhap ban nhan vien");
				String nhapBan = scan.nextLine();
				
				if (nhapBan.equals(NV.getPhongBan())) {
					
					System.out.println(NV.toString());
					
				} else {
					
					System.out.println("Khong co thong tin nhan vien");
					
				}
				
			}
			
		}
		
		public double tongLuong() {
			
			double sum = 0;
			for (Object data : List) {
				
				if (data instanceof GiangVien ) {
					sum += ((GiangVien)data).tongLuongGiangVien();
				}
				
				if (data instanceof NhanVienHanhChinh) {
					sum += ((NhanVienHanhChinh)data).tongLuongNV();
				}
			}
			return sum;
		}
		
		public void sapXep() {
			
		}
}
