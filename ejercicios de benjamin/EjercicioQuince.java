import java.util.HashMap;
import java.util.Map;

class ArgumentHandler {
  static String[] arguments = { 
    "--metros",
    "--pulgadas",
    "--pies",
    "--yardas"
  };

  public static HashMap<String, Float> handleArgs(String[] args) {
    HashMap<String, Float> parsed = new HashMap<String, Float>();
    boolean correct = false;

    for (String op : arguments) {
      for (int i=0; i<args.length; i++) {
        if (!op.equals(args[i])) continue;

        try {
          parsed.put(args[i], Float.valueOf(args[i+1]));
          correct = true;
        } catch (Exception e) {
          parsed.put(args[i], null);
        }
      }
    }

    return (correct ? parsed : null);
  }
}

public class metros {
  static float metro = 100.0f;
  static float pulgada = 2.54f;
  static float pie = pulgada * 12;
  static float yarda = pie * 3;

  public static HashMap<String, String> getMeasurementValue(String key) {
    HashMap<String, String> map = new HashMap<String, String>();

    switch (key) {
      case "metros":
        map.put("value", String.valueOf(metro));
        map.put("mesure", "m");
        break;
      case "pulgadas":
        map.put("value", String.valueOf(pulgada));
        map.put("mesure", "in");
        break;
      case "yardas":
        map.put("value", String.valueOf(yarda));
        map.put("mesure", "yd");
        break;
      case "pies":
        map.put("value", String.valueOf(pie));
        map.put("mesure", "ft");
        break;

      default:
        map = null;
        break;
    }

    return map;
  }

  public static HashMap<String, String> performCalculation(HashMap<String, Float> args) {
    HashMap<String, String> result = new HashMap<String, String>();
    
    HashMap<String, String> fromValueHash;
    HashMap<String, String> toValueHash;

    String fromMessure;
    String toMessure;
    float fromValue;
    float toValue;
    float calcResult;

    String from = "";
    String to = "";
    float inputValue = 0.0f;

    for (Map.Entry<String, Float> item : args.entrySet()) {
      if (item.getValue() == null)  {
        to = item.getKey();
        continue;
      }
      from = item.getKey();
      inputValue = item.getValue();
    }

    fromValueHash = getMeasurementValue(from.replace("-", ""));
    toValueHash = getMeasurementValue(to.replace("-", ""));

    if (fromValueHash == null || toValueHash == null) return null;

    fromMessure = fromValueHash.get("mesure");
    toMessure = toValueHash.get("mesure");

    fromValue = Float.valueOf(fromValueHash.get("value"));
    toValue = Float.valueOf(toValueHash.get("value"));

    calcResult = (fromValue * inputValue) / toValue;
    result.put("from", inputValue + fromMessure);
    result.put("to", calcResult + toMessure);

    return result;
  }

  public static void displayResult(HashMap<String, Float> result) {
    if (result == null) return;

    String from = result.get("from");
    String to = result.get("to");
    
    System.out.println("\n[*] From: " + from);
    System.out.println("[*] To: " + to);
  }

  public static void printUsage(String fileName) {
      System.out.println("\n[*] Usage: java " + fileName + " --metros/pulgadas/yardas/pies [AMOUNT] --metros/pulgadas/yardas/pies");
      System.out.println("[*] Example (for converting from metros to pies): java " + fileName + " --metros 3 --pies\n");
  }

  public static void main(String[] args) {
    HashMap<String, Float> parsed = ArgumentHandler.handleArgs(args);
    HashMap<String, String> result;
    
    if (parsed == null || parsed.values().size() == 0) {
      printUsage("metros");
      System.exit(-1);
    } 

    result = performCalculation(parsed);
    if (result == null) {
      System.out.println("\n[-] Something went wrong :CCC ....");
      printUsage("metros");
      System.exit(-1);
    }

    displayResult(result);
  }
}
