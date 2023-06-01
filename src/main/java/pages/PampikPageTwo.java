package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PampikPageTwo extends BasePage {

    public PampikPageTwo(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        //            Test 1
        private final static By inputNumberPhone = By.xpath("//input[@placeholder='Телефон']");
        private final static By inputPassword = By.xpath("//input[@placeholder='Пароль']");
        private final static By buttonEnter = By.xpath("//button[text()='Увійти']");
        private final static By badMessage = By.xpath("//div[text()='Невірний логін або пароль']");

        //            Test 2
        private final static By buttonRegistration = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div/a");
        private final static By registrationForm = By.xpath("//div[@class='login__left']");
        //            Test 3
        private final static By buttonFeedBack = By.xpath("//div[@class='rngst_phone_body--tooltip rngst_phone_icon']");
        private final static By buttonTelegram = By.xpath("//img[@alt='Telegram']");
        private final static By buttonViber = By.xpath("//img[@alt='Viber']");

        //            Test 4
        private final static By fieldEMail = By.xpath("//input[@placeholder='Ваш e-mail']");
        private final static By buttonContinue = By.xpath("//*[@id=\"footer\"]/div[1]/div/form/div/button");
        private final static By fixSend = By.xpath("//h2");
        //            Test 5
        private final static By buttonRusLanguage = By.xpath("//a[@data-lang='ru-RU']");
        private final static By helpMenu = By.xpath("//a[@id=\"help-trigger\"]");
    }

    private static class Labels {
        //            Test 1
        private final static String url2 = "https://pampik.com/ua/account/login";
        private final static String phoneNumber = "500000000";
        private final static String password = "111111";

        //    Test 4
        private final static String eMail = "alexvitr73@gmail.com";

    //    Test 5
    private final static String helpRus = "Помощь";
    }
    //       Methods
    //      Test 1
    public void openPage() {
        driver.get(Labels.url2);
    }

    public void phoneNumberFieldClick() {
        elements.clickOnElement(Locators.inputNumberPhone);
    }

    public void phoneNumberInput() {
        elements.sendTextOnElement(Locators.inputNumberPhone, Labels.phoneNumber);
    }

    public void passwordFieldClick() {
        elements.clickOnElement(Locators.inputPassword);
    }

    public void passwordInput() {
        elements.sendTextOnElement(Locators.inputPassword, Labels.password);
    }

    public void buttonEnterClick() {
        elements.clickOnElement(Locators.buttonEnter);
    }

    public void result1() {
        assertions.elementIsDisplayedByXpath(Locators.badMessage);
    }

    //      Test 2
    public void buttonRegisrationClick() {
        elements.clickOnElement(Locators.buttonRegistration);
    }

    public void result2() {
        assertions.elementIsDisplayedByXpath(Locators.registrationForm);
    }

    //      Test 3
    public void buttonFeedBackClick() {
        wait.waitForElementToBeClickable(Locators.buttonFeedBack);
        elements.clickOnElementOfClicable(Locators.buttonFeedBack);
    }

    public void result3() {
        assertions.elementIsDisplayedByXpath(Locators.buttonTelegram);
        assertions.elementIsDisplayedByXpath(Locators.buttonViber);
    }

    //      Test 4
    public void buttonEmailClick() {
        elements.clickOnElementOfClicable(Locators.fieldEMail);
    }

    public void eMailInput() {
        elements.sendTextOnElement(Locators.fieldEMail, Labels.eMail);
    }

    public void buttonContinueClick() {
        wait.waitForElementToBeClickable(Locators.buttonContinue);
        elements.clickOnElementOfClicable(Locators.buttonContinue);
    }

    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }

    public void result4() {
        assertions.elementIsDisplayedByXpath(Locators.fixSend);
    }
    //      Test 5
    public void buttomRusClick() {
        elements.clickOnElementOfClicable(Locators.buttonRusLanguage);
    }
    public void result5() {
        assertions.equalsOfTextXpath(Locators.helpMenu, Labels.helpRus);;
    }
}