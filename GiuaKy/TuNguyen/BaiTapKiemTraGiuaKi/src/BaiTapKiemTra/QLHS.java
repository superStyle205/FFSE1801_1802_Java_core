package BaiTapKiemTra;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	Scanner scan = new Scanner(System.in);
	
	// Benh Nhan
	
	ArrayList<BenhNhan> benhNhan = new ArrayList();
	
	// 1. Nhsp thong tin benh nhan:
	
	public void nhapThongTinBenhNhan() {
		BenhNhan bn = new BenhNhan();
		
		System.out.println("Nhap ten:");
		bn.setTen(scan.nextLine());
		System.out.println("Nhap tuoi:");
		bn.setTuoi(Integer.parseInt(scan.nextLine()));
		System.out.println("Nhap Gioi tinh:");
		bn.setGioiTinh(scan.nextLine());
		System.out.println("Nhap so cmnd:");
		bn.setCmnd(Integer.parseInt(scan.nextLine()));
		System.out.println("Ma benh nhan:");
		bn.setMaBenhNhan(scan.nextLine());
		System.out.println("Benh:");
		bn.setBenh(scan.nextLine());
		System.out.println("Phuong phap chua benh:");
		bn.setPhuongPhapChuaBenh(scan.nextLine());
		System.out.println("Ngay nhap vien:");
		bn.setNgayNhapvien(scan.nextLine());
		System.out.println("Ngay ra vien:");
		bn.setNgayRaVien(scan.nextLine());
		System.out.println("Tien thanh toan:");
		bn.setTienThanhToan(Double.parseDouble(scan.nextLine()));
		
		
		benhNhan.add(bn);
	}
	
	// 2. hien thi thong tin benh nhan:
	
	public void hienThiThongTinBenhNhan() {
		for (int i = 0; i < benhNhan.size(); i++) {
			System.out.println(benhNhan.get(i).toString());
		}
	}
	
	// 3. Hien thi ho so benh nhan voi thong tin nhap id tu ban phim:
	
	public void hienThiThongTinBangId() {
		System.out.println("Nhap ma benh nhan:");
		String id = scan.nextLine();
		
		for (int i = 0; i < benhNhan.size(); i++) {
			if (id.equals(benhNhan.get(i).getMaBenhNhan())) {
				System.out.println(benhNhan.get(i));
			} else {
				System.out.println("Khong tim thay benh nhan");
			}
		}
	}
	
	// 4. Tinh tong cac so tien cua tat ca benh nhan:
	
	public void tongTienBenhNhan() {
		int sum = 0;
		for (int i = 0; i < benhNhan.size(); i++) {
			sum += benhNhan.get(i).getTienThanhToan();
		}
		System.out.println("Tong tien cua benh nhan la: " + sum);
	}
	
	// 5.Tim benh nhan co tien tra nhieu nhat:
	
	public void tienBenhNhanNhieuNhat() {
		
		double max = benhNhan.get(0).getTienThanhToan();
		int ii = 0;
		for(int i = 1; i < benhNhan.size(); i++) {
			if(benhNhan.get(i).getTienThanhToan() > max) {
				max = benhNhan.get(i).getTienThanhToan();
				ii = i;
			}
		}
		System.out.println(benhNhan.get(ii));
	}

	/// 6. Tìm các bệnh nhân có bệnh tương ứng:

	public void benhTuongUng(){
		System.out.println("Nhap benh:");
		String benh = scan.nextLine();
		
		for (int i = 0; i < benhNhan.size(); i++){
		if (benh.equals(benhNhan.get(i).getBenh())){
			System.out.println("Benh trung nhau: " + benhNhan.get(i));
			}
		}
	}
	
	/// Bệnh nhân:

		ArrayList<BacSy> nhanVien = new ArrayList();

		/// 7. Thêm mới nhân viên:

		public void themNhanVien(){
			BacSy nv = new BacSy();
			
			System.out.println("Ten:");
			String ten = scan.nextLine();
			System.out.println("Tuoi:");
			int tuoi = Integer.parseInt(scan.nextLine());
			System.out.println("gioi tinh:");
			String sex = scan.nextLine();
			System.out.println("Cmnd:");
			int cmnd= Integer.parseInt(scan.nextLine());
			System.out.println("Ma bac sy:");
			String ma = scan.nextLine();
			System.out.println("Khoa:");
			String khoa = scan.nextLine();
			System.out.println("Ngay vao lam:");
			String day = scan.nextLine();
			System.out.println("Luong");
			double luong = Double.parseDouble(scan.nextLine());
			System.out.println("phu cap:");
			double phuCap = Double.parseDouble(scan.nextLine());
			nv.setTen(ten);
			nv.setTuoi(tuoi);
			nv.setGioiTinh(sex);
			nv.setCmnd(cmnd);
			nv.setMaBacSy(ma);
			nv.setKhoa(khoa);
			nv.setNgayLamDau(day);
			nv.setLuong(luong);
			nv.setPhuCap(phuCap);
			nhanVien.add(nv);
			
		}

		/// 8. Hiển thị bác sỹ:

		public void hienThiBacSy(){
			for(int i = 0; i < nhanVien.size(); i++){
				System.out.println(nhanVien.get(i).toString());
				}
			}

		/// 9. Hiển thị bác sỹ với khoa tương ứng nhập từ bàn phím:

		public void hienThiKhoa(){
			System.out.println("Nhập khoa:");
			String khoa = scan.nextLine();
			
			for (int i = 0; i < nhanVien.size(); i++){
				if(khoa.equals(nhanVien.get(i).getKhoa())){
					System.out.println(nhanVien.get(i).toString());
					} else {
						System.out.println("Khong co nhan vien nao");
						}
				}	
		}

		/// 10. Sửa phụ cấp bác sỹ với mã tương ứng bác sỹ nhập từ bàn phím:

		public void suaPhuCap(){
			System.out.println("Nhap ma:");
			String ma = scan.nextLine();
			
			for(int i = 0; i < nhanVien.size(); i++){
				if(ma.equals(nhanVien.get(i).getMaBacSy())){
			nhanVien.get(i).toString();
				System.out.println("Nhap phu cap thay doi:");
			nhanVien.get(i).setPhuCap(scan.nextDouble());
				}
			}
		}


		/// 11. Xóa bác sỹ với mã tương ứng

		public void xoaBacSy(){
			
				
				System.out.println("Nhap ma can xoa:");
				String x = scan.nextLine();
				
				for (int i = 0; i < nhanVien.size(); i++) {
					if(nhanVien.get(i).getMaBacSy().equals(x)) {
						nhanVien.remove(i);
					}
					System.out.println(nhanVien.get(i).toString());
				}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
