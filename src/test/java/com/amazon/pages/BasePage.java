package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "sp-cc-accept")
    public WebElement cookiesBtn;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement merhabaElemet;

    @FindBy(css = "#nav-flyout-ya-signin>a")
    public WebElement girisYapBtn;

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    public WebElement username;

    @FindBy(linkText = "Liste Oluşturun")
    public WebElement listeOlusturLink;
    public void acceptCookies(){
        cookiesBtn.click();
    }

    public void navigateTologinPage(){
        BrowserUtils.hover(merhabaElemet);
        girisYapBtn.click();
    }
    public String getUsername(){
        return username.getText();

    }
    public void createANewList(){
        BrowserUtils.hover(username);
        listeOlusturLink.click();
    }
}
