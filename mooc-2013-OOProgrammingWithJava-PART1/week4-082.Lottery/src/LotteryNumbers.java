import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        Random randomizer = new Random();
        this.numbers = new ArrayList<Integer>();
        while(true){
            int num = randomizer.nextInt(39) + 1;

            if (containsNumber(num)) {
                continue;
            }else{
                this.numbers.add(num);
            }

            if(this.numbers.size() == 7){
                break;
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
