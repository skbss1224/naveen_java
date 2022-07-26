package neveen;

import java.util.Scanner;

public class mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your language:");
		String language=scan.nextLine();
		if(language.equals("tamil")) {
			System.out.println("tamil mark=78");
		}
		else if(language.equals("english")) {
			System.out.println("english=89");
		}
		else if(language.equals("maths")) {
			System.out.println("maths=66");
		}
		else if(language.equals("science")) {
			System.out.println("science=66");
		}
		else if(language.equals("social")) {
			System.out.println("social=66");
		}
		else {
			System.out.println("none of these subject");
		}
	}

}
