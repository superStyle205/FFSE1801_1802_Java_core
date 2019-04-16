package ASM06;

import java.util.ArrayList;
import java.util.Scanner;
import ASM06.common.*;

public class QLCB {
    ArrayList<NhanVien> dsNhanViens=new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    IDException idException = new IDException(dsNhanViens);
    LevelException levelException = new LevelException();
    PosException posException = new PosException();
    NameException nameException = new NameException();
    NumberException numberException = new NumberException();

    public void addGV(){
        System.out.println("Nhap ma giang vien:");
        String id="";
        while (id.equals("")){
            id=idException.idCheck(scanner.nextLine());
        }
        System.out.println("Nhap ten giang vien:");
        String name="";
        while (name.equals("")){
            name=nameException.nameCheck(scanner.nextLine());
        }
        System.out.println("Nhap he so luong giang vien:");
        double salary=-1;
        while(salary<0){
            salary=numberException.doubleCheck(scanner.nextLine());
        }
        System.out.println("Nhap phong ban:");
        String department=scanner.nextLine();
        System.out.println("Nhap trinh do:");
        System.out.println("1/ Cu nhan");
        System.out.println("2/ Thac si");
        System.out.println("3/ Tien si");
        String level="";
        while(level.equals("")){
            level=levelException.levelCheck(scanner.nextLine());
        }

        System.out.println("Nhap so lop trong tuan:");
        int classes=-1;
        while(classes<0){
            classes=numberException.intCheck(scanner.nextLine());
        }

        GiangVien giangVien=new GiangVien(id,name,salary,department,level,classes);
        dsNhanViens.add(giangVien);
    }

    public void addNV(){
        System.out.println("Nhap ma giang vien:");
        String id="";
        while (id.equals("")){
            id=idException.idCheck(scanner.nextLine());
        }
        System.out.println("Nhap ten nhan vien:");
        String name="";
        while (name.equals("")){
            name=nameException.nameCheck(scanner.nextLine());
        }
        System.out.println("Nhap he so luong nhan vien:");
        double salary=-1;
        while(salary<0){
            salary=numberException.doubleCheck(scanner.nextLine());
        }
        System.out.println("Nhap phong ban:");
        String department=scanner.nextLine();
        System.out.println("Nhap chuc vu:");
        System.out.println("1/ Truong phong");
        System.out.println("2/ Pho phong");
        System.out.println("3/ Nhan vien");
        String pos="";
        while(pos.equals("")){
            pos=posException.posCheck(scanner.nextLine());
        }
        System.out.println("Nhap so ngay cong trong thang:");
        int workDays=-1;
        while(workDays<0){
            workDays=numberException.intCheck(scanner.nextLine());
        }
        GiangVien giangVien=new GiangVien(id, name,salary,department,pos,workDays);
        dsNhanViens.add(giangVien);
    }

    public void showGiangVienInfo(GiangVien giangVien){
        System.out.println("Ma giang vien: " + giangVien.getId());
        System.out.println("Ten giang vien: " + giangVien.getName());
        System.out.println("Luong giang vien: " + giangVien.getSalary());
        System.out.println("Phu cap: " + giangVien.getBonus());
        System.out.println("Khoa: " + giangVien.getDepartment());
        String level;
        if (giangVien.getLevel().equals("1")){
            level="Cu nhan";
        } else if (giangVien.getLevel().equals("2")){
            level="Thac si";
        } else {
            level="Tien si";
        }
        System.out.println("Trinh do: " + level);
        System.out.println("So tiet day: " + giangVien.getClasses());
    }

    public void showNhanVienHCInfo(NhanVienHC nhanVienHC){
        System.out.println("Ma nhan vien: " + nhanVienHC.getId());
        System.out.println("Ten nhan vien: " + nhanVienHC.getName());
        System.out.println("Luong nhan vien: " + nhanVienHC.getSalary());
        System.out.println("Phu cap: " + nhanVienHC.getBonus());
        System.out.println("Phong ban: " + nhanVienHC.getDepartment());
        String pos;
        if (nhanVienHC.getPos().equals("1")){
            pos="Truong phong";
        } else if (nhanVienHC.getPos().equals("2")){
            pos="Pho phong";
        } else {
            pos="Nhan vien";
        }
        System.out.println("Trinh do: " + pos);
        System.out.println("So ngay cong: " + nhanVienHC.getWorkDays());
    }

    public void showListGiangVien(String department){
        if (dsNhanViens.size()==0){
            System.out.println("Du lieu khong co");
        } else {
            for (NhanVien giangVien : dsNhanViens){
                if (giangVien instanceof GiangVien){
                    if (((GiangVien)giangVien).getDepartment().toUpperCase().equals(department.toUpperCase())){
                        showGiangVienInfo((GiangVien)giangVien);
                        System.out.println();
                    }
                }
            }
        }
    }

