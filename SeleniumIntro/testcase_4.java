import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_4 {

    public static void main(String[] args) throws Exception {


        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver.close();


    }
}
