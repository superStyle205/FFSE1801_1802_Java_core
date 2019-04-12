package QLTD.test;

import java.util.Scanner;

import QLTD.model.Customer;
import QLTD.model.Receipt;
import QLTD.model.getAll;

public class test {
	public static void main(String[] args) {
		
		getAll dsKH = new getAll();
		
		System.out.println("Name");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Adress");
		String adress = new Scanner(System.in).nextLine();
		System.out.println("Number New");
		double N_New = new Scanner(System.in).nextDouble();
		System.out.println("Number Old");
		double N_Old = new Scanner(System.in).nextDouble();
		
		dsKH.addd(new Customer(name,adress, new Receipt(N_New, N_Old)));
		
		dsKH.out();
		
	}
}
