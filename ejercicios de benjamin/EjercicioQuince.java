import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class EjercicioQuince {
    public static float prompt(String text, Scanner sc) {
        float value;
        System.out.print("[*] " + text + ": ");
        value = sc.nextFloat();
        return value;
    }

    public static HashMap<String, Float> calculate(HashMap<String, Float> amounts) {
        HashMap<String, Float> result = new HashMap<String, Float>();

        final float juanAmount = amounts.get("soles") / 3.0f;
        final float rosaAmount = amounts.get("dolares");
        final float total = juanAmount + rosaAmount;

        final float pJuan = juanAmount * 100 / total;
        final float pRosa = rosaAmount * 100 / total;

        result.put("rosa", pRosa);
        result.put("juan", pJuan);
        result.put("total", total);

        return result;
    }

    public static void displayResult(HashMap<String, Float> result) {
        float pRosa = result.get("rosa");
        float pJuan = result.get("juan");
        float total = result.get("total");

        System.out.println("\n[*] Porcentaje de Juan: " + pJuan + "%");
        System.out.println("[*] Porcentaje de Rosa: " + pRosa + "%");
        System.out.println("\n[*] Total (en dolares): " + total);
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        HashMap<String, Float> amounts = new HashMap<String, Float>();
        HashMap<String, Float> result;

        amounts.put("dolares", prompt("Dolares (cantidad de Rosa)", sc));
        amounts.put("soles", prompt("Soles (cantidad de Juan)", sc));

        result = calculate(amounts);
        displayResult(result);
    }
}