import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_1 {

    public static void main(String[] args) {

        //Create  Driver Object for Chrome Browser

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());



    }
}
