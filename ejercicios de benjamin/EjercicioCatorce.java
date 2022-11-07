import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class EjercicioCatorce {
    static int day = 86400;
    static int hour = 3600;
    static int minute = 60;

    public static int prompt(String text, Scanner sc) {
        int value;
        System.out.print("[*] " + text + ": ");
        value = sc.nextInt();
        return value;
    }

    public static HashMap<String, Integer> calculate(List<HashMap<String, Integer>> times) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        int total_seconds = 0;

        for (HashMap<String, Integer> time : times) {
            if (time.get("hours") >= 24) {
                System.out.println("\n[-] Hours cannot be greater than 23");
                return null;
            }

            if (time.get("minutes") >= 60 || time.get("seconds") >= 60) {
                System.out.println("\n[-] Minutes and seconds cannot be greater than 59");
                return null;
            }
        }

        for (HashMap<String, Integer> time : times) {
            total_seconds += time.get("hours") * hour;
            total_seconds += time.get("minutes") * minute;
        }

        final int days = total_seconds / day;
        final int hours = (total_seconds - days * day) / hour;
        final int minutes = (total_seconds - (total_seconds / hour) * hour) / minute;
        final int seconds = total_seconds - ((total_seconds / hour) * hour + minutes * minute);

        result.put("hours", hours);
        result.put("minutes", minutes);
        result.put("seconds", seconds);

        return result;
    } 

    public static void displayResult(HashMap<String, Integer> result) {
        final int hours = result.get("hours");
        final int minutes = result.get("minutes");
        final int seconds = result.get("seconds");

        String time = hours + ":" + minutes + ":" + seconds;

        System.out.println("\n[*] Total in time format: " + time);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<HashMap<String, Integer>> times = new ArrayList<HashMap<String, Integer>>();
        HashMap<String, Integer> result;

        for (int i=0; i<2; i++) {
            HashMap<String, Integer> newTime = new HashMap<String, Integer>();
            System.out.println("\n[*] Time " + i+1);
            
            newTime.put("hours", prompt("Hours", sc));
            newTime.put("minutes", prompt("Minutes", sc));
            newTime.put("seconds", prompt("Seconds", sc));

            times.add(newTime);
        }

        result = calculate(times);
        if (result == null) {
            System.exit(-1);
        }

        displayResult(result);
    }
}