package HoSoBenhVien;
import java.util.Scanner;
public class HoSoBenhVien {
	public static final int MAX_LENGTH = 100;
	private BenhNhan[] danhSachBenhNhan;
	private BacSy[] danhSachBacSy;
	private int size;
	private Scanner sc;
	public HoSoBenhVien() {
		danhSachBenhNhan = new BenhNhan[MAX_LENGTH];
		danhSachBacSy = new BacSy[MAX_LENGTH];
		sc = new Scanner(System.in);
	}
	public void addBN(BenhNhan benhNhan) {
		danhSachBenhNhan[size++] = benhNhan;
	}
	public void addBS(BacSy bacSy) {
		danhSachBacSy[size++] = bacSy;
	}
	public void hienThiDanhSachBenhNhan() {
		for (int i = 0; i < size; i++) {
			danhSachBenhNhan[i].xuat();
		}
	}
	public void hienThiDanhSachBacSy() {
		for (int i = 0; i < size; i++) {
			danhSachBacSy[i].xuat();
		}
	}
	public void tongTienBN(){
		double tong = 0;
		for(int i = 0; i < size; i++) {
			tong+= danhSachBenhNhan[i].getTienThanhToan();
		}
		System.out.println("Tổng số tiền của tất cả bệnh nhân là: "+tong);
	}
	public void maxTienBN(){
		double max = danhSachBenhNhan[0].getTienThanhToan();
		for(int i = 1; i < size; i++) {
			if(max < danhSachBenhNhan[i].getTienThanhToan()){
				max = danhSachBenhNhan[i].getTienThanhToan();
				System.out.println(danhSachBenhNhan[i].getTen());
			}
		}
	}
	public void timBN(){
		String nhapBenh = sc.nextLine();
		System.out.println("Các bệnh nhân bị bệnh "+nhapBenh+" là: ");
		for(int i = 0; i < size; i++) {
			if(danhSachBenhNhan[i].getBenh().equals(nhapBenh)){
				System.out.println(danhSachBenhNhan[i].getTen());
			}
		}
	}
	public BenhNhan nhapBN(){
		BenhNhan benhNhan = null;
		String ten;
		double tuoi;
		String gioiTinh;
		double CMND;
			System.out.print("Nhập tên: ");
			ten = sc.nextLine();
			System.out.print("Nhập tuổi: ");
			tuoi=Double.parseDouble(sc.nextLine());
			System.out.print("Nhập giới tính: ");
			gioiTinh=sc.nextLine();
			System.out.print("Nhập CMND: ");
			CMND=Double.parseDouble(sc.nextLine());
			System.out.print("Nhập mã: ");
			String maBenhNhan = (sc.nextLine());
			System.out.print("Nhập tên bệnh: ");
			String benh =(sc.nextLine());
			System.out.print("Nhập phương pháp chữa bệnh: ");
			String phuongPhapChuaBenh =(sc.nextLine());
			System.out.print("Nhập ngày vào viện: ");
			String ngayNhapVien =(sc.nextLine());
			System.out.print("Nhập ngày ra viện: ");
			String ngayRaVien =(sc.nextLine());
			System.out.print("Nhập viện phí: ");
			double tienThanhToan =Double.parseDouble(sc.nextLine());
			benhNhan = new BenhNhan(ten,tuoi,gioiTinh,CMND,maBenhNhan,benh,phuongPhapChuaBenh,ngayNhapVien,ngayRaVien,tienThanhToan);
			return benhNhan;
		}
	public BacSy nhapBS(){
		BacSy bacSy = null;
		String ten;
		double tuoi;
		String gioiTinh;
		double CMND;
			System.out.print("Thêm Mới Nhân Viên: ");
			ten = sc.nextLine();
			System.out.print("Nhập tuổi: ");
			tuoi=Double.parseDouble(sc.nextLine());
			System.out.print("Nhập giới tính: ");
			gioiTinh=sc.nextLine();
			System.out.print("Nhập CMND: ");
			CMND=Double.parseDouble(sc.nextLine());
			System.out.print("Nhập mã: ");
			String maBacSy = (sc.nextLine());
			System.out.print("Nhập khoa: ");
			String khoa =(sc.nextLine());
			System.out.print("Nhập ngày bắt đầu vào làm: ");
			String ngayBatDauVaoLam =(sc.nextLine());
			System.out.print("Nhập lương: ");
			double luong =Double.parseDouble(sc.nextLine());
			System.out.print("Nhập phụ cấp: ");
			double phuCap =Double.parseDouble(sc.nextLine());
			bacSy = new BacSy(ten,tuoi,gioiTinh,CMND,maBacSy,khoa,ngayBatDauVaoLam,luong,phuCap);
			return bacSy;
		}
	public void traMaBN(){
		String ma = sc.nextLine();
		for(int i=0;i < size;i++){
			if (danhSachBenhNhan[i].getMaBenhNhan().equals("ma")) {
				danhSachBenhNhan[i].xuat();
			}
		}
	}
	public void traKhoaBS(){
		String khoaNganh = sc.nextLine();
		for(int i=0;i<size;i++){
			if (danhSachBacSy[i].getMaBacSy().equals("ma")) {
				danhSachBacSy[i].xuat();
			}
		}
	}
	public void thayDoiPhuCap() {
		String maBS = sc.nextLine();
		System.out.println("Nhập mã bác sỹ cần thay đổi phụ cấp: ");
		for (int i = 0; i < size; i++) {
			if(danhSachBacSy[i].getMaBacSy().equals(maBS)){
				System.out.println("Nhập phụ cấp mới: ");
				danhSachBacSy[i].setPhuCap(Double.parseDouble(sc.nextLine()));
			}
		}
	}
	public void xoaBS() {
		String maBS = sc.nextLine();
		for (int i = 0; i < size; i++) {
			if(danhSachBacSy[i].getMaBacSy().equals(maBS)){
			for(int j=i; j<size-1;j++) {
				danhSachBacSy[j] = danhSachBacSy[j+1];
				size--;
				}
			}
		}
	}
	public void menu(){
		while (true) {
			System.out.println(
					 "1/ Thêm mới hồ sơ bệnh nhân \n"
					+"2/ Hiển thị thông tin tất cả bệnh nhân \n"
					+"3/ Hiển thị hồ sơ của bệnh nhân với mã bệnh nhân nhập từ bàn phím \n"
					+"4/ Tính tổng các số tiền của tất cả bệnh nhân \n"
					+"5/ Tìm bệnh nhân có tiền trả nhiều nhất \n"
					+"6/ TÌm các bệnh nhân có bệnh tương ứng nhập từ bàn phím \n"
					+"7/ Thêm mới nhân viên \n"
					+"8/ Hiển thị tất cả bác sỹ \n"
					+"9/ Hiển thị bác sỹ với khoa tương ứng nhập từ bàn phím \n"
					+"10/ Sửa phụ cấp cho bác sỹ tương ứng với mã bác sỹ nhập từ bàn phím \n"
					+"11/ Xóa bác sỹ với mã tương ứng");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				BenhNhan benhNhan=nhapBN();
				addBN(benhNhan);
				break;
			case 2:
				hienThiDanhSachBenhNhan();
				break;
			case 3:
				traMaBN();
				break;
			case 4:
				tongTienBN();
				break;
			case 5:
				maxTienBN();
				break;
			case 6:
				timBN();
				break;
			case 7:
				BacSy bacSy=nhapBS();
				addBS(bacSy);
				break;
			case 8:
				hienThiDanhSachBacSy();
				break;
			case 9:
				traKhoaBS();
				break;
			case 10:
				thayDoiPhuCap();
				break;
			case 11:
				xoaBS();
				break;
			default:
				System.out.println("Chức năng bạn nhập không hợp lệ");
			}
		}
	}
	public static void main(String[] args) {
		HoSoBenhVien hoSoBenhVien = new HoSoBenhVien();
		hoSoBenhVien.menu();
	}
}
