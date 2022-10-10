package JavaAssignment_5;

public class SavingAccount extends Account {
    SavingAccount(double withdraw, double balance) {
        this.withdraw = withdraw;
        this.balance = balance - withdraw;
    }

    public String toString() {
        if (balance >= 500) {
            return "The balance left after withdrawal is " + balance;
        } else {
            return "You have to maintain minimum balance of Rs. 500";
        }
    }

}
