
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account myAccount = new Account("Dustin", 100);
        myAccount.deposit(20);
        System.out.print(myAccount);
    }

}
