package quanLi;

public class sinhVienManger {
	private static SinhVienDao sVienDao = new SinhVienDao();
	public static void main(String[] args) {	
		sVienDao.add();
		System.out.println("Mang sinh vien la: ");
		sVienDao.display();
		System.out.println("Delete");
		sVienDao.delete(6);
		sVienDao.display();
	}
}
