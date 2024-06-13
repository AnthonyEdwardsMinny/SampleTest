package baseclass;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import jup.excel;
import jup.fileU;
import jup.javautility;
import jup.webdriverutility;
import objrepo.homepage;

public class baseclassjupiter {


		public fileU flib = new fileU();
		public excel elib = new excel();
		public javautility jlib = new javautility();
		public webdriverutility wlib = new webdriverutility();

		public WebDriver driver = null;

	
		

		@BeforeClass
		public void cofiGbC() throws IOException {
			System.out.println("launch browser");
			//String browser = flib.getdatafrompropertyjup("browser");
				String browser=System.getProperty("browser",flib.getdatafrompropertyjup("browser"));
			if (browser.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
			}
			wlib.waittoloadpage(driver);

		}
		@BeforeMethod
		public void confbm() throws IOException {
			System.out.println("login");
//			String url = flib.getdatafrompropertyjup("urljup");
			String url = System.getProperty("url",flib.getdatafrompropertyjup("urljup"));
			
			driver.get(url);
		driver.manage().window().maximize();
		}


		
		

		@AfterClass
		public void configAc() throws SQLException {
		System.out.println("close browser");
			driver.quit();
		}

				}
	


