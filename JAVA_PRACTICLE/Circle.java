package CLASSROOM_BASIC_OOPs;

public class Circle {
    private int radius;
    public void setRadius(int r)
    {
        radius=r;
    }
    public void calculateArea()
    {
        System.out.println("area of circle is "+Math.PI*Math.pow(radius,2));
    }
    public void calculateCircumference()
    {
        System.out.println("Circumference is "+2*Math.PI*radius);
    }

}
