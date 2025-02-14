package METHODS_CONSTRUCTOR_OVERLOADING;

public class UseSelection_of_Overloaded_Method {
    public static void main(String[] args) {
        short x=10;
        Selection_Of_Overloaded_Method obj1 = new Selection_Of_Overloaded_Method();
        obj1.show(x);
        obj1.show(5);
        obj1.show('A');//**this will run the body of show with argument type int.
        obj1.show(4.5);//this will give error because 4.5 is double, and we do not have any overloaded method that in
                         // which it gets convert
        obj1.show(4.5f);//**that will run the body of show with arguments type double.
    }
}
