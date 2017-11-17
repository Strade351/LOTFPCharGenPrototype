import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class ConfigReader {
    JsonArray classesList;
    Gson gson = new Gson();
    Equipment equipment;

    ConfigReader() throws IOException {
        File equipmentpacks = new File("equipmentpacks.json");
        String value = "";
        List<String> lines = Files.readAllLines(Paths.get(equipmentpacks.toString()));
        for (String line :
                lines) {
            value += line;
        }
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(value);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        classesList = jsonObject.getAsJsonArray("equipmentpacks");
    }

    /**
     * @param pclass
     * function return random pack to the variable
     */
    Equipment getPack(String pclass) {
        Random r = new Random();                //create random
        JsonElement pack;
        for (JsonElement jsonelement : classesList) {
            String tempclassname = jsonelement.getAsJsonObject().get("class").getAsString();                   //get current class name
            if (tempclassname.equals(pclass)) {
                JsonArray packsList = jsonelement.getAsJsonObject().get("packs").getAsJsonArray();
                pack = packsList.get(r.nextInt(packsList.size()));                                             //get random pack using size of json array as border
                equipment = gson.fromJson(pack, Equipment.class);                                              //fill Equipment object fields
                break;
            }
        }
        return equipment;
    }
}


////