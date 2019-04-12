package quanLyHoSo;
import java.util.Scanner;
public class Runs extends QLHoSo{
	 Scanner scan = new Scanner(System.in);
	 public void menu() {
		while (true) {
			System.out.println(""
					+ "1. Nhap thong benh nhan \n"
					+ "2. Xuat thong tin benh nhan \n"
					+ "3. Hiển thị hồ sơ của bệnh nhân với mã bệnh nhân nhập từ bàn phím \n"
					+ "4. Tính tổng các số tiền của tất cả bệnh nhân \n"
					+ "5. Tìm bệnh nhân có tiền trả nhiều nhất \n"
					+ "6. TÌm các bệnh nhân có bệnh tương ứng nhập từ bàn phím \n"
					+ "7. Xuat thong tin danh sach sinh vien \n"
					+ "8. Xuat sinh vien co hoc luc gioi \n"
					+ "9. Sap xep danh sach sinh vien theo diem \n"
					+ "10. Nhap danh sach sinh vien \n"
					+ "11. xóa bác Sỹ \n"
					+ "12. thoat");
			int n = Integer.parseInt(scan.nextLine());
			switch (n) {
				case 1:
					quanLyHoSoBenhNhan();
					break;
				case 2:
					hienThi();
					break;
				case 3:
					hienThiBenhNhanVoiMaId();
					break;
				case 4:
					tongTienCuaBenhNhan();
					break;
				case 5:
					benhTuongUng();
					break;
				case 6:
					tienBenhNhanNhieuNhat();
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
