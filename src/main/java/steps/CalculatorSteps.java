package steps;


import io.qameta.allure.Step;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CalculatorPage;

public class CalculatorSteps {

    CalculatorPage calculatorPage = new CalculatorPage();
    WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(),
            10);

    @Step("появился заголовок - {expectedTitle}")
    public void checkPageTitle(String expectedTitle) {
        String actualTitle = calculatorPage.title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("выбрана валюта – {сurrency}")
    public void selectCollectionItem(String сurrency) {
        calculatorPage.selectCollectionItem(сurrency, calculatorPage.selectCurrency);
    }

    @Step("выбрана сумма вклада – {amount}")
    public void selectAmountOfDeposit(String amount) {
        calculatorPage.amountOfDepositWindow.sendKeys(amount);
    }

    @Step("выбран срок вклада - {termOfDeposit}")
    public void selectTermOfDeposit(String termOfDeposit) {

        Select timeSelect = new Select(calculatorPage.selectTermOfdepositButton);

        timeSelect.selectByValue(termOfDeposit);
    }

    @Step("выбрано ежемесячное пополнение на сумму - {replenishment}")
    public void selectAmountOfMonthlyReplenishment(String replenishment) {
        wait.until(ExpectedConditions.visibilityOf(calculatorPage.replenish));
        calculatorPage.monthlyReplenishment.sendKeys(replenishment);
    }

    @Step("отмечен чекбокс – {itemOfCheckBox}")
    public void checkBoxClick(String itemOfCheckBox) {

        String[] item = itemOfCheckBox.split("\",\"");

        for (int i = 0; i < item.length; i++) {
            WebElement checkBoxItem = calculatorPage.checkBox.findElement(By.xpath("//span[text()='" + item[i] + "']" +
                    "/ancestor::label//div[@class='jq-checkbox calculator__check']"));
            wait.until(ExpectedConditions.visibilityOf(checkBoxItem));
            checkBoxItem.click();
        }
    }

    @Step("проверено что автоматически заполнилось поле Ставка - {rate}")

    public void checkRateField(String rate) {
        wait.until(ExpectedConditions.visibilityOf(BaseSteps.getDriver().findElement
        (By.xpath("//span[@class='js-calc-rate']"))));
        Assert.assertEquals("Ожидаемое число и действительное отличаются", rate, calculatorPage.rate
                .getText());
    }

    @Step("проверено что автоматически заполнилось поле Начислено - {accured}")

    public void checkAccuredField(String accured) {
        wait.until(ExpectedConditions.visibilityOf(calculatorPage.accured));
        Assert.assertEquals("Ожидаемое число и действительное отличаются", accured, calculatorPage.accured
                .getText());
    }

    @Step("проверено что автоматически заполнилось поле Пополнение за 9 месяцев - {replenish}")

    public void checkReplenishField(String replenish) {
        wait.until(ExpectedConditions.visibilityOf(calculatorPage.replenish));
        Assert.assertEquals("Ожидаемое число и действительное отличаются", replenish, calculatorPage.replenish
                .getText());
    }

    @Step("проверено что автоматически заполнилось поле К снятию через 9 месяцев – {result}")

    public void checkCalcResultField(String result) {
        wait.until(ExpectedConditions.visibilityOf(calculatorPage.calcResult));
        Assert.assertEquals("Ожидаемое число и действительное отличаются", result, calculatorPage.calcResult
                .getText());
    }
}