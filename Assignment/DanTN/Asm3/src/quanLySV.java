import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySV {
	private int chon;
	private ArrayList<SinhVien> listSinhVien;
	public Scanner sc;

	public QuanLySV() {
		listSinhVien = new ArrayList<SinhVien>();
		sc = new Scanner(System.in);
	}

	public void menu() {
		while (true) {
			System.out.println(
					"/*******************************************/\r\n" + 
					"1. Thêm sinh viên.\r\n" + 
					"2. Cập nhật thông tin sinh viên theo ID.\r\n" + 
					"3. Xóa sinh viên theo ID.\r\n" + 
					"4. Sắp xếp sinh viên theo tên.\r\n" + 
					"5. Hiển thị danh sách sinh viên.\r\n" + 
					"0. Kết thúc chương trình.\r\n" + 
					"/*******************************************/\r\n" +
					"Chọn chức năng:");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				themSinhVien();
				break;
			case 2:
				capNhatSinhVien();
				break;
			case 3:
				xoaSinhVien();
				break;
			case 4:
				sapxepSinhVien();
				break;
			case 5:
				hienThiSinhVien();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Lỗi!! Vui lòng chọn lại");
			}
		}
	}
	/**
	 * menu_1
	 */
	public void themSinhVien() {
		sc = new Scanner(System.in);

		System.out.print("Nhập số lượng sinh viên cần thêm: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			SinhVien sinhVien = new SinhVien();
			System.out.print("Nhập ID: ");
			sinhVien.setId(sc.nextLine());
			System.out.print("Nhập tên sinh viên: ");
			sinhVien.setName(sc.nextLine());
			System.out.print("Nhập tuổi sinh viên: ");
			sinhVien.setAge(Integer.parseInt(sc.nextLine()));
			System.out.print("Nhập địa chỉ sinh viên: ");
			sinhVien.setAddress(sc.nextLine());
			System.out.print("Nhập điểm trung bình: ");
			sinhVien.setGpa(Double.parseDouble(sc.nextLine()));

			listSinhVien.add(sinhVien);
			System.out.println("thêm thành công SV!!");
			System.out.println();
		}
	}
	/**
	 * menu_2
	 */
	public void capNhatSinhVien() {
		sc = new Scanner(System.in);

		System.out.print("Nhập ID sinh viên cần thay đổi: ");
		String idSV = sc.nextLine();
		for (int i = 0; i < listSinhVien.size(); i++) {
			if (listSinhVien.get(i).getId().equals(idSV)) {
				System.out.print("Nhập tên sinh viên: ");
				listSinhVien.get(i).setName(sc.nextLine());
				System.out.print("Nhập tuổi sinh viên: ");
				listSinhVien.get(i).setAge(Integer.parseInt(sc.nextLine()));
				System.out.print("Nhập địa chỉ sinh viên: ");
				listSinhVien.get(i).setAddress(sc.nextLine());
				System.out.print("Nhập điểm trung bình: ");
				listSinhVien.get(i).setGpa(Double.parseDouble(sc.nextLine()));
			}
		}
	}
	/**
	 * menu_3
	 */
	public void xoaSinhVien() {
		sc = new Scanner(System.in);

		System.out.print("Nhập ID sinh viên cần xóa: ");
		String idSV = sc.nextLine();
		for (int i = 0; i < listSinhVien.size(); i++) {
			if (listSinhVien.get(i).getId().equals(idSV)) {
				listSinhVien.remove(listSinhVien.get(i));
				System.out.println("Đã xóa SN thành công!!");
				System.out.println();
			}
		}
	}
	/**
	 * menu_4
	 */
	public void sapxepSinhVien() {
		SinhVien tam;
		for(int i = 0; i < listSinhVien.size(); i++) {
			for(int j = 0; j < listSinhVien.size() - 1; j++) {
				if(listSinhVien.get(j).getName().compareTo(listSinhVien.get(j+1).getName()) > 0){
					tam = listSinhVien.get(j);
					listSinhVien.set(j, listSinhVien.get(j+1));
					listSinhVien.set(j+1, tam);
				}
			}
		}
		hienThiSinhVien();
	}
	/**
	 * menu_5
	 */
	public void hienThiSinhVien() {
		for (int i = 0; i < listSinhVien.size(); i++) {
			System.out.println("ID sinh viên là: " + listSinhVien.get(i).getId());
			System.out.println("Tên sinh viên là: " + listSinhVien.get(i).getName());
			System.out.println("Tuổi sinh viên là: " + listSinhVien.get(i).getAge());
			System.out.println("Địa chỉ sinh viên là: " + listSinhVien.get(i).getAddress());
			System.out.println("Điểm trung bình là: " + listSinhVien.get(i).getGpa());
			System.out.println();
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		QuanLySV ql = new QuanLySV();
		ql.menu();
	}
}
