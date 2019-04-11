package QLSV;

import QLSV.controller.StudentManager;
import QLSV.model.Database;
import QLSV.model.bean.Student;
import QLSV.view.MenuView;

public class MainQLSV {
    public static void main (String... args){
        StudentManager manager =new StudentManager();
        manager.getMenu();
    }

}
