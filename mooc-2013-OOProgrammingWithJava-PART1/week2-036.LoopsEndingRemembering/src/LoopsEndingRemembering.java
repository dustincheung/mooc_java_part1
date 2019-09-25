import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0, nums = 0, even = 0;

        System.out.println("Type numbers: ");
        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                break;
            }

            sum += input;
            nums++;
            if (input % 2 == 0) {
                even++;
            }
        }

        int odd = nums - even;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + nums);
        System.out.println("Average: " + (double) sum / nums);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
