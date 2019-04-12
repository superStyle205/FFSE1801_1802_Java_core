package lap1;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
public class lap14 {
	public static int n, a[];
    public static void Capnhat() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử mảng:");
        n = in.nextInt();
        a = new int[n];
        System.out.print("Nhập các phần tử mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }
    }
 
    public static void Hienthi() {
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
        System.out.println();
    }
    
    public static void displayEvenNumber() {
    	int c = 0;
        int ch[] = new int[n];  
        int le[] = new int[n];
		for (int i = 0; i < n; i++) {
	        
	        if (a[i] % 2 == 0) {
	            ch[c] = a[i];
	            c++;
	        } 
	    }
		System.out.println("Danh sách số chẵn là: ");
	    for (int i = 0; i < c; i++) {
	        System.out.print(ch[i] + "\t");
	    }   
	}
    
    public static void increaseSort() {
    	int tmp = a[0];
    	for(int i=0; i< a.length - 1; i++) {
    		for(int j = i +1; j < a.length; j++) {
    			if(a[i]>a[j]) {
    				tmp = a[j];
    				a[j] = a[i];
    				a[i]= tmp;
    			}
    		}
    	}
    	for (int i = 0; i < a.length; i++) {
            System.out.print("danh sách số thứ tự giảm dần" + a[i]);
        }
    }
    
    public static void reduceSort() {
    	int tmp = a[0];
    	for(int i=0; i < a.length - 1; i++) {
    		for(int j = i +1; j < a.length; j++) {
    			if(a[i] < a[j]) {
    				tmp = a[j];
    				a[j] = a[i];
    				a[i]= tmp;
    			}
    		}
    	}
    	for (int i = 0; i < a.length; i++) {
            System.out.print("danh sách số thứ tự giảm dần" + a[i] );
        }
    }
    
    public static void sum() {
    	int tong = 0;
    	for ( int i = 0; i < n ; i ++){
            tong = tong + a[i];
        }
        System.out.println("Tong cua cac phan tu trong mang la : " + tong);
    }
    
    public static void search() {
    	System.out.println("Nhập số nguyên cần tìm: ");
    	Scanner in = new Scanner(System.in);
        int k = in.nextInt();
    	int l;
    	int d = 0;
    	int c = n - 1;
    	while(d <= c) {
    		l =(d+c) / 2;
    		if(a[l] == k) {
    			System.out.println("Tìm thấy phần tử " + k + " tại vị trí " + l);
    			return;
    		} else if (a[l] < k){
    			d = l + 1;
    		} else {
    			c = l - 1;
    		}
    	}
    	System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
    }
    
    public static void max() {
    	int max = 0;
    	for(int i = 0 ; i < n ; i ++){
            if ( i == 0 ){
                max = a[i];
            }else if (a[i] > max){
                max = a[i];
            }
        }
    	System.out.println("Gia tri lon cua cac phan tu trong mang la : " + max);
    }
    
    public static void min() {
    	int min = 0;
    	for(int i = 0 ; i < n ; i ++){
            if ( i == 0 ){
                min = a[i];
            }else if (a[i] < min){
                min = a[i];
            }
        }
    	System.out.println("Gia tri nho nhat cua cac phan tu trong mang la : " + min);
    }
    
    public static void oddSum() {
    	int tong = 0;
    	for (int i = 0; i < n; i++ ) {
    	    if (a[i] % 2 == 1) {
    	            tong +=  a[i];
    	        }
    	    } 
    	    System.out.println("Tong cac so le la :" + tong);
    }
    
    
   public static boolean KTSoNguyenTo(int n) {
	   if( n < 2) {
		   return false;
	   } else {
		   for(int i = 2; i <= n -1; i ++){
	           if ( n % i == 0) 
	        	   return false;
	       }
	       return true;
	   }
   }
   public static void primeSum() {
       int tong = 0;
       for(int i=0; i < n; i++) {
           if(KTSoNguyenTo(a[i])) {
               tong += a[i];
            }
       }
       System.out.println("tong cac so nguyen to la:" + tong);
    }
    public static void repeatDelete() {
    	int[] b = new int[n];
    	int size = 0;
    	boolean isExist = false;
    	for (int i=0; i < n; i++) {
    		isExist = false;
    		for(int j=0; j < size; j++) {
    			if(a[i]==b[j]) {
    				isExist = true;
    				break;
    			}
    		}
    		if (!isExist) {
    			b[size++] = a[i];
    		}
    	}
    	b = Arrays.copyOfRange(b, 0, size);// cat bo nhung phan tu du thua
        Arrays.sort(b);
    	System.out.println("Mang chi chua cac phan tu duy nhat: ");
        System.out.println(Arrays.toString(b));
    }
    
    public static void numberDelete() {
    	int size = 0;
    	int i,c = 0, k;
    	while(size <= 0){
    		System.out.print("Nhap so can xoa");
    		Scanner in = new Scanner(System.in);
    		k = in.nextInt();
    		for(c = i =0; i < n; i++){
    			if(a[i]!= k) {
    				a[c] = a[i];
    				c++;
    			}
    		}
    		size = c;
    		System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
    	    for (i = 0; i < size; i++) {
    	        System.out.print(a[i] + "\n");
    	    }
    	}
    }    
    public static void numberAdd() {
    	System.out.print(" so them moi");
		Scanner in = new Scanner(System.in);
			int soThemMoi = in.nextInt();
			soThemMoi = a[n];
			n=+1;
			for(int i=0; i < n; i++) {
				System.out.print(a[i] + "\n");
			}
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chon;
        do {
            System.out.println("1. Nhập");
            System.out.println("2. Hiển thị ");
            System.out.println("3. Hiển thị những số chẵn trong danh sách");
            System.out.println("4. Sắp xếp danh sách số thứ tự tăng dần");
            System.out.println("5. Sắp xếp danh sách số thứ tự giảm dần");
            System.out.println("6. Tìm 1 số trong mảng bằng với số nhập từ bàn phím");
            System.out.println("7. Tính tổng các phần tử trong danh sách");
            System.out.println("8. Tìm giá trị max trong danh sách");
            System.out.println("9. Tim gia tri min trong danh sách");
            System.out.println("10.Tính tổng các số lẻ trong mảng");
            System.out.println("11.Tính tổng các số nguyên tố trong mảng");
            System.out.println("12. Loại các số bị trùng lặp trong mảng");
            System.out.println("13.Update số tại vị trí nhập từ bàn phím");
            System.out.println("14.Xóa 1 số bằng với số nhập từ bàn phím");
            System.out.println("15.Thêm 1 số vào mảng");
            System.out.println("16.Kiểm tra mảng đó co chẵn lẽ");
            System.out.println("17.Thoát chương trình");
            chon = in.nextInt();
            switch (chon) {
                case 1:
                	Capnhat();
                    break;
                case 2:
                    Hienthi();
                    break;
                case 3:
                	displayEvenNumber();
                	break;
                case 4:
                	increaseSort();
                	break;
                case 5:
                	reduceSort();
                	break;
                case 6:
                	search();
                	break;
                case 7:
                	sum();
                	break;
                case 8:
                	max();
                	break;
                case 9:
                	min();
                	break;
                case 10:
                	oddSum();
                	break;
                case 11:
                	primeSum();
                	break;
                case 12:
                	repeatDelete();
                	break;
                case 13:
                	numberDelete();
                	break;
                case 14:
                	numberAdd();
                	break;
                case 15:
                    System.out.println("�?ã thoát!");
                    System.exit(0);
            }
        } while (chon != 0);
    }
}