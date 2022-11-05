package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage() {
        methods = new Methods();
    }

    public void login() {
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        logger.info("Giriş yap butonuna tıklandı");
        methods.sendKeys(By.id("login-email"), "samet.gurel@testinium.com");
        logger.info("E-posta alanına samet.gurel@testinium.com  yazıldı");
        methods.sendKeys(By.id("login-password"), "Sametest123");
        logger.info("Şifre alanına Sametest123 yazıldı");
        methods.click(By.cssSelector(".ky-form-buttons>button"));
        logger.info("Giriş Yap butonuna tıklandı");
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".common-sprite>b")));
        logger.info("Login işleminin yapıldığı kontrol edildi");
        methods.waitBySeconds(3);
    }


}
