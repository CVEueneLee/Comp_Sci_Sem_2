import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a name: ");
		String a = sc.nextLine();
		System.out.println("How many times should the name be printed: ");
		int b = sc.nextInt();
		while(true){
			for(int i = 1;i<=b;i++){
				System.out.println(a);
			}
			break;
			
		}

		


		
	}
}
