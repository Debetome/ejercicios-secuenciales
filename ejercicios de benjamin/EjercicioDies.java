import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class EjercicioDies {
    public static int prompt(String text, Scanner sc) {
        int number;
        System.out.print("[*] " + text + ": ");
        number = sc.nextInt();
        return number;
    }

    public static HashMap<String, String> flip(HashMap<String, String> numbers) {
        HashMap<String, String> newNumbers = new HashMap<String, String>();
        String[] firstSplitted = numbers.get("first").split("");
        String[] secondSplitted = numbers.get("second").split("");

        newNumbers.put("first", firstSplitted[2] + secondSplitted[1] + firstSplitted[0]);
        newNumbers.put("second", secondSplitted[2] + firstSplitted[1] + secondSplitted[0]);

        return newNumbers;
    }

    public static void displayNumbers(HashMap<String, String> numbers) {
        System.out.println("\n[*] First number (flipped): " + numbers.get("first"));
        System.out.println("[*] Second number (flipped): " + numbers.get("second"));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> numbers = new HashMap<String, String>();

        numbers.put("first", String.valueOf(prompt("First number", sc)));
        numbers.put("second", String.valueOf(prompt("Second number", sc)));

        for (Map.Entry<String, String> item : numbers.entrySet()) {
            if (item.getValue().length() > 3 || item.getValue().length() < 3) {
                System.out.println("\n[-] Numbers can't either be greater or less than digit numbers!");
                System.exit(-1);
            }
        }

        displayNumbers(flip(numbers));
    }
}