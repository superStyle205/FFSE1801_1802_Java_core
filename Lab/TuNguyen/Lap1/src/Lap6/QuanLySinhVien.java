package Lap6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {

	public  static  ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
	Scanner scan = new Scanner(System.in);

	public void menu() throws Exception {
		while (true) {
			System.out.println("" + "/****************************************/ \r\n"
					+ "1. Thêm sinh viên. 	                * . \r\n" + "2. Cập nhật thông tin sinh viên theo ID * . \r\n"
					+ "3. Xóa sinh viên theo ID 		* . \r\n" + "4. Sắp sếp sinh viên theo tên		* . \r\n"
					+ "5. Hiển thị danh sách sinh viên 	* . \r\n" + "0. Kết thúc chương trình                * . \r\n"
					+ "/****************************************/");
			int n = Integer.parseInt(scan.nextLine());
			switch (n) {
				case 1:
					themSinhVien();
					break;
				case 2:
					capNhat();
					break;
				case 3:
					xoaSinhVien();
					break;
				case 4:
					sapXepSV();
					break;
				case 5:
					hienThiSinhVien();
					break;
				case 0:
					System.err.println("THANKS");
					System.exit(0);
					break;
		
				default:
					break;
			}
		}
	}

	
	////   --------- BAI 1 -------------- ////
	
	public void themSinhVien() throws Exception {
		
		SinhVien SV = new SinhVien();
		
		
		try {
		System.out.println("Nhap id");
		SV.setId(Integer.parseInt(scan.nextLine()));
		kiemTraID(SV.getId());
		
		System.out.println("Nhap name");
		SV.setName(scan.nextLine());
		kiemTra(SV);
		
		System.out.println("Nhap tuoi");
		SV.setAge(Integer.parseInt(scan.nextLine()));
		kiemTra(SV);
		
		System.out.println("Nhap adress");
		SV.setAdress(scan.nextLine());
		
		System.out.println("Nhap gpa");
		SV.setGPA(Double.parseDouble(scan.nextLine()));
		kiemTra(SV);
		
		sv.add(SV);
		} catch (NumberFormatException e) {
			System.out.println("Loi~~~ ID rong...." + e);
		} catch (Exception tuBuDit) {
			System.out.println("Loi~~~ " + tuBuDit);
		}
	}

	

	public static void kiemTra(SinhVien sv2) throws Exception{
		
		// kt ten
		if (sv2.getTen().equals("")) {
			throw new Exception("Khong duoc de khoang trang");
		}
		
		// tuoi 
		if (sv2.getTuoi() < 0 || sv2.getTuoi() > 100) {
			throw new Exception("Khong duoc qua 100 va nho hon 0");
		}
		// GPA
		if (sv2.getDTB() < 0 || sv2.getDTB() > 10) {
			throw new Exception("Diem khong duoc qua 10 va nho hon 0");
		}
	}

	public static void kiemTraID(int id) throws Exception{
		
		int xet = 0;
		
		for (int j = 0;j < sv.size(); j++) {
			
			if (sv.get(j).getId() == id) {
				xet = 1;
			} 
		}
		if (xet == 1) {
			throw new Exception("Khong de rong id");
		}
		
	}
	
	
	
	
	
	//// --------- BAI 2 ------------ ////
	
	
	

	public void hienThiSinhVien() {
		for (int j = 0; j < sv.size(); j++) {
			System.out.println(sv.get(j).toString());
		}
	}


	
	
	//// ---------- BAI 3 ------------ ////
	
	
	public void capNhat() {
		System.out.println("moi nhap id sinh vien");
		int id = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < sv.size(); i++) {
			if (id == sv.get(i).getId()) {
				sv.get(i).toString();
				System.out.println("Nhap id thay doi");
				sv.get(i).setId(Integer.parseInt(scan.nextLine()));
			}
		}
	}
	
	
	//// ----------- BAI 4 -------------- ////
	
	public void xoaSinhVien() {
		System.out.println("Nhap id can xoa");
		int id = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < sv.size(); i++) {
			if (sv.get(i).getId() == id) {
				sv.remove(i);
			}
			System.out.println(sv.get(i).toString());
		}
	}
	
	
	//// ----------- BAI 5 --------------- ////
	
	
	public void sapXepSV() {
		Collections.sort(sv, new Comparator<SinhVien>() {
			@Override 
			public int compare(SinhVien sv1, SinhVien sv2) {
				return sv1.getTen().compareTo(sv1.getTen());
			}
		});
		for (int i = 0; i < sv.size(); i++) {
			System.out.println(sv.get(i).toString());
		}
	}

	public static void main(String[] args) throws Exception{
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		quanLySinhVien.menu();
	}
}