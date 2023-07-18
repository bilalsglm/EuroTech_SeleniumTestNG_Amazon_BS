package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(css = "input#continue")
    public WebElement devamBtn;

    @FindBy(id = "ap_password")
    public WebElement passwordBox;

    @FindBy(id = "signInSubmit")
    public WebElement girisYapBtnLogin;

    public void login(){
        navigateTologinPage();
        emailBox.sendKeys(ConfigurationReader.get("email"));
        devamBtn.click();
        BrowserUtils.clearAndSendKeys(passwordBox,ConfigurationReader.get("password"));
        //passwordBox.sendKeys(ConfigurationReader.get("passwprd"));
        girisYapBtnLogin.click();
    }
}
