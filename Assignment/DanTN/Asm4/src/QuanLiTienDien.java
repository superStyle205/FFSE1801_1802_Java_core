import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiTienDien {
	private ArrayList<KhachHang> listKH;
	private Scanner sc;
	
	public QuanLiTienDien() {
		listKH = new ArrayList<KhachHang>();
		sc = new Scanner(System.in);
	}
	/**
	 * menu
	 */
	public void menu() {
		while(true) {
			System.out.println(
					"+---------------------------------+\r\n" +
					"1. Nhập hộ dân\r\n" +
					"2. Hiển thị danh sách hộ dân\r\n" +
					"3. Hiển thị biên lai\r\n" +
					"4. Thoát\r\n" +
					"+---------------------------------+\r\n" +
					"Chọn chức năng: ");
			int nhap = sc.nextInt();
			switch(nhap) {
			case 1:
				nhapCH();
				break;
			case 2:
				hienThiHD();
				break;
			case 3:
				hienThiBienLai();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Lỗi!!Vui lòng nhập lại");
			}
		}
	}
	/**
	 * nhập chủ hộ
	 */
	public void nhapCH() {
		sc = new Scanner(System.in);
		
		System.out.print("Nhập số lượng chủ hộ cần nhập: ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			KhachHang khachHang = new KhachHang();
			BienLai bienLai = new BienLai();
			System.out.print("Nhập tên chủ hộ: ");
			khachHang.setHoTen(sc.nextLine());
			System.out.print("Nhập số nhà: ");
			khachHang.setSoNha(sc.nextLine());
			System.out.print("Nhập mã số công tơ: ");
			khachHang.setMaCongTo(Integer.parseInt(sc.nextLine()));
			System.out.print("Nhập chỉ số cũ: ");
			bienLai.setChiSoCu(Double.parseDouble(sc.nextLine()));
			System.out.print("Nhập chỉ số mới: ");
			bienLai.setChiSoMoi(Double.parseDouble(sc.nextLine()));
			
			khachHang.setBienLai(bienLai);
			
			listKH.add(khachHang);
			System.out.println("Đã thêm thành công!!");
			System.out.println();
		}
	}
	/**
	 * hiển thị danh sách hộ dân
	 */
	public void hienThiHD() {
		for(int i = 0; i < listKH.size(); i++) {
			System.out.println("Tên chủ hộ: " + listKH.get(i).getHoTen());
			System.out.println("Số nhà: " + listKH.get(i).getSoNha());
			System.out.println("Mã số công tơ: " + listKH.get(i).getMaCongTo());
			System.out.println("Chỉ số cũ: " + listKH.get(i).getBienLai().getChiSoCu());
			System.out.println("Chỉ số mới: " + listKH.get(i).getBienLai().getChiSoMoi());
			System.out.println();
		}
	}
	/**
	 * hiển thị biên lai
	 */
	public void hienThiBienLai() {
		for(int i = 0; i < listKH.size(); i++) {
			System.out.println("Tên chủ hộ:	" + listKH.get(i).getHoTen());
			System.out.println("Số nhà:	" + listKH.get(i).getSoNha());
			System.out.println("Mã số công tơ:	" + listKH.get(i).getMaCongTo());
			System.out.println("Chỉ số cũ:	" + listKH.get(i).getBienLai().getChiSoCu());
			System.out.println("Chỉ số mới:	" + listKH.get(i).getBienLai().getChiSoMoi());
			System.out.println("Số tiền phải trả: " + listKH.get(i).getBienLai().getSoTienPhaiTra());
			System.out.println();
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		QuanLiTienDien bl = new QuanLiTienDien();
		bl.menu();
	}
}
