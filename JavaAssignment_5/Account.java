package JavaAssignment_5;
import java.util.*;
import java.lang.*;
public class Account {
        public static int count;
        public int id;
        public double balance;
        public double annualInterestRate;
        public double withdraw;
        public Date dateCreated;

        public int getId() {
            return id;
        }
        public void setId(int id) {
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
        public Account(){

        }
        public Account(int id, double balance){
            this.id=id;
            this.balance=balance;
        }
        public double Withdraw(double withdraw){
            if((balance-500)>withdraw)
            {
                System.out.println("Amount left in balance is :-");
                System.out.println(balance-withdraw);
            }
            else if((balance-500)<withdraw)
            {
                System.out.println("Error! check your balance then type value");
            }
            return 0;
        }
        public double deposit(double withdraw){
            System.out.println("Total balance in the account is :-");
            return balance+withdraw;
        }

    }

