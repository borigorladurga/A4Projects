package Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Basic_Program_Facebook {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement email =driver.findElement(By.name("email"));
	email.sendKeys("6301494977");
		Thread.sleep(3000);
		WebElement password =driver.findElement(By.id("pass"));
		password.sendKeys("Thriven@412");
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();
	}

}