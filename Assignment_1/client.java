import java.util.Map;
import java.util.Scanner;

public class client {
  public static void main(String[] args) throws Exception {

    String desString = "";
    RouteFinder findRoute = new RouteFinder();
    System.out.println("😊 Please enter a letter that your destination start with: "); 
    Scanner scan = new Scanner(System.in);
    desString = scan.nextLine();

    final Map<String, Map<String, String>> secondRoute = findRoute.getBusRoutesUrls(desString.charAt(0));

      
    }
}