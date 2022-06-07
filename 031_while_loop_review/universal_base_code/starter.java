import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		
		while(true){
			for(int i = 0;i<=100;i++){
				int num = rand.nextInt(100)+1;
				System.out.println(num);
			}
		}


		
	}
}
