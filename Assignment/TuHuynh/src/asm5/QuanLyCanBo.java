package asm5;
import java.util.ArrayList;

public class QuanLyCanBo {
	private ArrayList<CanBo> danhSach = new ArrayList<CanBo>();

	public void add(CanBo arg0) {
		danhSach.add(arg0);
	}
	public GiangVien getGiangVien(int i) {
		if(danhSach.get(i) instanceof GiangVien) {
			return (GiangVien)danhSach.get(i);
		}else {
			return null;
		}
	}
	public NhanVien getNhanVien(int i) {
		if(danhSach.get(i) instanceof NhanVien) {
			return (NhanVien)danhSach.get(i);
		}else {
			return null;
		}
	}
	public ArrayList<CanBo> getAll() {
		return danhSach;
	}

}
