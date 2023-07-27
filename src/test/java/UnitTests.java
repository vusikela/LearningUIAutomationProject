import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnitTests
{

@Test
public void test() throws InterruptedException
{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\9045\\Desktop\\Drivers\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://snapengage-qa.appspot.com/");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"menu-item-926\"]/a")).click();
}


}
