package Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyConNguoi {

	private GiangVien GV;

	private NhanVienHanhChinh NV;

	private static ArrayList<ConNguoi> List;

	private Scanner scan;

	public QuanLyConNguoi() {

		GV = new GiangVien();

		NV = new NhanVienHanhChinh();

		List = new ArrayList<ConNguoi>();

		scan = new Scanner(System.in);
	}

	/// 1.Nhập thông tin:

	public void nhapThongTin() throws Exception{
		System.out.println("1. Nhập thông tin giảng viên");
		System.out.println("2. Nhập thông tin nhân viên");

		int nhap = Integer.parseInt(scan.nextLine());

		if (nhap == 1) {

			
				GiangVien GV = new GiangVien();

				try {

					System.out.println("Nhập id:");
					GV.setId(scan.nextLine());
					kiemTraID(GV.getId());

					System.out.println("Họ tên: ");
					GV.setHoTen(scan.nextLine());
					kiemTraTen(GV);

					System.out.println("Hệ số lương: ");
					GV.setHeSoLuong(Double.parseDouble(scan.nextLine()));
					kiemTraHSL(GV);
					System.out.println("Khoa: ");
					GV.setKhoa(scan.nextLine());

					System.out.println("Trình độ: ");
					System.out.println("Tien si ----- Thac si ---- Cu nhan");
					GV.setTrinhDo(scan.nextLine());
					kiemTraTrinhDo(GV);

					System.out.println("Số tiết dạy: ");
					GV.setSoTietDay(Integer.parseInt(scan.nextLine()));
					kiemTraTietDay(GV);

					List.add(GV);
				} catch (Exception e) {
					System.out.println("Lỗi ~~~ Mời nhập lại" + e);
				}
			}
		

		if (nhap == 2) {

			

				NhanVienHanhChinh NV = new NhanVienHanhChinh();

				try {
					System.out.println("Nhập id:");
					GV.setId(scan.nextLine());
					kiemTraID(NV.getId());

					System.out.println("Nhập tên:");
					NV.setHoTen(scan.nextLine());
					kiemTraTen(NV);

					System.out.println("Hệ số lương:");
					NV.setHeSoLuong(Double.parseDouble(scan.nextLine()));
					kiemTraHSL(NV);

					System.out.println("Phòng ban:");
					System.out.println("Truong phong ---- Pho phong ---- Nhan vien");
					NV.setPhongBan(scan.nextLine());
					kiemTraBan(NV);

					System.out.println("Chức vụ:");
					NV.setChucVu(scan.nextLine());

					System.out.println("Số ngày công: ");
					NV.setSoNgayCong(Integer.parseInt(scan.nextLine()));
					kiemTraCong(NV);

					List.add(NV);
				} catch (Exception e) {
					System.out.println("Lỗi ~~~ xin mời nhập lại!" + e);
				}
			
		}
	}


	///// KIEM TRA NGAY CONG 

	public static void kiemTraCong(NhanVienHanhChinh cong) throws Exception {

		if(cong.getSoNgayCong() < 0) {

			throw new Exception("Ngày công phải nhập trên 0");
		}

	}


	///// KIEM TRA BAN
	public static void kiemTraBan(NhanVienHanhChinh ban) throws Exception {

		if (ban.getPhongBan().equals("Truong phong") || ban.getPhongBan().equals("Pho phong")
				|| ban.getPhongBan().equals("Nhan vien")) {

		} else {
			throw new Exception("Nhập ban sai, xin mời nhập lại!");
		}

	}


	///// KIEM TRA TIET DAY
	public static void kiemTraTietDay(GiangVien tietDay) throws Exception {

		if (tietDay.getSoTietDay() < 0) {

			throw new Exception("Phai nhap so dương");
		}

	}


	///// KIEM TRA TRINH DO
	public static void kiemTraTrinhDo(GiangVien trinhDo) throws Exception {

		if(trinhDo.getTrinhDo().equals("Tien si") || trinhDo.getTrinhDo().equals("Thac si") 
				|| trinhDo.getTrinhDo().equals("Cu nhan")) {

		} else {
			throw new Exception("Bạn đã nhập sai, xin vui long nhập lại!");
		}

	}

	///// KIEM TRA HE SO LUONG
	public static void kiemTraHSL(ConNguoi cn2) throws Exception{



	}


	////KIEM TRA TEN
	public static void kiemTraTen(ConNguoi  cn) throws Exception{

		

			if (cn.getHoTen().equals("")) {

				throw new Exception("Không được để tên rỗng~~~");

			} else if (cn.getHoTen().length() > 40) {

				throw new Exception("Không được dài quá 40 kí tự");

			}
		}

	

	//// KIEM TRA ID
	public static void kiemTraID(String id) throws Exception{

		int xet = 0;

		for(int i = 0; i < List.size(); i++) {

			if(List.get(i).getId().equals(id)) {

				xet = 1;

			} 
		}

		if (xet == 1) {

			throw new Exception("Id trùng !");
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
