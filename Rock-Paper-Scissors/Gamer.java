import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Gamer {

    String name;
    int rating;

    public Gamer() {
        this.name = name;
        this.rating = readRating(this.name);
    }

    public void printName() {
        System.out.println("Hello, " + this.name);
    }
    public void printRating() {
        System.out.println("Your rating: " + this.rating);
    }
    public int readRating(String name) {
        if (readRatingInFile().contains(name)) {
            int i = readRatingInFile().indexOf(name);
            return Integer.parseInt(readRatingInFile().get(i + 1));
        } else return 0;
    }
    public static ArrayList<String> readRatingInFile() {
        File file = new File("./rating.txt");
        ArrayList<String> arrName = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String[] arr = scanner.nextLine().split(" ");
                arrName.add(arr[0]);
                arrName.add(arr[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + "./rating.txt");
        }
        return arrName;
    }
}
