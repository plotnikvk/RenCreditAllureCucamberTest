package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage extends BasePageObject{

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div")
    WebElement menuItems;

    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath("//div[@class='service__title-text'][text()='"+itemName+
                "']/ancestor::div/a[1]")).click();
    }
}
