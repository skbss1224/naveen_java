package neveen;

import java.util.Scanner;

public class runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("integer");
		
		int integer=scan.nextInt();
		System.out.println(integer);
		System.out.println("byte");
		byte a=scan.nextByte();
		System.out.println(a);
		System.out.println("short");
		short b=scan.nextShort();
		System.out.println(b);
		System.out.println("long");
		long c=scan.nextLong();
		System.out.println(c);
		System.out.println("float");
		float d=scan.nextFloat();
		System.out.println(d);
		System.out.println("double");
		double e=scan.nextDouble();
		System.out.println(e);
		System.out.println("enter the string:");
		String hello=scan.nextLine();
		System.out.println("your string value is"+hello);
	}

}
