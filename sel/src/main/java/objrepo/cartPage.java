package objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {
	
	WebDriver driver;

	public cartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//td[text()='$10.99']")
	private WebElement sfPrice;

	public WebElement getSfPrice() {
		return sfPrice;
	}
	@FindBy(xpath="//td[contains(text(),'21.98')]")
	private WebElement sftotalPrice;
	
	public WebElement getsftotalPrice() {
		return sftotalPrice;
	}
	@FindBy(xpath="//td[text()='$9.99']")
	private WebElement bunnyPrice;
	
	public WebElement getbunnyPrice() {
		return bunnyPrice;
	}
	@FindBy(xpath="//td[contains(text(),'49.95')]")
	private WebElement bunnytotalPrice;
	
	public WebElement getbunnytotalPrice() {
		return bunnytotalPrice;
	}
	@FindBy(xpath="//td[contains(text(),'14.99')]")
	private WebElement bearPrice;
	
	public WebElement getbearPrice() {
		return bearPrice;
	}
	@FindBy(xpath="//td[contains(text(),'44.97')]")
	private WebElement beartotalPrice;
	
	public WebElement getbeartotalPrice() {
		return beartotalPrice;
	}
	@FindBy(xpath="//strong[contains(text(),'Total: 116.9')]")
	private WebElement TotalAmount;
	
	public WebElement getTotalAmount() {
		return TotalAmount;
	}

}
