package Lap5Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainSinhVien {
	public static ArrayList<SinhVien> arrSV = new ArrayList<SinhVien>();
	static Scanner so = new Scanner(System.in);
	public static Scanner chu = new Scanner(System.in);


	public static void main(String[] args) {

		arrSV.add(new SinhVien("a a",0));
		arrSV.add(new SinhVien("b e",4));
		arrSV.add(new SinhVien("a f",5));
		arrSV.add(new SinhVien("t h",7));
		arrSV.add(new SinhVien("b",1));
		arrSV.add(new SinhVien("c",2));
		arrSV.add(new SinhVien("g",6));
		arrSV.add(new SinhVien("d",3));
		arrSV.add(new SinhVien("i",8));
		

		boolean flag = true;
		System.out.println("/****************************************/");
		System.out.println("1. Thêm SV");
		System.out.println("2. Xuất all SV");
		System.out.println("3. Xuất danh sách ngẫu nhiên ");
		System.out.println("4. Sắp xếp giảm dần theo điểm");
		System.out.println("5. Sắp xếp giảm dần theo họ tên");
		System.out.println("6. Tìm và xóa SV theo họ tên");
		System.out.println("7. Kết thúc");


		System.out.println("/****************************************/");

		do{
			System.out.println("Lựa chọn của bạn[0-7]");
			int choise = so.nextInt();

			switch (choise) {
			case 1:themSV();
			break;
			case 2:xuatAllSV();
			break;
			case 3:xuatNgauNhien();
			break;
			case 4:sxTheoDiem();
			break;
			case 5:sxTheoHoTen();
			break;
			case 6:timVaXoa();
			break;
			case 7:
			default:
				flag = false;
				System.out.println("Thanks");
				break;
			}
		}while(flag == true);
	}

	public static void themSV() {
		SinhVien sv = new SinhVien();
		System.out.println("Nhập thông tin sinh viên thứ " + (arrSV.size() + 1));
		System.out.println("Nhập tên");
		sv.setHoTen(chu.nextLine());
		System.out.println("Nhập điểm");
		sv.setDiem(so.nextDouble());

		if (sv.getDiem() < 0 || sv.getDiem() > 10) {
			System.out.println("Nhập sai điểm _ Vui lòng nhập lại");
		} else {
			arrSV.add(sv);
		}


	}


	public static void xuatAllSV() {
		if (arrSV.size() == 0) {
			System.out.println("Danh sách sinh viên rỗng!");
		}else {
			for (int i = 0; i < arrSV.size(); i++) {
				System.out.println("Sinh viên thứ " + (i+1) + " là ");
				System.out.println("Tên : "  + arrSV.get(i).getHoTen());
				System.out.println("Điểm : "  + arrSV.get(i).getDiem());

			}
		}
	}

	public static void xuatNgauNhien() {
		if (arrSV.size() == 0) {
			System.out.println("Danh sách sinh viên rỗng!");
		}else {
			Collections.shuffle(arrSV);
			for (int i = 0; i < arrSV.size(); i++) {
				System.out.println("Sinh viên thứ " + (i+1) + " là ");
				System.out.println("Tên : "  + arrSV.get(i).getHoTen());
				System.out.println("Điểm : "  + arrSV.get(i).getDiem());

			}
		}
	}

	public static void sxTheoDiem() {
		Collections.sort(arrSV, new Comparator<SinhVien>() {
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiem() < sv2.getDiem()) {
					return 1;
				} else {
					if (sv1.getDiem() == sv2.getDiem()) {
						return 0;
					} else {
						return -1;
					}
				}
			}
		});
		System.out.println("Danh sách sắp xếp theo thứ tự điểm giảm dần là: ");
		for (int i = 0; i < arrSV.size(); i++) {
			System.out.println("Tên: " + arrSV.get(i).getHoTen() + " Điểm: " + arrSV.get(i).getDiem());
		}
	}
	public static void sxTheoHoTen() {
		Collections.sort(arrSV, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				return (sv1.hoTen.compareTo(sv2.hoTen));

				// Muốn đảo danh sách các bạn đối thành
				//return (sv2.hoTen.compareTo(sv1.hoTen));
			}
		});

		System.out.println("Danh sách sắp xếp theo tên trong bảng chữ cái a - b - c: ");
		for (int i = 0; i < arrSV.size(); i++) {
			System.out.println("Tên: " + arrSV.get(i).getHoTen() + " Điểm: " + arrSV.get(i).getDiem());
		}
	}

	public static void timVaXoa() {
		System.out.println("Nhập tên bạn cần tìm để xóa");
		String name = chu.nextLine();
		boolean xet = true;

		for (int i = 0; i < arrSV.size(); i++) {
			if (arrSV.get(i).getHoTen().equals(name)) {
				System.out.println("Đã xóa sinh viên tên " + arrSV.get(i).getHoTen());
				arrSV.remove(i);

				xet = false;
			}
		}
		if (xet) {
			System.out.println("Không tìm thấy sinh viên nào");
		}
	}
}
