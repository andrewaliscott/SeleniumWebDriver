import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws Exception {


        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        //driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //driver.findElement(By.cssSelector("a[value='PYG']")).click();
        //driver.findElement(By.cssSelector("a[value='DEL']:nth-child(1)")).click();

        //Static DropDownMenu: the one with select tagName the option menu
        //Traditional DropDown Menu
        //Select s=new Select(driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_originStation1")));
        //s.selectByIndex(2);
        //s.selectByValue("INR");
        //s.selectByVisibleText("AED");

        //CHECKBOX

        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        //driver.wait(4000);

        driver.close();











    }
}
