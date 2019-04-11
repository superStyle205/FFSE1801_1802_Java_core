package Lab4Bai1;

abstract public class NhanVien {
	private String hoTen;
	private double luong;
	private String tenJob;
	
	abstract public double ThuNhap();
	public NhanVien() {
		this.hoTen = "Chưa có tên";
		this.luong = 0;
	}
	
	public String getTenJob() {
		return tenJob;
	}

	public void setTenJob(String tenJob) {
		this.tenJob = tenJob;
	}

	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	public void showInfo() {
		System.out.printf("-------- %s --------- \n",getTenJob());
		System.out.println("Tên \t\t:" + this.getHoTen());
		System.out.println("Lương \t\t:" + this.getLuong());
	}
}
