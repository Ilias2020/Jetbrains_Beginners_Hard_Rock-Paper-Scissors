import java.util.Random;

public class RandomPaperScissorsRock {
    public static int getRandom(String[] str) {
        Random random = new Random();
        return random.nextInt(0, str.length);
    }
}
