package ebay;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class loginTest extends loginpage{

	public static void main() throws MalformedURLException {
	
		AndroidDriver<AndroidElement> driver=setup();
		loginpage.search();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ADD TO CART\"));").click();;
		
		WebElement result= (WebElement) driver.findElementByXPath("//android.widget.TextView[@text='Sign in']");
		Assert.assertEquals(result.getText(), "Sign in");
		

		
	}

}
