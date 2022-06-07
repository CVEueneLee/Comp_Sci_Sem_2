public class Dwarf {
    private String name;
    private int age;
    
    public Dwarf() {
        name = "";
        age = 0;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String s) {
        name = s;
    }
    
    public void setAge(int x) {
        age = x;
    }
}