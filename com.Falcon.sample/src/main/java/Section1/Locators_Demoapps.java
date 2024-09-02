package Section1;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.WebElement; import
  org.openqa.selenium.chrome.ChromeDriver;
  
  public class Locators_Demoapps {
  
  public static void main(String[] args) throws Exception { WebDriver
  driver=new ChromeDriver();
  driver.get("https://demoapps.qspiders.com/ui?scenario=1");
  driver.manage().window().maximize(); 
  WebElement name=driver.findElement(By.id("name"));
  name.sendKeys("Bandi Triven Kumar Reddy"); Thread.sleep(3000); 
  WebElement email =driver.findElement(By.name("email"));
  email.sendKeys("triven.java412@gmail.com"); Thread.sleep(3000);
  WebElement password=driver.findElement(By.id("password"));
  password.sendKeys("Thriven@412"); Thread.sleep(3000);
  password.submit();  
  
  }
  
  }