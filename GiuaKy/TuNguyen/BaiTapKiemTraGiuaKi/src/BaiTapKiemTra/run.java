package BaiTapKiemTra;

public class run extends QLHS{
	public void menu() {
		while (true) {
			System.out.println(""
					+ "1. Nhap thong benh nhan \n"
					+ "2. Xuat thong tin benh nhan \n"
					+ "3. Hi?n th? h? so c?a b?nh nh�n v?i m� b?nh nh�n nh?p t? b�n ph�m \n"
					+ "4. T�nh t?ng c�c s? ti?n c?a t?t c? b?nh nh�n \n"
					+ "5. T�m b?nh nh�n c� ti?n tr? nhi?u nh?t \n"
					+ "6. T�m c�c b?nh nh�n c� b?nh tuong ?ng nh?p t? b�n ph�m"
					+ "7. Xuat thong tin danh sach sinh vien \n"
					+ "8. Xuat sinh vien co hoc luc gioi \n"
					+ "9. Sap xep danh sach sinh vien theo diem \n"
					+ "10. Nhap danh sach sinh vien \n"
					+ "11. Xoa bac sy \n"
					+ "12. thoat");
			int n = Integer.parseInt(scan.nextLine());
			switch (n) {
				case 1:
					nhapThongTinBenhNhan();
					break;
				case 2:
					hienThiThongTinBenhNhan();
					break;
				case 3:
					hienThiThongTinBangId();
					break;
				case 4:
					tongTienBenhNhan();
					break;
				case 5:
					tienBenhNhanNhieuNhat();
					break;
				case 6:
					benhTuongUng();
					break;
				case 7:
					themNhanVien();
					break;
				case 8:
					hienThiBacSy();
					break;
				case 9:
					hienThiKhoa();
					break;
				case 10:
					suaPhuCap();
					break;
				case 11:
					xoaBacSy();
					break;
				
				case 12:
					System.err.println("THANKS");
					System.exit(0);
					break;
		
				default:
					break;
			}
		}
	}
}
