import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRENIVASEN\\eclipse-workspace\\Day6\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.snapdeal.com/");
    WebElement btnCancel = driver.findElement(By.xpath("//button[@id='pushDenied']"));
    btnCancel.click();
    WebElement btnSearch = driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
    btnSearch.sendKeys("HP laptops");
    Thread.sleep(2000);
    WebElement btnOk = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
    btnOk.click();
    Thread.sleep(2000);
    TakesScreenshot screenshot = (TakesScreenshot) driver;
    File loc = screenshot.getScreenshotAs(OutputType.FILE);
    System.out.println(loc);
    File destFile = new File("C:\\Users\\SRENIVASEN\\Documents\\Ss\\snapdeal.png");
    FileUtils.copyFile(loc, destFile);
}
}
