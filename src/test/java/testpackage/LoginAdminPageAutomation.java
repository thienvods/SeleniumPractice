package testpackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginAdminPageAutomation {
public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
String driverPath = "C:\\chromedriver-win64\\chromedriver.exe";
public WebDriver driver ;
@Test
public void test() {
// set the system property for Chrome driver
System.setProperty("webdriver.chrome.driver", driverPath);
// Create driver object for CHROME browser
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get(baseUrl);


// xác đinh các field để nhập username và password và nút login
WebElement usernameInput = driver.findElement(By.name("username"));
WebElement passwordInput = driver.findElement(By.name("password"));
WebElement loginButton = driver.findElement(By.tagName("button"));


// Nhập thông tin đăng nhập của Admin
usernameInput.sendKeys("Admin");
passwordInput.sendKeys("admin123");

// Click vô nút đăng nhập

loginButton.click();
// Xác định nút Admin
WebElement adminTab = driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']"));
adminTab.click();


}}

