package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    
    // Properties object to store the data loaded from the properties file
    private Properties properties;

    // Constructor to initialize the ConfigReader and load the properties from the file
    public ConfigReader() {
        try {
            // Load the properties file (data.properties) using a FileInputStream
            FileInputStream file = new FileInputStream("src/test/java/Data/data.properties");
            
            // Create a new Properties object to store the key-value pairs
            properties = new Properties();
            
            // Load the properties from the file
            properties.load(file);
        } catch (IOException e) {
            // If there is an error (e.g., file not found), print an error message
            System.out.println("Error loading properties file: " + e.getMessage());
        }
    }

    // Method to retrieve the value associated with a given key from the properties file
    public String getProperty(String key) {
        // Return the value of the specified key in the properties file
        return properties.getProperty(key);
    }
}
