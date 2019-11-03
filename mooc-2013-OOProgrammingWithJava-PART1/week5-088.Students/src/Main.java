
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();

            if(name.equals("")){
                break;
            }

            System.out.print("student number: ");
            String studNum = reader.nextLine();

            list.add(new Student(name,studNum));
        }

        for(Student stud: list){
            System.out.println(stud);
        }

        System.out.println("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");

        for(Student stud: list){
            if(stud.getName().contains(term)){
                System.out.println(stud);
            }
        }
    }
}
