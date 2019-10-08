import java.util.Random;

public class PasswordRandomizer {
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        Random randomizer = new Random();
        String password = "";
        int i = 0;
        while(i < this.length){
            password += "abcdefghijklmnopqrstuvwxyz".charAt(randomizer.nextInt(26));
            i++;
        }
        return password;
    }
}
