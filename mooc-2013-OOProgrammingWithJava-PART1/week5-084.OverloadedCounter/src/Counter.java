public class Counter {
    private int value;
    private boolean check;

    //constructor
    public Counter(){
        this(0,false);
    }
    public Counter(int startingValue, boolean check){
        this.value = startingValue;
        this.check = check;
    }

    //overloaded constructor
    public Counter(int startingValue){
        this(startingValue, false);
    }

    public Counter(boolean check){
        this(0, check);
    }

    public int value(){
        return this.value;
    }

    public void increase(){
        this.value++;
    }

    public void increase(int increaseAmount){
        if(increaseAmount >= 0){
            this.value += increaseAmount;
        }
    }

    public void decrease(){
        int result = this.value - 1;
        if(check){
            if(result >= 0){
                this.value = result;
            }else{
                this.value = 0;
            }
        }else{
            this.value = result;
        }
    }

    public void decrease(int decreaseAmount){
        if(decreaseAmount >= 0){
            int result = this.value - decreaseAmount;
            if(check){
                if(result >= 0){
                    this.value = result;
                }else{
                    this.value = 0;
                }
            }else{
                this.value = result;
            }
        }
    }
}
