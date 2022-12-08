package week3.day3;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
	    
	    ChromeOptions option= new ChromeOptions();
	    option.addArguments("-disable-notifications");
	    ChromeDriver driver=new ChromeDriver(option);
	     driver.get(" https://www.leafground.com/alert.xhtml");
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
	     driver.switchTo().alert().accept();
	     
	      String text = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
	System.out.println(text);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	driver.switchTo().alert().accept();
	
	String text2 = driver.findElement(By.xpath("//span[@id='result']")).getText();
	System.out.println(text2);
	
	driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']/span)[2]")).click();
	driver.switchTo().alert().sendKeys("lavanya");
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	
	String text3 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	System.out.println(text3);
	
	driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	
	driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	
	Thread.sleep(3000);

	
	driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//span[text()='Delete']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[text()='Yes'])[1]")).click();
	Thread.sleep(3000);

	
	
	
	     

	}

}
