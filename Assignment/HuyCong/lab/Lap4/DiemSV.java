package Lap4;

public class DiemSV extends SVFPT{
	private double diem;

	
	public DiemSV() {
		
	}
	
	public DiemSV(String hoTen, String nganh, double diem) {
		super(hoTen, nganh);
		this.diem = diem;
	}
	
	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	
	
	
	public String getHocLuc() {
		return setHocLuc();
	}
	
	
	public String setHocLuc() {
		if (getDiem() < 5) {
			return "Yeu";
		} else if (getDiem() > 5 && getDiem() <= 6.5 ) {
			return "Trung binh";
		} else if (getDiem() > 6.5 && getDiem() <= 8) {
			return "kha";
		} else if (getDiem() > 8 && getDiem() <= 10) {
			return "Gioi";
		} 
		return null;
			
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Diem: " + getDiem());
		System.out.println("Hoc luc: " + getHocLuc());
	}
}
