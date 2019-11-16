import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.println("Type exam scores, -1 completes:");

        while(true){
            int input = Integer.parseInt(lukija.nextLine());
            if(input == -1){
                break;
            }else{
                exam.addScore(input);
            }
        }

        exam.printDistribution();

    }
}
