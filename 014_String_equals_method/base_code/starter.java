import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to be a wizard, warrior, or rogue: ");
		String a = sc.nextLine();
		
		if(a.equals("wizard")){
			System.out.println("You are a wizard");
		}
		
		else if(a.equals("warrior")){
			System.out.println("You are a warrior");
		}
		
		else if(a.equals("rogue")){
			System.out.println("You are a rogue");
		}
		
		else{
			System.out.println("You did not input a valid role");
		}
		
	}
}
