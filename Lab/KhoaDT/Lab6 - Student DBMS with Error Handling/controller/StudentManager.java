package Lab6.controller;

import Lab6.model.bean.Student;
import Lab6.view.MenuView;
import Lab6.model.Database;

public class StudentManager {
    public static Database database1=new Database();
    private MenuView manageStudentView=new MenuView(database1);

    public void getMenu(){
        String input=manageStudentView.menu();
        Student studentTemp;
        while(true) {
            switch (input){
                case "1":
                    int len=database1.getSize();
                    System.out.println(len);
                    int i=0;
                    for (Student student : database1.list()){
                        manageStudentView.listView(student,i);
                        i++;
                    }
                    break;
                case "2":
                    String id=manageStudentView.getIdView();
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
            }
            manageStudentView.message("Chọn hành động tiếp theo");
            input=manageStudentView.getInput();
        }
    }
}
