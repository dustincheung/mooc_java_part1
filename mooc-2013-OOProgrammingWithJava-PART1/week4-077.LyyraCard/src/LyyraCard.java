public class LyyraCard {
    private double balance;

    //constructor
    public LyyraCard(double balance){
        this.balance = balance;
    }

    public void payEconomical(){
        if(this.balance >= 2.5){
            this.balance -= 2.5;
        }
    }

    public void payGourmet(){
        if(this.balance >= 4){
            this.balance -= 4;
        }
    }

    public void loadMoney(double amount){
        if(!(amount < 0)){
            double totalBalance = this.balance + amount;

            if(totalBalance > 150){
                this.balance = 150;
            }else{
                this.balance = totalBalance;
            }
        }
    }

    public String toString(){
        return "The card has " + this.balance + " euros";
    }
}
