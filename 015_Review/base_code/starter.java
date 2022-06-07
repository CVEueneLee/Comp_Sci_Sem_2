import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name?: ");
		String name = sc.nextLine();
		
		System.out.print("What is your title?Ex:Slayer of Dragons: ");
		String title = sc.nextLine();
		
		System.out.print("Do you want to be a wizard, warrior, or rogue: ");
		String a = sc.nextLine();
		
		if(a.equals("wizard")){
			System.out.println("You have chosen the wizard! How incredible!");
		}
		
		else if(a.equals("warrior")){
			System.out.println("You have chosen the warrior! How Brave!");
		}
		
		else if(a.equals("rogue")){
			System.out.println("You have chosen the rogue! How cunning!");
		}
		
		else{
			System.out.println("You did not input a valid role");
		}	
		
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		System.out.println("You have " + (25-strength) + " points left to spend.");
		
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		System.out.println("You have " + (25-strength-dexterity) + " points left to spend.");
		
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		System.out.println("You have " + (25-strength-dexterity-intelligence) + " points left to spend.");
		if((25-strength-dexterity-intelligence)==0){
			System.out.print("You have no points remaining.");
			return;
		}
		
		else if((25-strength-dexterity-intelligence)<0){
			System.out.println("You do not have enough points to use this much");
			return;
		}
		
		System.out.print("Constitution (1-10): ");
		int constitution = sc.nextInt();
		System.out.println("You have " + (25-strength-dexterity-intelligence-constitution) + " points left to spend.");
		if((25-strength-dexterity-intelligence-constitution)==0){
			System.out.print("You have no points remaining.");
			return;
		}
		
		else if((25-strength-dexterity-intelligence-constitution)<0){
			System.out.println("You do not have enough points to use this much");
			return;
		}
		
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		System.out.println("You have " + (25-strength-dexterity-intelligence-constitution-charisma) + " points left to spend.");
		if((25-strength-dexterity-intelligence-constitution-charisma)==0){
			System.out.print("You have no points remaining.");
		}
		
		else if((25-strength-dexterity-intelligence-constitution-charisma)<0){
			System.out.println("You do not have enough points to use this much");
			return;
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("------------------------------------------------------");
		
		System.out.println("You are " + name + " the person of " + title);
		System.out.println("You're a " + a + " with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Constitution - " + constitution);
		System.out.println("Charisma - " + charisma);
		
		System.out.println("Good luck on your quest " + name + "!");
		
		
		
		
		
		
		
		
		
	}
}
