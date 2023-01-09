import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

    @Test

    public void firstTestCase()
    {
       System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");

       WebDriver driver=new ChromeDriver();

       driver.get("https://www.amazon.ca");
    }

}
