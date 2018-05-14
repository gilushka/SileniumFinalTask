package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class AllFilterPage extends BasePage {

    @FindBy(xpath = "//h1[@title=\"Все фильтры\"]")
    public WebElement pageHeader;

    @FindBy(xpath = "//span[@sign-title=\"от\"]/span/input")
    public WebElement costFrom;

    @FindBy(xpath = "//span[@sign-title=\"до\"]/span/input")
    public WebElement costTo;

    @FindBy(xpath = "//label[contains(text(),'Samsung')]/../../span")
    public WebElement samsungCheckBox;

    @FindBy(xpath = "//label[contains(text(),'LG')]/../../span")
    public WebElement lGCheckBox;

    @FindBy(xpath = "//label[contains(text(),'Beats')]/../../span")
    public WebElement beatsCheckBox;

    @FindBy(xpath = "//span[text()=\"Показать подходящие\"]/..")
    public WebElement chooseButton;

    public AllFilterPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void waitAppearence(){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(pageHeader));
    }

    public void fillCost(String name, String itemValue) {
        if (name.equals("Цена от")){
            fillField(costFrom, itemValue);
        }
        else if (name.equals("Цена до")){
            fillField(costTo, itemValue);
        }
    }

    public void checkBoxSet(String itemName){
        switch (itemName){
            case "Samsung":
                samsungCheckBox.click();
                break;
            case "LG":
                lGCheckBox.click();
                break;
            case "Beats":
                beatsCheckBox.click();
                break;
            default:  throw new AssertionError("Поле '"+itemName+"' не объявлено на странице");
        }
    }

    public void filterAdmition(){
        chooseButton.click();
    }

}
