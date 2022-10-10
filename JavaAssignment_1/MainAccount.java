package JavaAssignment_1;

import java.util.Date;
import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id :-");
        int id = sc.nextInt();
        System.out.println("Enter your Balance :-");
        double balance = sc.nextInt();
        System.out.println("Enter your Annual Interest Rate :-");
        double annualInterestRate = sc.nextInt();
        Date datecreated = new Date();
        System.out.println("Account created on " + datecreated);
        Account a = new Account();
        Account a1 = new Account(id, balance);
        System.out.println("1 --> Withdraw");
        System.out.println("2 --> deposit");
        System.out.println("3 --> Monthly Interest Rate of Account");
        System.out.println("Enter the number:-");
        int k = sc.nextInt();
        if (k == 1) {
            System.out.println("Enter Withdraw Amount: -");
            double withdraw = sc.nextInt();
            System.out.println(a1.Withdraw(withdraw));
        } else if (k == 2) {
            System.out.println("Enter Deposit Amount: -");
            double deposit = sc.nextInt();
            System.out.println(a1.deposit(deposit));
        } else if (k == 3) {
            System.out.println("Your monthly interest rate is: -");
            System.out.println(a1.getMonthlyInterestRate());
            System.out.println("Your Monthly interest is :-");
            System.out.println(a1.getMonthlyInterest());
        } else {
            System.out.println("Entered number is not correct");
        }
        System.out.println("Thanks For Coming");
    }
}
