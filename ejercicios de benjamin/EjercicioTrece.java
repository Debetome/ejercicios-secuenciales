import java.util.Scanner;
import java.util.HashMap;
import java.lang.Math;


public class EjercicioTrece {
    static float hour = 3600.0f;
    static float minute = 60.0f;

    public static float prompt(String text, Scanner sc) {
        float value;
        System.out.println("[*] " + text + ": ");
        value = sc.nextFloat();
        return value;
    }

    public static HashMap<String, Integer> calculate(HashMap<String, Float> values) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        float total_seconds = 0.0f;
        total_seconds += values.get("hours") * hour;
        total_seconds += values.get("minutes") * minute;
        total_seconds += minute * 45.0f;

        float minutes = (int)Math.floor(total_seconds / minute);
        float hours = (int)Math.floor(total_seconds / hour);
        
        result.put("minutes", minutes);
        result.put("hours", hours);
        result.put("seconds", values.get("seconds"));

        return result;
    }

    public static void displayResult(HashMap<String, Integer> result) {
        System.out.println(result);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Float> values = new HashMap<String, Float>();
        HashMap<String, Integer> result;

        values.put("hours", prompt("Hours", sc));
        values.put("minutes", prompt("Minutes", sc));
        values.put("seconds", prompt("Seconds", sc));

        result = calculate(values);
        displayResult(result);
    }
}