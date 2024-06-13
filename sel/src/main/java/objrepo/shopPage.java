package objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shopPage {
	WebDriver driver;

		public shopPage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}

	@FindBy(xpath ="(//a[@class='btn btn-success'])[2]")
private WebElement Sf;

public WebElement getSf() {
return Sf;
}
@FindBy(xpath ="(//a[@class='btn btn-success'])[4]")
private WebElement bunny;

public WebElement getbunny() {
	return bunny;
}
@FindBy(xpath ="(//a[@class='btn btn-success'])[7]")
private WebElement bear;

public WebElement getbear() {
	return bear;
}
@FindBy(xpath ="//a[@href='#/cart']")
private WebElement cartlink;

public WebElement getcartlink() {
	return cartlink;
}

}
