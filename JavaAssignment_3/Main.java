package JavaAssignment_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<JavaAssignment_3.Account> account = new ArrayList<JavaAssignment_3.Account>();
        Scanner sc = new Scanner(System.in);
        boolean f = true;
        String str;
        int op;
       JavaAssignment_3.Account ac = null;
        JavaAssignment_3.Account ac1 = new JavaAssignment_3.Account(null);
        account.add(new JavaAssignment_3.Account("AC001"));
        account.add(new JavaAssignment_3.Account("AC002"));
        account.add(new JavaAssignment_3.Account("AC003"));
        account.add(new JavaAssignment_3.Account("AC004"));
        account.add(new JavaAssignment_3.Account("AC005"));
        account.add(new JavaAssignment_3.Account("AC006"));
        account.add(new JavaAssignment_3.Account("AC007"));
        account.add(new JavaAssignment_3.Account("AC008"));
        account.add(new JavaAssignment_3.Account("AC009"));
        account.add(new JavaAssignment_3.Account("AC0010"));
        System.out.println("Enter your ID :-");
        str = sc.next();

        for (JavaAssignment_3.Account account1 : account) {
            if (str.equals(account1.id)) {
                ac = ac1;
                break;
            }
        }
        {
            if (ac == null) {
                System.out.println("Invalid ID");
                System.exit(0);
            } else {
                do {

                    op = sc.nextInt();
                    switch (op) {
                        case 1 -> ac.Balance_Inq();
                        case 2 -> ac.Withdraw();
                        case 3 -> ac.deposit();
                        case 4 -> ac.MoneyTransfer(account);
                        case 5 -> ac.Create(account);
                        case 6 -> ac.delete(account);
                        case 99 -> System.out.println("Thank you");
                        default -> System.out.println("Invalid input");
                    }
                } while (op != 99);
            }
        }
    }
}
