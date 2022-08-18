package neveen;

import java.util.Scanner;

public class demoswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to anitha enterprises");
		Scanner scan=new Scanner(System.in);
		String usage="",brand="";
		int gpu=0,price=0;
		System.out.println("tell us usage of the laptop");
		usage=scan.next();
		switch(usage)
		{
		case"it":case"IT":
			System.out.println("you have asked for it professional usage");break;
		case"accounts":System.out.println("you have asked for accounts purpose");break;
		case"gamers":case"vfx":System.out.println("you need cpu for high performance");
			System.out.println("tell us cpu capacity:");
			gpu=scan.nextInt();
			switch(gpu)
			{
			case 2:System.out.println("2GB nvidia cpu available in sony/lenovo");break;
			case 4:System.out.println("4GB intel ATI/Nvidia cpu available in dell/sony");break;
			case 8:System.out.println("8GB nvidia cpu available in hp/acer");
				System.out.println("tell us price:");
				price=scan.nextInt();
				if(price>=51000&&price<=80000)
					System.out.println("acer available");
				else if(price>=80001&&price<=124000)
					System.out.println("hp laptop available");
				else
					System.out.println("nothin matched for "+price);
				break;
			case 16:System.out.println("16GB nvidia available in hp /sony");
				System.out.println("tell us brand");
				brand=scan.next();
				switch(brand)
				{
				case"hp":case"HP":System.out.println("hp laptop available in 58000 to 81000");break;
				case"sony":System.out.println("sony available between 82000 to 134000");break;
				default:System.out.println("invalid brand"+brand);
				}
				break;
			default:System.out.println("no laptop matched with cpu of"+gpu);
			}
			break;
		default:System.out.println("you can use basic configuration");
		}
		scan.close();
	}

}
