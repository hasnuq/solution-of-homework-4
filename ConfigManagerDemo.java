public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Max Players: " + configManager.getConfig("maxPlayers"));
        System.out.println("All Configurations:");
        configManager.printConfigurations();
    }
}
