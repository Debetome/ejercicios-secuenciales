import java.util.Scanner;
import java.util.HashMap;
import java.lang.Math;

public class EjercicioTrece {
    static float hour = 3600.0f;
    static float minute = 60.0f;

    public static float prompt(String text, Scanner sc) {
        float value;
        System.out.print("[*] " + text + ": ");
        value = sc.nextFloat();
        return value;
    }

    public static HashMap<String, Integer> calculate(HashMap<String, Float> values) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        if (values.get("hours") >= 24) {
            System.out.println("Hours cannot be greater than 23");
            return null;
        }

        if (values.get("minutes") >= 60 || values.get("seconds") >= 60) {
            System.out.println("Minutes and seconds cannot be greater than 59");
            return null;
        }

        float total_seconds = 0.0f;
        total_seconds += values.get("hours") * hour;
        total_seconds += values.get("minutes") * minute;
        total_seconds += minute * 45.0f;

        int hours = (int)Math.floor(total_seconds / hour);
        int minutes = (int)Math.floor((total_seconds - hours * hour) / minute);
        int seconds = (int)Math.floor(values.get("seconds"));
        
        result.put("minutes", minutes);
        result.put("hours", hours);
        result.put("seconds", seconds);

        return result;
    }

    public static void displayResult(HashMap<String, Integer> result) {
        int hours = result.get("hours");
        int minutes = result.get("minutes");
        int seconds = result.get("seconds");

        String time = hours + ":" + minutes + ":" + seconds;
        System.out.println("\n[*] Time: " + time);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Float> values = new HashMap<String, Float>();
        HashMap<String, Integer> result;

        values.put("hours", prompt("Hours", sc));
        values.put("minutes", prompt("Minutes", sc));
        values.put("seconds", prompt("Seconds", sc));

        result = calculate(values);
        if (result == null) {
            System.exit(-1);
        }

        displayResult(result);
    }
}