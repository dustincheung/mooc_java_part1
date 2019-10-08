import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics numStat = new NumberStatistics();
        NumberStatistics evenStat = new NumberStatistics();
        NumberStatistics oddStat = new NumberStatistics();

        System.out.println("Type numbers: ");
        while(true){
            int numInput = Integer.parseInt(reader.nextLine());

            if(numInput == -1){
                break;
            }else{
                numStat.addNumber(numInput);
                if(numInput % 2 == 0){
                    evenStat.addNumber(numInput);
                }else{
                    oddStat.addNumber(numInput);
                }
            }
        }
        System.out.println("sum: " + numStat.sum());
        System.out.println("sum of even: " + evenStat.sum());
        System.out.println("sum of odd: " + oddStat.sum());
    }
}
