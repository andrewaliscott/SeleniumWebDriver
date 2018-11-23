import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase_2 {


    public static void main(String[] args) throws Exception {


        WebDriver driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        driver.get("http://www.yahoo.com");
        driver.navigate().back();
        driver.close();


    }
}
