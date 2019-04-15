package BaiKiemTra;

import java.util.Scanner;
import java.util.ArrayList;

public class QuanLiBenhVien {
	public static ArrayList<BenhNhan> listBenhNhan = new ArrayList<BenhNhan>();
	public static ArrayList<BacSi> listBacSi = new ArrayList<BacSi>();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("1/ Thêm mới hồ sơ bệnh nhân");
		System.out.println("2/ Hiển thị thông tin tất cả bệnh nhân");
		System.out.println("3/ Hiển thị hồ sơ của bệnh nhân với mã bệnh nhân nhập từ bàn phím");
		System.out.println("4/ Tính tổng các số tiền của tất cả bệnh nhân");
		System.out.println("5/ Tìm bệnh nhân có tiền trả nhiều nhất");
		System.out.println("6/ Tìm các bệnh nhân có bệnh tương ứng nhập từ bàn phím");
		System.out.println("Nhân viên");
		System.out.println("7/ Thêm mới nhân viên");
		System.out.println("8/ Hiển thị tất cả bác sỹ");
		System.out.println("9/ Hiển thị bác sỹ với khoa tương ứng nhập từ bàn phím");
		System.out.println("10/ Sửa phụ cấp cho bác sỹ tương ứng với mã bác sỹ nhập từ bàn phím");
		System.out.println("11/ Xóa bác sỹ với mã tương ứng");
		boolean lap = true;
		do {
			System.out.println("Chọn tính năng");
			int soNhap = sc.nextInt();
			switch (soNhap) {
			case 1:
				themBenhNhan();
				break;
			case 2:
				hienThiTatCaBenhNhan();
				break;
			case 3:
				hienThiBenhNhan();
				break;
			case 4:
				tinhTongTienThanhToan();
				break;
			case 5:
				timBenhNhanTienThanhToanCaoNhat();
				break;
			case 6:
				timBenhNhanTheoBenh();
				break;
			case 7:
				themBacSi();
				break;
			case 8:
				hienThiTatCaBacSi();
				break;
			case 9:
				hienThiBacSi();
				break;
			case 10:
				suaPhuCap();
				break;
			case 11:
				xoaBacSiTheoMa();
				break;
			case 12:
				clearData();
				break;
			default:
				System.out.println("Không có trong thao tác");
			}
		} while (lap);
	}

	// Câu 1: Thêm mới hồ sơ bệnh nhân
	public static void themBenhNhan() {
		BenhNhan bn = new BenhNhan();
		System.out.println("Nhập tên : ");
		bn.setTen(sc.nextLine());
		System.out.println("Nhập tuổi bệnh nhân : ");
		bn.setTuoi(Integer.parseInt(sc.nextLine()));
		System.out.println("Nhập giới tính : ");
		bn.setGioiTinh(sc.nextLine());
		System.out.println("Nhập cmnd : ");
		bn.setCmnd(Integer.parseInt(sc.nextLine()));
		if (listBenhNhan.size() >= 1) {
			boolean lapLai = true;
			do {
				System.out.println("Nhập mã bệnh nhân : ");
				String maBenhNhan = sc.nextLine();

				for (int i = 0; i < listBenhNhan.size(); i++) {
					if (listBenhNhan.get(i).getMaBenhNhan().equals(maBenhNhan)) {
						System.out.println("Mã bệnh nhân trùng");
						lapLai = true;
						break;
					} else {
						bn.setMaBenhNhan(maBenhNhan);
						lapLai = false;
					}
				}
			} while (lapLai);
		} else {
			System.out.println("Nhập mã bệnh nhân : ");
			bn.setMaBenhNhan(sc.nextLine());
		}
		System.out.println("Nhập bệnh : ");
		bn.setBenh(sc.nextLine());
		System.out.println("Nhập phương pháp chữa bệnh : ");
		bn.setPhuongPhapChuaBenh(sc.nextLine());
		System.out.println("Nhập ngày nhập viện : ");
		bn.setNgayNhapVien(sc.nextLine());
		System.out.println("Nhập ngày ra viện : ");
		bn.setNgayRaVien(sc.nextLine());
		System.out.println("Nhập tiền thanh toán : ");
		bn.setTienThanhToan(Double.parseDouble(sc.nextLine()));
		listBenhNhan.add(bn);
	}

	// Câu 2: Hiển thị thông tin tất cả bệnh nhân
	public static void hienThiTatCaBenhNhan() {
		if (listBenhNhan.size() != 0) {
			for (BenhNhan a : listBenhNhan) {
				a.xuat();
			}
		} else {
			System.out.println("Danh sách bệnh nhân trống");
		}
	}

	// Câu 3: Hiển thị hồ sơ của bệnh nhân với mã bệnh nhân nhập từ bàn phím
	public static void hienThiBenhNhan() {
		if (listBenhNhan.size() != 0) {
			System.out.println("Nhập mã bệnh nhân cần tìm");
			String nhapMa = sc.nextLine();
			for (int i = 0; i < listBenhNhan.size(); i++) {
				if (listBenhNhan.get(i).getMaBenhNhan().equals(nhapMa)) {
					listBenhNhan.get(i).xuat();
				} else {
					System.out.println("Không tìm ra mã bệnh nhân");
				}
			}

		} else {
			System.out.println("Danh sách bệnh nhân trống");
		}
	}

	// Câu 4: Tính tổng các số tiền của tất cả bệnh nhân
	public static void tinhTongTienThanhToan() {
		double sum = 0;
		if (listBenhNhan.size() != 0) {
			for (BenhNhan a : listBenhNhan) {
				sum = sum + a.getTienThanhToan();
			}
			System.out.println("Tổng tiền thanh toán của tất cả bệnh nhân là : " + sum);
		} else {
			System.out.println("Danh sách bệnh nhân trống");
		}
	}

	// Câu 5: Tìm bệnh nhân có tiền trả nhiều nhất
	public static void timBenhNhanTienThanhToanCaoNhat() {
		if (listBenhNhan.size() != 0) {
			double max = listBenhNhan.get(0).getTienThanhToan();
			for (int i = 1; i < listBenhNhan.size(); i++) {
				if (listBenhNhan.get(i).getTienThanhToan() > max) {
					max = listBenhNhan.get(i).getTienThanhToan();
				}
			}
			for (int j = 0; j < listBenhNhan.size(); j++) {
				if (listBenhNhan.get(j).getTienThanhToan() == max) {
					listBenhNhan.get(j).xuat();
				}
			}
		} else {
			System.out.println("Danh sách bệnh nhân trống");
		}
	}

	// Câu 6: TÌm các bệnh nhân có bệnh tương ứng nhập từ bàn phím
	public static void timBenhNhanTheoBenh() {
		if (listBenhNhan.size() != 0) {
			System.out.println("Nhập bệnh của bệnh nhân cần tìm");
			String nhapBenh = sc.nextLine();
			for (int i = 0; i < listBenhNhan.size(); i++) {
				if (listBenhNhan.get(i).getMaBenhNhan().equals(nhapBenh)) {
					listBenhNhan.get(i).xuat();
				} else {
					System.out.println("Không tìm ra bệnh của bệnh nhân cần tìm");
				}
			}

		} else {
			System.out.println("Danh sách bệnh nhân trống");
		}
	}

	// Câu 7: Thêm mới nhân viên
	public static void themBacSi() {
		BacSi bs = new BacSi();
		System.out.println("Nhập tên bác sĩ: ");
		bs.setTen(sc.nextLine());
		System.out.println("Nhập tuổi bác sĩ : ");
		bs.setTuoi(Integer.parseInt(sc.nextLine()));
		System.out.println("Nhập giới tính : ");
		bs.setGioiTinh(sc.nextLine());
		System.out.println("Nhập cmnd : ");
		bs.setCmnd(Integer.parseInt(sc.nextLine()));
		if (listBacSi.size() >= 1) {
			boolean lapLai = true;
			do {
				System.out.println("Nhập mã bác sĩ : ");
				String maBacSi = sc.nextLine();
				for (int i = 0; i < listBacSi.size(); i++) {
					if (listBacSi.get(i).getMaBacSi().equals(maBacSi)) {
						System.out.println("Mã bác sĩ trùng");
						lapLai = true;
						break;
					} else {
						bs.setMaBacSi(maBacSi);
						lapLai = false;
					}
				}
			} while (lapLai);
		} else {
			System.out.println("Nhập mã bác sĩ : ");
			bs.setMaBacSi(sc.nextLine());
		}

		System.out.println("Nhập khoa bác sĩ làm việc : ");
		bs.setKhoa(sc.nextLine());
		System.out.println("Nhập ngày vào làm : ");
		bs.setNgayBatDauVaoLam(sc.nextLine());
		System.out.println("Nhập lương cơ bản : ");
		bs.setLuong(Double.parseDouble(sc.nextLine()));
		System.out.println("Nhập phụ cấp : ");
		bs.setPhuCap(Double.parseDouble(sc.nextLine()));
		listBacSi.add(bs);
	}

	// Câu 8: Hiển thị tất cả bác sỹ
	public static void hienThiTatCaBacSi() {
		if (listBacSi.size() != 0) {
			for (BacSi b : listBacSi) {
				b.xuat();
			}
		} else {
			System.out.println("Danh sách bác sĩ trống");
		}
	}

	// Câu 9: Hiển thị bác sỹ với khoa tương ứng nhập từ bàn phím
	public static void hienThiBacSi() {
		if (listBacSi.size() != 0) {
			System.out.println("Nhập khoa của bác sĩ cần tìm");
			String nhapKhoa = sc.nextLine();
			for (int i = 0; i < listBacSi.size(); i++) {
				if (listBacSi.get(i).getMaBacSi().equals(nhapKhoa)) {
					listBacSi.get(i).xuat();
				} else {
					System.out.println("Không tìm ra khoa của bác sĩ cần tìm");
				}
			}

		} else {
			System.out.println("Danh sách bác sĩ trống");
		}
	}

	// Câu 10: Sửa phụ cấp cho bác sỹ tương ứng với mã bác sỹ nhập từ bàn phím
	public static void suaPhuCap() {
		if (listBacSi.size() != 0) {
			System.out.println("Nhập mã bác sĩ cần tìm");
			String nhapMa = sc.nextLine();
			for (int i = 0; i < listBacSi.size(); i++) {
				if (listBacSi.get(i).getMaBacSi().equals(nhapMa)) {
					listBacSi.get(i).setPhuCap(sc.nextDouble());
				} else {
					System.out.println("Không tìm ra mã bác sĩ");
				}
			}

		} else {
			System.out.println("Danh sách bác sĩ trống");
		}
	}

	// Câu 11: Xóa bác sỹ với mã tương ứng
	public static void xoaBacSiTheoMa() {
		if (listBacSi.size() != 0) {
			System.out.println("Nhập mã bác sĩ cần tìm");
			String nhapMa = sc.nextLine();
			for (int i = 0; i < listBacSi.size(); i++) {
				if (listBacSi.get(i).getMaBacSi().equals(nhapMa)) {
					listBacSi.remove(i);
				} else {
					System.out.println("Không tìm ra mã bác sĩ");
				}
			}

		} else {
			System.out.println("Danh sách bác sĩ trống");
		}
	}

	public static void clearData() {
		listBenhNhan.clear();
	}
}