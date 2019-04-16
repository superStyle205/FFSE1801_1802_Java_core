package Lab6.common;

import Lab6.model.Database;

public class IDException extends Exception{
    private String message;
    Database database;

    public IDException(Database database){
        this.database=database;
    }

    IDException (String a){
        message=a;
    }

    public String toString(){
        return "ID "+message+" da ton tai trong Database";
    }

    public void checkID(String id) throws IDException {
        if(database.findId(id)!=-1){
            throw new IDException(id);
        }
    }

    public String idCheck(String id){
        try{
            checkID(id);
        } catch(IDException e){
            System.out.println(e);
            System.out.println("Vui long nhap lai");
            id="";
        }
        return id;
    }
}
