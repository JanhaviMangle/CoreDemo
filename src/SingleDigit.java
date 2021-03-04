import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int a;
		System.out.println("please enter a number");
		a = reader.nextInt();
		if ((a > 9 && a < 10) || (a > -9 && a < -10)); 
		{
			System.out.println(true);
			main(args);
		}
		 {
			System.out.println(false);
			main(args);
		
		}

	}

}
