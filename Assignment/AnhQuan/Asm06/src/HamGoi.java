import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HamGoi {
	Scanner sc = new Scanner(System.in);
	ArrayList<GiangVien> gv = new ArrayList<GiangVien>();
	ArrayList<NhanVien> nv = new ArrayList<NhanVien>();

	public void giaoDien() {
		while (true) {
			System.out.println("Cac chung nang");
			System.out.println("1 Nhap giang vien");
			System.out.println(" 2 Nhap nhan vien hanh chinh");
			System.out.println("3 Xuat danh sach giang vien va nhan vien");
			System.out.println("4 Tong luong phai tra");

			System.out.println("5 sap xep can bo theo ten");
			int roll = nhapSo();

			switch (roll) {
			case 1:
				themGiangVien();
				break;
			case 2:
				themNhanVien();
				break;
			case 3:
				xuatDanhSach();
				break;
			case 4:
				tongLuong();
				break;
			case 5:
				sapXepCanBo();
				break;

			}
		}
	}

	public void themGiangVien() {
		GiangVien gvx = new GiangVien();
		String a;
		String c = "([A-Z]([a-z]+ ))+";
		System.out.print("nhap ten");
		while (true) {

			a = sc.nextLine();
			String m = a + " ";
			if (m.matches(c)) {
				gvx.setHoTen(m);
				break;

			} else {

				System.out.println(" nhap lai");
			}

		}

		System.out.print("nhap khoa");

		a = sc.nextLine();
		gvx.setKhoa(a);
		System.out.print("nhap trinh do ( cu nhan, thac si, tien si)");
		while (true) {
			a = sc.nextLine();
			if (a.equals("cu nhan") || a.equals("thac si") || a.equals("tien si")) {
				gvx.setTrinhDo(a);
				break;
			} else {
				System.out.println("nhap lai");
			}
		}

		switch (gvx.getTrinhDo()) {
		case "cu nhan":
			gvx.setPhuCap(300);
			break;
		case "thac si":
			gvx.setPhuCap(500);
			break;
		case "tien si":
			gvx.setPhuCap(1000);
			break;
		}

		System.out.print("nhap so tiet day trong thang");

		gvx.setSoTietDay(nhapSo());

		System.out.print("nhap he so luong");
		double y;
		while (true) {
			try {
				y = Double.parseDouble(sc.nextLine());
				gvx.setHeSoLuong(y);
				break;
			} catch (Exception e) {
				System.out.println("hay nhap so thuc");
			}
		}
		gvx.setLuong(gvx.heSoLuong * 730 + gvx.phuCap + gvx.soTietDay * 45);
		gv.add(gvx);
	}

	public void themNhanVien() {
		NhanVien nvx = new NhanVien();
		String a;
		System.out.print("nhap ten");
		String c = "([A-Z]([a-z]+ ))+";
		while (true) {

			a = sc.nextLine();
			String m = a + " ";
			if (m.matches(c)) {
				nvx.setHoTen(m);
				break;

			} else {

				System.out.println(" nhap lai");
			}

		}

		System.out.println("nhap phong ban");

		a = sc.nextLine();
		nvx.setPhongBan(a);

		System.out.print("chuc vu ( truong phong, nhan vien, pho phong)");
		while (true) {
			a = sc.nextLine();
			if (a.equals("truong phong") || a.equals("pho phong") || a.equals("nhan vien")) {
				nvx.setChucVu(a);
				break;
			} else {
				System.out.println("nhap lai");
			}
		}

		switch (nvx.getChucVu()) {
		case "nhan vien":
			nvx.setPhuCap(500);
			break;
		case "pho phong":
			nvx.setPhuCap(1000);
			break;
		case "truong phong":
			nvx.setPhuCap(2000);
			break;

		}

		System.out.print("nhap so ngay cong");
		nvx.setSoNgayCong(nhapSo());
		System.out.print("nhap he so luong");
		double y;
		y = sc.nextDouble();
		nvx.setHeSoLuong(y);
		nvx.setLuong(nvx.heSoLuong * 730 + nvx.phuCap + nvx.soNgayCong * 30);
		nv.add(nvx);
	}

	public void tongLuong() {
		double tongLuong = 0;
		for (int i = 0; i < gv.size(); i++) {
			tongLuong = tongLuong + gv.get(i).luong;
		}
		for (int j = 0; j < nv.size(); j++) {
			tongLuong = tongLuong + nv.get(j).luong;

		}
		System.out.println("Tong luong la" + tongLuong);
	}

	public int nhapSo() {
		int a = 0;
		while (true) {

			try {
				a = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Hay nhap so");
			}
		}
		return a;
	}


	public void sapXepCanBo() {

	gv.sort(new Comparator<GiangVien>() {
		@Override
		public int compare(GiangVien o1, GiangVien o2) {
			if (o1.getLuong() == o2.getLuong()) {
				return o1.getHoTen().compareTo(o2.getHoTen());
			}
			return o1.getLuong() > o2.getLuong() ? 1 : -1;
		}

	
	});
	}

	public void xuatDanhSach() {
		System.out.println("danh sach giang vien");
		for (int i = 0; i < gv.size(); i++) {
			System.out.println("Ho ten" + gv.get(i).hoTen);
			System.out.println("Khoa" + gv.get(i).khoa);
			System.out.println("Trinh do" + gv.get(i).trinhDo);
			System.out.println("So tiet day" + gv.get(i).soTietDay);
			System.out.println("He so luong" + gv.get(i).heSoLuong);
			System.out.println("luong " + gv.get(i).luong);
		}
		System.out.println("danh sach nhan vien");
		for (int j = 0; j < nv.size(); j++) {
			System.out.println("Ho ten" + nv.get(j).hoTen);
			System.out.println("Phong Ban" + nv.get(j).phongBan);
			System.out.println("Chuc vu" + nv.get(j).chucVu);
			System.out.println("so ngay cong" + nv.get(j).soNgayCong);
			System.out.println("he so luong" + nv.get(j).heSoLuong);
			System.out.println("luong " + nv.get(j).luong);
		}
	}

}
