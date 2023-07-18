package com.amazon.tests.amazonE2ETests;

import com.amazon.pages.LoginPage;
import com.amazon.pages.YourListPage;
import com.amazon.tests.TestBase;
import com.amazon.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_CreateList extends TestBase {
    /** Amazon E2E Task
     *  go to https://www.amazon.com.tr/ web page
     *  if there are cookies accept cookies
     *  log in with your own valid credential
     *  Verify that login is successful
     *  Click a new list from Hesap ve Listeler
     *  Create e new list name as Bilal
     *  Verify that Bilal list is created
     *  Select any category from the section tab next to the search box (click search button)
     *  Verify that category  is selected
     *  Write any product to search box and click
     *  Verify that the result page is displayed

     Project Name:EuroTech_SeleniumTestNG_Amazon
     */

    LoginPage loginPage;

    YourListPage yourListPage;
    @Test
    public void TC001_ListTest(){
        loginPage=new LoginPage();
        yourListPage=new YourListPage();

        extentLogger=report.createTest("TC001_List Test");

        extentLogger.info("go to "+ConfigurationReader.get("url")+" Web page");
        driver.get(ConfigurationReader.get("url"));

        extentLogger.info("if there are cookies accept cookies");
        loginPage.acceptCookies();

        extentLogger.info("log in with your own valid credential");
        loginPage.login();

        extentLogger.info("Verify that login is successful");
        String actualUsername = loginPage.getUsername();
        String expectedUsrname=ConfigurationReader.get("username");
        Assert.assertEquals(actualUsername,expectedUsrname);

        extentLogger.info("Click a new list from Hesap ve Listeler");
        yourListPage.createANewList();

        extentLogger.info("Create e new list name as Bilal");
        yourListPage.createANewListMethod("Bilal");

    }

}
