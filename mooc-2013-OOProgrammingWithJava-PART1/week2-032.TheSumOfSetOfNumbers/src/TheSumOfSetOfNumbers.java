
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what?");
        int cap = Integer.parseInt(reader.nextLine());
        System.out.println("");
        int sum = 0;
        int i = 1;
        while(i <= cap){
            sum += i;
            i++;
        }

        System.out.print("Sum is " + sum);

    }
}
