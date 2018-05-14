package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps{

    @Step("Переход на {0}")
    public void stepSelectMainMenu(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }

}
