package asm6;

import java.lang.Exception;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLi {
	private static final ConNguoi GiangVien = null;
	private Scanner scanner;
	private ArrayList<ConNguoi> ListConNguoi;

	public QuanLi() {
		ListConNguoi = new ArrayList<ConNguoi>();
		scanner = new Scanner(System.in);
	}

	public void addCanBo(ConNguoi conNguoi) {
		ListConNguoi.add(conNguoi);
	}

	public void xuatCanBo() {
		System.out.println(" nhập 1 xuất giảng viên |  nhập 2 xuất nhân viên");
		int choose = Integer.parseInt(scanner.next());
		// hien thi nhan vien
		if (choose == 2) {
			System.out.println("Nhap phong ban can tim");
			String phongBan = scanner.nextLine();
			for (ConNguoi conNguoi : ListConNguoi) {
				if (conNguoi instanceof NhanVien) {
					if (((NhanVien) conNguoi).getPhongBan().equals(phongBan))
						;
					((NhanVien) conNguoi).xuat();
				}
			}
			// hien thi giang vien
		} else if (choose == 1) {
			System.out.println("Nhap khoa can tim");
			String khoa = scanner.nextLine();
			for (ConNguoi conNguoi : ListConNguoi) {
				if (conNguoi instanceof GiangVien) {
					if (((GiangVien) conNguoi).getKhoa().equals(khoa))
						;
					((GiangVien) conNguoi).xuat();
				}
			}
		}

	}

	// tinh tong luong
	public double sumCanBo() {

		double sumNV = 0;
		double sumGV = 0;
		for (ConNguoi conNguoi : ListConNguoi) {
			if (conNguoi instanceof NhanVien) {
				sumNV += ((NhanVien) conNguoi).getLuong();
			} else if (conNguoi instanceof GiangVien) {
				sumGV += ((GiangVien) conNguoi).getLuong();
			}
		}

		System.out.println(" tong : " + (sumGV + sumNV));
		return 0;
	}

	public void sapXep() {
		Collections.sort(ListConNguoi, new Comparator<ConNguoi>() {
			@Override
			public int compare(ConNguoi cn1, ConNguoi cn2) {
				if (cn1.getLuong() < cn2.getLuong()) {
					return 1;
				} else {
					if (cn1.getLuong() == cn2.getLuong()) {
						// náº¿u lÆ°Æ¡ng báº±ng thÃ¬ sx theo tÃªn
						return (cn1.getName().compareTo(cn2.getName()));
					} else {
						return -1;
					}
				}
			}
		});
		for (ConNguoi conNguoi : ListConNguoi) {
			conNguoi.xuat();

		}
	}

	public ConNguoi nhapThongTin() throws Exception {
		ConNguoi conNguoi = null;
		String name;
		double heSoLuong;

		System.out.println("1. giảng viên / 2. nhân viên");
		int chooseInput = Integer.parseInt(scanner.nextLine());
		switch (chooseInput) {
		case 1:

			GiangVien gv = new GiangVien();

			while (true) {

				System.out.println("nhập thông tin giảng viên© " + (ListConNguoi.size() + 1));
				
				
				System.out.print("nhap  id :  ");			
				gv.setId(Integer.parseInt(scanner.nextLine()));
				
				try {
					System.out.println("nhap tên : ");
					gv.setName(scanner.nextLine());
					if (gv.getName().equals("")) {
						throw new Exception("text  is not empty!!");
					}
					for (int i = 0; i < ListConNguoi.size(); i++) {
						char subItem = gv.getName().charAt(i);
						if ((Character.isLetter(subItem) || Character.isWhitespace(subItem))) {
							System.out.println("format  text is wrong !!");
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				try {
					System.out.print("số tiêt  trong tháng : ");
					gv.setSoTietTrongThang(Integer.parseInt(scanner.nextLine()));
					if (gv.getSoTietTrongThang() < 0) {
						throw new Exception(" không được nhập số âm  oke :");

					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				try {
					System.out.println("trình độ : ");
					gv.setTrinhDo(scanner.nextLine());

					if (!(gv.getTrinhDo().equals("cu nhan") || gv.getTrinhDo().equals("tien si")
							|| gv.getTrinhDo().equals("thac si"))) {
						throw new Exception(" trinh do phai trình độ : thac sĩ , tiến sĩ ,cư nhân ");
					}

				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
				

				System.out.print("nhap khoa : ");
				gv.setKhoa(scanner.nextLine());
				
				
				try {
					System.out.println("hệ số lương :");
					gv.setHeSoLuong(Double.parseDouble(scanner.nextLine()));
					if (gv.getHeSoLuong() < 0) {
						throw new Exception(" không nhập số âm oke: ");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				
				ListConNguoi.add(gv);
 
			}

		case 2:
			NhanVien nv = new NhanVien();
			System.out.println("nhập thông tin nhân viên " + (ListConNguoi.size() + 1));

			try {
				System.out.print("nhap  id :  ");
				nv.setId(Integer.parseInt(scanner.nextLine()));

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println("nhap ten : ");
			nv.setName(scanner.nextLine());

			try {
				System.out.print("nhap chuc vu : ");
				nv.setChucVu(scanner.nextLine());
				if (!(nv.getChucVu().equals("truong phong")) || (nv.getChucVu().equals("phó phong"))
						|| (nv.getChucVu().equals(" nhân viên"))) {
					throw new Exception(" orre !! only trưởng phong ,phó phòng , nhân viên ");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.print(" số ngày công : ");
				nv.setSoNgayCong(Integer.parseInt(scanner.nextLine()));
				if (nv.getSoNgayCong() < 0) {
					throw new Exception("không được  nhập số âm :");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println("phong ban : ");
			nv.setPhongBan(scanner.nextLine());
			try {
				System.out.println("hệ số lương:");
				nv.setHeSoLuong(Double.parseDouble(scanner.nextLine()));
				if (nv.getSoNgayCong() < 0) {
					throw new Exception("không được  nhập số âm :");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			ListConNguoi.add(nv);

			break;

		default:
			System.out.println("không đúng vui lòng  nhập lại");
			break;

		}
		return conNguoi;
	}

	public void menu() throws Exception {
		int chooseMenu;
		while (true) {
			System.out.println("1. nhập thông tin ");
			System.out.println("2.xuất danh sách thông tin các khoa hoặc các ban");
			System.out.println("3. tổng lương ™");
			System.out.println("4. sắp sếp thứ tự theo lương nếu lương bằng nhau thì sắp xếp theo chữ ");
			chooseMenu = Integer.parseInt(scanner.nextLine());
			switch (chooseMenu) {
			case 1:
				ConNguoi conNguoi = nhapThongTin();
				addCanBo(conNguoi);
				break;
			case 2:
				xuatCanBo();
				break;
			case 3:
				sumCanBo();
				break;
			case 4:
				sapXep();
				break;
			case 5:
				System.out.println("tam biet");
				System.exit(0);
				break;
			default:
				System.out.println("khong ton tai tinh nang nay");
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		QuanLi quanLyCanBo = new QuanLi();
		quanLyCanBo.menu();
	}

}
