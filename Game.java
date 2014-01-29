
public class Game {

  // Global
  public static int currentLocale = 0;
    
  public static void main(String[] args) {
     updateDisplay();
  }

  private static void updateDisplay() {
     String msg = new String();
     msg = "";
     switch (currentLocale) {
        case 0: msg = "The rain in Spain falls mainly on the plain.";
                break;
        default: msg = "currentLocale does not compute.";
     }
     System.out.println(msg);
  } 


}

