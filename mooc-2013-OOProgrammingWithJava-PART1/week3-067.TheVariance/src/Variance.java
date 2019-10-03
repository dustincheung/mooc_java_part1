import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int total = sum(list);
        return (double) total / list.size();

    }

    public static double variance(ArrayList<Integer> list) {
        double yBar = average(list);
        double sigma = 0;
        for(int y: list){
            double term = Math.pow(y - yBar, 2);
            sigma += term;
        }
        return sigma / (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
