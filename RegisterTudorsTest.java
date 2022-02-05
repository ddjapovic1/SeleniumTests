// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RegisterTudorsTest {
	private String
	exePath =
	"C:\\Users\\Darko\\Desktop\\Testiranje softvera seminarski\\chromedriver.exe";
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", exePath);
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void registerTudors() {
    driver.get("https://tudors.rs/login.php");
    driver.findElements(By.className("acceptcookies")).get(0).click();
    driver.manage().window().setSize(new Dimension(1280, 672));
    driver.findElement(By.name("FirstName")).click();
    driver.findElement(By.name("FirstName")).sendKeys("Darko");
    driver.findElement(By.name("LastName")).sendKeys("Đapović");
    driver.findElement(By.name("Address")).sendKeys("Užičke republike 83");
    driver.findElement(By.name("City")).sendKeys("Užice");
    driver.findElement(By.name("PostalCode")).sendKeys("31000");
    driver.findElement(By.id("Phone")).sendKeys("0600180819");
    driver.findElement(By.cssSelector(".form-control:nth-child(10)")).sendKeys("darkodjapovictsw1@gmail.com");
    driver.findElement(By.id("Password")).click();
    driver.findElement(By.id("Password")).sendKeys("031554806aA");
    driver.findElement(By.id("RegisterButton")).click();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    assertTrue(driver.getPageSource().contains("Uspešno ste kreirali nalog."));
    
  }
}
