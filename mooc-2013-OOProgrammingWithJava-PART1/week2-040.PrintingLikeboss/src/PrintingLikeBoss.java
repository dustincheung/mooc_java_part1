public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount > 0){
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        while(amount > 0){
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        int numOfStars = 1;
        while(size > 0){
            printWhitespaces(size - 1);
            printStars(numOfStars);
            size--;
            numOfStars++;
        }
    }

    public static void xmasTree(int height) {
        int baseDist = height - 2;
        int numOfStars = 1;
        while(height > 0){
            printWhitespaces(height - 1);
            printStars(numOfStars);
            height--;
            numOfStars += 2;
        }

        printWhitespaces(baseDist);
        printStars(3);
        printWhitespaces(baseDist);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
