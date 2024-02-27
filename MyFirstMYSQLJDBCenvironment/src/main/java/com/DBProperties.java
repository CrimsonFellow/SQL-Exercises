package com;

import java.io.InputStream;
import java.util.Properties;

public class DBProperties {
    private static Properties properties = new Properties();

    static {
        try {
            // Load the properties file
            InputStream inputStream = DBProperties.class.getClassLoader().getResourceAsStream("config.properties");
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get JDBC URL from properties
    public static String getJdbcUrl() {
        return properties.getProperty("jdbc.url");
    }

    // Get JDBC username from properties
    public static String getUsername() {
        return properties.getProperty("jdbc.username");
    }

    // Get JDBC password from properties
    public static String getPassword() {
        return properties.getProperty("jdbc.password");
    }
}
