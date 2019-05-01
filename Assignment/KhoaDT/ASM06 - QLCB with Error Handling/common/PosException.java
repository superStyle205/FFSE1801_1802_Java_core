package ASM06.common;

import java.util.Arrays;

public class PosException extends Exception {
    String [] posArray;
    private String message="Vui long nhap chuc vu theo yeu cau";
    public PosException(){
        posArray=new String []{"TRUONG PHONG","PHO PHONG","NHAN VIEN"};
    }

    public String toString(){
        return message;
    }

    public void checkPos(String pos) throws PosException {
        if(!Arrays.asList(posArray).contains(pos.trim().toUpperCase())){
            throw new PosException();
        }
    }

    public String posCheck(String input){
        String pos;
        try{
            checkPos(input.trim());
            if (input.trim().toUpperCase().equals("TRUONG PHONG")){
                pos="1";
            } else if (input.toUpperCase().equals("PHO PHONG")) {
                pos="2";
            } else {
                pos="3";
            }
        } catch (PosException e){
            System.out.println(e);
            System.out.println("Vui long nhap lai");
            pos="";
        }
        return pos;
    }
}
