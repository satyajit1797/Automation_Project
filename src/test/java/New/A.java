package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A
{
  public static void main(String []args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","E:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("(//div[@class='card-body'])[1]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//li[@id='item-4'])[1]")).click();
      Thread.sleep(2000);
      WebElement next=driver.findElement(By.id("rightClickBtn"));
      Actions act=new Actions(driver);
      act.moveToElement(next).perform();
      act.contextClick().perform();
      Thread.sleep(2000);
      System.out.println("satyajit");
  }
  
}

