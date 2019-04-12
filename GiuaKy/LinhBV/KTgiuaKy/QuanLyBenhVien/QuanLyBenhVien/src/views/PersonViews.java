package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.BacSy;
import model.BenhNhan;


public class PersonViews {
	
	Scanner sc =new Scanner(System.in);
	private int maBN=0;
	private int maBS=0;
	public BenhNhan addBenhNhanView() {
		System.out.println("Mời ban nhập tên");
		String ten = sc.nextLine();
		System.out.println("Mời ban nhập tuổi");
		byte age = Byte.parseByte(sc.nextLine());
		System.out.println("Mời bạn chọn giới tính");
		System.out.println("1. Nam \t 2.Nữ ");
		String sex = choseSex();
		System.out.println("Mời ban nhập CMND");
		String cmnd = sc.nextLine();
		//mã bệnh nhân tự tăng
		String maBenhNhan = maBenhNhan(maBN++);
		System.out.println("Mời ban nhập bệnh");
		String benh =sc.nextLine();
		System.out.println("Mời ban nhập phương pháp");
		String phuongPhapChuaBenh = sc.nextLine();
		System.out.println("Mời ban nhập ngày nhập viện dd/MM/yyy");
		String datein =sc.nextLine();
		Date ngayNhapVien = formatStringToDate(datein);
		System.out.println("Mời ban nhập ngày nhập viện dd/MM/yyy");
		String dateout =sc.nextLine();
		Date ngayRaVien = formatStringToDate(dateout);
		System.out.println("Mời ban nhập tiền thanh toán");
		double tienThanhToan = Double.parseDouble(sc.nextLine());
		return new BenhNhan(ten, age, sex, cmnd, maBenhNhan, benh, phuongPhapChuaBenh, ngayNhapVien, ngayRaVien, tienThanhToan);
	}
	
	public BacSy addBacSyView() {
		System.out.println("Mời ban nhập tên");
		String ten = sc.nextLine();
		System.out.println("Mời ban nhập tuổi");
		byte age = Byte.parseByte(sc.nextLine());
		System.out.println("Mời bạn chọn giới tính");
		System.out.println("1. Nam \t 2.Nữ ");
		String sex = choseSex();
		System.out.println("Mời ban nhập CMND");
		String cmnd = sc.nextLine();
		String maBacSy = maBacSy(maBS++);
		System.out.println("Mời ban nhập khoa");
		String khoa =sc.nextLine();
		System.out.println("Mời ban nhập ngày vào làm dd/MM/yyy");
		String datein =sc.nextLine();
		Date ngayVaoLam = formatStringToDate(datein);
		System.out.println("Mời ban nhập phụ cấp");
		double phuCap = Double.parseDouble(sc.nextLine());
		System.out.println("Mời ban nhập lương");
		double luong = Double.parseDouble(sc.nextLine());
		return new BacSy(ten, age, sex, cmnd, maBacSy, khoa, ngayVaoLam, luong, phuCap);
	}
	
	private String maBenhNhan(int i) {
		String ma ;
		if(i<10) {
			ma= "BN0"+i;
		}else {
			ma="BN"+i;
		}
		return ma;
	}
	
	private String maBacSy(int i) {
		String ma ;
		if(i<10) {
			ma= "BS0"+i;
		}else {
			ma="BS"+i;
		}
		return ma;
	}
	
	private String choseSex() {
		String sex = null;
		boolean check = false;
		do {
			check=false;
			int chose = Integer.parseInt(sc.nextLine());
			switch(chose) {
			case 1: 
				sex = "Nam";
				break;
			case 2:
				sex = "Nữ";
				break;
			default:
				System.out.println("Mời chọn lại");
				System.out.println("1. Nam \t 2. Nữ");
				check = true;
			}
		}while(check);
		return sex;
	}
	
	private Date formatStringToDate(String str) {
		Date date=null;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
		try {
			 date = format.parse(str);
		} catch (ParseException e) {
			System.out.println(e);
		}
		return date;
	}
	
