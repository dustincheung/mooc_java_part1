
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.println("");
        if(num1 > num2){
            System.out.print("The bigger number of the two numbers given was: " + num1);
        }else{
            System.out.print("The bigger number of the two numbers given was: " + num2);
        }
    }
}
