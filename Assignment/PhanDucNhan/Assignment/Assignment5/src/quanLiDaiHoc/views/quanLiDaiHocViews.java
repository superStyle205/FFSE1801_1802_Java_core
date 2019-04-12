package quanLiDaiHoc.views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.omg.CosNaming.NameComponent;

import quanLiDaiHoc.model.giangVien;
import quanLiDaiHoc.model.nhanVien;

public class quanLiDaiHocViews{
	private giangVien gv;
	private nhanVien nv;
	private ArrayList<Object> arr;

	public quanLiDaiHocViews() {
		gv = new giangVien();
		nv = new nhanVien();
		arr = new ArrayList<Object>();
	}

	public void menu() {
		while(true) {
			System.out.println(""
					+ "1.Nhập thông tin danh sách cán bộ trong trường. ( + 2.5 điểm )\r\n" + 
					"2.Xuất danh sách giảng viên khoa x, hoặc nhân viên phòng ban y nào đó. ( + 2.5 điểm )\r\n" + 
					"3.Tổng số lương trường phải trả cho cán bộ. ( + 2.5 điểm ) \r\n" + 
					"4.Sắp xếp cán bộ theo lương, nếu lương bằng thì sắp xếp theo tên. ( + 2.5 điểm )");
			int sc = new Scanner(System.in).nextInt();
			switch (sc) {
			case 1:
				them();
				break;
			case 2:
				xuat();
				break;
			case 3:
				System.out.println(tong());
				break;
			case 4:
				sapXet();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				break;
			}

		}
	}

	public void them() {
		while(true) {
			System.err.println("1 = Thêm giảng viên | 2 = Thêm nhân viên");
			int sc = new Scanner(System.in).nextInt();
			if(sc == 1) {
				System.out.println("= Giảng Viên =");
				System.err.println("Tên");
				gv.setTen(new Scanner(System.in).nextLine());
				System.err.println("Khoa");
				gv.setKhoa(new Scanner(System.in).nextLine());
				System.err.println("Trình độ (1. cử nhân, 2. thạc sĩ, 3. tiến sĩ");
				gv.setTrinhDo(new Scanner(System.in).nextInt());
				System.err.println("số tiết dạy trong tháng");
				gv.setSoTietDay(new Scanner(System.in).nextInt());
				System.err.println("lương");
				gv.setHeSoLuong(new Scanner(System.in).nextDouble());

				arr.add(gv);
			}else if(sc == 2){
				System.out.println("= Nhân Viên =");
				System.err.println("Tên");
				nv.setTen(new Scanner(System.in).nextLine());
				System.err.println("phòng");
				nv.setPhongBan(new Scanner(System.in).nextInt());
				System.err.println("Số ngày công");
				nv.setSoNgayCong(new Scanner(System.in).nextInt());
				System.err.println("hệ số lương");
				nv.setHeSoLuong(new Scanner(System.in).nextDouble());
				System.err.println("Chức vụ (1. truong phong | 2. pho phong | 3. nhan vien)");
				nv.setChucVu(new Scanner(System.in).nextInt());

				arr.add(nv);
			}else {
				System.out.println("Nhập sai");
			}
			System.out.println("Tiếp không ? (c/k)");
			String s = new Scanner(System.in).nextLine();
			if(s.equals("k")) {
				break;
			}
			System.out.println();
		}
	}

	public void xuat() {
		for(Object data : arr) {
			if(data instanceof giangVien) {
				System.out.println("Giảng viên");
				System.out.println(data);
			}
			if(data instanceof nhanVien) {
				System.out.println("Nhân viên");
				System.out.println(data);
			}
		}
	}

	public double tong() {
		double sumAll = 0;
		for(Object data : arr) {
			if(data instanceof giangVien) {
				sumAll += ((giangVien) data).tinhLuong();
			}
			if(data instanceof nhanVien) {
				sumAll += ((nhanVien) data).tinhLuong();
			}
		}
		return sumAll;
	}


	public void sapXet() {
		//~.~
	}



}
