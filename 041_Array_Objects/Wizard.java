public class Wizard {
    
    private int health;
    
    public Wizard() {
        health = 100;
    }
    
    public boolean isDead() {
        if (health <= 0) {
            return true;
        }
        return false;
    }
    
    public void attack(Warrior w) {
        w.removeHealth(15);
    }
    
    public void removeHealth(int x) {
        health = health - x;
    }
    
}