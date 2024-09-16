import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        int choiceAi;

        Gamer ilias = new Gamer();
        System.out.println("Enter your name: ");
        ilias.name = new Scanner(System.in).nextLine();
        ilias.rating = ilias.readRating(ilias.name);
        ilias.printName();
        String[] arrOptions = Options.inputOptions();
        System.out.println("Okay, let's start");
        do {
            input = new Scanner(System.in).nextLine();
            choiceAi = RandomPaperScissorsRock.getRandom(arrOptions);
        } while (MenuOption.isMenu(input, choiceAi, ilias, arrOptions));
        System.out.println("Bye!");
    }
}