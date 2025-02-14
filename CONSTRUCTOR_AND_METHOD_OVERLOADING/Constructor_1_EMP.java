package METHODS_CONSTRUCTOR_OVERLOADING;

import java.util.Scanner;

public class Constructor_1_EMP {
    private int age;
    private String name;
    private double salary;

    public Constructor_1_EMP() {
        System.out.println("entr data for the EMP (age,name,salary)");
        Scanner kb=new Scanner(System.in);
        age=kb.nextInt();
        name=kb.next();
        salary=kb.nextDouble();
    }
    public void Display_Emp()
    {
        System.out.println("Age is "+age+", name is "+name+", salary is "+salary);
    }
}
