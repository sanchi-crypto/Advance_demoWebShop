package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	private static Properties prop;
	static {
		try {
			
			prop=new Properties();
			FileInputStream fis=new FileInputStream("src/test/resources/config/config.properties");
			prop.load(fis);
			
		}catch(Exception e) {
			throw new RuntimeException("config file not found");
		}
	}
	public static String get(String Key) {
		return prop.getProperty(Key);
	}
public static String getBaseUrl() {
	String env=get("env");
	return get(env+".baseUrl");
}	
	
	
}
	


