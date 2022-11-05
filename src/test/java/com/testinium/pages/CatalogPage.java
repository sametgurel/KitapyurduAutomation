package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class CatalogPage {
    Methods methods;

    Logger logger = LogManager.getLogger(CatalogPage.class);

    public CatalogPage(){
        methods = new Methods();
    }
    public void catalogPageSort(){
        methods.click(By.cssSelector(".lvl1catalog>a"));
        logger.info("Puan Kataloğu alanına tıklandı");
        methods.click(By.xpath("//*[@title='Puan Kataloğundaki Türk Klasikleri']"));
        logger.info("Türk Klasikleri alanına tıklandı");
        methods.selectByText(By.cssSelector(".sort>select"),"Yüksek Oylama");
        logger.info("Sıralama alanında Yüksek Oylama seçildi");
        methods.waitBySeconds(3);

    }

    public void selectHobbyThenAddToCart(){
        methods.hoverElement(By.xpath("//*[contains(span,'Tüm Kitaplar')]"));
        logger.info("Tüm Kitaplar alanına hover yapıldı");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[contains(a,'Hobi')]"));
        logger.info("Hobi alanına tıklandı");
        methods.waitBySeconds(1);
        methods.randomElement(By.cssSelector(".pr-img-link")).click();
        logger.info("Rastgele ürüne tıklandı");
        methods.click(By.id("button-cart"));
        logger.info("Ürün sepete eklendi");
        methods.waitBySeconds(3);
    }



}
