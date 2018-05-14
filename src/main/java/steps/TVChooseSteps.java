package steps;

import pages.TVChoosePage;
import ru.yandex.qatools.allure.annotations.Step;

public class TVChooseSteps {

    @Step("Проверка открытия страницы Телевизоры")
    public void checkPage(){
        new TVChoosePage().waitAppearence();
    }

    @Step("Переход на страницу фильтров")
    public void allFilterPageLink(){
        new TVChoosePage().filterPageLinkClick();
    }
}
