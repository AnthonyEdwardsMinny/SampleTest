package objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
WebDriver driver;

		 		public homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

				@FindBy(xpath ="//a[@href='#/contact']")
		private WebElement contactlink;

		public WebElement getContactlink() {
			return contactlink;
		}

		
		@FindBy(xpath ="(//a[@href='#/shop'])[1]")
		private WebElement shoplink;
		
		public WebElement getshoplink() {
			return shoplink;
		}
		
		
	}


