package com.project01.testcases;

import com.project01.Driver.DriverFactory;
import com.project01.Pages.LoginPage;
import com.project01.base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void isLoginPageWorking() throws InterruptedException {
        //driver config
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login("standard_user","secret_sauce")
                .sleep()
                .addItems()
                .sleep()
                .CartLingBtn()
                .sleep()
                .clickContinueBtn()
                .sleep()
                .clickCartLink()
                .sleep()
                .clickRemoveBtn()
                .sleep()
                .clickCheckOutBtn()
                .sleep()
                .setPostalInfo("alaa ","ali" ,"3335")
                .sleep()
                .clickFinishBtn();

    }

    @Test
    public void lockedMsg() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");

        //login page
        LoginPage loginPage =new LoginPage(driver);
        loginPage.load().login("locked_out_user","secret_sauce ");

        boolean blockedMsg =driver.findElement(By.cssSelector("[data-test=\"error\"]")).isDisplayed();
        Assert.assertTrue(blockedMsg);

    }

    @Test
    public  void  shouldAddToCartBug() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        // add to cart section
        loginPage
                .load()
                .login("error_user","secret_sauce")
                .addItems()
                .CartLingBtn().sleep()
                .clickContinueBtn()
                .sleep()
                .clickCartLink()
                .sleep()
                .clickRemoveBtn()
                .sleep()
                .clickCheckOutBtn()
                .sleep()
                .setPostalInfo("alaa ","ali" ,"3335")
                .sleep()
                .clickFinishBtn();;


    }

//    @Test
//    public  void  shouldAddToCartBug1() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//
//        // add to cart section
//        loginPage
//                .load()
//                .login("problem_user","secret_sauce")
//                .addItems()
//                .removeItems()
//                .CartLingBtn().sleep()
//                .clickContinueBtn()
//                .sleep()
//                .clickCartLink()
//                .sleep()
//                .clickRemoveBtn()
//                .sleep()
//                .clickCheckOutBtn()
//                .sleep()
//                .setPostalInfo("ahmed ","ahmed" ,"3335")
//                .sleep()
//                .clickFinishBtn();;
//
//
//    }




    }













