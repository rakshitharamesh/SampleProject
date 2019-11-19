package automation.helper.resourceHelper;

public class ResourceHelper {

	/**
	 * This method will return complete directory of file
	 * 
	 * @param filePath
	 * @return
	 */
	public static String getResourceDirectory(String filePath) {
		String currentDir = System.getProperty("user.dir"); 
		String fileDir = currentDir + "\\" + filePath;
		return fileDir;
	}
}
