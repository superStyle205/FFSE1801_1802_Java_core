package assignment4.controller;

import assignment4.model.bean.KhachHang;
import assignment4.view.KhachHangView;

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
