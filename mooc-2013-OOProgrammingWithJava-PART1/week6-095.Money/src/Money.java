
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money b) {
        int tempEuros = this.euros + b.euros();
        int tempCents = this.cents + b.cents();
        return new Money(tempEuros, tempCents);
    }

    public static int convert(Money money){
        return money.euros() * 100 + money.cents();
    }

    public boolean less(Money compared){
        if(compared.euros > this.euros){
            return true;
        }else if (compared.euros < this.euros){
            return false;
        }else{
            if(compared.cents > this.cents){
                return true;
            }else{
                return false;
            }
        }
    }

    public Money minus(Money decremented){
        if(this.less(decremented)){
            return new Money(0,0);
        }else{
            int decreCents = convert(decremented);
            int thisCents = convert(this);

            int resultCents = thisCents - decreCents;

            return new Money(0, resultCents);

        }
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
