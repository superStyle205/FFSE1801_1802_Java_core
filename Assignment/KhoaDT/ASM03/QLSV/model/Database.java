package QLSV.model;

import QLSV.model.bean.Student;
import QLSV.controller.StudentManager;

public class Database {
    public final int MAX_LEN=100;
    int size=0;


    Student[] studentArr=new Student[MAX_LEN];

    public void add(Student studentTemp){
        studentArr[size]=studentTemp;
        size++;
    }

    public void update(int index, Student studentTemp){
        for (int i=0;i<size;i++){
            if (studentArr[i].getId().equals(index)){
                studentArr[i]=studentTemp;
            }
        }
    }

    public boolean delete(String id){
        for (int i=0;i<size;i++){
            if (studentArr[i].getId().equals(id)){
                for (int j=i; j<size-1;j++){
                    studentArr[j]=studentArr[j+1];
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
        for (int i=0;i<size;i++){
            if (studentArr[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public Student [] list(){
        Student[] studentTempArr=new Student[size];
        for (int i=0;i<size;i++){
            studentTempArr[i]=studentArr[i];
        }
        return studentTempArr;
    }
    public int getSize(){
        return size;
    }
}
