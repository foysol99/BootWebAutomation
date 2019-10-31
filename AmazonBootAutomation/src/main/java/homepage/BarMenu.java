package homepage;

import common.CommonAPI;

public class BarMenu extends CommonAPI {
    public void suggestmenu() {
        clearFieldByXpath("//a[@id='nav-hamburger-menu']");
        clickOnElementByLinkText("//div[contains(text(),'Books & Audible')]");
        clickOnElementByLinkText("//ul[@class='hmenu hmenu-visible hmenu-translateX']//li[3]//a[1]");
        sleepFor(2);
    }
}
