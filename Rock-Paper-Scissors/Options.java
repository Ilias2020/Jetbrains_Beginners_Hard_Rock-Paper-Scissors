import java.util.Scanner;

public class Options {

    public static String[] inputOptions() {

        String[] arr;
        String str = new Scanner(System.in).nextLine();
        if (str.isEmpty()) {
            arr = new String[]{"rock", "paper", "scissors"};
        } else {
            arr = str.split(",");
        }
        return arr;
    }
}
