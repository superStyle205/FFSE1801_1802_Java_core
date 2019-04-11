package Lab4_B234;

import java.util.Scanner;

public class MainFPT {
    private static Database database=new Database();
    static Scanner scn =new Scanner(System.in);


    public static void main (String[] args){
        StudentFPT[] studentList;
        int size;


        System.out.println("Vui long chon menu:\n"+
        "1.	Nhap danh sach sinh vien\n"+
        "2.	Xuat danh sach sinh vien\n"+
        "3.	Xuat danh sach sinh vien co hoc luc gioi\n"+
        "4. Sap xep danh sach sinh vien theo diem\n"+
        "5. Ket thuc");

        while (true){
            studentList=database.getData();
            size= database.getSize();

            switch (scn.nextLine()){
                case "1":
                    database.add(addStudent());
                    break;
                case "2":
                    for (int i=0;i<size;i++){
                        getStudent(studentList[i],i);
                    }
                    break;
                case "3":
                    getStudentExcellent(studentList,size);
                    break;
                case "4":
                    StudentFPT studentTemp;
                    for (int i=0;i<size-1;i++){
                        for (int j=i+1;j<size;j++){
                            if(studentList[i].getDiem()<studentList[j].getDiem()){
                                studentTemp= studentList[i];
                                studentList[i]=studentList[j];
                                studentList[j]=studentTemp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong!");
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Vui long chon tu menu");
            }
            System.out.println("Chon hanh dong tiep theo");
        }

    }

    public static StudentFPT addStudent (){
        String lop;
        StudentFPT student;
        String name;
        double diemHTML;
        double diemJava;
        double diemCSS;
        double diemMarketing;
        double diemSales;
        while (true){
            System.out.println("Chon lop: \n1/IT\n2/Business");
            lop=scn.nextLine();
            if (lop.equals("1")){
                System.out.println("Nhap ten:");
                name=scn.nextLine();
                System.out.println("Nhap Java:");
                diemJava=Double.parseDouble(scn.nextLine());
                System.out.println("Nhap HTML:");
                diemHTML=Double.parseDouble(scn.nextLine());
                System.out.println("Nhap CSS:");
                diemCSS=Double.parseDouble(scn.nextLine());
                student=new StudentIT(name,"IT",diemJava,diemHTML,diemCSS);
                return student;
            } else if (lop.equals("2")){
                System.out.println("Nhap ten:");
                name=scn.nextLine();
                System.out.println("Nhap Marketing:");
                diemMarketing=Double.parseDouble(scn.nextLine());
                System.out.println("Nhap Sales:");
                diemSales=Double.parseDouble(scn.nextLine());
                student=new StudentBiz(name,"Biz",diemMarketing,diemSales);
                return student;
            } else System.out.println("Vui long chon so tu menu");
        }
    }
    public static void getStudent(StudentFPT student,int index){
            if (student.getMajor().equals("IT")){
                System.out.println("Sinh viÃªn thá»© "+(index+1)+": TÃªn: "+student.getName()+" - NgÃ nh: "+student.getMajor()+" - Java: "+((StudentIT)student).getDiemJava()+" - HTML: "+((StudentIT)student).getDiemHTML()+" - CSS: "+((StudentIT)student).getDiemHTML()+" - Hoc luc: "+student.getHocLuc());
            }
            else {
                System.out.println("Sinh viÃªn thá»© "+(index+1)+": TÃªn: "+student.getName()+" - NgÃ nh: "+student.getMajor()+" - Marketing: "+((StudentBiz)student).getDiemMarketing()+" - Sales: "+((StudentBiz)student).getDiemSales()+" - Hoc luc: "+student.getHocLuc());
            }

    }
    public static void getStudentExcellent(StudentFPT[] studentList,int size){
        for (int i=0;i<size;i++){
            if (studentList[i].getHocLuc().equals("Gioi")){
                getStudent(studentList[i],i);
            }
        }
    }

}

