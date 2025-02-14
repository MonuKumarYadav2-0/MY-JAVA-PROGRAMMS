package CLASSROOM_BASIC_OOPs;

public class UsePureOOpsStudent {
    public static void main(String[] args) {
        pureOOPsStudent obj=new pureOOPsStudent();//but there is a drawback that  the data of roll grade and per for
        obj.set();/////////////////////////////////every object will remain same because we explicitly initialize the data
        obj.display();
    }
}
