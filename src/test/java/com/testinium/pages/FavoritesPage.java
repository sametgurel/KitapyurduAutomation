package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FavoritesPage {
    Methods methods;

    Logger logger = LogManager.getLogger(FavoritesPage.class);


    public FavoritesPage() {
        methods = new Methods();

    }

    public void removeFromFavorites() {
        methods.hoverElement(By.xpath("//*[contains(a,'Listelerim')]"));
        logger.info("Listelerim alanına hover işlemi yapıldı");
        methods.click(By.xpath("//*[contains(a,'Favorilerim')]"));
        logger.info("Hover edilen alanda Favorilerim seçeneğine tıklandı");
        methods.waitBySeconds(3);
        String favorited2 = methods.getAttribute(By.xpath("(//div[@class='name']/a)[2]"), "title");
        String favorited = favorited2;
        logger.info("Favorilere alınan 3. ürünün attribute'u alındı");
        logger.info("Alınan attribute değer: " + favorited2);
        Assert.assertEquals(favorited, favorited2);
        logger.info("Alınan attribute değerlerinin eşitliği kontrol ediliyor");
        methods.click(By.xpath("(//a[@data-title='Favorilerimden Sil'])[2]"));
        logger.info("Favorilere eklenen 3. ürün favorilerden kaldırılıyor");
        methods.waitBySeconds(10);

    }

}
