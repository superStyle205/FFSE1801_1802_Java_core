package baiTap2.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class function_baiTap2 {
	private ArrayList<khachSan> ks;

	public ArrayList<khachSan> getKh() {
		return ks;
	}

	public void setKh(ArrayList<khachSan> kh) {
		this.ks = kh;
	}

	public function_baiTap2(ArrayList<khachSan> kh) {
		super();
		this.ks = kh;
	}

	public function_baiTap2() {
		super();
		ks = new ArrayList<>();
	}
	
	public void println() {
		for(khachSan data : ks) {
			System.out.println(data);
		}
	}
	
	public void add(khachSan e) {
		ks.add(e);
	}
	
	public String look(int cmnd) {
		for(khachSan data : ks) {
			if(data.getNguoi().getCmnd() == cmnd) {
				return "Kq: " + data;
			}
		}
		return "ERROR";
	}
	
	public String sum(int cmnd) {
		for(khachSan data : ks) {
			if(data.getNguoi().getCmnd() == cmnd) {
				return "Money: " + (data.getGiaP() * data.getSoNgay());
			}
		}
		return "Error";
	}

	public Date chuyenStringDate(String str) { 
		Date ns=null; 
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 
		try { 
			ns=sdf.parse(str); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ns;
	}
	
	public void add_kh() {
		while(true) {
			khachSan kh = new khachSan();
			Nguoi nguoi = new Nguoi();
			System.out.println("Họ và tên");
			nguoi.setHoTen(new Scanner(System.in).nextLine());
			System.out.println("Ngày sinh ( dd/MM/YYYY, Ex: 12/12/2000)");
			nguoi.setNgaySinh(chuyenStringDate(new Scanner(System.in).nextLine()));
			System.out.println("Chứng minh");
			nguoi.setCmnd(new Scanner(System.in).nextInt());
			
			kh.setNguoi(nguoi);
			
			System.out.println("Số ngày");
			kh.setSoNgay(new Scanner(System.in).nextInt());
			System.out.println("Loại phòng");
			kh.setLoaiP(new Scanner(System.in).nextLine());
			System.out.println("Giá");
			kh.setGiaP(new Scanner(System.in).nextDouble());
			
			ks.add(kh);
			
			System.out.println("Tiếp không (c/k");
			String check = new Scanner(System.in).nextLine();
			if(check.equals("k")) {
				break;
			}
		}
	}
	
	public void menu() {
		while(true) {
			System.out.println("1. NHẬP\r\n" + 
					"2. XUẤT\r\n" + 
					"3. TÌM\r\n" + 
					"4. TÍNH TIỀN\r\n" + 
					"5. THOÁT"
					+ "Chọn gì ?");
			int check = new Scanner(System.in).nextInt();
			
			switch (check) {
			case 1:
				add_kh();
				break;
			case 2:
				println();
				break;
			case 3:
				System.out.println("Nhập CMND để tìm");
				int cmnd = new Scanner(System.in).nextInt();
				System.out.println(look(cmnd));
				break;
			case 4:
				System.out.println("Nhập CMND để tính tiền phòng");
				int cmnd_sum = new Scanner(System.in).nextInt();
				System.out.println(sum(cmnd_sum));
				break;
			case 5:
				System.err.println("Thanks");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	
	
	
}
