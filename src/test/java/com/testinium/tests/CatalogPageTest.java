package com.testinium.tests;

import com.testinium.driver.BaseTest;
import com.testinium.pages.CatalogPage;
import org.junit.Test;

public class CatalogPageTest extends BaseTest {
    @Test
    public void catalogTest(){
        CatalogPage catalogPage = new CatalogPage();

        catalogPage.catalogPageSort();
        catalogPage.selectHobbyThenAddToCart();

    }

}
