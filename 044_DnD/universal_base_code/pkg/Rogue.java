package pkg;
import java.util.Scanner;
import java.util.Random;


public class Rogue {
	private String name;
	private int health;
	private int attack;

	public Rogue() {
		this.name = "Rogue";
		this.health = 15;
		this.attack = 5;
	}

	public Rogue(String name, int health, int attack) {
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	
	public void setHealth(int h) {
		health = h;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Warrior w) {
		int dmg = (int) ((Math.random() * attack) + 1);
		w.setHealth(w.getHealth() - dmg);
		return;
	}

	public void attack(Wizard w) {
		int dmg = (int) ((Math.random() * attack) + 1);
		w.setHealth(w.getHealth() - dmg);
		return;
	}

}

