package controller;

import model.Database;
import model.bean.ConNguoi;
import view.ManagerPersonView;


public class ManagerPersonController {

	private ManagerPersonView managerPersonView;
	private Database database;

	public ManagerPersonController() {
		managerPersonView = new ManagerPersonView();
		database = new Database();
	}

	public void loadProgram() {
		int maBenhNhan;
		int maBacSy;
		String benh;
		int choose;
		String khoa;
		ConNguoi conNguoi;
		while (true) {
			choose = managerPersonView.menuView();
			switch (choose) {
				case 1:
					conNguoi = managerPersonView.inputBenhNhan();
					database.addConNguoi(conNguoi);
					break;
				case 2:
					database.hienThiDanhSachBenhNhan();
					break;
				case 3:
					maBenhNhan = managerPersonView.inputidBenhNhan();
					database.hienThiBenhNhanTheoMa(maBenhNhan);
					break;
				case 4:
					database.tinhTongTienBenhNhan();
					break;
				case 5:				
					database.benhNhanCoTienTraNhieuNhat();
					break;
				case 6:
					benh = managerPersonView.inputBenh();
					database.benhNhanCoBenhTuongUng(benh);
					break;
				case 7:
					conNguoi = managerPersonView.inputBacSy();
					database.addConNguoi(conNguoi);				
					break;
				case 8:
					database.hienThiDanhSachBacSy();				
					break;
				case 9:
					khoa = managerPersonView.inputKhoa();
					database.benhNhanCoBenhTuongUng(khoa);				
					break;
				case 10:
					maBacSy = managerPersonView.inputidBenhNhan();
					database.suaPhuCap(maBacSy);				
					break;
				case 11:
					maBacSy = managerPersonView.inputidBenhNhan();
					database.hienThiBenhNhanTheoMa(maBacSy);			
					break;
				case 0:
					System.exit(0);
					break;
			}
		}
	}
}
