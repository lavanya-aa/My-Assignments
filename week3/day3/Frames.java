package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
	    
	    ChromeOptions option= new ChromeOptions();
	    option.addArguments("-disable-notifications");
	    ChromeDriver driver=new ChromeDriver(option);
	     driver.get(" https://chercher.tech/practice/frames-example-selenium-webdriver");
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	     WebElement frame1= driver.findElement(By.xpath("//iframe[@id='frame1']"));
	    driver.switchTo().frame(frame1);
	    
	     
	     driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("types of animals");
	     
	     WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
	     
	     driver.switchTo().frame(frame3);
	     
	     driver.findElement(By.xpath("//input[@id='a']")).click();
	     driver.switchTo().defaultContent();
	     
	     WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
	     driver.switchTo().frame(frame2);
	     
	     WebElement types = driver.findElement(By.xpath("//select[@id='animals']"));
	     Select obj= new Select (types);
	     
	     obj.selectByValue("babycat");
	     Thread.sleep(3000);
	     
	     
	     
	     

	}

}
