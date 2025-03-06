import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> configSettings;

    private ConfigurationManager() {
        configSettings = new HashMap<>();
        loadConfigurations();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private void loadConfigurations() {
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }

    public String getConfig(String key) {
        return configSettings.getOrDefault(key, "Not Found");
    }

    public void printConfigurations() {
        configSettings.forEach((key, value) ->
                System.out.println(key + " -> " + value));
    }
}
