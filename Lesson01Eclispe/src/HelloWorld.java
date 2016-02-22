import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		String myName = "";
		float myNumber = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		myName = input.nextLine();
		System.out.println("Your Name Is: " + myName);		
		
		System.out.println();
		
		System.out.print("Please Rate This Program From 1 - 10: ");
		myNumber = input.nextFloat();		
	    if(myNumber>=11){
			System.out.print("Error: Rating Must Be From 1 - 10");
		} else if(myNumber<=10)
		System.out.printf("Your Assigned Rating: %.2f", myNumber);
	}

}
