package asm6;

public class GiangVien extends ConNguoi{
	
	private String khoa;
	private int soTietTrongThang;
	private String trinhDo;

	
	
	public GiangVien(int id, String name, double heSoLuong,String khoa, int soTietTrongThang, String trinhDo) {
	
		this.khoa = khoa;
		this.soTietTrongThang = soTietTrongThang;
		this.trinhDo = trinhDo;
	}

	public String getKhoa() {
		return khoa;
	}


	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public int getSoTietTrongThang() {
		return soTietTrongThang;
	}


	public void setSoTietTrongThang(int soTietTrongThang) {
		this.soTietTrongThang = soTietTrongThang;
	}


	public String getTrinhDo() {
		return trinhDo;
	}


	public GiangVien() {
		
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	
	public double getPhuCap() {
		
		if(getTrinhDo().equals("tien si")) {
			return 1000;
		
			} else if (getTrinhDo().equals("thac si")) {
			return 500;
			
			} else if(getTrinhDo().equals("cu nhan")){
			return  300;
			}
			return 0;
		}
	public double getLuong() {
		return getHeSoLuong()*730 + getPhuCap()+ soTietTrongThang * 30;
	}


	
	
	
}