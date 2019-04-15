package quanLiHoSo;

import java.util.Scanner;

import java.util.ArrayList;

public class QuanLi {
  
	private  ArrayList<ConNguoi> listConNguoi;
    private Scanner scanner;

    
//    -------------------------------------------------
	public QuanLi() {
		listConNguoi = new ArrayList<ConNguoi>();
		
		scanner = new Scanner(System.in);
	}
	
	
//	1 them con nguoi ..................................
	public void addConNguoi( ConNguoi conNguoi) {
		listConNguoi.add(conNguoi);
	}
	
	
//	2hien thị con nguoi.-----------------------------
	public void hienThiConNguoi() {
		for (int i = 0; i < listConNguoi.size(); i++) {			
			listConNguoi.get(i).xuat();
		}
	}
//3 hiện thị thông tin bệnh nhân ........................
	
	 public void hienThiBenhNhan(){
			for( ConNguoi benhNhan : listConNguoi){
				
				 if(benhNhan instanceof ConNguoi) {
					 benhNhan .xuat();	
				 }
			}
		}
	 
//4 hiển thị thông tin bệnh nhân nhập từ bàn phím :
	
	 public void hienThiBenhNhankeys( String maBN) {
		System.out.println("nhập mã bệnh nhân cần tìm : ");
		 maBN = scanner.nextLine();	 
		 for(ConNguoi benhNhan : listConNguoi) {
			 if(benhNhan.getId().equals(maBN)) {
				 benhNhan.xuat();	
			 }
		 }
	 }
	 
// 5 hiển thị bác sĩ :
	 
	 public void hienThiNV() {
		 for(ConNguoi nhanVien : listConNguoi) {
			 if(nhanVien instanceof ConNguoi) {
				 nhanVien.xuat();
			 }
		 }	
	 }


//6 tổng tiền tấc cả bệnh nhân.................................................
	public void sumTienBN() {
		double sum = 0;
		for(ConNguoi conNguoi : listConNguoi) {
			if(conNguoi instanceof ConNguoi) {
				sum += ((BenhNhan) conNguoi).getTien();			
			}
		}
	}
//8  tìm bệnh nhân có tổng tiền max: 
	public void maxSum() {
		double max = ((BenhNhan) (listConNguoi.get(0))).getTien();
		for(ConNguoi conNguoi : listConNguoi) {
			if (max < ((BenhNhan) conNguoi).getTien()) {
				max = ((BenhNhan) conNguoi).getTien() ;
				((BenhNhan) conNguoi).xuat();
			}
		}
		
	}
//	9 xóa nhân viên
	public void deleteNV(String maNV) {
		System.out.println("nhập mã nhân viên");
		maNV =  scanner.nextLine(); 
		String postion = findMaNV(maNV);
		if( postion == null) {
			System.out.println(" mã  bác sĩ k tìm thấy :");
		} else {
			listConNguoi.remove(postion);
		}
	}
//	tìm id nhân viên :
	private String findMaNV(String maNV) {
		for(ConNguoi conNguoi :listConNguoi) {
			if (conNguoi instanceof NhanVien && ((NhanVien) conNguoi).getId() .equals(maNV));
			return maNV;
		}
		return null;
}


	public ConNguoi nhapConNguoi() {
		ConNguoi conNguoi = null;
		int id;
		String name;
		String cmnd ;
		int age;
		String gioiTinh;
		System.out.println("Chon 1 nhap nhân viên| 2 nhap bệnh nhân : ");
		int chooseInput = Integer.parseInt(scanner.nextLine());
		
		switch (chooseInput) {
		case 1:
			System.out.print("nhap id : ");
		    id = Integer.parseInt(scanner.nextLine());
			System.out.print("nhap ten : ");
			name = scanner.nextLine();
			System.out.print("nhap cmnd : ");
			cmnd = scanner.nextLine();
			System.out.print("nhap tuổi : ");
			age = Integer.parseInt(scanner.nextLine());
			System.out.print("nhap giới tính : ");
			gioiTinh = scanner.nextLine();
			
			System.out.print("nhap mã bệnh nhân: ");
			String maBN = scanner.nextLine();
			System.out.print("nhap bệnh: ");
			String benh = scanner.nextLine();
			System.out.print("phương pháp chữa : "); 
			String pPChua = scanner.nextLine();
			System.out.print("ngày nhập viện ");
			String ngayNhapVien = scanner.nextLine();
			System.out.print("ngày ra viện ");
			String ngayRaVien = scanner.nextLine();
			double tien =Double.parseDouble(scanner.nextLine());		
			conNguoi = new BenhNhan(cmnd, name, id, age, gioiTinh, maBN, benh, pPChua, ngayNhapVien, ngayRaVien, tien);
		case 2:
			System.out.print("nhap id : ");
			id = Integer.parseInt(scanner.nextLine());
			System.out.print("nhap ten : ");
			name = scanner.nextLine();
			System.out.print("nhap cmnd : ");
			cmnd = scanner.nextLine();
			System.out.print("nhap tuổi : ");
			age = Integer.parseInt(scanner.nextLine());
			
			System.out.print("nhap giới tính : ");
			gioiTinh = scanner.nextLine();
			System.out.println("mã khoa : "); 
			String maNV = scanner.nextLine();
			System.out.println("khoa :  ");
			String khoa =scanner.nextLine();
			System.out.println("ngày  bắt đầu làm : ");
			String ngayBatDauLam = scanner.nextLine();
			System.out.println("lương :");
			double luong =Double.parseDouble(scanner.nextLine());		
			System.out.println("phu cấp :");
			double phuCap =Double.parseDouble(scanner.nextLine());
			conNguoi = new NhanVien(cmnd, name, id, age, gioiTinh, maNV, khoa, ngayBatDauLam, luong, phuCap);
			break;
	}
		return conNguoi;
		

    }
	public  void menu() {
		int chooseMenu;
		while (true) {
//			System.out.println("1. nhập danh sách sinh viên");
//			System.out.println("2. hiển thị danh sách sinh viên");
//			System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
//			System.out.println("4.sắp xếp sinh viên");
//			System.out.println("5. thoát");
			chooseMenu = Integer.parseInt(scanner.nextLine());
			switch (chooseMenu) {
				case 1:
					ConNguoi conNguoi = nhapConNguoi();
					addConNguoi(conNguoi);
					break;
				case 2:
					hienThiConNguoi();
					break;
				case 3:
					hienThiBenhNhan();
					break;
				case 4:
					hienThiBenhNhankeys(null);
					break;
					
				case 5:
					hienThiNV();
					break;
					
				case 6:
					sumTienBN();
					break;
					
				case 7:
					maxSum();
					break;
					
				case 8:
					deleteNV(null);
					break;
						
				case 9:
					findMaNV(null);
					break;
				case 11:
					System.out.println("tam biet");
					System.exit(0);
					break;
				default:
					System.out.println("khong ton tai tinh nang nay");
					break;
			}
		}
	}
	public static void main(String[] args) {
		QuanLi quanLi = new QuanLi();
		quanLi.menu();
	}
}
