import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
	private Scanner scanner;
	ArrayList<CanBo> listCanBo;
	
	public QuanLyCanBo() {
		scanner = new Scanner(System.in);
		listCanBo = new ArrayList<CanBo>();
	}
	
	public void addNhanVien() {
		System.out.println("nhập số nhân viên cần lưu: ");
		int n = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < n; i++) {
			
			NhanVien nhanVien = new NhanVien();
			
			System.out.println("Tên: ");
			nhanVien.setTen(scanner.nextLine());
			System.out.println("Hệ số lương: ");
			nhanVien.setHeSoLuong(Double.parseDouble(scanner.nextLine()));
			System.out.println("chức vụ: ");
			nhanVien.setChuVu(scanner.nextLine());
			System.out.println("phòng ban: ");
			nhanVien.setPhongBan(scanner.nextLine());
			System.out.println("số ngày công: ");
			nhanVien.setSoNgayCong(Integer.parseInt(scanner.nextLine()));
			
			listCanBo.add(nhanVien);
		}
	}
	
	public void addGiangVien() {
		System.out.println("nhập số giảng viên cần lưu: ");
		int n = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < n; i++) {
			
			GiangVien giangVien = new GiangVien();
			
			System.out.println("Tên: ");
			giangVien.setTen(scanner.nextLine());
			System.out.println("Hệ số lương: ");
			giangVien.setHeSoLuong(Double.parseDouble(scanner.nextLine()));
			System.out.println("khoa: ");
			giangVien.setKhoa(scanner.nextLine());
			System.out.println("trình độ: ");
			giangVien.setTrinhDo(scanner.nextLine());
			System.out.println("Số tiết tháng: ");
			giangVien.setSoTietDayTrongThang(Integer.parseInt(scanner.nextLine()));
			
			listCanBo.add(giangVien);
		}
	}
	
	public ArrayList<GiangVien> findGiangVienCungKhoa(String khoa){
		ArrayList<GiangVien> list = new ArrayList<GiangVien>();
		for(CanBo giangVien : listCanBo) {			
			GiangVien giangVienTmp = (GiangVien)giangVien;
			if(giangVienTmp.getKhoa().equals(khoa)) {
				list.add(giangVienTmp);
			}	
		}
		return list;
	}
	
	public ArrayList<NhanVien> findNhanVienCungPhong(String phongBan){
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		for(CanBo nhanVien : listCanBo) {			
			NhanVien nhanVienTmp = (NhanVien)nhanVien;
			if(nhanVienTmp.getPhongBan().equals(phongBan)) {
				list.add(nhanVienTmp);
			}	
		}
		return list;
	}
	
	public double sumLuongCanBo() {
		double s = 0;
		for(CanBo canBo : listCanBo) {
			s += canBo.getLuong(); 
		}
		return s;
	}
	
	public ArrayList<CanBo> sortIcrease(){
		CanBo canBoTmp;
		for(int i = 0; i < listCanBo.size(); i++) {
			for(int j = i+1; j < listCanBo.size(); j++) {
				if(listCanBo.get(i).getLuong() > listCanBo.get(j).getLuong()) {
					canBoTmp = listCanBo.get(i);
					listCanBo.set(i, listCanBo.get(j));
					listCanBo.set(j, canBoTmp);
				}
			}
		}
		
		for(int i = 0; i < listCanBo.size(); i++) {
			for(int j = i+1; j < listCanBo.size(); j++) {
				if(listCanBo.get(i).getTen().compareTo(listCanBo.get(j).getTen())>0) {
					canBoTmp = listCanBo.get(i);
					listCanBo.set(i, listCanBo.get(j));
					listCanBo.set(j, canBoTmp);
				}
			}
		}
		return listCanBo;
		
	}
	public void showGiangVien(ArrayList<GiangVien> list) {
		for(GiangVien giangVien : list) {
			if(giangVien instanceof GiangVien) {
				System.out.println("Tên: "+giangVien.getTen());
				System.out.println("Khoa: "+((GiangVien) giangVien).getKhoa());
				System.out.println("Trình độ: "+((GiangVien) giangVien).getTrinhDo());
				System.out.println("Tiết dậy trong tháng: "+((GiangVien) giangVien).getSoTietDayTrongThang());
				System.out.println("Hệ số lương: "+giangVien.getHeSoLuong());
				System.out.println("Phụ cấp: "+giangVien.getPhuCap());
				System.out.println("Lương: "+giangVien.getLuong());
			}
		}
	}
	
	public void showNhanVien(ArrayList<NhanVien> list) {
		for(NhanVien nhanVien : list) {
			if(nhanVien instanceof NhanVien) {
				System.out.println("Tên: "+nhanVien.getTen());
				System.out.println("Phòng: "+((NhanVien) nhanVien).getPhongBan());
				System.out.println("Chức vụ: "+((NhanVien) nhanVien).getChucVu());
				System.out.println("Hệ số lương: "+nhanVien.getHeSoLuong());
				System.out.println("Phụ cấp: "+nhanVien.getPhuCap());
				System.out.println("Số ngày công: "+((NhanVien) nhanVien).getSoNgayCong());
				System.out.println("Lương: "+nhanVien.getLuong());
			}
		}
	}
	
	public void menu() {
		int option;
		while(true) {
			System.out.println("1.Nhập thông tin danh sách cán bộ trong trường. \n" + 
					"2.Xuất danh sách giảng viên khoa x, hoặc nhân viên phòng ban y nào đó. \n" + 
					"3.Tổng số lương trường phải trả cho cán bộ. \n" + 
					"4.Sắp xếp cán bộ theo lương, nếu lương bằng thì sắp xếp theo tên. \n " +
					"0. bye bye"+ "======================================");
			System.out.println("~~~~vui lòng chọn chức năng~~~~ \n ===============================");
			option = Integer.parseInt(scanner.nextLine());
			switch(option) {
			case 1:
				System.out.println("chọn 1: nhập nhân viên! \n Chọn 2: nhập giảng viên");
				int optionAdd = Integer.parseInt(scanner.nextLine());
				if( optionAdd == 1) {
					addNhanVien();
					break;
				} else {
					if(optionAdd == 2) {
						addGiangVien();
						break;
					}
				}
				break;
			case 2:
				System.out.println("chọn 1: hiển thị danh sách nhân nhân viên có cùng 1 ban phòng!");
				System.out.println("chọn 2: hiển thị danh sách giảng viên có cùng khoa");
				int optionShow = Integer.parseInt(scanner.nextLine());
				if(optionShow == 1) {
					System.out.println("nhập tên ban phòng cần tìm: ");
					showNhanVien(findNhanVienCungPhong(scanner.nextLine()));
					break;
				} else {
					if(optionShow == 2) {
						System.out.println("nhập tên ban khoa cần tìm: ");
						showGiangVien(findGiangVienCungKhoa(scanner.nextLine()));
						break;
					}
				}
			case 3:
				System.out.println("tổng số lương phải trả cho cán bộ là: "+sumLuongCanBo());
				break;
			case 4:
				sortIcrease();
				break;
			case 0:
				scanner.close();
				System.out.println("~~bye bye~~");
				System.exit(0);
				default:
					System.out.println("nhập sai chức năng, vui lòng nhập lại!");
			}
		}
	}
}
