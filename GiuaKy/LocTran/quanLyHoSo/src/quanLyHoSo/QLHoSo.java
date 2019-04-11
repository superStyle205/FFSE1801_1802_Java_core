package quanLyHoSo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class QLHoSo {
	
	private static final String ngayRaVien = null;
	Scanner scan = new Scanner(System.in);
	ArrayList<BenhNhan> benhNhan = new ArrayList();
	private double sum;
		
		


		/// 1. Thêm mới hồ sơ bệnh nhân

		public void quanLyHoSoBenhNhan(){
			BenhNhan bn = new BenhNhan();

			System.out.println("Nhập tên bệnh nhân: ");
			String ten = scan.nextLine();
			System.out.println("Nhập tuổi: ");
			int tuoi = Integer.parseInt(scan.nextLine());
			System.out.println("Nhập giới tính: ");
			String GioiTinh = scan.nextLine();
			System.out.println("Nhập số cmnd: ");
			int cmnd = Integer.parseInt(scan.nextLine());
			System.out.println("Nhập mã bệnh nhân: ");
			String idBenhNhan = scan.nextLine();
			System.out.println("Nhập bệnh:");
			String benh = scan.nextLine();
			System.out.println("Nhập phương pháp chữa bệnh:");
			String PhuongPhapChuaBenh = scan.nextLine();
			System.out.println("Ngày Nhập viện:");
			String nhapVien = scan.nextLine();
			System.out.println("Ngày xuất viện:");
			String ngayRaVien = scan.nextLine();
			System.out.println("Tiền thanh toán:");
			double tienThanhToan = Double.parseDouble(scan.nextLine());
			bn.setTen(ten);
			bn.setTuoi(tuoi);
			bn.setGioiTinh(GioiTinh);
			bn.setBenh(benh);
			bn.setCMND(cmnd);
			bn.setIdBenhNhan(idBenhNhan);
			bn.setPhuongPhapChuaBenh(PhuongPhapChuaBenh);
			bn.setNgayNhapVien(nhapVien);
			bn.setNgayRaVien(ngayRaVien);
			bn.setTienThanhToan(tienThanhToan);
			benhNhan.add(bn);
		}
	
	//2. hiển thị thông tin
	public void hienThi(){
		for (int i = 0; i < benhNhan.size()-1;i++){
			benhNhan.get(i).xuat();		
		}
	}
	
	//3.hiển thị Thông tin bệnh nhân nhập từ bàn phím
	
	public void hienThiBenhNhanVoiMaId(){
		System.out.println("Nhập mã id: ");
		int ma = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < benhNhan.size(); i++){
		if( benhNhan.get(i).getIdBenhNhan().equals(ma)){
			System.out.println("Thông tin bệnh nhân là: " + benhNhan.get(i).toString());
			} else {
				System.out.println("Không có thông tin bệnh nhân.");
				}
		}
	}
	/// 4. Tính tổng số tiền của tất cả các bệnh nhân:

	public void tongTienCuaBenhNhan(){
		sum = 0;
		for(int i = 0; i < benhNhan.size(); i++){
		sum += benhNhan.get(i).getTienThanhToan();
		System.out.println("Tổng tiền là: " + benhNhan.get(i).toString());
		}
	}

	/// 5. Bệnh nhân có tiền trả nhiều nhất:

	public void tienBenhNhanNhieuNhat() {
		Collections.sort(benhNhan, new Comparator<BenhNhan>(){
		public int compare(BenhNhan bn1, BenhNhan bn2){
			if( bn1.getTienThanhToan() < bn2.getTienThanhToan()){
			return 1;	
			} else {
				if(bn1.getTienThanhToan() == bn2.getTienThanhToan()){
					return 0;
					} else {
					return -1;
					}
				}
			}
		});
		System.out.println("Benh nhan co tien tra cao nhat la:");
		benhNhan.get(benhNhan.size() - 1).toString();
	}
	/// 6. Tìm các bệnh nhân có bệnh tương ứng:

	public void benhTuongUng(){
		System.out.println("Nhap benh:");
		String benh = scan.nextLine();
		
		for (int i = 0; i < benhNhan.size(); i++){
		if (benh == benhNhan.get(i).getBenh()){
			System.out.println("Benh trung nhau: " + benhNhan.get(i).toString());
			}
		}
	}
//7.thêm bác sỹ
	ArrayList<BacSy> nhanVien = new ArrayList<BacSy>();
	
	public void themNhanVien(){
		BacSy bacSy = new BacSy();
		
		System.out.println("Nhập tên bệnh nhân: ");
		String ten = scan.nextLine();
		System.out.println("Nhập tuổi: ");
		int tuoi = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập giới tính: ");
		String GioiTinh = scan.nextLine();
		System.out.println("Nhập số cmnd: ");
		int cmnd = Integer.parseInt(scan.nextLine());
		System.out.println("Ma bac sy:");
		String IdBacSy = scan.nextLine();
		System.out.println("Khoa:");
		String Khoa = scan.nextLine();
		System.out.println("Ngay vao lam:");
		String day = scan.nextLine();
		System.out.println("Luong");
		double Luong = Double.parseDouble(scan.nextLine());
		System.out.println("phu cap:");
		double phuCap = Double.parseDouble(scan.nextLine());
		nhanVien.add(bacSy);
		bacSy.setTen(ten);
		bacSy.setCMND(cmnd);
		bacSy.setTuoi(tuoi);
		bacSy.setGioiTinh(GioiTinh);
		bacSy.setIdBacSy(IdBacSy);
		bacSy.setKhoa(Khoa);
		bacSy.setNgayVaoLam(day);
		bacSy.setPhuCap(phuCap);
		bacSy.setLuong(Luong);
	}
	/// 8. Hiển thị bác sỹ:

	public void hienThiBacSy(){
		for(int i = 0; i < nhanVien.size(); i++){
			System.out.println(nhanVien.get(i).toString());
			}
		}
	// 9. Hiển thị bác sỹ với khoa tương ứng nhập từ bàn phím:

	public void hienThiKhoa(){
		System.out.println("Nhập khoa:");
		String khoa = scan.nextLine();
		
		for (int i = 0; i < nhanVien.size(); i++){
			if(khoa == nhanVien.get(i).getKhoa()){
				System.out.println(nhanVien.get(i).toString());
				} else {
					System.out.println("Khong co nhan vien nao");
					}
			}	
	}
	
	// 10. Sửa phụ cấp bác sỹ với mã tương ứng bác sỹ nhập từ bàn phím:

	public void suaPhuCap(){
		System.out.println("Nhap ma:");
		int ma1 = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < nhanVien.size(); i++){
			if( nhanVien.get(i).getIdBacSy().equals(ma1)){
			nhanVien.get(i).toString();
			System.out.println("Nhap phu cap thay doi:");
			nhanVien.get(i).setPhuCap(scan.nextDouble());
			}
		}
	}
	// 11. Xóa bác sỹ với mã tương ứng

	public void xoaBacSy(){
		
			
			System.out.println("Nhap ma can xoa:");
			String x = scan.nextLine();
			
			for (int i = 0; i < nhanVien.size(); i++) {
				if(nhanVien.get(i).getIdBacSy().equals(x)) {
					nhanVien.remove(i);
				}
				System.out.println(nhanVien.get(i).toString());
			}
		
	}

}
