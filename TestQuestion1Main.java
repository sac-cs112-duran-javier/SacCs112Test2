import java.util.Scanner;

public class TestQuestion1Main {
	
	public static void main (String[] args){
		
		int choice;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Hi, how many dice would you like to throw?: ");
		choice = input.nextInt();
		System.out.println("You have rolled a total of " + TestQuestion1.OneThrow(choice));
	}
}


