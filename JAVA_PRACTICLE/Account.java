package CLASSROOM_BASIC_OOPs;

public class Account {
    private int AcctId;
    private String name;
    private double balance;
    public void setAccount(int id,String n,double bal)
    {
        AcctId=id;
        name=n;
        balance=bal;
    }
    public void ShowAccount()
    {
        System.out.println("Account id is "+AcctId);
        System.out.println("name is "+name);
        System.out.println("balance is "+balance);
    }
    public void transferAccount(Account p,int amount)
    {
        if((balance-amount)>=500)
        {
            p.balance+=amount;
            balance-=amount;
        }
        else System.out.println("given amiount can not be transfered...due to min bal should required 500.");
    }
}
