package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    
	    ChromeOptions option= new ChromeOptions();
	    option.addArguments("-disable-notifications");
	    
	     ChromeDriver driver=new ChromeDriver(option);
	     driver.get(" https://jqueryui.com/droppable/");
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     driver.manage().window().maximize();
	     driver.switchTo().frame(0);
	     Thread.sleep(3000);
	     
	     WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
	     
	     WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	     
	     Actions dd= new Actions(driver);
	     
	    dd.dragAndDrop(drag, drop).perform();
	     
	     
	     

	}

}
