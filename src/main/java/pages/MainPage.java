package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage extends BasePage{

    @FindBy(xpath = "//div[@role=\"navigation\"]")
    WebElement navigationBlock;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName){
        navigationBlock.findElement(By.xpath("./a[contains(text(),'"+itemName+"')]")).click();
    }
}
