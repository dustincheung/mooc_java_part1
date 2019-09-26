public class Printing {

    public static void printStars(int amount) {
        while(amount > 0){
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        int count = 0;
        while(count < sideSize){
            printStars(sideSize);
            count++;
        }
    }

    public static void printRectangle(int width, int height) {
        int count = 0;
        while(count < height){
            printStars(width);
            count++;
        }
    }

    public static void printTriangle(int size) {
        int numOfStars = 1;
        while(size > 0){
            printStars(numOfStars);
            numOfStars++;
            size--;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
