
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int cap = Integer.parseInt(reader.nextLine());

        int count = 1;
        while(count <= cap){
            System.out.println(count);
            count++;
        }

    }
}
