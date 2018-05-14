package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class TVChoosePage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),\"Уточнить категорию\")]")
    public WebElement pageHeader;

    @FindBy(xpath = "//a[contains(text(),\"Перейти ко всем фильтрам\")]")
    public WebElement filterPageLink;

    public TVChoosePage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void waitAppearence(){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(pageHeader));
    }

    public void filterPageLinkClick(){
        filterPageLink.click();
    }
}
