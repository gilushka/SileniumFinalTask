package steps;

import pages.AllFilterPage;
import ru.yandex.qatools.allure.annotations.Step;


public class AllFilterSteps {

    @Step("Проверка открытия страницы фильтров")
    public void checkPage(){
        new AllFilterPage().waitAppearence();
    }

    @Step("поле {0} заполняется значением {1}")
    public void fillCostFieldStep(String field, String value){
        new AllFilterPage().fillCost(field, value);
    }

    @Step("Выбирается производитель {0}")
    public void setCheckboxStep(String name){
        new AllFilterPage().checkBoxSet(name);
    }

    @Step("Переход на страницу с результатами")
    public void filterAdmitionStep(){
        new AllFilterPage().filterAdmition();
    }

}
