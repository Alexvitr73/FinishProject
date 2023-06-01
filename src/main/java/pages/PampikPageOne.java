package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PampikPageOne extends BasePage {


    public PampikPageOne(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        //            Test 1
        private final static By city = By.xpath("//a[@class='current-city-name']");
        private final static By cityInput = By.xpath("//input[@id='popup-city-autocomplete']");
        private final static By cityChoise = By.xpath("//div[text()='Ржищів (Київська обл.)(Кагарлицький р-н.)']");
        private final static By cityNew = By.xpath("//*[@id=\"current-city\"]/a");
        //        Test 2
        private final static By helpMenu = By.xpath("//a[@id=\"help-trigger\"]");
        private final static By garantItem = By.xpath("//a[text()='Гарантія']");
        private final static By garantFieeld = By.xpath("//h1[text()='Гарантія']");
        public final static By garantFieldXpath = By.xpath("//h1[text()='Гарантія']");

        //        Test 3
        private final static By textCallMe = By.xpath("//a[text()='Замовити дзвінок']");
        private final static By telephoneCallMe = By.xpath("//input[@id='phoneCallback']");
        private final static By buttonSend = By.xpath("//button[@id='popup-callback-btn']");
        //        Test 4
        private final static By searchField = By.xpath("//input[@id=\"search-form__input\"]");
        private final static By lupa = By.xpath("//button[@class='search-form__btn submit-btn search-form__btn--active']");
        private final static By resultSearch = By.xpath("//h1");
        //        Test 5
        private final static By buttonRus = By.xpath("//a[@data-lang='ru-RU']");

    }

    private static class Labels {
        //            Test 1
        private final static String expectedCity = "Ржищів";
        private final static String url = "https://pampik.com/ua";
        public final static String cityNewxpath = "//a[@class='current-city-name']";
        //        Test 2
        private final static String expectedText = "Гарантія";


        //    Test 3
        private final static String numberPhone = "500000000";
        public final static String windowWithTextConFirm = "//div[@class=\"popup-text\"]";
        //    Test 4
        private final static String inputText = "коляска";

        //    Test 5
        private final static String helpRus = "Помощь";
    }

    //       Methods
    //      Test 1
    public void openPage() {
        driver.get(Labels.url);
    }

    public void cityClick() {
        elements.clickOnElement(Locators.city);
    }

    public void cityInput() {
        elements.sendTextOnElement(Locators.cityInput, Labels.expectedCity);
    }

    public void cityChoise() {
        elements.clickOnElement(Locators.cityChoise);

    }

    public void textNewCity() {
        System.out.println(elements.getElementText(Locators.cityNew) + "город");
    }

    public void result() {
        assertions.equalsOfTextXpath(Locators.cityNew, Labels.expectedCity);
    }

    //    Test 2
    public void helpMenuClick() {
        elements.clickOnElementOfClicable(Locators.helpMenu);
    }

    public void garantItemClick() {
        elements.clickOnElement(Locators.garantItem);
    }

    public void result2() {
        assertions.equalsOfTextXpath(Locators.garantFieldXpath, Labels.expectedText);

    }

    //    Test 3
    public void telephoneCallMeClick() {
        elements.clickOnElement(Locators.textCallMe);
    }

    public void numberInput() {
        elements.sendTextOnElement(Locators.telephoneCallMe, Labels.numberPhone);
    }

    public void sendMessageClick() {
        elements.clickOnElement(Locators.buttonSend);
    }

    public void result3() {
        assertions.elementIsDisplaye(Labels.windowWithTextConFirm);
    }

    //    Test 4
    public void searchFieldClick() {
        elements.clickOnElement(Locators.searchField);
    }

    public void enterTextForSeacrh() {

        elements.sendTextOnElement(Locators.searchField, Labels.inputText);
        elements.clickOnElement(Locators.lupa);
    }

    public void result4() {
        assertions.equalsOfTextXpathContains(Locators.resultSearch, Labels.inputText);
    }

    //    Test 5
    public void buttonRusClick() {
        elements.clickOnElement(Locators.buttonRus);
    }

    public void result5() {
        assertions.equalsOfTextXpath(Locators.helpMenu, Labels.helpRus);
    }
}
