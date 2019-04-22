package assignment6;

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
		}
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
						"/****************************************/ \n" 
						+ "1.Nhập thông tin danh sách cán bộ trong trường \n"
						+ "2.Xuất danh sách giảng viên khoa x, hoặc nhân viên phòng ban y nào đó \n"
						+ "3.Tổng số lương trường phải trả cho cán bộ \n"
						+ "4.Sắp xếp cán bộ theo lương, nếu lương bằng thì sắp xếp theo tên \n"
						+ "0. Kết thúc chương trình. \n" + "/****************************************/");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			themCanBo();
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

	public static void themCanBo() {
		System.out.print("Chon 1 nhập Nhân Viên| 2 nhập Giảng viên ");
		int chooseInput = Integer.parseInt(sc.nextLine());
		switch (chooseInput) {
		case 1:
			NhanVien nhanVien = new NhanVien();
			while (true) {
				try {
					System.out.print("Nhập mã nhân viên : ");
					nhanVien.setMaCanBo(sc.nextLine());
					kiemTraMa(nhanVien.getMaCanBo());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			while (true) {
				try {
					System.out.print("Nhập tên nhân viên : ");
					nhanVien.setHoTen(sc.nextLine());
					kiemTra(nhanVien.getHoTen());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.print("Nhập phòng ban : ");
			nhanVien.setPhongBan(sc.nextLine());	
			while (true) {
				try {
					System.out.print("Nhập chức vụ : ");
					nhanVien.setChucVu(sc.nextLine());
					kiemTraChucVu(nhanVien.getChucVu());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			while (true) {
				try {
					System.out.print("Nhập số ngày công : ");
					nhanVien.setSoNgayCong(Integer.parseInt(sc.nextLine()));
					kiemTraNhapSo(nhanVien.getSoNgayCong());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			while (true) {
				try {
					System.out.print("Nhập hệ số lương : ");
					nhanVien.setHeSoLuong(Double.parseDouble(sc.nextLine()));
					break;
				} catch (NumberFormatException e) {
					System.out.println("Chỉ nhận số thực");
				}
			}			
			DanhSach.add(nhanVien);
			break;
		case 2:
			GiangVien giangVien = new GiangVien();
			while (true) {
				try {
					System.out.print("Nhập mã giảng viên : ");
					giangVien.setMaCanBo(sc.nextLine());
					kiemTraMa(giangVien.getMaCanBo());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			while (true) {
				try {
					System.out.print("Nhập tên giảng viên : ");
					giangVien.setHoTen(sc.nextLine());
					kiemTra(giangVien.getHoTen());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.print("Nhập khoa : ");
			giangVien.setKhoa(sc.nextLine());	
			
			while (true) {
				try {
					System.out.print("Nhập trình độ : ");
					giangVien.setTrinhDo(sc.nextLine());
					kiemTraTrinhDo(giangVien.getTrinhDo());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			while (true) {
				try {
					System.out.print("Nhập số tiết dạy : ");
					giangVien.setSoTietDay(Integer.parseInt(sc.nextLine()));
					kiemTraNhapSo(giangVien.getSoTietDay());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			while (true) {
				try {
					System.out.print("Nhập hệ số lương : ");
					giangVien.setHeSoLuong(Double.parseDouble(sc.nextLine()));
					break;
				} catch (NumberFormatException e) {
					System.out.println("Chỉ nhận số thực");
				}
			}			
			DanhSach.add(giangVien);
			break;
		}

	}
	
	// kiểm tra mã thêm mới có bị trùng hay không
	public static void kiemTraMa(String id) throws Exception {
		for (int i = 0; i < DanhSach.size(); i++) {
			if (id.equals(DanhSach.get(i).getMaCanBo())) {
				throw new Exception("Mã bị trùng...yêu cầu nhập lại");
			}
		}
	}
	
	// kiểm tra nhập tên có rỗng hay quá 40 kí tự hay không
	public static void kiemTra(String name) throws Exception{
		if (name.equals("") || name.length() > 40) {
			throw new Exception("Tên nhập sai... yêu cầu nhập lại");
 		}
	}
	
	// kiểm tra các trường nhập số có dương hay không
	public static void kiemTraNhapSo(int nhapSo) throws Exception {
		if (nhapSo < 0) {
			throw new Exception("Chỉ châp nhận số dương...yêu cầu nhập lại");
		}
	} 
	
	// trường trình độ chỉ nhận 1 trong 3 giá trị : Cử nhân, Thạc sĩ, Tiến sĩ 
	public static void kiemTraTrinhDo(String trinhDo) throws Exception {
		if (!(trinhDo.equals("Cu nhan") || trinhDo.equals("Tien si") || trinhDo.equals("Thac si"))) {		
			throw new Exception("Trình độ chỉ nhận (Cu nhan, Thac si, Tien si)");
		} 
	}
	
	// trường trình độ chỉ nhận 1 trong 3 giá trị : Trường phòng, phó phòng, nhân viên 
	public static void kiemTraChucVu(String chucVu) throws Exception {
		if (!(chucVu.equals("Truong phong") || chucVu.equals("Pho phong") || chucVu.equals("Nhan Vien"))) {		
			throw new Exception("Chức vụ chỉ nhận (Truong phong, Pho phong, Nhan vien)");
		}
			
	}

	//  xuất thông tin Nhân Viên hoặc Giảng Viên
	public static void xuatThongTin() {
		System.out.print("Chon 1 xuất Nhân Viên| 2 xuất Giảng viên ");
		int chon = Integer.parseInt(sc.nextLine());
		switch (chon) {
		case 1:
			int xet1 = 0;
			System.out.println("Nhập phòng ban");
			String nhapPhongBan = sc.nextLine();
			for (ConNguoi conNguoi : DanhSach) {
				if (conNguoi instanceof NhanVien) {
					if (((NhanVien) conNguoi).getPhongBan().equals(nhapPhongBan)) {
						conNguoi.xuat();
						xet1 = 1;	
					} 
				}
				if (xet1 == 0) {
					System.out.println("Không có");
				}
			} break;
		case 2:
			int xet2 = 0;
			System.out.println("Nhập khoa");
			String nhapKhoa = sc.nextLine();
			for (ConNguoi conNguoi : DanhSach) {
				if (conNguoi instanceof GiangVien) {
					if (((GiangVien) conNguoi).getKhoa().equals(nhapKhoa)) {
						conNguoi.xuat();
						xet2 = 1;
					} 				
				}
				if (xet2 == 0) {
					System.out.println("Không có");
				}
			} break;
		case 3 :
			for (ConNguoi conNguoi : DanhSach) {
				conNguoi.xuat();
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
