package de.svenkroell.gymondoTest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

class BasePage {

    private String url;
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
        this.wait = new WebDriverWait(driver, 10, 50);
    }

    public String getUrl() {
        return url;
    }

    <T extends BasePage> T initPage(Class<T> pageObject) {
        return PageFactory.initElements(driver, pageObject);
    }
}
