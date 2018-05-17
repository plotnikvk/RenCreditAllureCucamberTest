package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import steps.BaseSteps;

import java.util.List;

public class CalculatorPage extends BasePageObject {

    public CalculatorPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//h2[@class='calculator-block__title block-title']")
    public WebElement title;

    @FindBy(xpath = "//span[@class='calculator__currency-field-text']")
    public List<WebElement> selectCurrency;

    @FindBy(xpath = "//input[@name='amount']")
    public  WebElement amountOfDepositWindow;

    @FindBy(tagName = "select")
    public WebElement selectTermOfdepositButton;

    @FindBy(xpath = "//input[@name='replenish']")
    public WebElement monthlyReplenishment;

    @FindBy(xpath = "//div")
    public WebElement checkBox;

    @FindBy(xpath = "//span[@class='js-calc-rate']")
    public WebElement rate;

    @FindBy(xpath = "//span[@class='js-calc-earned']")
    public WebElement accured;

    @FindBy(xpath = "//span[@class='js-calc-replenish']")
    public WebElement replenish;

    @FindBy(xpath = "//span[@class='js-calc-result']")
    public WebElement calcResult;

    @Override
    public void selectCollectionItem(String itemName, List<WebElement> collection) {
        super.selectCollectionItem(itemName, collection);
    }
}
