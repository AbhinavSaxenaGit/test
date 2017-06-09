package com.poc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	public static String getConfig(String propertyName) {
		Properties config = new Properties();
		try {
			InputStream iStream = new FileInputStream("config.properties");
			config.load(iStream);
		} catch (IOException e) {
		}
		return (config.getProperty(propertyName));
	}

}
