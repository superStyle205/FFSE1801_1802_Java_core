package Assignment6;

public class NhanVienHanhChinh extends ConNguoi{

		private String phongBan;
		
		private int soNgayCong;
		
		private String chucVu;
		
		public NhanVienHanhChinh() {
			
		}
		

		public NhanVienHanhChinh(String id,String hoTen, double heSoLuong, String phongBan, int soNgayCong, String chucVu) {
			super(id,hoTen, heSoLuong);
			this.phongBan = phongBan;
			this.soNgayCong = soNgayCong;
			this.chucVu = chucVu;
		}


		public String getPhongBan() {
			return phongBan;
		}


		public void setPhongBan(String phongBan) {
			this.phongBan = phongBan;
		}


		public int getSoNgayCong() {
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
		
		public double getPhuCap() {
			if (getChucVu().equals("TP")) {
				return 2000;
			} else if (getChucVu().equals("PP")) {
				return 1000;
			} else if (getChucVu().equals("NV")) {
				return 500;
			}
			return 0;
		}
		
		public double getLuong() {
			return (getHeSoLuong() * 730) +  getPhuCap() + (getSoNgayCong() * 30);
		}
		
		@Override
		public String toString() {
			
			return super.toString() + "\n Phòng ban: " + phongBan + "\n Phụ cấp: " + getPhuCap() + "\n Số ngày công: " + soNgayCong + "\n Chức vụ: " + chucVu
					+ "\n TỔNG LƯƠNG: " + getLuong();
		}
}
