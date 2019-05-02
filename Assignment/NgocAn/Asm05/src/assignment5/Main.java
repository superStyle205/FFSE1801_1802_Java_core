package assignment5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("\n==========================MENU============================="
				+ "\n1.Nhap thong tin danh sach can bo trong truong"
				+ "\n2.Xuat danh sach giao vien khoa x, hoac nhan vien phong ban Y nao do"
				+ "\n3.Tong luong truong phai tra cho can bo"
				+ "\n4.Sap xep can bo theo luong, neu luong bang thi sap xep theo ten"
				+ "\n================================================================");
		System.out.println("\nChon chuc nang: ");
	}

	public static void runProgram() {
		ArrayList<CanBo> canBoList = new ArrayList<CanBo>();
		boolean pause = false;
		while (!pause) {
			showMenu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out
						.println("Chon danh sach nhap: \n 1. Danh sach giao vien \n 2.Danh sach nhan vien hanh chinh");
				int choiceList1 = sc.nextInt();
				switch (choiceList1) {
				case 1:
					GiangVien giangVien = new GiangVien();
					giangVien.input();
					canBoList.add(giangVien);
					break;
				case 2:
					NhanVien nhanVien = new NhanVien();
					nhanVien.input();
					canBoList.add(nhanVien);
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.println("Hien thi danh sach theo: \n 1. Khoa \n 2. Phong ban");
				int choiceList2 = sc.nextInt();
				switch (choiceList2) {
				case 1:
					System.out.println("Vui long nhap khoa: ");
					sc.nextLine();
					String khoa = sc.nextLine();
					for (int i = 0; i < canBoList.size(); i++) {
						if (canBoList.get(i) instanceof GiangVien) {
							((GiangVien) canBoList.get(i)).findGiangVien(khoa);
						}
					}
					break;
				case 2:
					System.out.println("Vui long nhap phong ban: ");
					sc.nextLine();
					String phongBan = sc.nextLine();
					for (int i = 0; i < canBoList.size(); i++) {
						if (canBoList.get(i) instanceof NhanVien) {
							((NhanVien) canBoList.get(i)).findNhanVien(phongBan);
						}
					}
					break;
				default:
					break;
				}
				break;
			case 3:
				double sum = 0;

				for (int i = 0; i < canBoList.size(); i++) {
					sum = sum + canBoList.get(i).getLuong();
				}
				System.out.println("Tong luong can bo: " + sum);
				break;
			case 4:

				canBoList.sort(new Comparator<CanBo>() {
					@Override
					public int compare(CanBo o1, CanBo o2) {
						if (o1.getLuong() == o2.getLuong()) {
							return o1.getName().compareTo(o2.getName());
						}
						return o1.getLuong() > o2.getLuong() ? 1 : -1;
					}
				});
				for (int i = 0; i < canBoList.size(); i++) {
					if (canBoList.get(i) instanceof NhanVien) {
						((NhanVien) canBoList.get(i)).output();
					}
					if (canBoList.get(i) instanceof GiangVien) {
						((GiangVien) canBoList.get(i)).output();
					}
				}
				break;
			default:
				break;
			}
		}
	}

	public static void main(String[] args) {
		runProgram();

	}

}
