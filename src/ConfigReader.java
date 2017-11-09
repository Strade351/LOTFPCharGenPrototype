import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ConfigReader {

    ConfigReader() throws IOException {
        File equipmentpacks = new File("equipmentpacks.json");
        String value = "";
        List<String> lines = Files.readAllLines(Paths.get(equipmentpacks.toString()));
        for (String line :
                lines) {
            value += line;
        }
        System.out.println(value);
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(value);
        System.out.println(jsonElement);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonArray classesList = jsonObject.getAsJsonArray("equipmentpacks");
        for (JsonElement jsonelement : classesList) {
            jsonElement.getAsJsonObject();
        }
        System.out.println(classesList);
    }

    void getPack(JsonElement pack) {

    }
}
