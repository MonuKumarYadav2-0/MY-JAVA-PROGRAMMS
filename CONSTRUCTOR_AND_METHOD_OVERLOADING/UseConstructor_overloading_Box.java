package METHODS_CONSTRUCTOR_OVERLOADING;

public class UseConstructor_overloading_Box {
    public static void main(String[] args) {
        Constructor_Overloading_Box obj1=new Constructor_Overloading_Box();
        Constructor_Overloading_Box obj2=new Constructor_Overloading_Box(5);
        Constructor_Overloading_Box obj3=new Constructor_Overloading_Box(4,5,6);
        Constructor_Overloading_Box obj4=new Constructor_Overloading_Box(obj3);// ***DEEP COPY***
//      Constructor_Overloading_Box obj4=obj3;// ***SHALLOW COPY***
        obj1.show();
        System.out.println("-------------------");
        obj2.show();
        System.out.println("-------------------");
        obj3.show();
        System.out.println("-------------------");
        obj4.show();
    }
}
