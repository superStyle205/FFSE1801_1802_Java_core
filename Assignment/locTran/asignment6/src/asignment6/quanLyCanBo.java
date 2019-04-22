package asignment6;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class quanLyCanBo {		
	private ArrayList<CanBo> canBos;
	private Scanner sc;

	public  quanLyCanBo() {
		canBos = new ArrayList<CanBo>();
		sc = new Scanner(System.in);
	}

	public ArrayList<CanBo> getDanhSachGiangVien () {
		ArrayList<NhanVien> teachers = new ArrayList<NhanVien>();
		for (CanBo canBo : canBos) {
			if (canBo instanceof NhanVien) {
				teachers.add((NhanVien) canBo);
				break;
			}
		}
		return canBos;
	}
	
	public CanBo nhapThongTin () throws Exception {
		System.out.println("1. Giảng Viên / 2. Nhân viên");
		int chon = Integer.parseInt(sc.nextLine());
		if (chon == 1) {
			GiangVien gv = new GiangVien();
			try {
			System.out.println("Nhập thông tin giảng viên thứ  " + (canBos.size() + 1));

			System.out.println("Nhập tên");
			gv.setTen(sc.nextLine());

			System.out.println("Nhập khoa");
			gv.setKhoa(sc.nextLine());

			System.out.println("Trình độ học vấn ");
			gv.setTrinhDo(sc.nextLine());

			System.out.println("Nhập số tiết dạy trong tháng");
			gv.setSoTietDayTrongThang(Double.parseDouble(sc.nextLine()));

			System.out.println("Hệ số lương");
			gv.setHeSoLuong(Double.parseDouble(sc.nextLine()));

			canBos.add(gv);
			} catch (Exception e) {
				System.out.println("mời bạn nhập lại " + e);
			}
		} else if (chon == 2) {

			NhanVien hc = new NhanVien();
			try {
			System.out.println("nhập thông tin nhân viên " + (canBos.size() + 1));

			System.out.println("Nhập tên");
			hc.setTen(sc.nextLine());

			System.out.println("Nhập phòng  ban");
			hc.setPhongBan(sc.nextLine());

			System.out.println("Nhập số ngày làm trong tháng ");
			hc.setSoNgayCong(Double.parseDouble(sc.nextLine()));

			System.out.println("Nhập chức vụ:");
			hc.setChucVu(sc.nextLine());

			System.out.println("Hệ số lương trong tháng :");
			hc.setHeSoLuong(Double.parseDouble(sc.nextLine()));
			canBos.add(hc);
			}catch (Exception e) {
			System.out.println("mời bạn nhập lại :");
				}
		}
		return null;
	}

	public ArrayList<CanBo> getDanhSachNhanVien() {
		ArrayList<NhanVien> employees = new ArrayList<NhanVien>();
		for (CanBo canBo : canBos) {
			if (canBo instanceof NhanVien) {
				employees.add((NhanVien) canBo);
				break;
			}
		}
		return canBos;
	}

	public void addCanBo(CanBo canBo) {
		canBos.add(canBo);
	}
	
	// kiểm tra ngày công 
	public static void kiemTraNgayCong(NhanVien cong) throws Exception {
		if (cong.getSoNgayCong() < 0) {
			throw new Exception("ngày công phải hơn 0");
		}
	}
	
	// kiểm tra ban 
	public static void kiemTraTietDay(GiangVien TietDay)throws Exception {
		if (TietDay.getSoTietDayTrongThang() < 0) {
			throw new Exception("vui lòng nhập số tiết lớn hơn 0!!");
		}
	}
	
	//kiểm Tra Trinh độ
	
	public static void kiemTraTrinhDo(GiangVien TrinhDo) throws Exception{
		if (TrinhDo.getTrinhDo().equals("Tiến sĩ") || TrinhDo.getTrinhDo().equals("Thạc sĩ") 
				|| TrinhDo.getTrinhDo().equals("Cử Nhân")) {
		} else {
			throw new Exception("Bạn nhập sai vui lòng nhập lại");
		}
	}
	
	//kiểm tra hệ số lương
	public static void kiemTraHeSoLuong(CanBo KtHeSoLuong) throws Exception {
		if (KtHeSoLuong.getHeSoLuong() < 0) {
			throw new Exception("nhập sai vui lòng nhập lương lớn hơn không!");
		}
	}
	
	//kiểm tra tên 
	public static void kiemTraTen(CanBo TraTen) throws Exception{
		if (TraTen.getTen().equals("")) {
			throw new Exception("không được để trống vui lòng nhập lại");
		} else if (TraTen.getTen().length() > 40) {
			throw new Exception("thông tên quá dài! vui lòng nhập lại!");
		}
	}
	
	//kiểm tra id
	public  void kiemTraId(String KtId ) throws Exception {
		int xet = 0;
		for (int i = 0; i < canBos.size();i++) {
			if (canBos.get(i).getId().equals(KtId)) {
				xet = 1;
			}
		}
		if (xet == 1) {
			throw new Exception("Id Trống!");
		}
	}
	
	public void hienThiCanBo() {
		System.out.println("1. Hien thi giang vien / 2. Hien thi nhan vien");
		int choose = Integer.parseInt(sc.nextLine());
		if (choose == 1) {
			// hien thi giang vien
			System.out.println("Nhap khoa");
			String chonKhoa = sc.nextLine();
			for (CanBo canBo : canBos) {
				if (canBo instanceof GiangVien) {
					if (((GiangVien) canBo).getKhoa().equals(chonKhoa))
						;
					((GiangVien) canBo).xuat();
				}
			}
		}
		if (choose == 2) {
			// hien thi nhan vien
			System.out.println("Nháº­p phĂ²ng ban cáº§n tĂ¬m");
			String chonBan = sc.nextLine();
			for (CanBo canBo : canBos) {
				if (canBo instanceof NhanVien) {
					if (((NhanVien) canBo).getPhongBan().equals(chonBan));
					}	
					((NhanVien) canBo).xuat();
				}
			}
		}
	

	public void tongLuong() {
		double sumGiangVien = 0;
		double sumNhanVien = 0;
		for (CanBo canBo : canBos) {
			if (canBo instanceof GiangVien) {
				sumGiangVien += ((GiangVien) canBo).getLuong();
			} else if (canBo instanceof NhanVien) {
				sumNhanVien += ((NhanVien) canBo).getLuong();
			}
		}
		System.out.println("Tổng giảng vien: " + sumGiangVien);
		System.out.println("Tổng nhân viên\t: " + sumNhanVien);
		System.out.println("Tổng tất cả các cán bộ: " + (sumGiangVien + sumNhanVien));
	}

	public void sapXep() {
		Collections.sort(canBos , new Comparator<CanBo>() {
			public int compare(CanBo cn1, CanBo cn2) {
				if (cn1.getLuong() < cn2.getLuong()) {
					return 1;
				} else {
					if (cn1.getLuong() == cn2.getLuong()) {
						// náº¿u lÆ°Æ¡ng báº±ng thĂ¬ sx theo tĂªn
						return (cn1.getTen().compareTo(cn2.getTen()));
					} else {
						return -1;
					}
				}
			}
		});
		for (CanBo canBo : canBos) {
			canBo.xuat();

		}
	}
	
	public void menu() throws Exception {
		int chooseMenu;
		while (true) {
			System.out.println("1. Nhập danh sách cán bộ trong trường .");
			System.out.println("2. xuất danh sách cán bộ trong trường ");
			System.out.println("3.tổng lương của tất cả các cán bộ trong trường");
			System.out.println("4. sắp xếp các cán bộ theo mức lương hoặc tên trong trường.");
			chooseMenu = Integer.parseInt(sc.nextLine());
			switch (chooseMenu) {
				case 1:
					CanBo person = nhapThongTin();
					addCanBo(person);
					break;
				case 2:
					hienThiCanBo();
					break;
				case 3:
					tongLuong();
					break;
				case 4:
					sapXep();
					break;
				case 5:
					System.out.println("Tạm biệt");
					System.exit(0);
					break;
				default:
					System.out.println("Không tồn tại tính năng này !!");
					break;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		quanLyCanBo quanLyCanBo = new quanLyCanBo();
		quanLyCanBo.menu();
	}
}
