package neveen;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float salary,tax,mbal,qbal,hbal,ybal;
		float gst=(float)7.5;
		System.out.println("enter your monthly salary: ");
		salary=sc.nextFloat();
		//monthly
		tax=salary*gst/100;
		mbal=salary-tax;
		System.out.println("your monthly salary will be" +mbal);
		System.out.println("your monthly tax will be "+tax);
		System.out.println();
		//3month
		salary*=3;
		tax=salary*gst/100;
		qbal=salary-tax;
		System.out.println("your quarterly salary will be" +qbal);
		System.out.println("your quarterly tax will be "+tax);
		System.out.println();
		//6 month
		salary*=2;
		tax=salary*gst/100;
		hbal=salary-tax;
		System.out.println("your half salary will be" +hbal);
		System.out.println("your half tax will be "+tax);
		System.out.println();
		//1year
		salary*=2;
		tax=salary*gst/100;
		ybal=salary-tax;
		System.out.println("your year salary will be" +ybal);
		System.out.println("your year tax will be "+tax);
		System.out.println();
	}

}
