package METHODS_CONSTRUCTOR_OVERLOADING;

public class Constructor_2_Account {
    private int id;
    private String name;
    private double valance;

    public Constructor_2_Account(int id, String name, double valance) {
        this.id = id;
        this.name = name;
        this.valance = valance;
    }
    public void show()
    {
        System.out.println("The id is "+this.id+", name is "+this.name+", and valance is "+this.valance);
    }
}
