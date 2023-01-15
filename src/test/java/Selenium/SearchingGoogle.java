package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingGoogle {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com/watch?v=OM4mr3PKgcQ&list=PLUDwpEzHYYLuW9XEvFEJk2kqsk6HqscI4&index=11");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.quit();

    }
}
