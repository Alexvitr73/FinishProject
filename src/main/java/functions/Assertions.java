package functions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Assertions {
    private final WebDriver driver;
    private final Waiters waiters;
    private final Action actionist;
    private final Elements elements;

    public Assertions(WebDriver driver) {
        this.driver = driver;
        elements = new Elements(driver);
        waiters = new Waiters(driver);
        actionist = new Action(driver);
    }

    public void elementIsDisplayedByXpath(By by) {
        assertTrue(elements.isElementDisplayedByXpath(by), "Элемент не отображается, а должен был");
    }
    public void elementIsDisplaye(String text) {
        assertTrue(elements.isElementDisplayed(text), "Элемент не отображается, а должен был");}

    public void equalsOfText(String xpath, String expectectText) {
        assertEquals(elements.getElementText(elements.findElementByXpath("xpath")), expectectText,
                "Я ожидал получить текст " + expectectText + ". А получил " +
                        elements.getElementText(elements.findElementByXpath(xpath)) + ".");
    }

    public void equalsOfInts(int actual, int expectect) {
        assertEquals(actual, expectect,
                "Я ожидал получить текст " + expectect + ". А получил " +
                        actual + ".");
    }

    public void equalsOfTextXpath(By by, String expectectText) {
        assertEquals((elements.getElementText(elements.findElement(by))), expectectText,
                "Я ожидал получить текст " + expectectText + ". А получил " +
                        elements.getElementText(elements.findElement(by)) + ".");

    }

    public void equalsOfTextXpathContains(By by, String expectectText) {
        assertTrue((elements.getElementText(elements.findElement(by))).contains(expectectText),
                "Я ожидал получить текст " + expectectText + ". А получил " +
                        elements.getElementText(elements.findElement(by)) + ".");
    }
}