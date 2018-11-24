import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

    public static void main(String[] args) throws Exception {


        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();
        int count = driver.findElements(By.cssSelector("input[name='group1']")).size();
        for (int i = 0; i < count; i++) {

            String text = driver.findElements(By.cssSelector("input[name='group1']")).get(i).getAttribute("value");
            if (text.equals("Cheese")) {
                driver.findElements(By.cssSelector("input[name='group1']")).get(i).click();

            }
        }

        driver.wait(3000);
        driver.close();
    }
}
