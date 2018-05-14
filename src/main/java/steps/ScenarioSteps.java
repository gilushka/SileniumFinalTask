package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketMainPageSteps marketMainPageSteps = new MarketMainPageSteps();
    TVChooseSteps tvChooseSteps = new TVChooseSteps();
    AllFilterSteps allFilterSteps = new AllFilterSteps();

    @When("^выбран переход на \"(.+)\"$")
    public void stepSelectMainMenu(String menuItem){
        mainSteps.stepSelectMainMenu(menuItem);
    }

    @Then("^открыта страница Маркета$")
    public void stepCheckPage(){
        marketMainPageSteps.checkPage();
    }

    @When("^выбран раздел меню - \"(.+)\"$")
    public void stepSelectMarketMainMenu(String menuItem){
        marketMainPageSteps.stepSelectMarketMainMenu(menuItem);
    }

    @When("^выбран раздел подменю - \"(.+)\"$")
    public void stepSelectMarketSubMenu(String menuItem){
        marketMainPageSteps.stepSelectMarketSubMenu(menuItem);
    }

    @Then("^переход на страницу поиска$")
    public void stepCheckSearchPage(){
        tvChooseSteps.checkPage();
    }

    @When("^инициируется переход к фильрам$")
    public void stepAllFiltersPageLink(){
        tvChooseSteps.allFilterPageLink();
    }

    @Then("^переход на страницу фильтров$")
    public void stepCheckFilterPage(){
        allFilterSteps.checkPage();
    }

    @When("^в поле \"(.+)\" указано значение \"(.+)\"$")
    public void stepFillCostField(String field, String value) {
        allFilterSteps.fillCostFieldStep(field, value);
    }

    @When("^выбран чекбокс \"(.+)\"$")
    public void stepCheckboxSet(String name){
        allFilterSteps.setCheckboxStep(name);
    }

    @Then("^возврат на страницу поиска$")
    public void stepAdmitFilter(){
        allFilterSteps.filterAdmitionStep();
    }

}
