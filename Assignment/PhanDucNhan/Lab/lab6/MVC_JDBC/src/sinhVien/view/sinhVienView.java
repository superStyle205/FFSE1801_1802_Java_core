package sinhVien.view;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import sinhVien.model.dataBase;
import sinhVien.model.sinhVien;

public class sinhVienView {
	public static String USER = null;
	
	public static final int SINH_VIEN_GET_ALL = 1;
	public static final int SINH_VIEN_GET = 2;
	public static final int SINH_VIEN_ADD = 3;
	public static final int SINH_VIEN_UPDATE = 4;
	public static final int SINH_VIEN_DELETE = 5;
	public static final int SINH_VIEN_LOGOUT = 6;
	public static final int SINH_VIEN_EXIT = 7;

	public int menu(){
		System.out.println();
		System.out.println("======== MENU =========\r\n"
				+ "Mời bạn chọn\r\n" + 
				"1. Lấy toàn bộ sinh viên\r\n" + 
				"2. Lấy sinh viên theo tài khoản\r\n" + 
				"3. Thêm sinh viên\r\n" + 
				"4. Cập nhật sinh viên\r\n" + 
				"5. Xóa sinh viên theo tài khoản\r\n"+ 
				"6. Đăng xuất\r\n"
				+ "7. Thoát\r\n"
				+ "======== END MENU =========");
		int r = new Scanner(System.in).nextInt();
		return r;
	}

	public String[] login() {
		System.err.println("======= LOGIN =========");
		System.out.println("Mời bạn đăng nhập");
		String re[] = new String[2];
		System.out.println("Nhập tài khoản");
		re[0] = new Scanner(System.in).nextLine();
		System.out.println("Nhập mật khẩu");
		re[1] = new Scanner(System.in).nextLine();
		System.out.println();
		return re;
	}
	
	public void logout() {
		USER = null;
		System.out.println();
		System.err.println("Đăng xuất thành công");
		System.out.println();
	}
	
	public sinhVien add() {
		System.out.println();
		sinhVien sv = new sinhVien();
		System.out.println("Nhập tài khoản");
		sv.setUser(new Scanner(System.in).nextLine());
		System.out.println("Nhập mật khẩu");
		sv.setPass(new Scanner(System.in).nextLine());
		System.out.println("Nhập họ tên");
		sv.setName(new Scanner(System.in).nextLine());
		System.out.println("Nhập email");
		sv.setEmail(new Scanner(System.in).nextLine());
		System.out.println("Nhập địa chỉ");
		sv.setAdress(new Scanner(System.in).nextLine());
		return sv;
	}
	
	public String get() {
		System.out.println();
		System.out.println("Nhập tài khoản");
		String user = new Scanner(System.in).nextLine();
		
		return user;
	}
	
	public String[] update() {
		System.out.println();
		String[] re = new String[3];
		System.out.println("Gõ: "
					+ "1 - sửa pass\r\n" + 
					"2 - sửa name\r\n" + 
					"3 - sửa email\r\n" + 
					"4 - sửa adress");
		re[0] = new Scanner(System.in).nextLine();
		System.out.println("Nhập tài khoản");
		re[1] = new Scanner(System.in).nextLine();
		System.out.println("Nhập dữ liệu mới");
		re[2] = new Scanner(System.in).nextLine();
		return re;
	}
	
	public String delete() {
		System.out.println();
		System.out.println("Nhập tài khoản");
		String user = new Scanner(System.in).nextLine();
		
		return user;
	}
	
	
}
