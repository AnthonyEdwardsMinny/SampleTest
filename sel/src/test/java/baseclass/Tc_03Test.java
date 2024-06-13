package baseclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import objrepo.cartPage;
import objrepo.homepage;
import objrepo.shopPage;

public class Tc_03Test extends baseclassjupiter {

	@Test
	public void addtocart() throws IOException {

		homepage hp = new homepage(driver);
		hp.getshoplink().click();
		shopPage pg = new shopPage(driver);
		for (int i = 1; i <= 2; i++) {
			pg.getSf().click();
		}
		for (int i = 1; i <= 5; i++) {
			pg.getbunny().click();
		}

		for (int i = 1; i <= 3; i++) {
			pg.getbear().click();
		}

		pg.getcartlink().click();
		cartPage cp = new cartPage(driver);
		double res=0;
		String sfprice = cp.getSfPrice().getText();
		String bunnyp = cp.getbunnyPrice().getText();
		String bearp = cp.getbearPrice().getText();
		String subtotalsf = cp.getsftotalPrice().getText();
		String subtotalbunny = cp.getbunnytotalPrice().getText();
		String subtotalbear = cp.getbeartotalPrice().getText();
		
		double priceTotalSF = verifySubTotal(sfprice, "frog", "$10.99",2,subtotalsf);
		double priceTotalBunnyp = verifySubTotal(bunnyp, "bunny", "$9.99",5,subtotalbunny);
		double priceTotalbearp = verifySubTotal(bearp, "bear", "$14.99",3,subtotalbear);
		res+=priceTotalSF+priceTotalBunnyp+priceTotalbearp;
		System.out.println(res);
		String result=Double.toString(res);
		System.out.println(result);
      	String fullAmount=cp.getTotalAmount().getText();
		if(fullAmount.contains(result)) {
			System.out.println("full amount verified");
		}
		else {
			System.out.println("failed");
		}
		
	}
	
	public static double verifySubTotal(String objectPrice, String objectName, String itemPrice, int count, String subTotal){
			String priceto=objectPrice.replace("$", "");
			Double priceto1=Double.parseDouble(priceto);
			double subprice=count*priceto1;
			String subfinal=Double.toString(subprice);
			System.out.println(subprice);
				if (objectPrice.equals(itemPrice)) {
				System.out.println(objectName + "price verified");
				} else {
				System.out.println("price verification failed");
				}
				if (subTotal.contains(subfinal)) {
				System.out.println(objectName + "subtotal verified");
				} else {
				System.out.println("subtotal verification failed");
				}
				
				return subprice;
		}

}