public class Main {
    
    public static void main(String[] args) {
        Wizard[] Wizards = new Wizard[50];
        Warrior[] Warriors = new Warrior[50];
        
        int x = 0;
        int y = 0;
        
        for(int z = 0; z < 50; z++) {
            Wizards[z] = new Wizard();
            Warriors[z] = new Warrior();
        }
        
        while(true) {
            if (Wizards[x].isDead()) {
                x++;
                if (x >= 50) {
                    System.out.println("Warriors win! With " + (50 - y) + " remaining");
                    break;
                }
            }
            if (Warriors[y].isDead()) {
                y++;
                if (y >= 50) {
                    System.out.println("Wizards win! With " + (50 - x) + " remaining");
                    break;
                }
            }
            Wizards[x].attack(Warriors[y]);
            Warriors[y].attack(Wizards[x]);
        }
    }
}