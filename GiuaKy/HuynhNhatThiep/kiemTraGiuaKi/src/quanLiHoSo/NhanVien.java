package quanLiHoSo;

public class NhanVien extends ConNguoi {
	private String maNV;
	private String khoa;
	private String ngayBatDauLam;
	private double luong;
	private double phuCap;
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String id, String name, int cmnd, int age, String gioiTinh,String maNV, String khoa, String ngayBatDauLam, double luong, double phuCap) {
		super(id,name,cmnd,age,gioiTinh);
		this.maNV = maNV;
		this.khoa = khoa;
		this.ngayBatDauLam = ngayBatDauLam;
		this.luong = luong;
		this.phuCap = phuCap;
	}
	@Override
	public void xuat() {
		 super.xuat();
		 System.out.println(" mã nhân viên :  "+maNV);
		 System.out.println("tên khoa :  "+khoa);
		 System.out.println(" ngày bắt đâu làm:  "+ngayBatDauLam);
		 System.out.println(" lương :  "+luong);
		 System.out.println(" phụ cấp  :  "+phuCap);
		 

	}
}
