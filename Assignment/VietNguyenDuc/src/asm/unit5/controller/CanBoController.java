package asm.unit5.controller;

import asm.unit5.model.CanBoDatabase;
import asm.unit5.model.bean.CanBo;
import asm.unit5.view.CanBoView;

import java.util.List;

public class CanBoController {
    CanBo canBo = new CanBo();
    CanBoView canBoView = new CanBoView();
    CanBoDatabase canBoDatabase = new CanBoDatabase();

    public void insert(int type) {
        canBo.setType(type);
        canBo.setTen(canBoView.getTen());
        canBo.setKhoa(canBoView.getKhoa());
        canBo.setTrinhdo(canBoView.getTrinhdo());
        canBo.setSotietday(canBoView.getSotietday());
        canBo.setHesoluong(canBoView.getHesoluong());
        canBo.setPhucap(canBoView.getPhucap());
        if (canBoDatabase.addCanbo(canBo)) {
            canBoView.setThongbao("green", "Them thanh cong!");
        } else {
            canBoView.setThongbao("red", "Them !");
        }
    }

    public void find(int type) {
        List<CanBo> result;
        result = canBoDatabase.getCanbo(type, canBoView.getKhoa());
        for (int i = 0; i < result.size(); i++) {
            canBoView.setThongbao("blue", "***************** Giang vien " + (i + 1) + " *****************");
            canBoView.setTen(result.get(i).getTen());
            canBoView.setKhoa(result.get(i).getKhoa());
            canBoView.setTrinhdo(result.get(i).getTrinhdo());
            canBoView.setSotietday(result.get(i).getSotietday());
            canBoView.setHesoluong(result.get(i).getHesoluong());
            canBoView.setPhucap(result.get(i).getPhucap());
            canBoView.setThongbao("blue", "***********************************************");
        }
    }
}
