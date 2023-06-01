import base.BaseTest;
import org.testng.annotations.Test;

public class PageTwoTest extends BaseTest {

    @Test(priority = 1)
    public void checkEnterIncorrectData() {
        pampikPageTwo.openPage();
        pampikPageTwo.phoneNumberFieldClick();
        pampikPageTwo.phoneNumberInput();
        pampikPageTwo.passwordFieldClick();
        pampikPageTwo.passwordInput();
        pampikPageTwo.buttonEnterClick();
        pampikPageTwo.result1();
    }
    @Test(priority = 2)
    public void checkButtonRegistration() {
        pampikPageTwo.openPage();
        pampikPageTwo.buttonRegisrationClick();
        pampikPageTwo.result2();
    }
    @Test(priority = 3)
    public void checkButtonFeedback() {
        pampikPageTwo.openPage();
        pampikPageTwo.buttonFeedBackClick();
        pampikPageTwo.result3();
    }
    @Test(priority = 4)
    public void checkSubscribeNews(){
        pampikPageTwo.openPage();
        pampikPageTwo.scrollPage();
        pampikPageTwo.buttonEmailClick();
        pampikPageTwo.eMailInput();
        pampikPageTwo.scrollPage();
        pampikPageTwo.buttonContinueClick();
        pampikPageTwo.eMailInput();
        pampikPageTwo.buttonContinueClick();
        pampikPageTwo.result4();
    }
    @Test(priority = 5)
    public void checkChangeLanguage() {
        pampikPageTwo.openPage();
        pampikPageTwo.buttomRusClick();
        pampikPageTwo.result5();
    }
}
