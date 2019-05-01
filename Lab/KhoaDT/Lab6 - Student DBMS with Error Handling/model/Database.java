package Lab6.model;

import Lab6.model.bean.Student;

import java.util.ArrayList;

public class Database {

    ArrayList<Student> studentArr=new ArrayList<>();
    {
        Student student1=new Student("1","Khoa",23,"Nguyen thien ke",3.52);
        Student student2=new Student("2","Viet",18,"Le Duan",4.0);
        Student student3=new Student("3","Luong",25,"Ngo Quyen",3);
        Student student4=new Student("4","Quan",19,"Quang Tri",3);
        Student student5=new Student("5","Ân",18,"Hue",3);
        studentArr.add(student1);
        studentArr.add(student2);
        studentArr.add(student3);
        studentArr.add(student4);
        studentArr.add(student5);
    }

    public void add(Student studentTemp){
        studentArr.add(studentTemp);
    }

    public void update(int index, Student studentTemp){
        for (Student student : studentArr){
            if (student.getId().equals(index)){
                student=studentTemp;
            }
        }
    }

    public boolean delete(String id){
        int size=studentArr.size();
        for (int i=0;i<size;i++){
            if (studentArr.get(i).getId().equals(id)){
                for (int j=i; j<size-1;j++){
                    studentArr.set(j,studentArr.get(j+1));
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public void sort(){

    }
    public int findId(String id){
        int size=studentArr.size();
        for (int i=0;i<size;i++){
            if (studentArr.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Student> list(){
        return studentArr;
    }
    public int getSize(){
        return studentArr.size();
    }
}
