package lap1;
import java.util.Arrays;
import java.util.Scanner;
public class lap12 {
	public static void main(String[]args){
		Scanner so = new Scanner(System.in);
		int array[] = new int[100];
		System.out.println("nhap phan tu cho mang: ");
		System.out.println("nhap \"exit\"de hoan tat");
		int size = 0;
		String soNhap;
		while(true) {
			System.out.print("nhập phần tử thứ " +(size +1)+":");
			soNhap = so.nextLine();
			if(soNhap.equals("exit")) {
				break;
			}else {
				array[size] =Integer.parseInt(soNhap);
			size++;
			}
		}
		soChan(array,size);
		hienThi(array,size);
		tangDan(array,size);	
		loaiSoTrung(array,size);		
	}
//	1 hienThị
	public static void hienThi(int array[], int a) {
		for(int i = 0; i < a; i++) {
			System.out.print(array[i] +"");		
		}	
	}
// 2 hiện thị số chẵn
	public static void soChan(int array[] , int a) {
		for(int i = 0; i < a; i++) {
			if(array[i] % 2 == 0) {
				System.out.print(array[i] +" ");
			}
		}
	}
//3 tăng dần 
	public static void tangDan(int array[], int a) {
		int temp = array[0];
		for(int i = 0; i < a-1; i++ ) {
			for(int j = i + 1; j < a; j++) {
				if(array[i] < array[j]) {
				   temp = array[i];
				   array[i] = array[j];
				   array[j] = temp;	 
				}
			}
		}	
	}
	public static void show(int [] arr[], int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i] + " ");
        }
    }
//	bài 11  Loại các số bị trùng lặp trong mảng (ví 1 xuất hiện 3 lần thì loại 2 số 1 còn lại kia đi)
	
	public static void loaiSoTrung(int array[],int a) {
		int[] b= new int[a];
		int size = 0;
		boolean tonTai = false;
		for (int i = 0; i < a; i++) {
			tonTai = false;
			for( int j = 0; j < size; j++) {
				if(array[i] == b[j]) {
					 tonTai = true;
					 break;
				}
			} if(!tonTai) {
				b[size++]= array[i];
			}
		}
		b = Arrays.copyOfRange(b, 0, size);
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}
//	. Update số tại vị trí nhập từ bàn phím
    public static void  Update(int array, int a) {
    	Scanner scanner = new Scanner(System.in);
		System.out.print("NHẬP số nhập");
		int	soNhap = scanner.nextInt();
		if(a < soNhap) {
			for(int i = 0; i < a; i++) {
							}
		}
		}    		
    }


