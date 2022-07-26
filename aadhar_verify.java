package neveen;

import java.util.Scanner;

public class aadhar_verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your nationality:");
		String nationality=scan.nextLine();
		if(nationality.equals("indian")) {
			System.out.println("you are selected "+nationality);
			System.out.println("enter your age:");
			int age=scan.nextInt();
			if(age>=18) {
				System.out.println("you are applyesd for voter id");
			}
			else {
				System.out.println("minimum age 18 so you are not apply for voter id");
			}
		}
		else {
			System.out.println("you are not a indian");
		}
	}

}
