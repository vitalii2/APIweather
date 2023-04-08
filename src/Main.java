import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {
    public static void main(String[] args) throws IOException {

        URL url = new URL(
                "https://api.openweathermap.org/data/2.5/weather?lat=32.794044&lon=34.989571&appid=eb98b07832d7b6338715ba348f8d658c");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Chrome");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        String resJSON = response.toString();
        // System.out.println(resJSON);
        Pattern p = Pattern.compile(
                "\"[a-z]{4}\"\\S\\d{3}\\S\\d{1,}\\S\"[a-z]{5}\\S[a-z]{4}\"\\S\\d{3}\\S\\d{1,}\\S\"[a-z]{4}\\S[a-z]{3}\"\\S\\d{3}\\S\\d{1,}\\S\"[a-z]{4}\\S[a-z]{3}\"\\S\\d{3}\\S\\d{1,}");
        Matcher m = p.matcher(resJSON);
        String tempInfo = "";
        while (m.find()) {

            tempInfo = m.group().toString();

        }
        // System.out.println(tempInfo); 
        String [] s = tempInfo.split("[:,]");

        // System.out.println(Arrays.toString(s));
        Temperature t = new Temperature(s);
        List<Temperature> temp = new ArrayList<>();
        temp.add(t);
        System.out.println( temp );
        GUI g = new GUI(t.getTemp(), t.getFeels(), t.gettMax(), t.gettMin());

    }
}
