package METHODS_CONSTRUCTOR_OVERLOADING;

public class Constructor_Overloading_Box {
    private int length,breadth,height;

    public Constructor_Overloading_Box(int h, int b, int l) {
       length=l;
       breadth=b;
       height=h;
    }
    public Constructor_Overloading_Box(int s)
    {
        length=breadth=height=s;
    }
    public Constructor_Overloading_Box()
    {
        length=breadth=height=0;
    }
    public Constructor_Overloading_Box(Constructor_Overloading_Box p)
    {
        length=p.length;
        breadth=p.breadth;
        height=p.height;
    }
    public void show()
    {
        System.out.println("length is "+length);
        System.out.println("bradth is "+breadth);
        System.out.println("height is "+height);

    }

}
