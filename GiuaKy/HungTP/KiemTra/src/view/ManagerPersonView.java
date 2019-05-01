package view;

import java.util.Scanner;

import model.bean.BacSy;
import model.bean.BenhNhan;


/**
 * Impplement UI console for manager student program.
 * 
 * @author Thang Tran
 */
public class ManagerPersonView {

	private Scanner scan;

	public ManagerPersonView() {
		scan = new Scanner(System.in);
	}

	public BenhNhan inputBenhNhan() {
		BenhNhan benhNhan = new BenhNhan();
		System.out.print("Input name : ");
		benhNhan.setName(scan.nextLine());

		System.out.print("Input age : ");
		benhNhan.setAge(Integer.parseInt(scan.nextLine()));

		System.out.print("Input sex : ");
		benhNhan.setSex(scan.nextLine());

		System.out.print("Input cmnd : ");
		benhNhan.setCmnd((Integer.parseInt(scan.nextLine())));

		System.out.print("Input ma benh nhan : ");
		benhNhan.setMaBenhNhan((Integer.parseInt(scan.nextLine())));

		System.out.print("Input benh : ");
		benhNhan.setBenh(scan.nextLine());

		System.out.print("Input phuong phap chua : ");
		benhNhan.setPhuongPhapChuaBenh(scan.nextLine());

		System.out.print("Input ngay nhap vien : ");
		benhNhan.setNgayNhapVien(scan.nextLine());

		System.out.print("Input ngay ra vien : ");
		benhNhan.setNgayRaVien(scan.nextLine());

		System.out.print("Input tien thanh toan : ");
		benhNhan.setTienThanhToan((Double.parseDouble(scan.nextLine())));
		return benhNhan;
	}
	
	public BacSy inputBacSy() {
		BacSy bacSy = new BacSy();
		System.out.print("Input name : ");
		bacSy.setName(scan.nextLine());

		System.out.print("Input age : ");
		bacSy.setAge(Integer.parseInt(scan.nextLine()));

		System.out.print("Input sex : ");
		bacSy.setSex(scan.nextLine());

		System.out.print("Input cmnd : ");
		bacSy.setCmnd((Integer.parseInt(scan.nextLine())));

		System.out.print("Input ma bac si : ");
		bacSy.setMaBacSy((Integer.parseInt(scan.nextLine())));

		System.out.print("Input khoa : ");
		bacSy.setKhoa(scan.nextLine());

		System.out.print("Input ngay vao lam : ");
		bacSy.setNgayVaoLam(scan.nextLine());

		System.out.print("Input luong : ");
		bacSy.setLuong((Double.parseDouble(scan.nextLine())));
		
		System.out.print("Input tien phu cap : ");
		bacSy.setPhuCap((Double.parseDouble(scan.nextLine())));
		return bacSy;
	}
	
	public int inputidBenhNhan() {
		System.out.print("Input id : ");
		return Integer.parseInt(scan.nextLine());
	}
	public String inputBenh() {
		System.out.print("Input benh : ");
		return scan.nextLine();
	}
	
	public String inputKhoa() {
		System.out.print("Input khoa : ");
		return scan.nextLine();
	}
	
	public int menuView() {
		System.out.println("************** menu **************");
		System.out.println("1. Thêm moi ho so benh nhân");
		System.out.println("2. Hien thi thông tin t?t c? b?nh nhân");
		System.out.println("3. Hi?n th? h? so c?a b?nh nhân v?i mã b?nh nhân nh?p t? bàn phím ");
		System.out.println("4. Tính t?ng các s? ti?n c?a t?t c? b?nh nhân");
		System.out.println("5. Tìm b?nh nhân có ti?n tr? nhi?u nh?t");
		System.out.println("6. TÌm các b?nh nhân có b?nh tuong ?ng nh?p t? bàn phím ");
		System.out.println("7. Thêm m?i nhân viên");
		System.out.println("8. Hien thi tat ca bác s?");
		System.out.println("9. Hien thi bác sy v?i khoa tuong ?ng nh?p t? bàn phím");
		System.out.println("10. S?a ph? c?p cho bác s? tuong ?ng v?i mã bác s? nh?p t? bàn phím");
		System.out.println("11. Xóa bác s? v?i mã tuong ?ng ");
		System.out.println("**********************************");
		System.out.print("Choose menu : ");
		return Integer.parseInt(scan.nextLine());
	}

}
