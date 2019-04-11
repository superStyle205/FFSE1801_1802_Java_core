package quanLiDaiHoc.controller;

import quanLiDaiHoc.views.quanLiDaiHocViews;

public class quanLiDaiHocController {
	private quanLiDaiHocViews qldh;

	public quanLiDaiHocController() {
		qldh = new quanLiDaiHocViews();
	}

	public void load() {
		qldh.menu();
	}
}
