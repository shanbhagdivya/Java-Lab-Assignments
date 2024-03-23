mport java.util.Scanner;
class NOMATCHEXCP extends Exception {
  public NOMATCHEXCP(int lineNumber, String inputString) {
    super("Error at line " + lineNumber + ": Input string '" + inputString + "' does not match 'India'");
  }
}

public class assignment7_part3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();
    try {
      if (!inputString.equals("India")) {
        throw new NOMATCHEXCP(new Throwable().getStackTrace()[0].getLineNumber(), inputString);
      } else {
        System.out.println("Input string matches 'India'.");
      }
    } catch (NOMATCHEXCP e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }
}
