import java.util.Scanner;

public class Helper {
    public int getUserInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
