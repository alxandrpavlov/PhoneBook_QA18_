import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest(){
        String email = "poi@poi.com";
        String password = "$Qazxcv123456";
        openLoginRegistationFofm();
        fillLoginRegistrationForm(email, password);
        submitLogin();


    }


}
