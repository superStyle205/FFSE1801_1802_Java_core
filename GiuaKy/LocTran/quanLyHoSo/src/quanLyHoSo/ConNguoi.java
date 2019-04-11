package quanLyHoSo;

public class ConNguoi {
	private String Ten;
	private int Tuoi;
	private String GioiTinh;
	private int CMND;
	
	public ConNguoi(String ten, int tuoi, String gioiTinh, int cMND) {
		super();
		Ten = ten;
		Tuoi = tuoi;
		GioiTinh = gioiTinh;
		CMND = cMND;
	}

	public ConNguoi() {
		// TODO Auto-generated constructor stub
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

	public String getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}

	public int getCMND() {
		return CMND;
	}

	public void setCMND(int cMND) {
		CMND = cMND;
	}
	public void xuat(){
		System.out.println("nh?p Ten" + Ten);
		System.out.println("nh?p Ten" + Tuoi);
		System.out.println("nh?p Ten" + GioiTinh);
		System.out.println("nh?p Ten" + CMND);

		}
}
