package ASSIGNMENTS;

public class UseAccount {
    public static void main(String[] args) {
        Account A1=new Account();
        Account A2=new Account();
        A1.SetAccount(1000,"Monu kumar",50000);
        A2.SetAccount(1001,"Vicky",49500);
        System.out.println("before transferring amount");
        A1.showAccount();
        A2.showAccount();
        A1.TransferAccount(A2,600);
        System.out.println("after trsnsaction , the  account detail is ");
        A1.showAccount();
        A2.showAccount();

    }
}
