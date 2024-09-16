import java.util.List;
public class MenuOption {
    public static boolean isMenu(String input, int choiceAi, Gamer ilias, String[] str) {
        List<String> arrStr = List.of(str);
        if (input.equals("!exit")) return false;
        else if (input.equals("!rating")) ilias.printRating();
        else if (arrStr.contains(input)) Winner.printWinner(input, choiceAi, ilias, str);
        else System.out.println("Invalid input");
        return true;
    }
}
