package neveen;

public class unery_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unery operator
		//+  plus operator
		//- minus operator
		//++ increment operator
		//-- degrement operator
		int a=5;
		System.out.println(a++);//post increment
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(++a);//pre increment
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(a--);//post degrement
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);//pre degrement
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		
		int a=5,b=6;
		System.out.println(a++ + ++a + a++ + ++a);
						//(5+7+7+9)
						//(12+16)
		System.out.println(++b - ++a + a++ + b++);
						//(7-6+6+7)
						//(1+13)
	}

}
