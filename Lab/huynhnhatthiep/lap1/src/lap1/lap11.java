package lap1;
import java.util.Scanner;
public class lap11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] SV = 	new String[2];
		System.out.println("nhap ten sv");
		SV[0] = sc.nextLine();
		System.out.println("diem TB");
		SV[1] = sc.nextLine();
		double DTB = Double.valueOf(SV[1]);
		if(0.0 <= DTB && DTB <= 10.0) {
			if(DTB < 5) {
				System.out.println("hoc sinh "+SV[0]+" Có diem tb la: "+DTB+" HOC lUC:  yeu");
			} else if(DTB >= 5 && DTB < 6.5) {
				System.out.println("hoc sinh "+SV[0]+" Có diem tb la: "+DTB+" HOC lUC: trung binh");
			} else if(DTB >= 6.5  && DTB <7.5) {
				System.out.println("hoc sinh "+SV[0]+" Có diem tb la: "+DTB+"  HOC lUC: kha");
			}else if(DTB >= 7.5  && DTB <9) {
				System.out.println("hoc sinh "+SV[0]+" Có diem tb la: "+DTB+" HOC lUC: gioi");
			}
			else if(DTB >= 9) {
				System.out.println("hoc sinh "+SV[0]+" Có diem tb la: "+DTB+" HOC lUC: xuat sat");
			}
		}
	}
}


