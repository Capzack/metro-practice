import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class JSONReader {
    public static void main(String[] args) throws IOException {
            String jsonContent = new String(Files.readAllBytes(Paths.get("C:\\Users\\ThePe\\Downloads\\Telegram Desktop\\map.json")));
            JSONObject jsonObject = new JSONObject(jsonContent);
            JSONArray jsonArray = jsonObject.getJSONArray("properties");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject object = jsonArray.getJSONObject(i);
                if (object.has("coordinates")) {
                    JSONArray coordinatesArray = object.getJSONArray("coordinates");
                    double latitude = coordinatesArray.getDouble(0);
                    double longitude = coordinatesArray.getDouble(1);
                    System.out.println("Latitude: " + latitude);
                    System.out.println("Longitude: " + longitude);
                    System.out.println();
                }
            }
    }
}

