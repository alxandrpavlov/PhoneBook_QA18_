import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

//    WebDriver wd;
//    FluentWait<WebDriver> wait;


    @BeforeMethod
    public void preCondition(){
        if (isLogged()){
            logout();
        }

    }
    //    public void init() {
//        wd = new ChromeDriver();
//        wd.navigate().to("https://telranedu.web.app/home");
////        wait = new FluentWait<>(wd);
//        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


//    }

    @Test
    public void regPositiveTest() {

//        1.open login/reg form
        openLoginRegistationFofm();

//        WebElement loginBtn = wd.findElement(By.xpath("//a[@href='/login']"));
//        loginBtn.click();
//        2.fill login/reg form

        int i = (int) (System.currentTimeMillis() / 1000) % 3600;

        String email = "wsderfgt" + i + "@wsw.com";
        String password = "$Qazxcv123456";

        fillLoginRegistrationForm(email, password);


//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("wsderfgt" + i + "@wsw.com");
////        3. sumbol by click reg button
        submitRegistration();
//
//
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.clear();
//        passInput.sendKeys("$Qazxcv123456");
//        passInput.click();
//
//        wd.findElement(By.xpath("//button[2]")).click();

//        pause(10000);
//        4. assert

        Assert.assertTrue(wd.findElement(By.xpath("//a[text()='ADD']")).getText().equals("ADD"));


    }

//    public void pause(int time) {
//
////        FluentWait<WebDriver> wait = new FluentWait<>(wd);
////        wait.withTimeout(Duration.ofSeconds(time));
//
//
////        try {
////            Thread.sleep(time);
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
//    }


        @Test
        public void registrationWrongEmail(){
            WebElement loginBtn = wd.findElement(By.xpath("//a[@href='/login']"));
            loginBtn.click();

            int i = (int) (System.currentTimeMillis() / 1000) % 3600;


            WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
            emailInput.click();
            emailInput.clear();
            emailInput.sendKeys("wsderfgt" + i + "wsw.com");


            WebElement passInput = wd.findElement(By.xpath("//input[2]"));
            passInput.clear();
            passInput.sendKeys("$Qazxcv123456");
            passInput.click();

            wd.findElement(By.xpath("//button[2]")).click();

//        Assert.assertTrue(wd.findElement(By.xpath("//a[text()='ADD']")).getText().equals("ADD"));


        }


        @AfterMethod
        public void tearDawn () {
////            wd.quit();
        }


    }
