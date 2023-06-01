import base.BaseTest;
import org.testng.annotations.Test;


public class PageOneTest extends BaseTest {

    @Test(priority = 1)
    public void cityChoice() {
        pampikPageOne.openPage();
        pampikPageOne.cityClick();
        pampikPageOne.cityInput();
        pampikPageOne.cityChoise();
        driver.navigate().refresh();
        pampikPageOne.result();
    }
        @Test(priority = 2)
        public void checkHelpMenu() {
        pampikPageOne.openPage();
        pampikPageOne.helpMenuClick();
        pampikPageOne.garantItemClick();
        pampikPageOne.result2();
    }
    @Test(priority = 3)
    public void checkCallMe() {
        pampikPageOne.openPage();
        pampikPageOne.telephoneCallMeClick();
        pampikPageOne.numberInput();
        pampikPageOne.sendMessageClick();
        pampikPageOne.result3();
    }
    @Test(priority = 4)
    public void checkSearch() {
        pampikPageOne.openPage();
        pampikPageOne.searchFieldClick();
        pampikPageOne.enterTextForSeacrh();
        pampikPageOne.result4();
    }
    @Test(priority = 5)
    public void checkChangeLanguage() {
        pampikPageOne.openPage();
        pampikPageOne.buttonRusClick();
        pampikPageOne.result5();
    }

}
