
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int count = 1;
        while(true){
            System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());

            if(guess > numberDrawn){
                System.out.println("The number is lesser, guesses made: " + count);
            }else if(guess < numberDrawn){
                System.out.println("The number is greater, guesses made: " + count);
            }else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            count++;
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
