package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class MarketMainPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),\"Корзина\")]")
    public WebElement trashBox;

    @FindBy(xpath = "//div[contains(text(),\"Ваш регион\")]")
    public WebElement region;

    @FindBy(xpath = "//span[contains(text(),\"Да, спасибо\")]/..")
    public  WebElement regionAccept;

    @FindBy(xpath = "//ul[@class=\"topmenu__list\"]")
    public WebElement topmenu;

    public MarketMainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void regionCheck(){
        if (region.isDisplayed()){
            regionAccept.click();
        }
    }

    public void waitAppearence(){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(trashBox));
    }

    public void waitAppearence(WebElement element){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void selectMarketMenuItem(String itemName) {
        new Actions(driver).moveToElement(topmenu.findElement(By.xpath("//a[contains(text(),'" + itemName + "')]"))).perform();
    }

    public void selectMarketSubMenuItem(String itemName) {
        waitAppearence(topmenu.findElement(By.xpath("//a[contains(text(),'" + itemName + "')]")));
        topmenu.findElement(By.xpath("//a[contains(text(),'" + itemName + "')]")).click();
    }

}
