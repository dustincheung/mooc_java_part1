import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();

        while(true){
            System.out.print("? ");

            String input = scanner.nextLine();

            switch(input){
                case "Add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Latin Name: ");
                    String latinName = scanner.nextLine();
                    Bird bird = new Bird(name, latinName);
                    db.addBird(bird);
                    continue;
                case "Observation":
                    System.out.print("What was observed:? ");
                    String birdObsv = scanner.nextLine();
                    db.observed(birdObsv);
                    continue;
                case "Statistics":
                    db.printStat();
                    continue;
                case "Show":
                    System.out.print("What? ");
                    String birdName = scanner.nextLine();
                    db.printBird(birdName);
                    continue;
                case "Quit":
                    return;
            }
        }
    }
}
