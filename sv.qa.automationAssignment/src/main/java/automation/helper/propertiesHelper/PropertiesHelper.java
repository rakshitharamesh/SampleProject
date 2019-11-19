package automation.helper.propertiesHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import automation.helper.resourceHelper.ResourceHelper;

public class PropertiesHelper {

	/**
	 * This method will return value of corresponding key present in the properties
	 * file
	 * 
	 * @param keyProperties
	 * @return
	 */

	public static String getProperties(String keyProperties) {
		String propertiesPath = ResourceHelper.getResourceDirectory("\\src\\main\\resources\\Resource.properties");
		File file = new File(propertiesPath);
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties properties = new Properties();
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(keyProperties);

	}

	/*
	 * public static void main(String[] args) {
	 * System.out.println(getProperties("chromedriver")); }
	 */
}
