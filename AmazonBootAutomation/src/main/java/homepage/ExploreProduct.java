package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class ExploreProduct extends CommonAPI {
    public void productinfo() {
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "laptop cover");
        clickOnElementByXpath("//input[@type='submit']");
        sleepFor(2);
        clickOnElementByXpath("//span[contains(text(),'MacBook Air 13 inch Case, UESWILL Smooth Soft-Touc')]");
        System.out.println(driver.findElement(By.xpath("//div[@id='feature-bullets']")).getText());
    }
}
