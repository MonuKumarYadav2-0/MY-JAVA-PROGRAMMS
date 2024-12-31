package ASSIGNMENTS;

public class Account {
    private int AcctId;
    private String CustName;
    private double balance;
    public void SetAccount(int id,String name,double bal)
    {
        AcctId=id;
        CustName=name;
        balance=bal;
    }
    void showAccount()
    {
        System.out.println("Account id is "+AcctId+",Name is "+CustName+", Balance is "+balance);
    }
    void TransferAccount(Account p,int x)
    {
        if((balance-x)>=500)
        {
            balance=balance-x;
            p.balance=p.balance+x;
        }
        else
        {
            System.out.println("TRSNSACTION CANCELLED!!!!!!!.. TRY ANOTHER AMOUNT");
        }
    }

}
