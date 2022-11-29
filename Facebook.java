package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("lavanya");
		driver.findElement(By.name("lastname")).sendKeys("aaleyah");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("lavanya01@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("lavanya@1");
		WebElement day = driver.findElement(By.id("day"));
		Select fb=new Select(day);
		fb.selectByValue("1");
		
		WebElement month = driver.findElement(By.id("month"));
		Select fb2= new Select(month);
		fb2.selectByValue("5");
		
		WebElement year = driver.findElement(By.id("year"));
		Select fb3 = new Select(year);
		fb3.selectByValue("1990");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		

		

	}

}
