import java.util.ArrayList;
import java.util.Scanner;
import model.bean.BienLai;
import model.bean.KhachHang;

public class QuanLyKhachHang {
	private ArrayList<KhachHang> danhSachKhachHang;
	private Scanner scanner;

	public QuanLyKhachHang() {
		danhSachKhachHang = new ArrayList<KhachHang>();
		scanner = new Scanner(System.in);
	}

	public void nhapDanhSachKhachHang() {
		System.out.print("Nhap n khach hang : ");
		int soLuongKhachHang = Integer.parseInt(scanner.nextLine());
		KhachHang khachHang;
		String hoTen;
		String soNha;
		BienLai bienLai;
		String maCongTo;
		double chiSoCu;
		double chiSoMoi;
		for (int i = 0; i < soLuongKhachHang; i++) {
			khachHang = new KhachHang();
			System.out.print("Nhap ho ten : ");
			hoTen = scanner.nextLine();
			khachHang.setHoTen(hoTen);

			System.out.print("Nhap so nha : ");
			soNha = scanner.nextLine();
			khachHang.setSoNha(soNha);

			bienLai = new BienLai();
			System.out.print("Nhap ma cong to : ");
			maCongTo = scanner.nextLine();
			bienLai.setMaCongTo(maCongTo);

			System.out.print("Nhap chi so cu : ");
			chiSoCu = Double.parseDouble(scanner.nextLine());
			bienLai.setChiSoCu(chiSoCu);

			System.out.print("Nhap chi so moi : ");
			chiSoMoi = Double.parseDouble(scanner.nextLine());
			bienLai.setChiSoMoi(chiSoMoi);

			khachHang.setBienLai(bienLai);

			danhSachKhachHang.add(khachHang);
		}
	}

	public void xuatToanBoThongTinKhachHang() {
		System.out.printf("%n|%-20s|%-30s|%-10s|%-10s|%-10s|%n",
				"ho ten khach hang",
				"dia chi",
				"ma cong to",
				"chi so cu",
				"chi so moi");
//		for (int i = 0; i < danhSachKhachHang.size() ; i++) {
//			System.out.printf("|%-20s|%-30s|%-10s|%-10s|%-10s|%n",
//								danhSachKhachHang.get(i).getHoTen(),
//								danhSachKhachHang.get(i).getSoNha(),
//								danhSachKhachHang.get(i).getBienLai().getMaCongTo(),
//								danhSachKhachHang.get(i).getBienLai().getChiSoCu(),
//								danhSachKhachHang.get(i).getBienLai().getChiSoMoi());
//		}
		for (KhachHang khachHang : danhSachKhachHang) {
			System.out.printf("|%-20s|%-30s|%-10s|%-10s|%-10s|%n",
					khachHang.getHoTen(),
					khachHang.getSoNha(),
					khachHang.getBienLai().getMaCongTo(),
					khachHang.getBienLai().getChiSoCu(),
					khachHang.getBienLai().getChiSoMoi());
		}
	}
	
	public void xuatToanBoTienTraCuaKhachHang() {
		System.out.printf("%n|%-20s|%-10s|%-15s|%n",
				"ho ten khach hang",
				"ma cong to",
				"tien phai tra");
		for (int i = 0; i < danhSachKhachHang.size() ; i++) {
			System.out.printf("|%-20s|%-10s|%-15s|%n",
					danhSachKhachHang.get(i).getHoTen(),
					danhSachKhachHang.get(i).getBienLai().getMaCongTo(),
					danhSachKhachHang.get(i).getBienLai().getSoTienPhaiTra());
		}
	}
	
	public static void main(String[] args) {
		QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang();
		quanLyKhachHang.nhapDanhSachKhachHang();
		quanLyKhachHang.xuatToanBoThongTinKhachHang();
		quanLyKhachHang.xuatToanBoTienTraCuaKhachHang();
	}
}
