
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String result = "";
        int index = text.length()-1;
        while(index >= 0){
            result = result + text.charAt(index);
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
