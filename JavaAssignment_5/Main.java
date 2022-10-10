package JavaAssignment_5;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id :-");
        int id = sc.nextInt();
        System.out.println("Enter your Balance :-");
        double balance = sc.nextInt();
        System.out.println("Enter your Annual Interest Rate :-");
        double annualInterestRate = sc.nextInt();
        Date dateCreated = new Date();
        System.out.println("Account created on " + dateCreated);
        Account a1 = new Account(id, balance);


        System.out.println("1 --> Checking Account");
        System.out.println("2 --> Saving Account");
        System.out.println("3 --> Withdraw");
        System.out.println("4 --> deposit");
        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("Enter withdraw amount :-");
            double withdraw1 = sc.nextInt();
            Account c = new CheckingAccount(withdraw1, balance);
            System.out.println(c);
        } else if (num == 2) {
            System.out.println("Enter withdraw amount :-");
            double withdraw = sc.nextInt();
            Account s = new SavingAccount(withdraw, balance);
            System.out.println(s);
        } else if (num == 3) {
            a1.Withdraw(1000);
        } else if (num == 4) {
            a1.deposit(2000);
        } else {
            System.out.println("Entered number is not correct");
        }
        System.out.println("Thanks For Coming");
    }
}