	public void displayBenhNhan(BenhNhan benhNhan) {
		if(benhNhan==null) {
			System.out.println("Empty");
		}else {
			System.out.println(
					benhNhan.getTen()+"\t"+
					benhNhan.getAge()+"\t"+
					benhNhan.getCmnd()+"\t"+
					benhNhan.getSex()+"\t"+
					benhNhan.getMaBenhNhan()+"\t"+
					benhNhan.getPhuongPhapChuaBenh()+"\t"+
					benhNhan.getNgayNhapVien()+"\t"+
					benhNhan.getNgayRaVien()+"\t"+
					benhNhan.getTienThanhToan()
			);
		}
	}
	
	public void displayListBenhNhan(ArrayList<BenhNhan> arrBenhNhan) {
		if(arrBenhNhan.size()==0) {
			System.out.println("Empty");
		}else {
			for(BenhNhan ds : arrBenhNhan) {
				System.out.println(
						ds.getTen()+"\t"+
						ds.getAge()+"\t"+
						ds.getCmnd()+"\t"+
						ds.getSex()+"\t"+
						ds.getMaBenhNhan()+"\t"+
						ds.getPhuongPhapChuaBenh()+"\t"+
						ds.getNgayNhapVien()+"\t"+
						ds.getNgayRaVien()+"\t"+
						ds.getTienThanhToan()
						);
			}
		}
	}

	public String findBenhNhanFromMa() {
		System.out.println("Mời bạn nhập mã");
		return sc.nextLine();
		
	}
	
	public String findBenhNhanFromBenh() {
		System.out.println("Mời bạn nhập bệnh");
		return  sc.nextLine();
		
	}
	
	public void totalMoneyBenhNhanViews(double total) {
		System.out.println(total);
	}
	
	/* bác sĩ */
	
	public void displayListBacSy(ArrayList<BacSy> arrBacSy) {
		if(arrBacSy.size()==0) {
			System.out.println("Empty");
		}else {
			for(BacSy ds : arrBacSy) {
				System.out.println(
						ds.getTen()+"\t"+
						ds.getAge()+"\t"+
						ds.getCmnd()+"\t"+
						ds.getSex()+"\t"+
						ds.getMaBacSy()+"\t"+
						ds.getKhoa()+"\t"+
						ds.getNgayVaoLam()+"\t"+
						ds.getLuong()+"\t"+
						ds.getPhuCap()
						);
			}
		}
	}
	
	public String findBacSyFromKhoa() {
		System.out.println("Mời bạn nhập khoa");
		return sc.nextLine();
	}
	
	public String findBacSyFromMa() {
		System.out.println("Mời bạn nhập Mã");
		return sc.nextLine();
	}
	
	public double editBacSyViews(boolean check) {
		double phuCap=0 ;
		if(check) {
			System.out.println("Mời bạn nhập phụ cấp cần sửa ");
			phuCap = Double.parseDouble(sc.nextLine());
		}else {
			System.out.println("Ma not found");
		}
		return phuCap;
	}
	
	public int menuViews() {
		
		System.out.println("1. Thêm bệnh nhân");
		System.out.println("2. Hiển thị tất cả bệnh nhân");
		System.out.println("3. Hiển thị bệnh nhân từ mã");
		System.out.println("4. Tính Tổng tiền tất cả bệnh nhân");
		System.out.println("5. Tìm bệnh nhân có tiền nhiều nhất");
		System.out.println("6. Tìm bệnh nhân từ bệnh");
		System.out.println("<---------------------------->");
		System.out.println("7. Thêm bác sĩ");
		System.out.println("8. Hiển thị tất cả bác sỹ");
		System.out.println("9. Hiển thị bác sỹ từ khoa");
		System.out.println("10. Sửa phụ cấp bác sỹ từ mã");
		System.out.println("11. Xóa bác sỹ với mã tương ứng");
		System.out.println("12. thoát");
		return Integer.parseInt(sc.nextLine());
	}

	public void exit() {
		System.out.println("Bạn đã thoát");
		System.exit(0);
		
	}

	public void mesage() {
		System.out.println("Mời bạn nhập lại");
		
	}

	
}
