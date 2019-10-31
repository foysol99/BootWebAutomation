import common.CommonAPI;
import homepage.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testhomepage extends CommonAPI {


    SearchProduct searchProduct;

    @BeforeMethod
    public void getsearchproductclass() {
        searchProduct = PageFactory.initElements(driver, SearchProduct.class);
    }

    @Test
    public void setSearchProduct() {
        searchProduct.searchvalue();

    }

    SelectProduct selectProduct;

    @BeforeMethod
    public void getsearchandverify() {
        selectProduct = PageFactory.initElements(driver, SelectProduct.class);
    }

    @Test
    public void setSearchAndVerify() {
        selectProduct.verifyproduct();
    }

    BarMenu barMenu;

    @BeforeMethod
    public void getautosuggestion() {
        barMenu = PageFactory.initElements(driver, BarMenu.class);
    }

    @Test
    public void setAutoSuggestion() {
        barMenu.suggestmenu();
    }

    ExploreProduct exploreProduct;

    @BeforeMethod
    public void getnavigateproduct() {
        exploreProduct = PageFactory.initElements(driver, ExploreProduct.class);
    }

    @Test
    public void setNavigateProduct() {
        exploreProduct.productinfo();
    }

    Signout signout;

    @BeforeMethod
    public void getsignout() {
        signout = PageFactory.initElements(driver, Signout.class);
    }

    @Test
    public void setSignout() {
        signout.getloginclass();
        signout.setloginclass();
        signout.SignoutTest();
    }


}

