package JavaAssignment_3;
import java.util.*;
import java.lang.*;
public class Account {
    public String id;
    private double balance = 8000;
    private double annualInterestRate ;
    private Date dateCreated;
    public Account(String id) {
        this.id=id;
    }
    public void Balance_Inq(){
        System.out.println("ID :-"+id);
        System.out.println("Balance :-"+balance);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*(getMonthlyInterestRate()/12)/100;
    }
    public double Withdraw(){
        double withdraw;
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        withdraw = sc.nextInt();
        if(balance>withdraw)
        {
            System.out.println(balance-withdraw);
        }
        else if(balance<withdraw)
        {
            System.out.println("Error! check your balance then type value");
        }
        return 0;
    }
    public double deposit(){
        Scanner sc =new Scanner(System.in );
        double deposit = sc.nextInt();
        System.out.println("Total balance in the account is :-");
        return balance+deposit;
    }
    public void MoneyTransfer(ArrayList arr){
        int temp;
        String id;
        Scanner sc = new Scanner(System.in);
        Account ac = null;
        System.out.println("Enter ID to transfer :-");
        id = sc.next();
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            Account ac1 = (Account) itr.next();
            if(id.equals(ac1.id));
            ac=ac1;
        }
        if(ac==null){
            System.out.println("Account not found");
        }
        else{
            System.out.println("Enter amount to transfer");
            temp = sc.nextInt();
            if(temp>balance){
                System.out.println("Not enough balance in account. Please check your balance first");
            }
            else{
                ac.balance=ac.balance+temp;
                balance = balance-temp;
            }
        }
    }
    public void Create(ArrayList arr){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :- ");
        str = sc.next();
        Account ac = new Account(str);
        arr.add(ac);
    }
    public void delete(ArrayList arr){
        String str;
        Account ac = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :- ");
        str = sc.next();
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            Account ab = (Account) itr.next();
            if(str.equals(ac.id));
            ac = ab;
        }
        if(ac == null){
            System.out.println("Account not found");
        }
        else{
            arr.remove(ac);
            System.out.println("Account removed successfully");
        }
    }

}
