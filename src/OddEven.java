import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

int n;
Scanner s= new Scanner(System.in);
System.out.println("enter the no");
n = s.nextInt();
if(n % 2 == 0)
{
	System.out.println("no is even");
}
else
{
	System.out.println("no is odd");
}
}

	}


