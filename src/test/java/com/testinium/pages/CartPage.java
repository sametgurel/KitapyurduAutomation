package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class CartPage {

    Methods methods;
    Logger logger = LogManager.getLogger(CartPage.class);

    public CartPage(){
        methods = new Methods();
    }

    public void purchaseProduct(){
        methods.click(By.id("cart-items"));
        logger.info("Sepet butonuna tıklanır");
        methods.waitBySeconds(2);
        methods.click(By.id("js-cart"));
        logger.info("Sepete git butonuna tıklanır");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@name='quantity']"),"2");
        logger.info("Ürün adedi 2 olarak güncellenir");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".fa.fa-refresh.green-icon"));
        logger.info("Güncelle butonuna tıklanır");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class='buttons']/div/a"));
        logger.info("Satın al butonuna tıklandı");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@id='shipping-tabs']/a[2]"));
        logger.info("Yeni bir adres kullanmak istiyorum alanına tıklanır");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-firstname-companyname"),"testdata");
        logger.info("Form alanına ad girildi");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-lastname-title"),"datatest");
        logger.info("Form alanına soyad girildi");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("address-zone-id"),"Adana");
        logger.info("Adres kısmında Adana seçildi");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("address-county-id"),"ALADAĞ");
        logger.info("İlçe kısmında ALADAĞ seçildi");
        methods.waitBySeconds(2);
        methods.click(By.id("district"));
        logger.info("Mahalle alanına tıklandı");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#districtautocomplete-list>div"));
        logger.info("Mahalle alanındaki ilk seçenek seçildi");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-address-text"),"deneme adres testinium");
        logger.info("Adres alanına adres girildi");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-postcode"),"12345");
        logger.info("Posta kodu alanına 12345 girildi");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-mobile-telephone"),"5123456789");
        logger.info("Telefon alanına 5123456789 girildi");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-telephone"),"2123456789");
        logger.info("Sabit telefon alanına 2123456789 girildi");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-tax-id"),"29464913862");
        logger.info("TC Kimlik no alanına 29464913862 girildi");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        logger.info("Devam butonuna tıklandı");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        logger.info("Devam butonuna tıklandı");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit-card-owner"),"samet gurel");
        logger.info("Kart sahibi adına samet gurel yazıldı");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_1"),"1111");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_2"),"1111");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_3"),"1111");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_4"),"1111");
        logger.info("Kart numarası 1111 1111 1111 1111 yazıldı");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("credit-card-expire-date-month"),"01");
        logger.info("Son kullanma tarihi ayı 01 seçildi");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("credit-card-expire-date-year"),"2022");
        logger.info("Son kullanma tarihi yılı 2022 seçildi");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit-card-security-code"),"111");
        logger.info("Güvenlik kodu 111 seçildi");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        logger.info("Devam butonuna tıklanır");
        methods.waitBySeconds(2);
        methods.isElementVisible(By.xpath("//span[@class='error']"));
        logger.info("Hata mesajı kontrol edilir");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".checkout-logo"));
        logger.info("Anasayfaya dönülür");
        methods.waitBySeconds(2);
        methods.hoverElement(By.cssSelector(".menu.top.login"));
        logger.info("Sol üst kısımda hesap adının bulunduğu alana hover yapıldı");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/logout']"));
        logger.info("Logout olundu");
        methods.waitBySeconds(2);



    }

}
