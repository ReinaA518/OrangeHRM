import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

  
public class Leave_list {  
  
    public static void main(String[] args) {  
        
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
    
   
    // Set start
    driver.findElement(By.name("leaveList[calFromDate]")).clear();
    driver.findElement(By.name("leaveList[calFromDate]")).sendKeys("2019-10-26");
    
    // Set end date
    driver.findElement(By.name("leaveList[calToDate]")).clear();
    driver.findElement(By.name("leaveList[calToDate]")).sendKeys("2020-10-26");
    
    // Click on the search button
    driver.findElement(By.name("btnSearch")).click();
    
    // Scroll down to see leave requests
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,150)");
    
    // Select leave action from the dropdown menu
    Select dropdown = new Select(driver.findElement(By.name("select_leave_action_16")));  
    dropdown.selectByVisibleText("Reject");  
    
    // Scroll to bottom of page
    js.executeScript("window.scrollBy(0,600)");
    
    // Click save button
    driver.findElement(By.name("btnSave"));
    
    // Close chrome driver
    driver.close();
    System.out.print("Test passed!S");
    }  
}
