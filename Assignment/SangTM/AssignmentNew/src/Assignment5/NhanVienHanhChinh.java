package Assignment5;

public class NhanVienHanhChinh extends CanBo{
	private String phongBan;
	private int soNgayCong;
	private int choose;
	private String chucVu;
	
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public double getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.print("Nhập phòng ban: ");
		phongBan = scan.nextLine();
		do {
			System.out.print("Nhập chức vụ (1 - Trưởng phòng, 2 - Phó phòng, 3 - Nhân viên): ");
			choose = scan.nextInt();
			switch (choose) {
			case 1:
				chucVu = "Trưởng phòng";
				this.setPhuCap(2000);
				break;
				
			case 2:
				chucVu = "Phó phòng";
				this.setPhuCap(1000);
				break;
				
			case 3:
				chucVu = "Nhân viên";
				this.setPhuCap(500);
				break;

			default:
				System.out.println("Nhập lại!!!");
				break;
			}
		} while (choose < 1 || choose > 3);
		System.out.print("Nhập số ngày công: ");
		soNgayCong = scan.nextInt();
	}
	
	@Override
	public void xuat() {
		System.err.println("~~~Nhân viên~~~");
		super.xuat();
		System.err.println("Phòng ban: " + phongBan);
		System.err.println("Chức vụ: " + chucVu);
		System.err.println("Số ngày công: " + soNgayCong);
		System.err.println("Phụ cấp: " + getPhuCap());
		System.err.println("Lương: " + getTinhLuong());
	}
	
	@Override
	public double getTinhLuong() {
		return (getHeSoLuong() * 730+ getPhuCap() + getSoNgayCong() * 30);
	}
}
