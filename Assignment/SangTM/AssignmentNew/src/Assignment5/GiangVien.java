package Assignment5;

public class GiangVien extends CanBo{
	private String khoa;
	private String trinhDo;
	private int soTietDayTrongThang;
	private int choose;
	
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	public int getSoTietDayTrongThang() {
		return soTietDayTrongThang;
	}
	public void setSoTietDayTrongThang(int soTietDayTrongThang) {
		this.soTietDayTrongThang = soTietDayTrongThang;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.print("Nhập khoa: ");
		khoa = scan.nextLine();
		do {
			System.out.print("Nhập trình độ (1 - Cử nhân, 2 - Thạc sĩ, 3 - Tiến sĩ): ");
			choose = scan.nextInt();
			switch (choose) {
			case 1:
				trinhDo = "Cử nhân";
				this.setPhuCap(300);
				break;
				
			case 2:
				trinhDo = "Thạc sĩ";
				this.setPhuCap(500);
				break;
				
			case 3:
				trinhDo = "Tiến sĩ";
				this.setPhuCap(1000);
				break;
				
			default:
				System.out.println("Nhập lại!!!");
				break;
			}
		} while (choose < 1 || choose > 3);
		System.out.print("Nhập số tiết: ");
		soTietDayTrongThang = scan.nextInt();
	}
	
	@Override
	public void xuat() {
		System.err.println("~~~Giảng viên~~~");
		super.xuat();
		System.err.println("Khoa làm việc: " + khoa);
		System.err.println("Trình độ: " + trinhDo);
		System.err.println("Phụ cấp: " + getPhuCap());
		System.err.println("Lương: " + getTinhLuong());
	}
	
	@Override
	public double getTinhLuong() {
		return (getHeSoLuong() * 730 + getPhuCap() + getSoTietDayTrongThang() * 45);
	}
}
