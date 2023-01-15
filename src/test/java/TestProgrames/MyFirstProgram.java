package TestProgrames;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;

public class MyFirstProgram {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String originalwindow = driver.getWindowHandle();
      //  driver.navigate().to("https://youtube.com");
       // driver.switchTo().newWindow(WindowType.WINDOW);
       WebElement element = driver.findElement(By.className("lnXdpd"));
        File file = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./image1.png"));
        driver.quit();

    }
}

