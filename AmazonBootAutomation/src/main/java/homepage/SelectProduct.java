package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class SelectProduct extends CommonAPI {
    public void verifyproduct() {
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "apple air pod");
        clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        sleepFor(2);
        clickOnElementByXpath("//div[@class='rush-component']//div[@class='rush-component']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple AirPods with Charging Case (Latest Model)')]");
        System.out.println(driver.findElement(By.xpath("//h1[@id='title']")).getText());
    }
}
