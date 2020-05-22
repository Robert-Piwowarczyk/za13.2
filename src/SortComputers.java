import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortComputers {
    public static void main(String[] args) {
        List<Computer>computers = new ArrayList<>();
        computers.add(new Computer("Mac", 2800, 16));
        computers.add(new Computer("HP", 3200, 16));
        computers.add(new Computer("Dell", 4100, 8));

        System.out.println("Po czym sortujemy:\n" + "1` = name, 2- cpu, 3 -ram?");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (userInput.equals("1")) {
            Arrays.sort(computers,nameCompare);
        } else if (userInput.equals("2")) {
            Arrays.sort(computers, cpuCompare);
        } else if (userInput.equals("3")) {
            Arrays.sort(computers, ramCompare);
        }
    }
}
