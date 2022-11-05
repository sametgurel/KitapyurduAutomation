package com.testinium.tests;

import com.testinium.driver.BaseTest;
import com.testinium.pages.*;
import org.junit.Test;

public class CartPageTest extends BaseTest {
    @Test
    public void cartTest(){
        FavoritesPage favoritesPage = new FavoritesPage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        CatalogPage catalogPage = new CatalogPage();
        CartPage cartPage = new CartPage();

        loginPage.login();
        productPage.scrollToProduct();
        productPage.addToFavorites();
        productPage.returnToHomepage();
        catalogPage.catalogPageSort();
        catalogPage.selectHobbyThenAddToCart();
        favoritesPage.removeFromFavorites();
        cartPage.purchaseProduct();
    }

}
