package sinhVien.controller;

import sinhVien.model.sinhVien;

import java.util.ArrayList;

import sinhVien.model.dataBase;
import sinhVien.view.sinhVienView;

public class sinhVienController {
	private sinhVienView sv;
	private sinhVien sv_data;
	private dataBase dataBase;

	public sinhVienController() {
		sv = new sinhVienView();
		sv_data = new sinhVien();
		dataBase = new dataBase();
	}

	public void load(){
		if(sv.USER != null) {
			Logged();
		}else {
			notLoggedIn();
		}
	}

	public void notLoggedIn() {
		while(true) {
			String[] data_Login = sv.login();
			String result = dataBase.login(data_Login[0], data_Login[1]);
			System.out.println(result);
			load();
		}
	}

	public void Logged() {
		while(true) {
			if(sv.USER == null) {
				load();
				break;
			}
			int choose = sv.menu();
			switch (choose) {
			case sinhVienView.SINH_VIEN_GET_ALL:
				System.out.println( (dataBase.SINH_VIEN_GET_ALL().isEmpty()) ? "Không có dữ liệu !" : dataBase.SINH_VIEN_GET_ALL() );
				break;
				
			case sinhVienView.SINH_VIEN_GET:
				String r = sv.get();
				System.out.println( (dataBase.SINH_VIEN_GET(r).isEmpty()) ? "Không có người này !" : dataBase.SINH_VIEN_GET(r) );
				break;
				
			case sinhVienView.SINH_VIEN_ADD:
				sinhVien rSv = sv.add();
				System.out.println(dataBase.SINH_VIEN_ADD(rSv));
				break;
				
			case sinhVienView.SINH_VIEN_UPDATE:
				String[] update = sv.update();
				System.out.println(dataBase.SINH_VIEN_UPDATE(update[1], Integer.parseInt(update[0]), update[2]));
				break;
				
			case sinhVienView.SINH_VIEN_DELETE:
				String delete = sv.delete();
				System.out.println(dataBase.SINH_VIEN_DELETE(delete));
				break;
				
			case sinhVienView.SINH_VIEN_LOGOUT:
				sv.logout();
				System.out.println("Bạn đăng xuất thành công @@");
				break;
			case sinhVienView.SINH_VIEN_EXIT:
				System.err.println("Cảm ơn bạn đã sử dụng");
				System.exit(0);
				break;
				
			default:
				System.err.println("Bạn nhập sai - mời nhập lại !");
				break;
			}

		}
	}
}
