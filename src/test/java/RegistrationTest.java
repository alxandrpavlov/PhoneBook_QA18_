import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {

    WebDriver wd;


    @BeforeMethod
    public void init(){
        wd =new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/home");


    }

    @Test
    public void regPositiveTest(){

        WebElement loginBtn = wd.findElement(By.xpath("//a[@href='/login']"));
        loginBtn.click();

        int i = (int)(System.currentTimeMillis() / 1000) % 3600;


        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("wsderfgt" + i + "@wsw.com");


        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
        passInput.clear();
        passInput.sendKeys("$Qazxcv123456");
        passInput.click();

        wd.findElement(By.xpath("//button[2]")).click();

        Assert.assertTrue(wd.findElement(By.xpath("//a[text()='ADD']")).getText().equals("ADD"));



    }


    @AfterMethod
    public void tearDawn(){
//    wd.quit();
    }


}
