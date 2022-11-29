package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click()
;
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("AAL");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Aaleyah");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("leaf");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("description");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("aal3101@gmail.com");
		WebElement sele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select scr=new Select(sele);
		scr.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

	}

}
