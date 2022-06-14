import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reg {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User\\Desktop\\Selenium\\chromedriver_win32//chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://sam.rultest2.com/account/");
        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[1]/span[1]/div/div/input")).sendKeys("foysalzitu");
        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[1]/span[2]/div/div/input")).sendKeys("zitu@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[1]/div/div/input")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[2]/div/div/input")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[3]/div/div/input")).sendKeys("Foysal Zitu");
        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[4]/div/div/input")).sendKeys("01518919299");

        WebElement e = driver.findElement(By.name("Gender"));
		Select s = new Select(e);
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[6]/div/div/input")).sendKeys("22");

        WebElement designation = driver.findElement(By.name("Designation"));
        Select d = new Select(designation);
        Thread.sleep(3000);
        d.selectByIndex(4);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[8]/div/div/input")).sendKeys("GUB");

        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[3]/div/div/button/span")).click();
    }

}
