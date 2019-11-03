public class Player {
    private String name;
    private int numGoals = 0;

    public Player(String name){
        this.name = name;
    }

    public Player(String name, int numGoals){
        this.name = name;
        this.numGoals = numGoals;
    }
    public String getName(){
        return this.name;
    }

    public int goals(){
        return this.numGoals;
    }

    public String toString(){
        return this.name + ", goals " + this.numGoals;
    }
}
