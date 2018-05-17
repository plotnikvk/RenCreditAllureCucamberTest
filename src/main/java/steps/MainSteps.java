package steps;

import pages.MainPage;
import io.qameta.allure.Step;

public class MainSteps {

    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }
}
