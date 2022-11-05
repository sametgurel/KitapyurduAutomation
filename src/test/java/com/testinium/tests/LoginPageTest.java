package com.testinium.tests;

import com.testinium.driver.BaseTest;
import com.testinium.pages.LoginPage;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();

        loginPage.login();
    }

}
