
public class Main {

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(.2, 100, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
