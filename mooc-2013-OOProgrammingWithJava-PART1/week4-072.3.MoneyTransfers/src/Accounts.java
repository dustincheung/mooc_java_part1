
public class Accounts {

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
    public static void main(String[] args) {
        Account accA = new Account("A", 100);
        Account accB = new Account("B", 0);
        Account accC = new Account("C", 0);
        transfer(accA, accB, 50);
        transfer(accB, accC, 25);
    }


}
