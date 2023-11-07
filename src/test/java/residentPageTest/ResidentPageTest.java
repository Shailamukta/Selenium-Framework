package residentPageTest;

import org.testng.annotations.Test;

import baseutil.BaseClass;
import pages.ResidentPage;

public class ResidentPageTest extends BaseClass {
	@Test
	public void clickResidentPageTest() throws InterruptedException {
		rp.clickResident();
	}

}