    public void showListNhanVien(String department){
        if (dsNhanViens.size()==0){
            System.out.println("Du lieu khong co");
        } else {
            for (NhanVien nhanVienHC : dsNhanViens){
                if (nhanVienHC instanceof NhanVien){
                    if (((NhanVienHC)nhanVienHC).getDepartment().toUpperCase().equals(department.toUpperCase())){
                        showNhanVienHCInfo((NhanVienHC)nhanVienHC);
                        System.out.println();
                    }
                }
            }
        }
    }

    public void totalSalary(){
        double totalSalary=0;
        if (dsNhanViens.size()!=0){
            for (NhanVien nhanVien : dsNhanViens){
                totalSalary+=nhanVien.getSalary();
            }
        }
        System.out.println("Tong luong cac nhan vien la:" + totalSalary);
    }

    public void sortListNhanVien(){
        NhanVien nhanVienTmp;
        for(int i = 0; i < dsNhanViens.size()-1; i++) {
            for(int j = i+1; j < dsNhanViens.size(); j++) {
                if(dsNhanViens.get(i).getSalary()>dsNhanViens.get(j).getSalary()) {
                    nhanVienTmp=dsNhanViens.get(i);
                    dsNhanViens.set(i,dsNhanViens.get(j));
                    dsNhanViens.set(j,nhanVienTmp);
                } else if (dsNhanViens.get(i).getSalary()==dsNhanViens.get(j).getSalary()) {
                    if(dsNhanViens.get(i).getName().compareTo(dsNhanViens.get(j).getName())>0) {
                        nhanVienTmp=dsNhanViens.get(i);
                        dsNhanViens.set(i,dsNhanViens.get(j));
                        dsNhanViens.set(j,nhanVienTmp);
                    }
                }

            }
        }
    }

    public void showAll(){
        for (NhanVien nhanVien : dsNhanViens){
            if (nhanVien instanceof NhanVienHC){
                showNhanVienHCInfo((NhanVienHC)nhanVien);
            } else {
                showGiangVienInfo((GiangVien) nhanVien);
            }
            System.out.println();
        }
    }

    public void menu(){
        System.out.println("Chon hanh dong tu menu: ");
        System.out.println("1/ Nhap thong tin giang vien");
        System.out.println("2/ Nhap thong tin nhan vien HC");
        System.out.println("3/ Xuat danh sach giang vien theo khoa");
        System.out.println("4/ Xuat danh sach nhan vien theo phong ban");
        System.out.println("5/ Tinh tong luong truong phai tra");
        System.out.println("6/ Sap xep danh sach giang vien theo luong/ten");
        System.out.println("7/ Hien thi tat ca can bo");
        System.out.println("8/ Thoat chuong trinh");
        while (true){
            switch(scanner.nextLine()){
                case "1":
                    addGV();
                    break;
                case "2":
                    addNV();
                    break;
                case "3":
                    System.out.println("Nhap khoa: ");
                    showListGiangVien(scanner.nextLine());
                    break;
                case "4":
                    System.out.println("Nhap phong ban: ");
                    showListNhanVien(scanner.nextLine());
                    break;
                case "5":
                    totalSalary();
                    break;
                case "6":
                    sortListNhanVien();
                    showAll();
                    break;
                case "7":
                    showAll();
                    break;
                case "8":
                    System.exit(0);
                default:
                    System.out.println("Vui long chon hanh dong tu menu!");
            }
            System.out.println("Chon hanh dong tiep theo:...");
        }
    }

    public QLCB(){
        GiangVien giangVien1=new GiangVien("1","Khoa",2.5,"Tai chinh","1",30);
        GiangVien giangVien2=new GiangVien("2","Viet",2,"Tai chinh","2",20);
        GiangVien giangVien3=new GiangVien("3","Luong",3.5,"Ke toan","3",35);
        NhanVienHC nhanVien1=new NhanVienHC("4","An",2.8,"Dao tao","1",28);
        NhanVienHC nhanVien2=new NhanVienHC("5","Quan",1,"Tai vu","2",24);
        NhanVienHC nhanVien3=new NhanVienHC("6","Dan",1.5,"Tuyen sinh","3",26);
        NhanVienHC nhanVien4=new NhanVienHC("7","Bao",1.5,"Tuyen sinh","3",26);
        dsNhanViens.add(nhanVien1);
        dsNhanViens.add(nhanVien2);
        dsNhanViens.add(nhanVien3);
        dsNhanViens.add(nhanVien4);
        dsNhanViens.add(giangVien1);
        dsNhanViens.add(giangVien2);
        dsNhanViens.add(giangVien3);
    }
}
