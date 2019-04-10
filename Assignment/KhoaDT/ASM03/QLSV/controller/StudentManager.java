package QLSV.controller;

import QLSV.model.bean.Student;
import QLSV.view.MenuView;
import QLSV.model.Database;

import java.awt.*;

//import static QLSV.MainQLSV.database1;

public class StudentManager {

    private MenuView manageStudentView=new MenuView();;
//    private Database database =new Database() ;
    Student student1=new Student("1","Khoa",23,"Nguyen thien ke",3.52);
    Student student2=new Student("2","Viet",18,"Le Duan",4.0);
    Student student3=new Student("3","Luong",25,"Ngo Quyen",3);
    Student student4=new Student("4","Quan",19,"Quang Tri",3);
    Student student5=new Student("5","Ân",18,"Hue",3);

    public static Database database1=new Database();
    {
        database1.add(student1);
        database1.add(student2);
        database1.add(student3);
        database1.add(student4);
        database1.add(student5);
    }

    public void getMenu(){
        String input=manageStudentView.menu();
        Student studentTemp;
        while(true) {
            switch (input){
                case "1":
                    int len=database1.getSize();
                    System.out.println(len);
                    Student[] studentTempArr=database1.list();
//                    manageStudentView.listView(studentTempArr[0],0);
                    for (int i=0;i<len;i++){
                        manageStudentView.listView(studentTempArr[i],i);
                    }
                    break;
                case "2":
                    String id=manageStudentView.getIdView();
                    while (database1.findId(id)!=-1){
                        manageStudentView.message("ID đã tồn tại.");
                        id=manageStudentView.getIdView();
                    }
                    studentTemp = new Student(id,manageStudentView.nameView(), manageStudentView.ageView(),manageStudentView.addressView(),manageStudentView.gpaView());
                    database1.add(studentTemp);
                    System.out.println("Cập nhật thông tin thành công");
                    break;
                case "3":
                    id=manageStudentView.getIdView();
                    if (database1.findId(id)==-1){
                        manageStudentView.message("Không tìm thấy ID");
                    } else {
                        studentTemp = new Student(id,manageStudentView.nameView(), manageStudentView.ageView(),manageStudentView.addressView(),manageStudentView.gpaView());
                        database1.update(database1.findId(id),studentTemp);
                        manageStudentView.message("Cập nhật thành công sinh viên "+id);
                    };

                    break;
                case "4":
                    id=manageStudentView.getIdView();
                    if (database1.findId(id)==-1){
                        manageStudentView.message("Không tìm thấy ID");
                    } else {
                        database1.delete(id);
                        manageStudentView.message("Xóa thành công");
                    }
                    break;
                case "5":
                    database1.sort();
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    manageStudentView.message("Vui lòng chọn hành động từ menu.");
//                    input=manageStudentView.getInput();
            }
            manageStudentView.message("Chọn hành động tiếp theo");
            input=manageStudentView.getInput();
        }
    }
}
