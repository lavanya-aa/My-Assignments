package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
     public static void main(String[] args) throws InterruptedException {
    	 

    		WebDriverManager.chromedriver().setup();
    	    
    	    ChromeOptions option= new ChromeOptions();
    	    option.addArguments("-disable-notifications");
    	    
    	     ChromeDriver driver=new ChromeDriver(option);
    	     driver.get(" https://jqueryui.com/draggable/");
    	     
    	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	     
    	     driver.manage().window().maximize();
    	     
    	     
    	     driver.switchTo().frame(0);
    	     Thread.sleep(3000);
    	     WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
    	     
    	     Actions obj= new Actions(driver);
    	     
    	     obj.dragAndDropBy(drag, 100, 100).perform();
    	     
    	     
	}
}
