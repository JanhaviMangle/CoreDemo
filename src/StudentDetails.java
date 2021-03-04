import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		String name;
        int roll, math, phy, eng, bio, chem;
         
        Scanner SC = new Scanner(System.in);
         
        System.out.print("Enter Name: ");
        name=SC.nextLine();
        System.out.print("Enter Roll Number: ");
        roll=SC.nextInt();
        System.out.print("Enter marks in Maths, Physics, Biology, Chemistry and English: ");
        math=SC.nextInt();
        phy=SC.nextInt();
        eng=SC.nextInt();
        bio=SC.nextInt();
        chem=SC.nextInt();
         
        int total=math+eng+phy+bio+chem;
        float perc=(float)total/500*100;
         
        System.out.println("Roll Number:" + roll +"\tName: "+name);
        System.out.println("Marks (Maths, Physics, English, Biology, Chemistry): " +math+","+phy+"," +bio+ "," +chem+ ","+eng);
        System.out.println("Total: "+total +"\tPercentage: "+perc);

	}

}
