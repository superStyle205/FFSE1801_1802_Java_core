package model;

import java.util.ArrayList;
import java.util.Scanner;
import model.bean.BacSy;
import model.bean.BenhNhan;
import model.bean.ConNguoi;

public class Database {

	private ArrayList<ConNguoi> conNguois;
	private Scanner sc;

	public Database() {
		conNguois = new ArrayList<ConNguoi>();
		sc = new Scanner(System.in);
	}

	public ArrayList<ConNguoi> getDanhSachBenhNhan() {
		ArrayList<BenhNhan> benhNhans = new ArrayList<BenhNhan>();
		for (ConNguoi conNguoi : conNguois) {
			if (conNguoi instanceof BenhNhan) {
				benhNhans.add((BenhNhan) conNguoi);
				break;
			}
		}
		return conNguois;
	}

	public ArrayList<ConNguoi> getDanhSachBacSy() {
		ArrayList<BacSy> bacSys = new ArrayList<BacSy>();
		for (ConNguoi conNguoi : conNguois) {
			if (conNguoi instanceof BacSy) {
				bacSys.add((BacSy) conNguoi);
				break;
			}
		}
		return conNguois;
	}

	/* Câu 1 & 7 */
	public void addConNguoi(ConNguoi conNguoi) {
		conNguois.add(conNguoi);
	}

	/* Câu 2 */
	public void hienThiDanhSachBenhNhan() {
		for (ConNguoi conNguoi : conNguois) {
			if (conNguoi instanceof BenhNhan) {
				((BenhNhan) conNguoi).xuat();
			}
		}
	}

	/* Câu 3 */
	public void hienThiBenhNhanTheoMa(int maBenhNhan) {
		for (ConNguoi conNguoi : conNguois) {
			if (conNguoi instanceof BenhNhan && ((BenhNhan) conNguoi).getMaBenhNhan() == maBenhNhan) {
				((BenhNhan) conNguoi).xuat();
			}
		}
	}

	/* Câu 4 */
	public double tinhTongTienBenhNhan() {
		double sum = 0;
		for (ConNguoi conNguoi : conNguois) {
			if (conNguoi instanceof BenhNhan) {
				sum += ((BenhNhan) conNguoi).getTienThanhToan();
			}
		}
		return sum;
	}

	/* Câu 5 */
	public void benhNhanCoTienTraNhieuNhat() {
		double max = ((BenhNhan) (conNguois.get(0))).getTienThanhToan();
		for (ConNguoi conNguoi : conNguois) {
			if (conNguoi instanceof BenhNhan) {
				if (max < ((BenhNhan) conNguoi).getTienThanhToan()) {
					max = ((BenhNhan) conNguoi).getTienThanhToan();
					((BenhNhan) conNguoi).xuat();
				}
			}
		}
	}

	/* Câu 6 */
	public void benhNhanCoBenhTuongUng(String benh) {
		for (ConNguoi conNguoi : conNguois) {
			if (conNguoi instanceof BenhNhan && ((BenhNhan) conNguoi).getBenh().equals(benh)) {
				((BenhNhan) conNguoi).xuat();
			}
		}
	}

	/* Câu 8 */
	public void hienThiDanhSachBacSy() {
		for (ConNguoi conNguoi : conNguois) {
			if (conNguoi instanceof BacSy) {
				((BacSy) conNguoi).xuat();
			}
		}
	}

	/* Câu 9 */
	public void hienThiBacSyTheoKhoa(String khoa) {
		for (ConNguoi conNguoi : conNguois) {
			if (conNguoi instanceof BacSy && ((BacSy) conNguoi).getKhoa().equals(khoa)) {
				((BacSy) conNguoi).xuat();
			}
		}
	}

	/* Câu 10 */
	public void suaPhuCap(int maBacSy) {
		int position = findMaBacSy(maBacSy);
		if (position == -1) {
			System.out.println("Ma bac sy ko tim thay !!!");
		} else {
			System.out.println("Nhap phu cap moi");
			for (ConNguoi conNguoi : conNguois) {
				if (conNguoi instanceof BacSy) {
					((BacSy) conNguoi).setPhuCap(sc.nextDouble());
				}
			}
		}
	}

	/* Câu 11 */
	public void xoaBacSyTheoMa(int maBacSy) {
		int position = findMaBacSy(maBacSy);
		if (position == -1) {
			System.out.println("Ma bac sy ko tim thay !!!");
		} else {
			conNguois.remove(position);
		}
	}

	// Tim id bac sy
	public int findMaBacSy(int maBacSy) {
		for (ConNguoi conNguoi : conNguois) {
			if (conNguoi instanceof BacSy && ((BacSy) conNguoi).getMaBacSy() == maBacSy) {
				return maBacSy;
			}
		}
		return -1;
	}
}
