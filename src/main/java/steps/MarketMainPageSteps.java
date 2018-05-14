package steps;

import pages.MarketMainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketMainPageSteps {

    @Step("Проверка открытия страницы Маркет")
    public void checkPage(){
        new MarketMainPage().regionCheck();
        new MarketMainPage().waitAppearence();
    }

    @Step("Выбор основного раздела меню - {0}")
    public void stepSelectMarketMainMenu(String menuItem){
        new MarketMainPage().selectMarketMenuItem(menuItem);
    }

    @Step("Выбор подраздела {0}")
    public void stepSelectMarketSubMenu(String menuItem){
        new MarketMainPage().selectMarketSubMenuItem(menuItem);
    }

}
