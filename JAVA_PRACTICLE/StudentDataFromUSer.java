package CLASSROOM_BASIC_OOPs;

import java.util.Scanner;

public class StudentDataFromUSer {
    private int roll ;
    private String name;
    private double per;
    public void getData()
    {
        System.out.println("enter the roll , name and perentage for students");
        Scanner kb=new Scanner(System.in);
        roll=kb.nextInt();
        name=kb.next();
        per=kb.nextDouble();
    }
    public void DisplayStudent()
    {
        System.out.println("the name is "+name+", roll is "+roll+", and percentage is "+per);
    }
}
