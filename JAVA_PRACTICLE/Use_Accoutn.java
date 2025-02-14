package CLASSROOM_BASIC_OOPs;

import java.util.Scanner;

public class Use_Accoutn {
    public static void main(String[] args) {
        int id;
        String custName;
        double custBalance;
        Scanner kb = new Scanner(System.in);
        System.out.println("enter the AccId,Name,Balance for the first Customer....");
        id=kb.nextInt();
        custName=kb.nextLine();
        custBalance=kb.nextDouble();
        Account A=new Account();
        A.setAccount(id,custName,custBalance);
        System.out.println("enter the AccId,name and balance for second customer");
        id=kb.nextInt();
        custName=kb.nextLine();
        custBalance=kb.nextDouble();
        Account B=new Account();
        B.setAccount(id,custName,custBalance);
        System.out.println("before the transfering balance...... the details of both are as below...");
        A.ShowAccount();
        System.out.println("----------------");
        B.ShowAccount();
        System.out.println("==================================================================================");
        System.out.println("After the calling TransferAccount.......the details of both are as below....");
        A.transferAccount(B,5000);
        A.ShowAccount();
        System.out.println("-----------------");
        B.ShowAccount();
    }
}
