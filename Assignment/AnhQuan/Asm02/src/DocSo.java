
import java.util.Scanner;



public class DocSo{ 
		public static void main(String args[]){ 
			int k = 9 ;
		do {
			Scanner myInput	= new Scanner(System.in);
			System.out.println("\nnhập 1 số trong khoảng từ 1 đến 9999 vào đây   : ");
			try{
			int number = myInput.nextInt();	
			int a = (number/10)%10;
			
			int b = number%10;
			int c = (number/100)%10;
			int d = number/1000;	 
			if(number > 0 && number <10000 ) {
			switch (d) {
			case 0:System.out.print("");break;
			case 1:System.out.print("một nghìn ");break;
			case 2:System.out.print("hai nghìn ");break;
			case 3:System.out.print("ba nghìn ");break;
			case 4:System.out.print("bốn nghìn ");break;
			case 5:System.out.print("năm nghìn ");break;
			case 6:System.out.print("sáu nghìn ");break;
			case 7:System.out.print("bảy nghìn ");break;
			case 8:System.out.print("tám  nghìn ");break;
			case 9:System.out.print("chín nghìn ");break;
			}
			switch (c) {
			case 0:System.out.print("");break;
			case 1:System.out.print("một trăm ");break;
			case 2:System.out.print("hai trăm ");break;
			case 3:System.out.print("ba  trăm ");break;
			case 4:System.out.print("bốn trăm ");break;
			case 5:System.out.print("năm trăm ");break;
			case 6:System.out.print("sáu trăm ");break;
			case 7:System.out.print("bảy trăm ");break;
			case 8:System.out.print("tám trăm ");break;
			case 9:System.out.print("chín trăm ");break;
			}
			switch (a) {
			case 0:System.out.print("");break;
			case 1:System.out.print("mười ");break;
			case 2:System.out.print("hai mười ");break;
			case 3:System.out.print("ba mươi ");break;
			case 4:System.out.print("bốn mươi ");break;
			case 5:System.out.print("năm mươi ");break;
			case 6:System.out.print("sáu mươi ");break;
			case 7:System.out.print("bảy mươi ");break;
			case 8:System.out.print("tám mươi ");break;
			case 9:System.out.print("chín mươi ");break;
			}
			switch (b) {
			case 0:System.out.print("");break;
			case 1:System.out.print("mot");break;
			case 2:System.out.print("hai");break;
			case 3:System.out.print("ba");break;
			case 4:System.out.print("bốn");break;
			case 5:System.out.print("nam");break;
			case 6:System.out.print("sáu");break;
			case 7:System.out.print("bảy");break;
			case 8:System.out.print("tám");break;
			case 9:System.out.print("chín");break;
			}
			}else {
				System.out.print("vui lòng nhập đúng giới hạn cho phép ");
			}
			}
			catch( Exception ex ) {
				System.out.print("vui lòng nhập số  ");
			}
	}while( k != 0);
		}
}