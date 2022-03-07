import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RouteFinder implements IRouteFinder {

  public Matcher makeAllMatcher(String findPattern, String findString) {
    Pattern pattern = Pattern.compile(findPattern);
    Matcher matcher = pattern.matcher(findString);
    return matcher;
  }

  public String getUrlText(String url) throws IOException { // connect with the website
    String text = "";
    String string = "";
    URLConnection bc = new URL("https://www.communitytransit.org/busservice/schedules/").openConnection();
    bc.setRequestProperty("user-Agent",
        "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
    BufferedReader in = new BufferedReader(new InputStreamReader(bc.getInputStream()));

    String inputUser = "";

    while ((inputUser = in.readLine()) != null) {
      string += inputUser + "\n";
    }
    return string;
  }

  public Map<String, Map<String, String>> getBusRoutesUrls(final char destInitial) throws Exception {
    Pattern patternForLetter = Pattern.compile("[A-Za-z]"); // make sure pattern is a letter from a to z
    String string = "" + destInitial;
    Matcher matcher = patternForLetter.matcher(string);

    String url = getUrlText(TRANSIT_WEB_URL);
    String upperCaseString = String.valueOf(destInitial).toUpperCase(); // make sure string is uppercase

    Pattern pattern1; Matcher matcher1;
    Pattern pattern2; Matcher matcher2;

    String subSectionRegex = "(<h3>[\\s\\S]*?<hr)";
    String rightSectionRegex = "(<h3>" + upperCaseString + "[\\s\\S]*?<hr)";
    String routesRegex = "href=\"(.*)\".*>(.*)</a>";
    String citiesRegex = "<h3>(.*?)</h3>";

    Matcher matcherForRegex = makeAllMatcher(url, subSectionRegex);

    Map<String, String> allRoutes = new HashMap<>(); // linked hash map for routes
    Map<String, Map<String, String>> allCities = new HashMap<>(); // linked hash map for cities

    String myMainSection = ""; // new string for the main section

    matcherForRegex = makeAllMatcher(subSectionRegex, myMainSection);

    while (matcherForRegex.find()) {
      myMainSection += matcherForRegex.group(1);
      matcher1 = makeAllMatcher(citiesRegex, matcherForRegex.group(1));
      matcher2 = makeAllMatcher(routesRegex, matcherForRegex.group(1));

      allRoutes.clear();
      while (matcher2.find()) {
        allRoutes.put(matcher2.group(2), matcher2.group(1));
      }
      Map<String, String> otherRoutes = new HashMap<>(allRoutes);
      while (matcher1.find()) {
        allCities.putIfAbsent(matcher1.group(1), otherRoutes);
      }
    }
    return allCities;
  }

  public Map<String, List<Long>> getBusRouteTripsLengthsInMinutesToAndFromDestination(final Map<String, String> destinationBusesMap) throws Exception {
    

    return null;
  }

}