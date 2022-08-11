package neveen;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String tech="";
		
		System.out.println("---------------cognizant-----------------");
		int expected=2;
		while(expected>0) {
			System.out.println("tell us what technology do you want:");
			tech=scan.next();
			switch(tech)
			{
			case"java":case"spring":case"hypernate":case"jpa":System.out.println(tech+"web developer available so we recruite you");
			expected--;
			
			break;
			case"python":System.out.println("python testing role available so we recruite you");
			expected--;
			break;
			default:System.out.println("we don't have any roles for"+tech);
			
			}
		}
		scan.close();
		System.out.println("dont use next time");
	}
	

}
