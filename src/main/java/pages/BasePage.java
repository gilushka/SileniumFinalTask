package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.NoSuchElementException;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    WebDriver driver = BaseSteps.getDriver();

    public void fillField(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
    }

    public boolean isElementPresent(By by) {
        try {
            BaseSteps.getDriver().findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
