package METHODS_CONSTRUCTOR_OVERLOADING;

public class UseMethod_overloading_MyMath {
    public static void main(String[] args) {
        Method_overloading_MyMath obj=new Method_overloading_MyMath();
        System.out.println(obj.add(4,5));
        System.out.println(obj.add(4,6,'a'));
        System.out.println(obj.add("MONU ","NIKHA"));
    }
}
