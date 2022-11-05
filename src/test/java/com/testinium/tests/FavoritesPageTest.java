package com.testinium.tests;

import com.testinium.driver.BaseTest;
import com.testinium.pages.CatalogPage;
import com.testinium.pages.FavoritesPage;
import com.testinium.pages.LoginPage;
import com.testinium.pages.ProductPage;
import org.junit.Test;

public class FavoritesPageTest extends BaseTest {
    @Test
    public void favoritesTest(){
        FavoritesPage favoritesPage = new FavoritesPage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.scrollToProduct();
        productPage.addToFavorites();
        favoritesPage.removeFromFavorites();

    }

}
