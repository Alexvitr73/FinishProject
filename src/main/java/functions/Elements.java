package functions;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elements {
    static final Logger logger = LoggerFactory.getLogger(Elements.class);
    private final WebDriver driver;
    private final Waiters waiters;

    public Elements(WebDriver driver) {
        this.driver = driver;
        waiters = new Waiters(driver);
    }

    public WebElement findElement(By by) {
        try {
            waiters.waitForVisabilityOfElement(by);
            return driver.findElement(by);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }

    public WebElement findElementXpath(String xpath) {
        waiters.waitForVisabilityOfElement(By.xpath(xpath));
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement findElementByXpath(String xpath) {
        try {
            waiters.waitForVisabilityOfElement(By.xpath(xpath));
            return driver.findElement(By.xpath(xpath));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }

    public WebElement findElementByXpathForClickable(String xpath) {
        try {
            waiters.waitForElementToBeClickable(By.xpath(xpath));
            return driver.findElement(By.xpath(xpath));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getElementText(WebElement element) {
        waiters.waitForVisabilityOfElement(element);
        return element.getText();
    }

    public String getElementText(By by) {
        waiters.waitForPresenceOfElement(by);
        logger.info("Getting text from element");
        return driver.findElement(by).getText();
    }

    public String getElementTextXpath(String xpath) {
        waiters.waitForPresenceOfElement(By.xpath(xpath));
        logger.info("Getting text from element");
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public String getTitleOfPage() {
        return driver.getTitle();
    }

    public void clickOnElement(WebElement element) {
        waiters.waitForVisabilityOfElement(element);
        element.click();
    }

    public void clickOnElement(By by) {
        WebElement element = waiters.waitForPresenceOfElementReturn(by);
        logger.info("Click on element located by" + by);
        element.click();
    }

    public void clickOnElementStringXpath(String xpath) {
        findElementByXpath(xpath).click();}

    public void clickOnElementByXpath(By by) {
        findElement(by).click();}


    public void clickOnElementInsideFrameXpath(String xpathFrame, String xpathElemnt) {
        waiters.waitForFrameAndSwitchXpath(xpathFrame);
        WebElement element = findElementByXpath(xpathElemnt);
        element.click();
    }

    public boolean isElementDisplayed(String xpath) {
        return findElementByXpath(xpath).isDisplayed();
    }
    public boolean isElementDisplayedByXpath(By by) {
        return findElement(by).isDisplayed();
    }
    public void sendTextOnElement(By by, String text) {
        WebElement element = waiters.waitForPresenceOfElementReturn(by);
        logger.info("Send text on element located by" + by);
        element.sendKeys(text);
    }

    public void clickOnElementOfClicable(By by) {
        WebElement element = waiters.waitForElementToBeClickable(by);
        logger.info("Click on element located by" + by);
        element.click();
    }
}