package CLASSROOM_BASIC_OOPs;

public class Circle2_0 {
    private int radius;

    public Circle2_0(int radius) {
        this.radius = radius;
    }
    public double calculateArea()
    {
        return (Math.PI*Math.pow(radius,2));
    }
    public double calculateCircumferene()
    {
        return 2*Math.PI*radius;
    }

}
