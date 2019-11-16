public class Bird {
    private String name;
    private String latinName;
    private int numTimesObserved;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.numTimesObserved = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public int getNumTimesObserved(){
        return this.numTimesObserved;
    }

    public void incrNumTimesObserved(){
        this.numTimesObserved++;
    }
}
