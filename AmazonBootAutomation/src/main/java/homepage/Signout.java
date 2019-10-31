package homepage;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Signout extends CommonAPI {
    SignIn signIn;

    @BeforeMethod
    public void getloginclass() {
        signIn = PageFactory.initElements(driver, SignIn.class);
    }

    @Test
    public void setloginclass() {
        signIn.logintest();
    }

    //signout
    public void SignoutTest() {
        clickOnElementByXpath("//span[contains(text(),'foysol')]");
        clickOnElementByXpath("//span[contains(text(),'Sign Out')]");
    }


}