import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class EjercicioOnce {
    static float day = 86400.0f;
    static float hour = 3600.0f;
    static float minute = 60.0f;

    public static HashMap<String, Float> calculate(float time) {
        HashMap<String, Float> result = new HashMap<String, Float>();

        float minutes = time / minute;
        float hours = time / hour;
        float days = time / day;

        result.put("minutes", minutes);
        result.put("hours", hours);
        result.put("days", days);

        return result;
    }

    public static void displayResult(HashMap<String, Float> result) {
        System.out.println("\n[*] Days: " + result.get("days"));
        System.out.println("[*] Hours: " + result.get("hours"));
        System.out.println("[*] Minutes: " + result.get("minutes"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Float> result;
        float time;

        System.out.print("[*] Time: ");
        time = sc.nextFloat();
        
        result = calculate(time);
        displayResult(result);
    }
}