package objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactpage {
	
	WebDriver driver;
public contactpage(WebDriver driver) {
	
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText ="Submit")
	private WebElement submitbtn;

	public WebElement getsubmitbtn() {
		return submitbtn;
	}
	@FindBy(xpath = "//span[@id='email-err']")
	private WebElement verifyerrormsg;

	public WebElement getVerifyerrormsg() {
		return verifyerrormsg;
	}
	@FindBy(xpath="//div[@class='alert alert-info ng-scope']")
	private WebElement verifyerrormsg1;
	
	public WebElement getVerifyerrormsg1() {
		return verifyerrormsg1;
	}
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement verifysucess;
	
	public WebElement getVerifysucess() {
		return verifysucess;
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement fname;
	
	public WebElement getfname() {
		return fname;
	}
	@FindBy(id="email")
	private WebElement mailid;
	
	public WebElement getmailid() {
		return mailid;
	}
	@FindBy(id="message")
	private WebElement msg;
	
	public WebElement getmsg() {
		return msg;
	}
	
	
	
	
	
	
	

}
