package lab.unit4;

//import Lab4.StudentFPT;

public class Database {
    private static StudentFPT[] students=new StudentFPT[100];
    private static int size=0;

    public void add (StudentFPT student){
        students[size++]=student;
    }

    public Database (){
        StudentBiz student1=new StudentBiz("Khoa","Biz",9,10);
        StudentBiz student2=new StudentBiz("Luong","Biz",6,8);
        StudentIT student3=new StudentIT("Dan","IT",7,6.5,8.5);
        StudentIT student4=new StudentIT("Viet","IT",6.5,9,8);
        add(student1);
        add(student2);
        add(student3);
        add(student4);
    }

    public int getSize (){
        return size;
    }
    public StudentFPT[] getData(){
        return students;
    }
}
