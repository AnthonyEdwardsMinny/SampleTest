package baseclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jup.fileU;
import jup.webdriverutility;
import objrepo.contactpage;
import objrepo.homepage;

public class tc_01Test extends baseclassjupiter {

	@Test
	public void jupcontactvalid() throws IOException {
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
		cp.getsubmitbtn().click();
		WebElement actualER = cp.getVerifyerrormsg();
		if (actualER.isDisplayed()) {
			System.out.println("display");
		} else {
			System.out.println("fail");
		}
		cp.getfname().sendKeys(fname);
		cp.getmailid().sendKeys(email);
		cp.getmsg().sendKeys(msg);
		// cp.getsubmitbtn().click();
		String colour = cp.getVerifyerrormsg1().getCssValue("colour");
		if (colour.equals("red")) {
			System.out.println("fail");
		} else {
			System.out.println("pass");
		}

	}

}
