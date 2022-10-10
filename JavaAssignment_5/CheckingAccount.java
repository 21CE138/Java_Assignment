package JavaAssignment_5;

public class CheckingAccount extends Account {

    CheckingAccount(double withdraw, double balance) {
        this.withdraw = withdraw;
        this.balance = (balance - withdraw);
    }

    public String toString() {
        return "Balance left is " + balance + " after withdrawal of " + withdraw;
    }
}
