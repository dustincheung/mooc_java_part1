import java.util.ArrayList;

public class Exam {
    private ArrayList<Integer> scores;
    private int fiveCount;
    private int fourCount;
    private int threeCount;
    private int twoCount;
    private int oneCount;
    private int zeroCount;
    private int totalCount;

    public Exam(){
        this.scores = new ArrayList<Integer>();
        this.fiveCount = 0;
        this.fourCount = 0;
        this.threeCount = 0;
        this.twoCount = 0;
        this.oneCount = 0;
        this.zeroCount = 0;
    }

    public void addScore(int score){
        scores.add(score);

        if (score >= 0 && score <= 29) {
            this.zeroCount++;
            this.totalCount++;
        } else if (score >= 30 && score <= 34) {
            this.oneCount++;
            this.totalCount++;
        } else if (score >= 35 && score <= 39) {
            this.twoCount++;
            this.totalCount++;
        } else if (score >= 40 && score <= 44) {
            this.threeCount++;
            this.totalCount++;
        } else if (score >= 45 && score <= 49) {
            this.fourCount++;
            this.totalCount++;
        } else if (score >= 50 && score <= 60) {
            this.fiveCount++;
            this.totalCount++;
        } else {
            return;
        }
    }

    public void printDistribution(){
        System.out.println("Grade Distribution:");
        System.out.print("5: ");
        for(int i =0; i < this.fiveCount; i++){
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("4: ");
        for(int i =0; i < this.fourCount; i++){
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("3: ");
        for(int i =0; i < this.threeCount; i++){
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("2: ");
        for(int i =0; i < this.twoCount; i++){
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("1: ");
        for(int i =0; i < this.oneCount; i++){
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("0: ");
        for(int i =0; i < this.zeroCount; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("Acceptance percentage: " + (double)100*(totalCount - zeroCount)/totalCount);
    }
}
