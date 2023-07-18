package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourListPage extends BasePage{

    @FindBy(className = "a-button-input")
    public WebElement aNewListLink;

    @FindBy(id = "list-name")
    public WebElement listNameBox;

    @FindBy(xpath = "//span[text()='Liste Oluştur']/preceding-sibling::input")
    public WebElement listeOlustutBtn;

    public void createANewListMethod(String listName){
        aNewListLink.click();
        BrowserUtils.waitForVisibility(listNameBox,5);
        BrowserUtils.clearAndSendKeys(listNameBox,listName);
        BrowserUtils.waitForVisibility(listeOlustutBtn,5);
        BrowserUtils.clickWithJS(listeOlustutBtn);

    }


}
