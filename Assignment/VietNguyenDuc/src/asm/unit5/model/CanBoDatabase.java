package asm.unit5.model;

import asm.unit5.model.bean.CanBo;

import java.util.ArrayList;
import java.util.List;

public class CanBoDatabase {
    List<CanBo> lst = new ArrayList<>();

    public boolean addCanbo(CanBo canBo) {
        boolean result = lst.add(canBo);
        if (result) {
            System.out.println(lst.size());
            return true;
        }
        return false;
    }
    public List<CanBo> getCanbo(int type,String find){
        List<CanBo> lstTemp = new ArrayList<>();
        for (CanBo ob:lst){
            if (ob.getKhoa()!=null && ob.getKhoa().equals(find)) {
                lstTemp.add(ob);
            } else if (ob.getChucvu()!=null && ob.getChucvu().equals(find)) {
                lstTemp.add(ob);
            }

        }
        return lstTemp;
    }
}
