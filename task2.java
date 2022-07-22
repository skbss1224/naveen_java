package neveen;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("your age is "+age);
			System.out.println("enter your weight:");
			int weight=sc.nextInt();
			if(weight>=50) {
				System.out.println("you can donate blood");
			}
			else {
				System.out.println("you can't donate blood");
			}
		}
		else {
			System.out.println("you din't have age 18");
		}
	}

}
