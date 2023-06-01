package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Action {
    static final Logger logger = LoggerFactory.getLogger(Action.class);
    private  final Elements elements;
    private  final Actions actions;
    private  final WebDriver driver;

    public Action(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        elements = new Elements(driver);
    }

    public void dragNDrop(String xpath1, String xpath2){
        actions.dragAndDrop(elements.findElementByXpath(xpath1),elements.findElementByXpath(xpath2)).perform();
    }
    }
