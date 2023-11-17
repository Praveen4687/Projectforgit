package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void LoginTest() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.ciitinstitute.com");
	  int a=0,b=20,c;
			  c=a+b;
			  System.out.println("Addition="+c);
	  
  }
}
