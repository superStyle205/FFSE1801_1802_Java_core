package ThuTienDien;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement{
    private ArrayList<ChuHo> chuHoList=new ArrayList<ChuHo>();
    private int size;
    Scanner scanner=new Scanner(System.in);

    public CustomerManagement() {
        init();
    }

    public ChuHo addChuHo(){
        ChuHo chuHo;
            System.out.println("Nhap ten khach hang:");
            String name= scanner.nextLine();
            System.out.println("Nhap dia chi khach hang:");
            String address= scanner.nextLine();
            System.out.println("Nhap ma counter:");
            String counter= scanner.nextLine();
            System.out.println("Nhap chi so cu:");
            double oldIndex= Double.parseDouble(scanner.nextLine());
            while (oldIndex<0){
                System.out.println("Chi so cu khong nho hon 0.");
                oldIndex= Double.parseDouble(scanner.nextLine());
            }

            System.out.println("Nhap chi so moi:");
            double newIndex= Double.parseDouble(scanner.nextLine());
            while (newIndex-oldIndex<0){
                System.out.println("Chi so moi khong nho hon chi so cu.");
                newIndex= Double.parseDouble(scanner.nextLine());
            }

            BienLai bienLai=new BienLai(counter,oldIndex,newIndex);
            chuHo=new ChuHo(name,address,bienLai);
            System.out.println("---****  Nhap thanh cong!  ****---");
            add(chuHo);
            return chuHo;
//        }
    }
    public void add(ChuHo chuHo){
        chuHoList.add(chuHo);
        size=chuHoList.size();
    }

    public void getChuHo(){
        for (int i=0;i<size;i++){
            System.out.println("Thong tin khach hang thu "+(i+1)+":");
            System.out.println("1/ Ten khach hang:"+chuHoList.get(i).getName());
            System.out.println("2/ Dia chi khach hang:"+chuHoList.get(i).getAddress());
            System.out.println("3/ Ma counter:"+chuHoList.get(i).getBienLai().getCounter());
            System.out.println("4/ Chi so trong thang:"+chuHoList.get(i).getBienLai().getCount());
            System.out.println("5/ Chi phi tien dien:"+chuHoList.get(i).getBienLai().getCost());
            System.out.println();
        }
    }

    public void init(){
        BienLai bienlai1=new BienLai("XA1",500,700);
        BienLai bienlai2=new BienLai("YA2",420,800);
        BienLai bienlai3=new BienLai("UB3",200,380);
        ChuHo chuHo1=new ChuHo("Khoa Do", "Ngo Quyen",bienlai1);
        ChuHo chuHo2=new ChuHo("Viet Nguyen", "Dien bien",bienlai2);
        ChuHo chuHo3=new ChuHo("Luong Tam", "Quang Tri",bienlai3);
        add(chuHo1);
        add(chuHo2);
        add(chuHo3);
    }

}
