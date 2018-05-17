package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.uk.Нехай;

public class ScenarioSteps {

    MainSteps mainPageSteps = new MainSteps();
    CalculatorSteps calculatorSteps = new CalculatorSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuName){
        mainPageSteps.selectMenuItem(menuName);
    }

    @When("^появился заголовок - \"(.+)\"$")
    public void checkPageTitle(String expectedTitle){
        calculatorSteps.checkPageTitle(expectedTitle);
    }

    @When("^выбрана валюта – \"(.+)\"$")
    public void selectCurrency(String currency){
        calculatorSteps.selectCollectionItem(currency);
    }

    @When("^выбрана сумма вклада – \"(.+)\"$")
    public void selectAmountOfDeposit(String amount){
        calculatorSteps.selectAmountOfDeposit(amount);
    }

    @When("^выбран срок вклада - \"(.+)\"$")
    public void selectTermOfDeposit(String termOfDeposit){
        switch (termOfDeposit) {
            case "6 месяцев": {
                calculatorSteps.selectTermOfDeposit("6");
                break;
            }
            case "9 месяцев": {
                calculatorSteps.selectTermOfDeposit("9");
                break;
            }
            case "12 месяцев": {
                calculatorSteps.selectTermOfDeposit("12");
                break;
            }
            case "3 месяцa": {
                calculatorSteps.selectTermOfDeposit("3");
                break;
            }
            case "13 месяцев":{
                calculatorSteps.selectTermOfDeposit("13");
            }
        }
    }
    @When("^выбрано ежемесячное пополнение на сумму - \"(.+)\"$")
    public void selectAmountOfMonthlyReplenishment(String replenishment){
        calculatorSteps.selectAmountOfMonthlyReplenishment(replenishment);
    }

    @When("^отмечен чекбокс – \"(.*)\"$")
    public void selectCheckBoxClick(String itemOfCheckBox){
        calculatorSteps.checkBoxClick(itemOfCheckBox);
    }

    @Then("^проверено что автоматически заполнилось поле Ставка - \"(.*)\"$")
    public void checkRateField(String rate){
        calculatorSteps.checkRateField(rate);
    }
    @Then("^проверено что автоматически заполнилось поле Начислено - \"(.*)\"$")
    public void checkAccuredField(String accured){
        calculatorSteps.checkAccuredField(accured);
    }

    @Then("^проверено что автоматически заполнилось поле Пополнение за 9 месяцев - \"(.*)\"$")
    public void checkReplenishField(String replenish){
        calculatorSteps.checkReplenishField(replenish);
    }

    @Then("^проверено что автоматически заполнилось поле К снятию через 9 месяцев – \"(.*)\"$")
    public void checkCalcResultField(String result) {
        calculatorSteps.checkCalcResultField(result);
    }
}
