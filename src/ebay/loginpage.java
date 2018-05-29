package ebay;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class loginpage extends BaseTest{

	public static void main(String[] args) throws MalformedURLException {
		
		//App launch
		AndroidDriver<AndroidElement> driver=setup();
		
		//Wait until launch
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='SIGN IN']")));
		
		//driver.findElementByXPath("//android.widget.Button[@text='SIGN IN']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Search for anything']").click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ebay.mobile:id/search_src_text")));
		
		driver.findElementById("com.ebay.mobile:id/search_src_text").sendKeys("65 inch tv"+"\n");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView").click();
		
		}

	}


