package asm5;
import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	QuanLyCanBo cb = new QuanLyCanBo();

//	@SuppressWarnings("null")
	public void input() {
		CanBo canBo = null;
		System.out.print("Họ và tên: ");
		String name = sc.nextLine();

		while (true) {
			System.out.print(
					"Vị trí hoặc trình độ của cán bộ (cử nhân/ thạc sĩ/ tiến sĩ/ trưởng phòng/ phó phòng/ nhân viên): ");
			String viTri = sc.nextLine();

			if (viTri.equals("cử nhân") || viTri.equals("thạc sĩ") || viTri.equals("tiến sĩ")) {
				System.out.print("Khoa của giảng viên: ");
				String khoa = sc.nextLine();
				System.out.print("Số tiết dạy trong tháng: ");
				int soTietDay = sc.nextInt();
				sc.nextLine();
				canBo = new GiangVien(name, 0, khoa, soTietDay, viTri);
				break;
			} else if (viTri.equals("trưởng phòng") || viTri.equals("phó phòng") || viTri.equals("nhân viên")) {
				System.out.print("Phòng ban của nhân viên: ");
				String phongBan = sc.nextLine();
				System.out.print("Số ngày công: ");
				int soNgayCong = sc.nextInt();
				sc.nextLine();
				canBo = new NhanVien(name, 0, phongBan, soNgayCong, viTri);
				break;
			} else {
				System.out.println("nhập đúng tên chức vụ hoặc trình độ: ");
			}
		}
		System.out.print("Hệ số lương: ");
		int heSoLuong = sc.nextInt();
		sc.nextLine();
//		System.out.println(heSoLuong);
		canBo.setHeSoLuong(heSoLuong);
		cb.add(canBo);
		menu();
	}

	public void showByTypeName() {
		System.out.print("Nhập khoa hoặc phòng ban: ");
		String input = sc.nextLine();
		System.out.println("Danh sách cán bộ: ");
		boolean flag = false;
		for (int i = 0; i < cb.getAll().size(); i++) {
			if (cb.getGiangVien(i) != null && cb.getGiangVien(i).getKhoa().equals(input)) {
				System.out.println(cb.getGiangVien(i).getHoTen());
				flag = true;
			} else if (cb.getNhanVien(i) != null && cb.getNhanVien(i).getPhongBan().equals(input)) {
				System.out.println(cb.getNhanVien(i).getHoTen());
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("không tìm thấy");
		}
		menu();
	}

	public void totalSalary() {
		double totalSalary = 0;
		for (int i = 0; i < cb.getAll().size(); i++) {
			totalSalary += cb.getAll().get(i).tinhLuong();
		}
		System.out.println("Tổng lương trường phải trả là: " + totalSalary);
		menu();
	}

	public void softBySalary() {
		Unicode uniCode = new Unicode();
		uniCode.VN();
		int size = cb.getAll().size();
		for (int i = 0; i < size; i++) {
			for (int j = ++i; j < size; j++) {
				if (cb.getAll().get(i).tinhLuong() > cb.getAll().get(j).tinhLuong()) {
					CanBo tg = cb.getAll().get(i);
					cb.getAll().set(i, cb.getAll().get(j));
					cb.getAll().set(j, tg);
				} else if (cb.getAll().get(i).tinhLuong() == cb.getAll().get(j).tinhLuong() && !(uniCode.compare(cb.getAll().get(i).getHoTen(), cb.getAll().get(j).getHoTen()))) {
					CanBo tg = cb.getAll().get(i);
					cb.getAll().set(i, cb.getAll().get(j));
					cb.getAll().set(j, tg);
				} else {
					continue;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(cb.getAll().get(i).getHoTen() + " : " + cb.getAll().get(i).tinhLuong());
		}
		menu();
	}

	public void menu() {
		System.out.println("1. Nhập danh sách cán bộ: ");
		System.out.println("2. Xuất danh sách cán bộ của khoa hoặc phòng ban: ");
		System.out.println("3. Tổng số lương trường phải trả cho cán bộ: ");
		System.out.println("4. Sắp xếp cán bộ theo lương, nếu lương bằng thì sắp xếp theo tên: ");
		int input = sc.nextInt();
		sc.nextLine();
		if (input == 1) {
			input();
		} else if (input == 2) {
			showByTypeName();
		} else if (input == 3) {
			totalSalary();
		} else if (input == 4) {
			softBySalary();
		} else {
			System.exit(0);
		}
	}
}
