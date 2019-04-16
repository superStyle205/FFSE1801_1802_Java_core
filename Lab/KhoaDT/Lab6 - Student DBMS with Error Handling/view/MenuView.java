package Lab6.view;

import Lab6.model.Database;
import Lab6.model.bean.Student;
import Lab6.common.*;
import java.util.Scanner;

public class MenuView {
    static Scanner scanner=new Scanner(System.in);
    NameException nameException=new NameException();
    AgeException ageException=new AgeException();
    GPAException gpaException=new GPAException();
    IDException idException;

    public MenuView(Database database) {
        idException=new IDException(database);
    }

    public String getInput(){
        String input=(scanner.nextLine());
        return input;
    }
    public String menu(){
        String input;
        System.out.println("Chọn hành động từ menu bên dưới:\n"+
            "1/ Liệt kê danh sách sinh viên\n"+
            "2/ Thêm sinh viên\n"+
            "3/ Sửa thông tin sinh viên\n"+
            "4/ Xóa sinh viên\n"+
            "5/ Sắp xếp theo tên\n"+
            "6/ Thoát chương trình");
        input=(scanner.nextLine());
        return input;
    }

    public String getIdView(){
        System.out.println("Nhập ID sinh viên");
        String ID="";
        while (ID.equals("")){
            ID=idException.idCheck(scanner.nextLine());
        }
        return ID;
    }

    public String nameView(){
        System.out.println("Cập nhật tên sinh viên");
        String name="";
        while (name.equals("")){
            name=nameException.nameCheck(scanner.nextLine());
        }
        return name;
    }

    public int ageView(){
        System.out.println("Cập nhật tuổi sinh viên");
        String age="";
        while (age.equals("")){
            age=ageException.ageCheck(scanner.nextLine());
        }
        return Integer.parseInt(age);
    }

    public String addressView(){
        String input;
        System.out.println("Cập nhật địa chỉ sinh viên");
        input=scanner.nextLine();
        return input;

    }

    public double gpaView(){
        System.out.println("Nhập GPA sinh viên");
        String gpa="";
        while (gpa.equals("")){
            gpa=gpaException.gpaCheck(scanner.nextLine());
        }
        return Double.parseDouble(gpa);
    }

    public void listView (Student studentTemp, int i){
        System.out.println("Sinh viên thứ "+(i+1)+":");
        System.out.println("   +ID: "+studentTemp.getId());
        System.out.println("   +Tên: "+studentTemp.getName());
        System.out.println("   +Tuổi: "+studentTemp.getAge());
        System.out.println("   +Địa chỉ: "+studentTemp.getAddress());
        System.out.println("   +GPA: "+studentTemp.getGpa());
    }

    public void message(String mes){
        System.out.println("***"+mes);
    }
}
