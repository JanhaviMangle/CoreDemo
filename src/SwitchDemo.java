import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int a,b,res;
		String op;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 nos");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("enter operator:"); 
		op=s.next();
		
		switch (op) 
		{
		case "+": res=a+b;
		System.out.println("the addition is :"+res);	
			break;
			case

		default:
			break;
		}
		
	}

}
