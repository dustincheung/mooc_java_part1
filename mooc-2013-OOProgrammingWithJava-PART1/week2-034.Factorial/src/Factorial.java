import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        int i = 2;
        int fact = 1;
        while(i <= num){
            fact *= i;
            i++;
        }

        System.out.print("Factorial is " + fact );
    }
}
