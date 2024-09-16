public class Winner {
    public static void printWinner(String choiceMan, int i, Gamer ilias, String[] str) {

        int j = str.length;
        int k = 0;
        for (int d = 0; d < j; d++) {
            if (str[d].equals(choiceMan)) {
                k = d;
                break;
            }
        }

        if (k == i) {
            System.out.printf("There is a draw (%s)\n", str[i]);
            ilias.rating += 50;
        } else if (str.length == 3) {
            if (i == 0 && k == 1 || i == 1 && k == 2 || i == 2 && k == 0) {
                System.out.printf("Well done. The computer chose %s and failed\n", str[i]);
                ilias.rating += 100;
            } else System.out.printf("Sorry, but the computer chose %s\n", str[i]);
        } else if (k + 1 > j / 2) {
            if (i < k && i >= k - j / 2) {
                System.out.printf("Well done. The computer chose %s and failed\n", str[i]);
                ilias.rating += 100;
            } else System.out.printf("Sorry, but the computer chose %s\n", str[i]);
        } else {
            if (i > k && i < k + j / 2) System.out.printf("Sorry, but the computer chose %s\n", str[i]);
            else {
                System.out.printf("Well done. The computer chose %s and failed\n", str[i]);
                ilias.rating += 100;
            }
        }
    }
}
