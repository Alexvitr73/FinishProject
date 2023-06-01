package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PampikPageThree extends BasePage {
    public PampikPageThree(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        //            Test 1
        public final static By choiceThing = By.xpath("//*[@id=\"products-list\"]/li[4]/div/a/span/span[1]/img");
        private final static By byThing = By.xpath("//button[@id='307647']");
        private final static By counterThing = By.xpath("//*[@id=\"cart-block\"]/a[1]/span[1]/span");
        //            Test 2
        public final static By choiceForOld = By.xpath("//*[@id=\"category-filter\"]/div[1]/div[2]/div[5]/a");
        public final static By buttonForLook = By.xpath("//button[@class='cst-btn category-filter__push']");
        public final static By resumeForOld = By.xpath("//a[@class='filter-result-name'][2]");

        //            Test 3
        public final static By choiceThingTwo = By.xpath("//*[@id=\"products-list\"]/li[6]/div/a/span/span[1]/img");
        private final static By byThingTwo = By.xpath("//button[@id='410147']");
        private final static By returnForPampers = By.xpath("//div[1]/div[1]/ul[1]/li[3]/a/span");
        //            Test 4
        public final static By quantitytThingDouble = By.xpath("//button[@class='qty-spinner__btn qty-spinner__btn--increment']");
        /// Test 5
        public final static By brandChicco = By.xpath("//a[text()='Chicco ']");
        public final static By result5 = By.xpath("//a[@class='filter-result-name'][1]");
    }

    private static class Labels {
        //            Test 1
        private final static String url3 = "https://pampik.com/ua/category/odnorazovyie-podguzniki";
        private final static int quantityThing = 1;
        //        Test 2
        private final static int quantityThingTwo = 2;
    }

    //       Methods
    //      Test 1
    public void openPage() {
        driver.get(Labels.url3);
    }

    public void choceThingClick() {
        elements.clickOnElement(Locators.choiceThing);
    }

    public void chocePriceClick() {
        elements.clickOnElement(Locators.byThing);
    }

    public int getIntFromCounter() {
        return Integer.parseInt(elements.getElementText(Locators.counterThing));
    }

    public void checkCounter() {
        assertions.equalsOfInts(getIntFromCounter(), Labels.quantityThing);
    }

    public void scrollDownPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }

    public void scrollUpPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-400)");
    }

    //    Test 2
    public void pampersChoiceForOldClick() {
        elements.clickOnElement(Locators.choiceForOld);
    }

    public void forLookClick() {
        elements.clickOnElement(Locators.buttonForLook);
    }

    public void result2() {
        assertions.elementIsDisplayedByXpath(Locators.resumeForOld);
    }

    //    Test 3
    public void pampersChoiceClickTwo() {
        elements.clickOnElement(Locators.choiceThingTwo);
    }

    public void chocePriceClickTwo() {
        elements.clickOnElementOfClicable(Locators.byThingTwo);
    }

    public void returnForPampersClickTwo() {
        elements.clickOnElementOfClicable(Locators.returnForPampers);
    }

    public int getIntFromCounterTwo() {
        return Integer.parseInt(elements.getElementText(Locators.counterThing));
    }

    public void checkCounterTwo() {
        assertions.equalsOfInts(getIntFromCounter(), Labels.quantityThingTwo);
    }
    //    Test 4

    public void quantityClickDouble() {
        elements.clickOnElementOfClicable(Locators.quantitytThingDouble);
    }
//    Test 5

    public void brandOfClick() {
        elements.clickOnElementOfClicable(Locators.brandChicco);
    }

    public void result5() {
        assertions.elementIsDisplayedByXpath(Locators.result5);
    }
}