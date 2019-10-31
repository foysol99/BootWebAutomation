package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class SearchProduct extends CommonAPI {
    public void searchvalue() {
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "macbook air");
        driver.findElement(By.className("nav-input")).click();
        sleepFor(3);
        clickOnElementByXpath("//div[@class='rush-component']//div[@class='rush-component']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'New Apple MacBook Air (13-inch, 1.6GHz dual-core I')]");
        clickOnElementByXpath("//input[@id='add-to-cart-button']");
        sleepFor(3);
    }
}