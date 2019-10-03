
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String word = reader.nextLine();
        System.out.print("Type the second word: ");
        String target = reader.nextLine();

        if(word.indexOf(target) != -1){
            System.out.println("The word '" + target + "' is found in the word '" + word + "'." );
        }else{
            System.out.println("The word '" + target + "' is not found in the word '" + word + "'." );

        }
    }
}
