package automation.helper.waitHelper;

public class SleepWaitHelper {

	public static void setSleepWait(int timeunitInMilliS) {
		try {
			Thread.sleep(timeunitInMilliS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
