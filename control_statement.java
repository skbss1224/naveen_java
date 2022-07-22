package neveen;

import java.util.Scanner;

public class control_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value:");
		int a=sc.nextInt();
		System.out.println("enter the b value:");
		int b=sc.nextInt();
		if(a<b) {
			System.out.println("b value is big");
		}
		else if(a>b) {
			System.out.println("a value is big");
			
		}
		else {
			System.out.println("none of these");
		}
	}

}
