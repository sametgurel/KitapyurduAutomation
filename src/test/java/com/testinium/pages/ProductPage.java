package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void scrollToProduct() {
        methods.sendKeys(By.id("search-input"), "oyuncak");
        logger.info("Arama kutucuğuna oyuncak kelimesi yazıldı");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        logger.info("Arama butonuna basıldı");
        methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])[7]"));
        logger.info("7. Ürüne scroll yapıldı");
        methods.waitBySeconds(2);


    }

    public void addToFavorites() {
        methods.click(By.xpath("(//*[@class='fa fa-heart'])[3]"));
        methods.waitBySeconds(2);
        logger.info("3. ürün favorilere eklendi.");
        methods.isElementClickable(By.cssSelector(".swal2-close"));

        methods.click(By.xpath("(//*[@class='fa fa-heart'])[4]"));
        methods.waitBySeconds(2);
        logger.info("4. ürün favorilere eklendi.");
        methods.isElementClickable(By.cssSelector(".swal2-close"));

        String favorited = methods.getAttribute(By.xpath("(//*[@class='product-cr'])[5]//div[@class='name']/a"), "title");
        logger.info("Alınan attribute değeri: " + favorited);
        methods.click(By.xpath("(//*[@class='fa fa-heart'])[5]"));
        methods.waitBySeconds(2);
        logger.info("5. ürün favorilere eklendi.");
        methods.isElementClickable(By.cssSelector(".swal2-close"));

        methods.click(By.xpath("(//*[@class='fa fa-heart'])[6]"));
        methods.waitBySeconds(2);
        logger.info("6. ürün favorilere eklendi.");
        methods.isElementClickable(By.cssSelector(".swal2-close"));

        methods.waitBySeconds(3);
    }

    public void returnToHomepage() {
        methods.click(By.cssSelector(".logo-text>a"));
        logger.info("Anasayfaya yönlendirildi");
        methods.waitBySeconds(3);
    }

}


