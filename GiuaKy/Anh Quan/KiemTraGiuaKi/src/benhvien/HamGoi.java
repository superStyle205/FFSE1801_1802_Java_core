package benhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class HamGoi {
	ArrayList<BenhNhan> bn = new ArrayList<BenhNhan>();
	ArrayList<BacSi> bs = new ArrayList<BacSi>();
	Scanner sc = new Scanner(System.in);

	public void themMoiBn() {

		BenhNhan bnx = new BenhNhan();
		System.out.println("Nhap ten benh nhan");
		bnx.setTen(sc.nextLine());
		bnx.setTen(sc.nextLine());
		System.out.println("Nhap tuoi ");
		bnx.setTuoi(sc.nextInt());

		System.out.println("Nhap gioi tinh benh nhan");
		bnx.setGioitinh(sc.nextLine());
		bnx.setGioitinh(sc.nextLine());
		System.out.println("Nhap benh cua benh nhan");
		bnx.setBenh(sc.nextLine());
		System.out.println("Nhap phuong phap chua benh nhan");
		bnx.setPhuongphap(sc.nextLine());

		System.out.println("Nhap tien thanh toan");
		bnx.setTienthanhtoan(sc.nextInt());

		System.out.println("Nhap cmnd");
		bnx.setCmnd(sc.nextInt());
		System.out.println("Nhap ma benh nhan");
		bnx.setMabenhnhan(sc.nextInt());

		bn.add(bnx);
	}

	public void hienThiTatCaBenhNhan() {
		for (int i = 0; i < bn.size(); i++) {
			System.out.println("benh nhan thu " + i + 1);
			System.out.println("ten la " + bn.get(i).ten);
			System.out.println("tuoi " + bn.get(i).tuoi);
			System.out.println("ma benh nhan " + bn.get(i).mabenhnhan);
			System.out.println("benh " + bn.get(i).benh);
			System.out.println("Chung minh nhan dan " + bn.get(i).cmnd);
			System.out.println("Phuong phap " + bn.get(i).phuongphap);
			System.out.println("Tien thanh toan " + bn.get(i).tienthanhtoan);
			System.out.println("Gioi tinh " + bn.get(i).gioitinh);
		}
	}

	public void timBenhNhanTheoMa() {
		int ma;
		System.out.println("Nhap ma benh nhan");
		ma = sc.nextInt();
		for (int i = 0; i < bn.size(); i++) {
			if (bn.get(i).getMabenhnhan() == ma) {
				System.out.println("ten" + bn.get(i).getTen());
				System.out.println("ma benh nhan " + bn.get(i).getMabenhnhan());
				System.out.println("benh " + bn.get(i).getBenh());
				System.out.println("Tien tt " + bn.get(i).getTienthanhtoan());
			}
		}

	}

	public void tinhTongTien() {
		int tong = 0;
		for (int i = 0; i < bn.size(); i++) {
			tong = tong + bn.get(i).getTienthanhtoan();
		}

		System.out.println(tong);
	}

	public void tienNhieuNhat() {
		int tiennhieu = 0;
		tiennhieu = bn.get(0).getTienthanhtoan();
		for (int i = 0; i < bn.size(); i++) {
			if (tiennhieu < bn.get(i).getTienthanhtoan()) {
				tiennhieu = bn.get(i).getTienthanhtoan();
			}

		}
	}

	public void timBenhNhanTheoBenh() {
	
		System.out.print("Nhap benh ");
		String benh = sc.nextLine();
		benh = sc.nextLine();
		for (int i = 0; i < bn.size(); i++) {
			 if(bn.get(i).getBenh().equals(benh)){
			 System.out.println("ten" + bn.get(i).getTen());
			 System.out.println("ma benh nhan " + bn.get(i).getMabenhnhan());
			 System.out.println("benh " + bn.get(i).getBenh());
			 System.out.println("Tien tt "+bn.get(i).getTienthanhtoan());
			
			 }
			
		}
	}

	public void themMoiNhanVien() {
		BacSi bsx = new BacSi();
		System.out.println("Nhap ten bac si");
		bsx.setTen(sc.nextLine());
		bsx.setTen(sc.nextLine());
		System.out.println("Nhap tuoi ");
		bsx.setTuoi(sc.nextInt());
		System.out.println("Nhap gioi tinh ");
		bsx.setGioitinh(sc.nextLine());
		bsx.setGioitinh(sc.nextLine());
		System.out.println("Nhap cmnd");
		bsx.setCmnd(sc.nextInt());
		System.out.println("Nhap ma bac si");
		bsx.setMabacsi(sc.nextInt());
		System.out.println("Nhap khoa");
		bsx.setKhoa(sc.nextLine());
		bsx.setKhoa(sc.nextLine());
		System.out.println("Nhap luong");
		bsx.setLuong(sc.nextInt());
		System.out.println("Nhap phu cap");
		bsx.setPhucap(sc.nextInt());
		bs.add(bsx);
	}

	public void hienThiBacSi() {

		for (int i = 0; i < bs.size(); i++) {
			System.out.println("bac si thu " + i);
			System.out.println("ten la" + bs.get(i).ten);
			System.out.println("tuoi" + bs.get(i).tuoi);
			System.out.println("ma bac si" + bs.get(i).mabacsi);
			System.out.println("khoa" + bs.get(i).khoa);
			System.out.println("Chung minh nhan dan" + bs.get(i).cmnd);
			System.out.println("Luong" + bs.get(i).luong);
			System.out.println("Phu cap " + bs.get(i).phucap);
			System.out.println("Gioi tinh" + bs.get(i).gioitinh);
		}
	}

	public void timBacSiTheoKhoa() {
		String khoa;
		System.out.println("Nhap khoa bac si");
		khoa = sc.nextLine();
		khoa = sc.nextLine();
		for (int i = 0; i < bs.size(); i++) {
			if (bs.get(i).getKhoa().equals(khoa)) {
				System.out.println("ten" + bs.get(i).getTen());
				System.out.println("ma bac si " + bs.get(i).getMabacsi());
				System.out.println("khoa " + bs.get(i).getKhoa());
				System.out.println("gioi tinh " + bs.get(i).getGioitinh());
			}
		}
	}
public void thayPhuCap() {
	System.out.println("Nhap ma bac si");
	int ma = sc.nextInt();

	for(int i = 0;i< bs.size();i++) {
		if(ma==bs.get(i).getMabacsi()) {
			System.out.println("nhap phu cap");
			int phucap= sc.nextInt();
			bs.get(i).setPhucap(phucap);
			
		}
	}
}
public void xoaNv() {
	int ma = sc.nextInt();
	for(int i=0;i<bs.size();i++) {
		if(bs.get(i).getMabacsi()==ma) {
			bs.remove(i);
		}
	}
}
	public void giaoDien() {

		while (true) {

			System.out.println("Lua chon cac chuc nang");
			System.out.println("	1/ Thêm m?i h? so b?nh nhân							");
			System.out.println("	2/ Hi?n th? thông tin t?t c? b?nh nhân							");
			System.out.println(
					"	3/ Hi?n th? h? so c?a b?nh nhân v?i mã b?nh nhân nh?p t? bàn phím							");
			System.out.println("	4/ Tính t?ng các s? ti?n c?a t?t c? b?nh nhân							");
			System.out.println("	5/ Tìm b?nh nhân có ti?n tr? nhi?u nh?t							");
			System.out.println("	6/ TÌm các b?nh nhân có b?nh tuong ?ng nh?p t? bàn phím							");

			System.out.println("	7/ Thêm m?i nhân viên							");
			System.out.println("	8/ Hi?n th? t?t c? bác s?							");
			System.out.println("	9/ Hi?n th? bác s? v?i khoa tuong ?ng nh?p t? bàn phím							");
			System.out.println(
					"	10/ S?a ph? c?p cho bác s? tuong ?ng v?i mã bác s? nh?p t? bàn phím							");
			System.out.println("	11/ Xóa bác s? v?i mã tuong ?ng							");

			int roll = sc.nextInt();
			switch (roll) {
			case 1:
				themMoiBn();
				break;
			case 2:
				hienThiTatCaBenhNhan();
				break;
			case 3:
				timBenhNhanTheoMa();
				break;
			case 4:
				tinhTongTien();
				break;
			case 5:
				tienNhieuNhat();
				break;
			case 6:
				timBenhNhanTheoBenh();
				break;
			case 7:
				themMoiNhanVien();
				break;
			case 8:
				hienThiBacSi();
				break;
			case 9:
				timBacSiTheoKhoa();
				break;
			case 10:
				thayPhuCap();
				break;
			case 11:
				xoaNv();
			
				break;
			default:	System.out.println("ko hop le");
			}
			
		}

	}
}
