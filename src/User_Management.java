import java.util.List;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class User_Management {

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
    
    WebElement navUL = driver.findElement(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]"));
    List<WebElement> navList = navUL.findElements(By.tagName("li"));
    for (WebElement li : navList ) {
    if (li.getText().equals("Admin")) {
         li.click();
         break;
       }
    }
    
	
	}
}
