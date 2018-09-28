package de.svenkroell.gymondoTest.support;

import de.svenkroell.gymondoTest.Constants;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
    public void loadProperties() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(inputStream);
            Constants.BASE_URL = properties.getProperty("baseUrl");
            Constants.EXISTING_USER_EMAIL = properties.getProperty("existingUserEmail");
            Constants.EXISTING_USER_PASSWORD = properties.getProperty("existingUserPassword");
        } catch (FileNotFoundException e) {
            System.out.println("File config.properties not found");
            throw e;
        } catch (IOException e) {
            throw e;
        }
    }
}
