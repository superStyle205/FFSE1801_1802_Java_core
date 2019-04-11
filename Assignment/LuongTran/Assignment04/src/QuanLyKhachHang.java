package QuanLyDien;
import java.util.*;
public class QuanLyKhachHang {
	private ArrayList<KhachHang> list;
	private Scanner scanner;

	public QuanLyKhachHang() {
		list =  new ArrayList<KhachHang>();
		scanner = new Scanner(System.in);
	}
	public void nhap() {
		System.out.print("vui lòng nhập số khách hàng muốn nhập: ");
		int n = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < n; i++) {
			KhachHang khachHang = new KhachHang();
			BienLai bienLai = new BienLai();
			System.out.println("Tên khách hàng "+(i+1)+": ");
			khachHang.setHoTen(scanner.nextLine());
			System.out.println("Số nhà khách hàng "+(i+1)+": ");
			khachHang.setSoNha(scanner.nextLine());
			System.out.println("Biên lai khách hàng "+(i+1)+": ");
			System.out.println("nhập số biên lai: ");
			bienLai.setMaCongTo(scanner.nextLine());
			System.out.println("nhập chỉ số cũ: ");
			bienLai.setChiSoCu(Double.parseDouble(scanner.nextLine()));
			System.out.println("nhập chỉ số mới: ");
			bienLai.setChiSoMoi(Double.parseDouble(scanner.nextLine()));
			khachHang.setBienLai(bienLai);
			list.add(khachHang);
		}
	}
	public void hienThiThongTin() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println("=============================================");
			System.out.println("tên khách hàng là: "+list.get(i).getHoTen());
			System.out.println("số nhà: "+ list.get(i).getSoNha());
			System.out.println("mã công tơ: " + list.get(i).getBienLai().getMaCongTo());
			System.out.println("chỉ số cũ: " + list.get(i).getBienLai().getChiSoCu());
			System.out.println("chỉ số mới: " + list.get(i).getBienLai().getChiSoMoi());
			System.out.println("=============================================");
		}
	}
	public void hienThiTienDien() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println("=============================================");
			System.out.println("Tên khách hàng "+(i+1)+" là: " + list.get(i).getHoTen());
			System.out.println("mã công tơ: " + list.get(i).getBienLai().getMaCongTo());
			System.out.println("tiền điện phải trả là: " + list.get(i).getBienLai().getTienDienTra());
			System.out.println("==============================================");
		}
	}
}