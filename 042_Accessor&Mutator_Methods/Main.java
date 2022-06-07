public class Main {
    public static void main(String[] args) {
        String[] names = {"Grumpy", "Dopey", "Doc", "Happy", "Bashful", "Sneezy", "Sleepy"};
        Dwarf[] d = new Dwarf[100];
        for(int x = 0; x < 100; x++) {
            d[x] = new Dwarf();
            d[x].setName(names[(int) (Math.random() * names.length)]);
            d[x].setAge((int) (Math.random() * 100));
            
        }
        
        for(Dwarf dd : d) {
            System.out.println(dd.getName() + ": Age " + dd.getAge());
        }

    }
}