package CLASSROOM_BASIC_OOPs;

public class UseNormalStudent
{
    public static void main(String[] args)
     {
        NormalStudent obj = new NormalStudent();
        obj.roll = 01;
        obj.grade = 'A';
        obj.per = 92;
        System.out.println("roll is " + obj.roll + ", grde is " + obj.grade + " , pecentage is " + obj.per);
      }
}