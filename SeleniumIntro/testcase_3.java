import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase_3 {

    public static void main(String[] args) throws Exception {


        WebDriver driver = new ChromeDriver();
        //WebDriver driver2 = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("hi");
        driver.findElement(By.name("pass")).sendKeys("123456");
        driver.close();


    }
}
