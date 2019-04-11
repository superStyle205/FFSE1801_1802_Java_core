package Lab4Bai1;

public class Main {
	public static void main(String[] args) {
		LaoCong LaoCong1 = new LaoCong();
		LaoCong1.setHoTen("Nguyễn Viết Long");
		LaoCong1.setLuong(20000);
		LaoCong1.setSoGioLamViec(10);
		LaoCong1.showInfo();
		
		TruongPhong TruongPhong1 = new TruongPhong();
		TruongPhong1.setHoTen("Trịnh Minh Sang");
		TruongPhong1.setLuong(2000);
		TruongPhong1.setTrachNhiem(10000);
		TruongPhong1.showInfo();
		
	}
	
}
