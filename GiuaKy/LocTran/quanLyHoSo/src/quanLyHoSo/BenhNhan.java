package quanLyHoSo;
	public class BenhNhan extends ConNguoi {
		private String IdBenhNhan;
		private String Benh;
		private String PhuongPhapChuaBenh;
		private String NgayNhapVien;
		private String NgayRaVien;
		private double TienThanhToan;

	public BenhNhan() {
		
	}
		public BenhNhan(String ten, int tuoi, String gioiTinh, int cMND, String idBenhNhan, String benh,
				String phuongPhapChuaBenh, String ngayNhapVien, String ngayRaVien, double tienThanhToan) {
			super(ten, tuoi, gioiTinh, cMND);
			IdBenhNhan = idBenhNhan;
			Benh = benh;
			PhuongPhapChuaBenh = phuongPhapChuaBenh;
			NgayNhapVien = ngayNhapVien;
			NgayRaVien = ngayRaVien;
			TienThanhToan = tienThanhToan;
		}

		
		public String getIdBenhNhan() {
			return IdBenhNhan;
		}
		public void setIdBenhNhan(String idBenhNhan) {
			IdBenhNhan = idBenhNhan;
		}
		public String getBenh() {
			return Benh;
		}
		public void setBenh(String benh) {
			Benh = benh;
		}
		public String getPhuongPhapChuaBenh() {
			return PhuongPhapChuaBenh;
		}
		public void setPhuongPhapChuaBenh(String phuongPhapChuaBenh) {
			PhuongPhapChuaBenh = phuongPhapChuaBenh;
		}
		public String getNgayNhapVien() {
			return NgayNhapVien;
		}
		public void setNgayNhapVien(String ngayNhapVien) {
			NgayNhapVien = ngayNhapVien;
		}
		public String getNgayRaVien() {
			return NgayRaVien;
		}
		public void setNgayRaVien(String ngayRaVien) {
			NgayRaVien = ngayRaVien;
		}
		public double getTienThanhToan() {
			return TienThanhToan;
		}
		public void setTienThanhToan(double tienThanhToan) {
			TienThanhToan = tienThanhToan;
		}
		@Override
		public void xuat(){
		super.xuat();
		System.out.println("ma benh nhan: " + IdBenhNhan );
		System.out.println("Benh: " + Benh );
		System.out.println("Phuong Phap Chua Benh : " + PhuongPhapChuaBenh);
		System.out.println("Ngay nhap vien : " + NgayNhapVien);
		System.out.println("ngay ra vien : " + NgayRaVien);
		System.out.println("Thanh Toan : " + TienThanhToan);
		}
		
	}

