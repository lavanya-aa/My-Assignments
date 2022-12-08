package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
	    
	    ChromeOptions option= new ChromeOptions();
	    option.addArguments("-disable-notifications");
	    ChromeDriver driver=new ChromeDriver(option);
	     driver.get(" https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     driver.manage().window().maximize();
	     
	  Thread.sleep(3000);
	     WebElement frame1 = driver.findElement(By.xpath("//div[@id='iframecontainer']//iframe[@id='iframeResult']"));
	     driver.switchTo().frame(frame1);
	    
	     
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//button[text()='Try it']")).click();
	     driver.switchTo().alert().sendKeys("lavanya");
	 	driver.switchTo().alert().accept();
	 	
	 	
	 	String text = driver.findElement(By.xpath("//p[(text()='Hello lavanya! How are you today?')]")).getText();
	 	System.out.println(text);
	     
	     
	     
	     

	}

}
