import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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
        System.out.println(value);
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(value);
        System.out.println(jsonElement);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        classesList = jsonObject.getAsJsonArray("equipmentpacks");
        getPack("fighter", 0);
        System.out.println(classesList);
    }

    void getPack(String pclass, int packnumber) {
        JsonElement pack;
        for (JsonElement jsonelement : classesList) {
            String tempclassname = jsonelement.getAsJsonObject().get("class").getAsString();
            if (tempclassname.equals(pclass)) {
                JsonArray packsList = jsonelement.getAsJsonObject().get("packs").getAsJsonArray();

                pack = packsList.get(packnumber);
                equipment = gson.fromJson(pack, Equipment.class);
                System.out.println(this.equipment.toString());
        }
            else
                System.out.println("no");
        }
    }
}


////"backpack", "bedroll", "standart ration 5", "tobacco", "tinderbox", "rope, 50", "waterskin"