package com.testinium.tests;

import com.testinium.driver.BaseTest;
import com.testinium.pages.LoginPage;
import com.testinium.pages.ProductPage;
import org.junit.Test;

public class ProductPageTest extends BaseTest {

    @Test
    public void productTest() {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.scrollToProduct();
        productPage.addToFavorites();
        productPage.returnToHomepage();

    }

}
