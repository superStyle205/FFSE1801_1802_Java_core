package quanLi;
import java.util.Scanner;

import javax.security.auth.kerberos.KerberosKey;
public class SinhVienDao {
	public static int MAX_LENGTH = 100;
	public static Scanner scanner = new Scanner(System.in);
	private static SinhVien[] sinhViens = new SinhVien[MAX_LENGTH];
	private static int size = 0;
	
//	THÊM SINH VIÊN
	
	public static void add() {
		System.out.println("Danh sách sinh viên rổng");
		String inputSV = null;
		while(true) {			
			if (size == MAX_LENGTH ) {
				System.out.println("ut of length array");
				break;
			}
			System.out.println("Nhap ten sinh vien");
			inputSV = scanner.nextLine();
			if ("exit".equals(inputSV)) {
				break;
			}
			sinhViens[size] = new SinhVien();
			
			sinhViens[size].setHoTen(inputSV);
			System.out.println("Nhap ten lop");
			inputSV = scanner.nextLine();
			sinhViens[size].setLop(inputSV);
			
//			---------------------------------
			
			System.out.println("Nhập mã sinh viên");
			inputSV = scanner.nextLine();
			sinhViens[size].setMaSV(Integer.parseInt(inputSV));
			
//			----------------------------------------
			
			System.out.println("Nhập tuổi sinh viên");
			inputSV = scanner.nextLine();
			sinhViens[size].setTuoi(Integer.parseInt(inputSV));
			
//			----------------------------------------
			
			System.out.println("Nhập ngày sinh");
			inputSV = scanner.nextLine();
			sinhViens[size].setNgaySinh(inputSV);
			
//			----------------------------------------
			
			System.out.println("Nhập điểm hóa");
			inputSV = scanner.nextLine();
			sinhViens[size].setDiemHoa(Integer.parseInt(inputSV));
			
//			----------------------------------------
			
			System.out.println("nhập điểm toán");
			inputSV = scanner.nextLine();
			sinhViens[size].setDiemToan(Integer.parseInt(inputSV));
			
//			----------------------------------------
			
			System.out.println("nhập điểm lí");
			inputSV = scanner.nextLine();
			sinhViens[size].setDiemLy(Integer.parseInt(inputSV));
			
//			----------------------------------------
			
			System.out.println("nhập điểm ANH");
			inputSV = scanner.nextLine();
			sinhViens[size].setDiemToan(Integer.parseInt(inputSV));	
			size++;
			
		}	
	}
//	in  sinh viên
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(sinhViens[i].getMaSV() +"  "+ sinhViens[i].getHoTen() +"  "+sinhViens[i].getLop() +"  "+sinhViens[i].getDiemHoa() +"  "+sinhViens[i].getDiemToan()+ "  "+sinhViens[i].getTrungBinh());
		}
	}	
	
//	cập nhập sinh viên
	public void capNhapSinhVien(int id) {
		
		
	}
//	XÓA SINH VIÊN
	public void delete(int maSV) {
		int index = indexMaSV(maSV);
		if (index == -1) System.out.println("Không tìm thấy sinh viên trong mảng để xóa");
		else removeStudentAtPosition(index);
	}	
	/**
	 * Xác định index trong mảng của mã sinh viên tương ứng
	 * @param maSV
	 * @return
	 */
	private int indexMaSV(int maSV) {
		for (int i=0; i<size; i++) {
			if (sinhViens[i].getMaSV()==maSV) return i;
		}
		return -1;
	}	
	/**
	 * Xoa 1 so co vi tri tuong ung ra khoi mang
	 * 
	 * @param position
	 *           vi tri cua so can xoa khoi mang
	 */
	private void removeStudentAtPosition(int position) {
		if (position == size - 1) {
			sinhViens[--size] = null;
			return;
		}
		for (int i = position; i < size - 1; i++) {
			sinhViens[i] = sinhViens[i + 1];
		}
		sinhViens[--size] = null;
		
	}
}