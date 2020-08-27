package Capability;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Cricbuzz {
	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sravani");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	    cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\SravaniTanukonda\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
		AndroidDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("m.cricbuzz.com");
	    //driver.findElement(MobileBy.className("android.widget.TextView")).click();
	   /* driver.findElementByAndroidUIAutomator("text(\"Menu\")").click();
        driver.findElementByAndroidUIAutomator("text(\"HOME\")").click();
	    WebElement Link = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"England clinch series 1-0\"));");
	    Link.click();*/
	
	}
}
