import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior t = new Warrior();
		System.out.println("Our warrior's name is " + t.getName());
		t.printArt();
		Wizard w = new Wizard();
		System.out.println("Our wizard's name is " + w.getName());
		w.printArt();
		Rogue r = new Rogue("Bob", 15, 15);
		System.out.println("Our Rogue's name is " + r.getName());
		System.out.println("\n" + "No art with this one :(");

		
	}
}
