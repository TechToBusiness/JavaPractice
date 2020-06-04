
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import java.io.File;
import java.io.IOException;
import java.lang.management.ThreadInfo;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.sql.Time;
import java.util.regex.Pattern;


public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		Runtime.getRuntime().exec("chromedriver (32 bit)");
		
		Runtime RT= Runtime.getRuntime();
		
		Pattern pp=Pattern.compile("Chrome .*");
//		RT.exec(command)
		 Process P = RT.exec("tasklist");
		
		
//		 Process P = RT.exec("taskkill /F /IM chrome.*");
//System.out.print(P.exitValue());
		
		
		
//		RT.availableProcessors();
//		RT.exec("taskkill /F /IM " + pp);
//		RT.exec("taskkill /F /IM chromedriver.exe");
//		RT.exec("taskkill /F /IM chromedriver.exe");
//		RT.exec("taskkill /F /IM chromedriver.exe");
//		RT.exec("taskkill /F /IM chromedriver.exe");
//		RT.exec("taskkill /F /IM chromedriver.exe");
//		RT.exec("taskkill /F /IM chromedriver.exe");
//		RT.exec("taskkill /F /IM chromedriver.exe");
//		
//		
////		Process p=RT.
//				
//		RT.exec("taskkill /PID 2324");
//		
//		RT.exec("taskkill chromedriver.exe");
//
//		RT.exec("taskkill chromedriver.exe");
//
//		RT.exec("taskkill chromedriver.exe");
//		RT.exec("taskkill chromedriver.exe");
//		
//		
//		RT.exec("taskkill chromedriver.exe");
//		
//		RT.exec("taskkill chromedriver.exe");
//		RT.exec("taskkill chromedriver.exe");
//		RT.exec("taskkill chromedriver.exe");
//		RT.exec("taskkill chromedriver.exe");
//		RT.exec("taskkill chromedriver.exe");
//		RT.exec("taskkill chromedriver.exe");
//		RT.exec("taskkill chromedriver.exe");
//		RT.exec("taskkill chromedriver.exe");
//		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDrivers\\chromedriver.exe");
		WebDriver CD=new ChromeDriver();
//		CD.getWindowHandle();
//		CD.close();
//		WebDriver CD=new ChromeDriver();
		CD.getWindowHandle();
		CD.get("https://www.makemytrip.com/");
		System.out.print(CD.getTitle());
//		CD.getWindowHandle()
//		CD.navigate();
//		WebElement flightButton=CD.findElement(By.xpath("//a [@href='//www.makemytrip.com/flights/']"));
		WebElement flightButton=CD.findElement(By.xpath("//a //span [text()='Flights'][1]"));
		
		try {
			File ff=flightButton.getScreenshotAs(OutputType.FILE);
			System.out.print(ff.getAbsolutePath());
			FileSystem FS=FileSystems.getDefault();
			ff.renameTo(new File("C:\\Collection\\TestScreen.jpeg"));
				
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		 	
		
//		getRect();
		flightButton.click();
//		flightButton.sendKeys(Keys.ENTER);
//		time
//		sendKeys("{enter}");
		
//		WebElement hotels=CD.findElement(By.xpath("//a [@href='//www.makemytrip.com/hotels/']"));
		WebElement hotels=CD.findElement(By.xpath("//span [text()='Hotels']"));
		
//		hotels.getRect();
		hotels.click();
//		hotels.sendKeys/(Keys.ENTER);
//		
//		WebElement searchButton=CD.findElement(By.xpath("//input [@type='submit' and @value='Google Search']"));
//		searchButton.getRect();
//		searchButton.submit();
//		click();
//		("https://www.java.com/en/download/windows-64bit.jsp");
//		CD.getTitle();
		
		WebElement cityName=CD.findElement(By.xpath("//input [@id='city']"));
		while(!cityName.isDisplayed())
		{Thread.sleep(15);}
		
//		cityName.click();
		cityName.sendKeys(Keys.ENTER);
		Thread.sleep(150);
		WebElement nameEnter=CD.findElement(By.xpath("//input [@type='text' and @placeholder='Enter city/ Hotel/ Area/ Building']"));
//		Thread.sleep(150);
		File ff1=nameEnter.getScreenshotAs(OutputType.FILE);
		System.out.print(ff1.getAbsolutePath());
		FileSystem FS=FileSystems.getDefault();
		ff1.renameTo(new File("C:\\Collection\\TestScreen1.jpeg"));
		nameEnter.sendKeys("Karnal");
		Thread.sleep(150);
	WebElement cityNameSelect =CD.findElement(By.xpath("//span [@class='sr_city blackText' and text()='Karnal, India']"));
	cityNameSelect.click();	}

}
