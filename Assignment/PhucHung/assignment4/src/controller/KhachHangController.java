package controller;

import model.bean.KhachHang;
import view.KhachHangView;
public class KhachHangController {

	private KhachHangView khachHangView;

	public KhachHangController() {
		khachHangView = new KhachHangView();
	}

	public void loadProgram() {
		KhachHang[] khachHangs = khachHangView.nhapKhachHang();
		khachHangView.hienThiThongTinKhachHangs(khachHangs);
		khachHangView.hienThiTienDienKhachHangs(khachHangs);
	}

	public static void main(String[] args) {
		KhachHangController khachHangController = new KhachHangController();
		khachHangController.loadProgram();
	}
}