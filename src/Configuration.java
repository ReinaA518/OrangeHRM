import java.util.List;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;


public class Configuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\14147\\Desktop\\Eclipse\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
    
    // Click on the search Username and Password fields and send value  
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");  
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");  

    // Click on the Login button
    driver.findElement(By.name("Submit")).click();  
    
    //Select nav_bar = new Select(driver.findElement(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]")));
    //nav_bar.selectByIndex(0);
    
    WebElement navUL = driver.findElement(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li[1]/ul/li[6]"));
    WebElement adminUL;
    WebElement configUL;
    List<WebElement> navList = navUL.findElements(By.tagName("li"));
    List<WebElement> configList = null;
    List<WebElement> adminList = null;
    for (WebElement li : navList ) {
    System.out.println(li.getAttribute("innerText"));	
    if (li.getAttribute("innerText").equals("Email Subscriptions")) {
    	WebElement aTag = li.findElement(By.tagName("a"));
    	driver.navigate().to(aTag.getAttribute("href"));
         break;
       }
    }
	}
    
}
