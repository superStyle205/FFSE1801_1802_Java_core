package asm4;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	Scanner sc = new Scanner(System.in);
	BienLai bienLai = new BienLai();
	public void add() {
		System.out.print("Nhập tên: ");
		String ten = sc.nextLine();
		System.out.print("Nhập số nhà: ");
		int soNha = sc.nextInt();
		sc.nextLine();
		System.out.print("Mã số công tơ nơ hiện tại: ");
		int code = sc.nextInt();
		sc.nextLine();
		KhachHang kh = new KhachHang(ten, soNha, code);
		bienLai.addKhachHang(kh);
	}
	public void mutilAdd() {
		System.out.println("Số khách hàng bạn muốn nhập: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			add();
		}
		menu();
	}
	public void showAll() {
		ArrayList<KhachHang> n = bienLai.getKhachHang();
		for(int i = 0; i < n.size(); i++) {
			System.out.println((i+1)+". Ten: " + n.get(i).getHoTen() + ", Số nhà: "+ n.get(i).getSoNha()+", mã số công tơ hiện tại: " +n.get(i).getCode());
		}
		menu();
	}
	public void countMoney() {
		ArrayList<KhachHang> n = bienLai.getKhachHang();
		System.out.println("Nhập tên hộ gia đình cần tính tiền: ");
		String ten = sc.nextLine();
		System.out.println("số công tơ mới là: ");
		int ct = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n.size(); i++ ) {
			if(n.get(i).getHoTen().equals(ten)) {
				System.out.println(bienLai.money(n.get(i), ct));
				n.get(i).setCode(ct);
			}
		}
		menu();
	}
	public void menu() {
		System.out.println("1. Nhập hộ gia đình: ");
		System.out.println("2. Hiển thị các hộ gia đình: ");
		System.out.println("3. Tính tiền điện: ");
		int input = sc.nextInt();
		sc.nextLine();
		if (input == 1) {
			mutilAdd();
		} else if (input == 2) {
			showAll();
		} else if (input == 3) {
			countMoney();
		} else if (input == 4) {
			System.exit(0);
		} else {
			System.exit(0);
		}
	}
}
