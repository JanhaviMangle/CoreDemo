import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		
		 Scanner sum1=new Scanner(System.in);

		    int n,sum=0,i;

		    System.out.println("Enter the range of number:");

		    n=sum1.nextInt();

            for(i=1;i<=n;i++)

		        sum+=i;

		    System.out.println("The sum of the series = "+sum);


	}

}
