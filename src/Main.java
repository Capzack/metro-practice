import com.fasterxml.jackson.databind.ObjectMapper;
import model.FeatureCollection;
import model.Node;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        FeatureCollection featureCollection =
                objectMapper.readValue(new File("C:\\Users\\ThePe\\Desktop\\map.json"), FeatureCollection.class);
        List<Node> nodes = new ArrayList<>();

    }
}
