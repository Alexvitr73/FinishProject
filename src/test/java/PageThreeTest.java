import base.BaseTest;
import org.testng.annotations.Test;

public class PageThreeTest extends BaseTest {
    @Test(priority = 1)
    public void checkChoiceThingInBasket() {
        pampikPageThree.openPage();
        pampikPageThree.scrollDownPage();
        pampikPageThree.choceThingClick();
        pampikPageThree.scrollDownPage();
        pampikPageThree.chocePriceClick();
        pampikPageThree.scrollUpPage();
        pampikPageThree.getIntFromCounter();
        pampikPageThree.checkCounter();
    }

    @Test(priority = 2)
    public void checkSortThingForType() {
        pampikPageThree.openPage();
        pampikPageThree.pampersChoiceForOldClick();
        pampikPageThree.forLookClick();
        pampikPageThree.result2();
    }

    @Test(priority = 3)
    public void checkChoiceTwoOtherThingInBasket() {
        pampikPageThree.openPage();
        pampikPageThree.scrollDownPage();
        pampikPageThree.choceThingClick();
        pampikPageThree.scrollDownPage();
        pampikPageThree.chocePriceClick();
        pampikPageThree.scrollUpPage();
        pampikPageThree.returnForPampersClickTwo();
        pampikPageThree.pampersChoiceClickTwo();
        pampikPageThree.chocePriceClickTwo();
        pampikPageThree.scrollUpPage();
        pampikPageThree.getIntFromCounterTwo();
        pampikPageThree.checkCounterTwo();
    }

    @Test(priority = 4)
    public void checkChoiceThingInBasketDouble() {
        pampikPageThree.openPage();
        pampikPageThree.scrollDownPage();
        pampikPageThree.choceThingClick();
        pampikPageThree.scrollDownPage();
        pampikPageThree.chocePriceClick();
        pampikPageThree.quantityClickDouble();
        pampikPageThree.scrollUpPage();
        pampikPageThree.getIntFromCounter();
        pampikPageThree.checkCounterTwo();
    }
    @Test(priority = 5)
    public void checkSortThingForBrand() {
        pampikPageThree.openPage();
        pampikPageThree.scrollDownPage();
        pampikPageThree.brandOfClick();
        pampikPageThree.forLookClick();
        pampikPageThree.result5();
    }
}
