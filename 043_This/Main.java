public class Main {
    public static void main(String[] args) {
        String[] names = {"Grumpy", "Dopey", "Doc", "Happy", "Bashful", "Sneezy", "Sleepy"};
        Dwarf[] d = new Dwarf[100];
        for(int x = 0; x < 100; x++) {
            d[x] = new Dwarf();
            d[x].setName(names[(int) (Math.random() * names.length)]);
            d[x].setAge((int) (Math.random() * 100));
        }
        
        
        int count = 0;
        
        for(int c = 0; c < 100; c++) {
            if(d[c].isSameName(d[0].getName())) {
                count++;
            }
        }
        
        System.out.print((count - 1) + " duplicates found of the name '" + d[0].getName() + "'.");
    }
}