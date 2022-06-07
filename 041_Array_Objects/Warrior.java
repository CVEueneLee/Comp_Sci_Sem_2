public class Warrior {
    
    private int health;
    
    public Warrior() {
        health = 100;
    }
    
    public boolean isDead() {
        if (health <= 0) {
            return true;
        }
        return false;
    }
    
    public void attack(Wizard w) {
        w.removeHealth(15);
    }
    
    public void removeHealth(int x) {
        health = health - x;
    }
    
}