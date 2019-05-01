package quanLi;

public class SinhVien {
	

		private	String hoTen;
		private String lop;
		private int tuoi;
		private int maSV; 
		private String ngaySinh;
		private float diemToan;
		private float diemLy;
		private float diemHoa;
		private float diemAnh;

		
		
		public SinhVien() {
			super();
		}
		public SinhVien(int maSV, String hoTen, String lop, String ngaySinh, float diemToan,
		        float diemLy, float diemHoa, float diemAnh) {
			this.maSV = maSV;
		    this.hoTen = hoTen;
		    this.lop = lop;
		    this.ngaySinh = ngaySinh;
		    this.diemToan = diemToan;
		    this.diemLy = diemLy;
		    this.diemHoa = diemHoa;
		    this.diemAnh = diemAnh;
		}
		public int getMaSV() {
		    return maSV;
		}
		public void setMaSV(int mSV) {
		    this.maSV = mSV;
		}
 
		public String getHoTen() {
		    return hoTen;
		}
		public void setHoTen(String hoTen) {
		    this.hoTen = hoTen;
		}

		public String getLop() {
		    return lop;
		}
		public void setLop(String lop) {
		    this.lop = lop;
		}

		public String getNgaySinh() {
		    return ngaySinh;
		}
		public void setNgaySinh(String ngaySinh) {
		    this.ngaySinh = ngaySinh;
		}
		public int getTuoi() {
		    return tuoi;
		}
		public void setTuoi(int tuoi) {
		    this.tuoi = tuoi;
		}
		public float getDiemToan() {
		    return diemToan;
		}
		public void setDiemToan(float diemToan) {
		    this.diemToan = diemToan;
		}

		public float getDiemLy() {
		    return diemLy;
		}
		public void setDiemLy(float diemLy) {
		    this.diemLy = diemLy;
		}
		
		public float getDiemHoa() {
		    return diemHoa;
		}
		public void setDiemHoa(float diemHoa) {
		    this.diemHoa = diemHoa;
		}
		public float getDiemAnh() {
		    return diemAnh;
		}
		public void setDiemAnh(float diemAnh) {
		    this.diemAnh = diemAnh;
		}
		
		public float getTrungBinh() {
		    return ( getDiemHoa()+ getDiemLy() + getDiemToan()+getDiemAnh()) / 4;
		}
}