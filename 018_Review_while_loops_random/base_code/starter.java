import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true){
			Random rand = new Random();
			int random = rand.nextInt(999) + 1;
			System.out.println(random);
			System.out.println("Please guess a number 1 to 1000");
			int x = sc.nextInt();
			if(x == random){
				System.out.println("You guessed right!");
				break;
			}
		}



		
	}
}
