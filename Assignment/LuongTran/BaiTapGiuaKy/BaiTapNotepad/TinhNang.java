package BaiTapNotepad;
import java.util.*;
public class TinhNang{
	private ArrayList<BenhNhan> listBenhNhan;
	private ArrayList<BacSy> listBacSy;
	private Scanner scanner;

	public TinhNang(){
		listBenhNhan = new ArrayList<BenhNhan>();
		listBacSy = new ArrayList<BacSy>();
		scanner = new Scanner(System.in);
	}

	public void addBenhNhan(){
		System.out.print("Nhập số lượng bệnh nhân cần lưu ");
		int n = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < n; i++){
			BenhNhan bn = new BenhNhan();
			System.out.print("tên: ");
			bn.setTen(scanner.nextLine());
			System.out.print("Tuổi:  ");
			bn.setTuoi(Integer.parseInt(scanner.nextLine()));
			System.out.print("Giới tính:  ");
			bn.setGioiTinh(scanner.nextLine());
			System.out.print("Chứng minh thư:  ");
			bn.setCmnd(scanner.nextLine());
			System.out.print("Mã bệnh nhân:  ");
			bn.setCodeBenhNhan(scanner.nextLine());
			System.out.print("Tên bệnh:  ");
			bn.setBenh(scanner.nextLine());
			System.out.print("Phương pháp trị:  ");
			bn.setPhuongPhapChua(scanner.nextLine());
			System.out.print("Ngày nhập viện:  ");
			bn.setNgayNhapVien(scanner.nextLine());
			System.out.print("Ngày xuất viện:  ");
			bn.setNgayXuatVien(scanner.nextLine());
			System.out.print("Tiền thanh toán:  ");
			bn.setTienThanhToan(Double.parseDouble(scanner.nextLine()));
			listBenhNhan.add(bn);
			System.out.println("===================================== ");
		}
	}
	
	public void addBacSy(){
		System.out.println("Nhập số lượng bác sĩ cần lưu ");
		int n = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < n; i++){
			BacSy bs = new BacSy();
			System.out.print("Tên:  ");
			bs.setTen(scanner.nextLine());
			System.out.print("Tuổi:  ");
			bs.setTuoi(Integer.parseInt(scanner.nextLine()));
			System.out.print("Giới tính:  ");
			bs.setGioiTinh(scanner.nextLine());
			System.out.print("Chứng minh thư:  ");
			bs.setCmnd(scanner.nextLine());
			System.out.print("Mã bác sỹ:  ");
			bs.setCodeBacSy(scanner.nextLine());
			System.out.print("Khoa:  ");
			bs.setKhoa(scanner.nextLine());
			System.out.print("Ngày đi làm:  ");
			bs.setNgayVaoLam(scanner.nextLine());
			System.out.print("Lương:  ");
			bs.setLuong(Double.parseDouble(scanner.nextLine()));
			System.out.print("Phụ cấp:  ");
			bs.setPhuCap(Double.parseDouble(scanner.nextLine()));
			listBacSy.add(bs);
			System.out.println("=====================================");
		}
	}
	
	public void showBenhNhan(ArrayList<BenhNhan> list){
		for(int i = 0; i < list.size(); i++){
			System.out.println((i+1)+"* \n"
			+"Tên: "+list.get(i).getTen() +"\n"
			+"Tuổi: "+list.get(i).getTuoi() +"\n"
			+"Giới tính: "+list.get(i).getGioiTinh()+"\n"	
			+"Chứng minh thư: "+list.get(i).getCmnd() +"\n"
			+"Mã bệnh nhân: "+list.get(i).getCodeBenhNhan() +"\n"
			+"Tên bệnh: "+list.get(i).getBenh() +"\n"
			+"Phương pháp chữa: "+list.get(i).getPhuongPhapChua() +"\n"
			+"Ngày nhập viện: "+list.get(i).getNgayNhapVien() + "\n"
			+"Ngày xuất viện: "+list.get(i).getNgayXuatVien() +"\n"
			+"Tiền thanh toán: "+list.get(i).getTienThanhToan() +"\n"
			);
			System.out.println("====================================");
		}
	}

	public void showBacSy(ArrayList<BacSy> list){
		for(int i = 0; i < list.size(); i++){
			System.out.println((i+1)+"* \n"
			+"Tên: "+list.get(i).getTen() +"\n"
			+"Tuổi: "+list.get(i).getTuoi() +"\n"
			+"Giới tính: "+list.get(i).getGioiTinh()+"\n"	
			+"Chứng minh thư: "+list.get(i).getCmnd() +"\n"
			+"Mã bác sỹ: "+list.get(i).getCodeBacSy() +"\n"
			+"Tên khoa: "+list.get(i).getKhoa() +"\n"
			+"Ngày vào làm: "+list.get(i).getNgayVaoLam() + "\n"
			+"Lương: "+list.get(i).getLuong() +"\n"
			+"Phụ cấp: "+list.get(i).getPhuCap() +"\n"
			);
			System.out.println("====================================");
		}
	}

	public void showBenhNhanByCode(String codeBenhNhan){
		for(int i = 0; i < listBenhNhan.size(); i++){
			if((listBenhNhan.get(i).getCodeBenhNhan()).equals(codeBenhNhan)){
				System.out.println(
				"Tên: "+listBenhNhan.get(i).getTen() +"\n"
				+"Giới tính: "+listBenhNhan.get(i).getGioiTinh()+"\n"	
				+"Chứng minh thư: "+listBenhNhan.get(i).getCmnd() +"\n"
				+"Mã bệnh nhân: "+listBenhNhan.get(i).getCodeBenhNhan() +"\n"
				+"Tên bệnh: "+listBenhNhan.get(i).getBenh() +"\n"
				+"Phương pháp chữa bệnh: "+listBenhNhan.get(i).getPhuongPhapChua() +"\n"
				+"Ngày nhập viện: "+listBenhNhan.get(i).getNgayNhapVien() + "\n"
				+"Ngày xuất viện: "+listBenhNhan.get(i).getNgayXuatVien() +"\n"
				+"Tiền thanh toán: "+listBenhNhan.get(i).getTienThanhToan() +"\n"
				);
			return;
			}
		}
		System.out.println("~~Mã không được tìm thấy!");
	}

	public ArrayList<BacSy> showBacSyByKhoa(String khoa){
		ArrayList<BacSy> list = new ArrayList<BacSy>();
		for(int i = 0; i < listBacSy.size(); i++){
			if((listBacSy.get(i).getKhoa()).equals(khoa)){
				list.add(listBacSy.get(i));
			}
		}
		return list;
	}
	
	public Double sumAllTienThanhToan(){
		double s = 0;
		for(int i = 0; i < listBenhNhan.size();i++){
			s+=listBenhNhan.get(i).getTienThanhToan();
		}
		return s;
	}

	public ArrayList<BenhNhan> maxTienThanhToan(){
		double max = listBenhNhan.get(0).getTienThanhToan();
		ArrayList<BenhNhan> list = new ArrayList<BenhNhan>();
		for(int i =1; i < listBenhNhan.size();i++){
			if(max < listBenhNhan.get(i).getTienThanhToan()){
				max =  listBenhNhan.get(i).getTienThanhToan();
			}
		}
		for(int i = 0; i < listBenhNhan.size();i++){
			if(listBenhNhan.get(i).getTienThanhToan() == max){
				list.add((listBenhNhan.get(i)));
			}
		}
		return list;
	}

	public ArrayList<BenhNhan> listBenhNhanCungBenh(String benh){
		ArrayList<BenhNhan> list = new ArrayList<BenhNhan>();
		for(int i = 0; i < listBenhNhan.size();i++){
			if((listBenhNhan.get(i).getBenh()).equals(benh)){
				list.add(listBenhNhan.get(i));
			}
		}
		return list;
	}

	public void editPhuCap(String codeBacSy, Double phuCap){
		for(int i =0; i < listBacSy.size(); i++){
			if((listBacSy.get(i).getCodeBacSy()).equals(codeBacSy)){
				listBacSy.get(i).setPhuCap(phuCap);
				return;
			}
		}
		System.out.println("~~Mã không được tìm thấy!");
	}

	public void removeBacSyByCode(String codeBacSy){
		for(int i =0; i < listBacSy.size(); i++){
			if((listBacSy.get(i).getCodeBacSy()).equals(codeBacSy)){
				listBacSy.remove(i);
			}
		}
	}

	public void menu(){
		String option;
		while(true){
			System.out.print(
			"Benh nhan \n"
			+"1/ Thêm mới hồ sơ bệnh nhân \n"
			+"2/ Hiển thị thông tin tất cả bệnh nhân \n"
			+"3/ Hiển thị thông tin bệnh nhân với mã bệnh nhân nhập từ bàn phím \n"
			+"4/ Tổng tiền thanh toán của tất cả bệnh nhân \n"
			+"5/ Tìm bệnh nhân có tiền thanh toán nhiều nhất \n"
			+"6/ Tìm bệnh nhân có bệnh tương tự nhập từ bàn phím \n"
			+"NhanVien \n"
			+"7/ Thêm mới nhân viên \n"
			+"8/ Hiển thị tất cả bác sỹ \n"
			+"9/ Hiển thị bác sỹ với khoa tương ứng nhập từ bàn phím \n"
			+"10/ Sửa phụ cấp với mã bác sỹ nhập từ bàn phím \n"
			+"11/ Xóa bác sỹ tương ứng với mã bác sỹ nhập từ bàn phím \n"
			+"0/ Exit \n");
			System.out.println("~~Vui lòng chọn tính năng~~ ");
			option = scanner.nextLine();
			switch(option){
				case "1" :
					addBenhNhan();
					break;
				case "2" :
					showBenhNhan(listBenhNhan);
					break;
				case "3" :
					System.out.println("Nhập mã bệnh nhân cần tìm ");
					showBenhNhanByCode(scanner.nextLine());
					break;
				case "4": 
					System.out.println("Tổng tiền thanh toán của tất cả bệnh nhân: "+sumAllTienThanhToan());
					break;
				case "5" :
					System.out.println("Thanh niên trả tiền nhiều nhất là: ");
					showBenhNhan(maxTienThanhToan());
					break;
				case "6" :
					System.out.println("Nhập bệnh cần tìm: ");
					String str = scanner.nextLine();
					showBenhNhan(listBenhNhanCungBenh(str));
					break;
				case "7" :
					addBacSy();
					break;
				case "8" :
					showBacSy(listBacSy);
					break;
				case "9" :
					System.out.println("Nhập khoa cần tìm: ");
					showBacSy(showBacSyByKhoa(scanner.nextLine()));
					break;
				case "10" :
					System.out.println("vui lòng nhập mã bác sỹ cần sửa: ");
					String code = scanner.nextLine();
					System.out.println("vui lòng nhập số phụ cấp cần sửa: ");
					double money = Double.parseDouble(scanner.nextLine());
					editPhuCap(code, money);
					break;
				case "11" :
					System.out.println("vui lòng nhập mã bác sỹ cần xóa!");
					removeBacSyByCode(scanner.nextLine());
					break;
				case "0" :
					scanner.close();
					System.out.println("~~bye bye~~");
					System.exit(0);
					break;
					default : 
						System.out.println("~~không tồn tại menu!");
			}
		}
	}
}