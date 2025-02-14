package METHODS_CONSTRUCTOR_OVERLOADING;

public class Constructor_Overloading_Persion {
    private int age;
    private String name;

    public Constructor_Overloading_Persion(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("name is "+name+", age is "+age);
    }

    public Constructor_Overloading_Persion(int age) {
        this.age = age;
        this.name="unknown";
        System.out.println("name is "+name+", age is "+age);

    }

    public Constructor_Overloading_Persion(String name) {
        this.name = name;
        this.age=0;
        System.out.println("name is "+name+", age is "+age);

    }
    public Constructor_Overloading_Persion()
    {
        this.age=0;
        this.name="unknown";
        System.out.println("name is "+name+", age is "+age);

    }
}
