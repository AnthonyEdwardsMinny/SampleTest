package baseclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import objrepo.contactpage;
import objrepo.homepage;

public class Tc_02_Test extends baseclassjupiter {
	@Test
	public void createContact() throws IOException {
//		WebDriver driver=null;
//		fileU flb=new fileU();
//	
//		String url=flb.getdatafrompropertyjup("urljup");
//	String browser=flb.getdatafrompropertyjup("browser");
//		if(browser.equalsIgnoreCase("chrome")) {
//			driver=new ChromeDriver();
//			
//			driver.get(url);
		String fname = elib.getdatafromExcel("Sheet1", 1, 0) + jlib.RandomNUm();
		String email = elib.getdatafromExcel("Sheet1", 1, 2) + "@gmail.com";
		String msg = elib.getdatafromExcel("Sheet1", 1, 4);

		homepage hp = new homepage(driver);
		hp.getContactlink().click();
		contactpage cp = new contactpage(driver);

		cp.getfname().sendKeys(fname);
		cp.getmailid().sendKeys(email);
		cp.getmsg().sendKeys(msg);
		cp.getsubmitbtn().click();
		WebElement smg = cp.getVerifysucess();
		if (smg.isDisplayed()) {
			System.out.println("pass");
		} else
			System.out.println("fail");

	}

}
