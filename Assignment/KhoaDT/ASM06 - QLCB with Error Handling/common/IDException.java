package ASM06.common;

import ASM06.NhanVien;

import java.util.ArrayList;

public class IDException extends Exception{
    private String message;
    ArrayList<NhanVien> dsNhanViens;

    public IDException(ArrayList<NhanVien> dsNhanViens){
        this.dsNhanViens=dsNhanViens;
    }

    public int findId(String id){
        int size=dsNhanViens.size();
        for (int i=0;i<size;i++){
            if (dsNhanViens.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    IDException (String a){
        message=a;
    }

    public String toString(){
        return "ID "+message+" da ton tai trong Database";
    }

    public void checkID(String id) throws IDException {
        if(findId(id)!=-1){
            throw new IDException(id);
        }
    }

    public String idCheck(String input){
        String id=input;
        try{
            checkID(id);
        } catch (IDException e){
            System.out.println(e);
            System.out.println("Vui long nhap lai");
            id="";
        }
        return id;
    }
}
